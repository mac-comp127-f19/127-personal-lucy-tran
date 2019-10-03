package activityStarterCode.graphicsPractice;

import comp127graphics.*;

import java.awt.*;


@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B),
        EYE_COLOR = new Color(0x000000);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 1000, 600);

        GraphicsGroup littleSmiley = createSmileyFace(100);
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup mediumSmiley = createWinkingFace(200);
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createHappyFace(300);
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);

        GraphicsGroup beautifulFace = createBeautifulFace(200);
        beautifulFace.setPosition(650, 300);
        canvas.add(beautifulFace);

        GraphicsGroup frownyFace = createFrownyFace(100);
        frownyFace.setPosition(850, 400);
        canvas.add(frownyFace);

    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eye1 = createEye(size * 0.15, size *0.15);
        Ellipse eye2 = createEye(size * 0.15, size *0.15);

        eye1.setPosition(size *0.25, size*0.3);
        group.add(eye1);

        eye2.setPosition(size *0.6, size*0.3);
        group.add(eye2);
        return group;
    }

    public static GraphicsGroup createWinkingFace(double size){
        GraphicsGroup group = new GraphicsGroup();
        group.add(createHead(size, size));

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eye1 = createEye(size * 0.15, size *0.15);
        eye1.setPosition(size *0.25, size*0.3);
        group.add(eye1);

        Line eye2 = createWinkingEye(size * 0.17);
        eye2.setPosition(size * 0.58, size * 0.37);
        group.add(eye2);
        return group;
    }

    public static GraphicsGroup createFrownyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Arc mouth = createFrown(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Ellipse eye1 = createEye(size * 0.15, size *0.15);
        Ellipse eye2 = createEye(size * 0.15, size *0.15);

        eye1.setPosition(size *0.25, size*0.3);
        group.add(eye1);

        eye2.setPosition(size *0.6, size*0.3);
        group.add(eye2);
        return group;
    }

    public static GraphicsGroup createHappyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        Arc eye1 = createHappyEye(size * 0.2, size *0.18);
        Arc eye2 = createHappyEye(size * 0.2, size *0.18);

        eye1.setPosition(size *0.2, size*0.32);
        group.add(eye1);

        eye2.setPosition(size *0.6, size*0.32);
        group.add(eye2);
        return group;
    }

    public static GraphicsGroup createBeautifulFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        GraphicsGroup eye1 = createBeautifulEye(size * 0.15, size *0.15);
        GraphicsGroup eye2 = createBeautifulEye(size * 0.15, size *0.15);

        eye1.setPosition(size *0.25, size*0.3);
        group.add(eye1);

        eye2.setPosition(size *0.6, size*0.3);
        group.add(eye2);
        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, -200, -140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double ellipseWidth, double ellipseHeight){
        Ellipse eye = new Ellipse(0, 0, ellipseWidth, ellipseHeight);
        eye.setFillColor(Color.BLACK);
//        eye.setStrokeColor(Color.BLUE);
//        eye.setStrokeWidth((float) (ellipseWidth * 0.1));
        return eye;
    }

    private static GraphicsGroup createBeautifulEye(double ellipseWidth, double ellipseHeight){
        GraphicsGroup wholeEye = new GraphicsGroup();
        Ellipse eye = new Ellipse(0, 0, ellipseWidth, ellipseHeight);
        eye.setFillColor(Color.BLACK);
        eye.setStrokeColor(Color.BLUE);
        eye.setStrokeWidth((float) (ellipseWidth * 0.1));
        wholeEye.add(eye);

        Ellipse iris = new Ellipse(0,0, ellipseWidth * 0.4, ellipseHeight * 0.4);
        iris.setFillColor(Color.WHITE);
        iris.setPosition(ellipseWidth * 0.4, ellipseHeight * 0.2);
        wholeEye.add(iris);
        return wholeEye;
    }

    private static Line createWinkingEye(double ellipseWidth){
        Line eye2 = new Line(0, 0, ellipseWidth,0);
        eye2.setStrokeColor(EYE_COLOR);
        eye2.setStrokeWidth((float) (ellipseWidth * 0.2));
        return eye2;
    }

    private static Arc createHappyEye(double ellipseWidth, double ellipseHeight){
        Arc eye = new Arc(0, 0, ellipseWidth, ellipseHeight, 0, 180) ;
        eye.setStrokeColor(EYE_COLOR);
        eye.setStrokeWidth((float) (ellipseWidth * 0.2));
        return eye;
    }
}
