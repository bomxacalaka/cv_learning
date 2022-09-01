import cv2
import numpy as np
import keyboard  # using module keyboard
import math

hh = 0
hl = 0

sh = 255
sl = 0

vh = 255
vl = 0

def click_event(event, x, y, flags, params):
 
    # checking for left mouse clicks
    if event == cv2.EVENT_LBUTTONDOWN:
 
        # displaying the coordinates
        # on the Shell
        print(x, ' ', y)
 
        # displaying the coordinates
        # on the image window
        font = cv2.FONT_HERSHEY_SIMPLEX
        cv2.putText(img, str(x) + ',' +
                    str(y), (x,y), font,
                    1, (255, 0, 0), 2)
        cv2.imshow('image', img)
 
    # checking for right mouse clicks    
    if event==cv2.EVENT_RBUTTONDOWN:
 
        # displaying the coordinates
        # on the Shell
        print(x, ' ', y)
 
        # displaying the coordinates
        # on the image window
        font = cv2.FONT_HERSHEY_SIMPLEX
        b = img[y, x, 0]
        g = img[y, x, 1]
        r = img[y, x, 2]
        cv2.putText(img, str(b) + ',' +
                    str(g) + ',' + str(r),
                    (x,y), font, 1,
                    (255, 255, 0), 2)
        cv2.imshow('image', img)


def processImage(img):
    kernel = np.ones((5,5),np.uint8)
    erosion = cv2.erode(img,kernel,iterations = 1)

def getColorMask(img):

    lowerBound = np.array([hl,sl,vl])
    upperBound = np.array([hh,sh,vh])

    hsv = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)
    return cv2.inRange(hsv, lowerBound, upperBound)

def BGRvalueToHSVvalue(BGRvalue):
    return cv2.cvtColor(np.uint8([[[BGRvalue]]]), cv2.COLOR_BGR2HSV)[0][0]

cv2.namedWindow("image")
cap = cv2.VideoCapture(0)

def getCoordinatesOfAverageWhitePixels(kek):
    # get the mask
    #mask = getColorMask(img)
    # get the coordinates of the white pixels
    coordinates = np.where(kek == 255)
    # get the average coordinates
    averageCoordinates = np.average(coordinates, axis=1)
    return averageCoordinates

def drawACircleAroundTheAverageWhitePixels(img, coordinates):
    # draw a circle around the average coordinates
    if math.isnan(coordinates[0]) or math.isnan(coordinates[1]): 
        coordinates = [0,0]
    #print(coordinates)
    cv2.circle(img, (int(coordinates[1]), int(coordinates[0])), 10, (0,255,0), -1)
    # show the image
    return img

def getHSVvalueOfMouseClick(img, x, y):
    # get the BGR value of the pixel
    BGRvalue = img[y, x]
    # convert the BGR value to HSV value
    HSVvalue = BGRvalueToHSVvalue(BGRvalue)
    return HSVvalue


while 1:
    ret, img = cap.read()
    mask = getColorMask(img)
    kernel = np.ones((5,5),np.uint8)
    erosion = cv2.erode(img,kernel,iterations = 1)
    dilation = cv2.dilate(img,kernel,iterations = 1)
    opening = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)
    closing = cv2.morphologyEx(mask, cv2.MORPH_CLOSE, kernel)
    gradient = cv2.morphologyEx(mask, cv2.MORPH_GRADIENT, kernel)
    tophat = cv2.morphologyEx(mask, cv2.MORPH_TOPHAT, kernel)
    blackhat = cv2.morphologyEx(mask, cv2.MORPH_BLACKHAT, kernel)
    res = cv2.bitwise_and(img,img, mask= mask)
    cv2.setMouseCallback('image', click_event)
    circled = drawACircleAroundTheAverageWhitePixels(img, getCoordinatesOfAverageWhitePixels(opening))
    #print(BGRvalueToHSVvalue(img[]))

    #getHSVvalueOfMouseClick(img, cv2.setMouseCallback('image', click_event))
    
    cv2.imshow("mask", mask)
    cv2.imshow("circled", circled)
    cv2.imshow("res", res)
    print(hh,hl,sh,sl,vh,vl)

    if cv2.waitKey(1) & 0xFF == ord('#'):
        break

    if keyboard.is_pressed('1') and hl < 255 and hl < hh:  # if key 'q' is pressed 
        hl += 1
        print(hl)

    if keyboard.is_pressed('q') and hl > 0 and hl <= hh:  # if key 'q' is pressed 
        hl -= 1
        print(hl)

    if keyboard.is_pressed('a') and hh < 255 and hh >= hl:  # if key 'q' is pressed 
        hh += 1
        print(hh)

    if keyboard.is_pressed('z') and hh > 0 and hh > hl:  # if key 'q' is pressed 
        hh -= 1
        print(hh)
    

    if keyboard.is_pressed('2') and sl < 255 and sl < sh:  # if key 'q' is pressed 
        sl += 1
        print(sl)

    if keyboard.is_pressed('w') and sl > 0 and sl <= sh:  # if key 'q' is pressed 
        sl -= 1
        print(sl)

    if keyboard.is_pressed('s') and sh < 255 and sh >= sl:  # if key 'q' is pressed 
        sh += 1
        print(sh)

    if keyboard.is_pressed('x') and sh > 0 and sh > sl:  # if key 'q' is pressed 
        sh -= 1
        print(sh)


    if keyboard.is_pressed('3') and vl < 255 and vl < vh:  # if key 'q' is pressed 
        vl += 1
        print(vl)

    if keyboard.is_pressed('e') and vl > 0 and vl <= vh:  # if key 'q' is pressed 
        vl -= 1
        print(vl)

    if keyboard.is_pressed('d') and vh < 255 and vh >= vl:  # if key 'q' is pressed 
        vh += 1
        print(vh)

    if keyboard.is_pressed('c') and vh > 0 and vh > vl:  # if key 'q' is pressed 
        vh -= 1
        print(vh)