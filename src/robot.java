import java.awt.Frame;
import java.io.IOException;
import java.lang.String;
import java.lang.System;

import jgl.GL;
import jgl.GLCanvas;

public class robot extends GLCanvas {

    private static int shoulder = 0, elbow = 0, body = 0, waist = 0, knee = 0;
    private boolean reverse = false;

    private void myinit() {
        myGL.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        myGL.glShadeModel(GL.GL_FLAT);
    }

    public void display() {
        myGL.glClear(GL.GL_COLOR_BUFFER_BIT);
// Body
        myGL.glPushMatrix();
        myGL.glTranslatef(0.0f, -2.5f, -3.0f);
        myGL.glRotatef((float) body, 1.0f, 0.0f, 0.0f);
        myGL.glTranslatef(0.0f, 2.5f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(2.0f, 5.0f, 1.0f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

// Right Arm
        myGL.glPushMatrix();
        myGL.glTranslatef(1.0f, 1.5f, 0.0f);
        myGL.glRotatef((float) shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(1.0f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(2.0f, 0.7f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(1.0f, 0.0f, 0.0f);
        myGL.glRotatef((float) -elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(1.0f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(2.0f, 0.7f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(1.4f, 0.0f, 0.0f);
        myUT.glutWireSphere(0.4, 10, 8);

        myGL.glPopMatrix();
        myGL.glFlush();
// End Right Arm

// Left Arm
        myGL.glPushMatrix();
        myGL.glTranslatef(-1.0f, 1.5f, 0.0f);
        myGL.glRotatef((float) -shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(-1.0f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(2.0f, 0.7f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(-1.0f, 0.0f, 0.0f);
        myGL.glRotatef((float) elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(-1.0f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(2.0f, 0.7f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(-1.4f, 0.0f, 0.0f);
        myUT.glutWireSphere(0.4, 10, 8);

        myGL.glPopMatrix();
        myGL.glFlush();
// End Left Arm

// Head
        myGL.glTranslatef(0.0f, 2.9f, 0.0f);
        myGL.glRotatef(90f, 0.0f, 1.0f, 0.0f);
        myUT.glutWireSphere(0.8, 20, 16);
// End Head

        myGL.glPopMatrix();
        myGL.glFlush();
//End Body

// Right Foot
        myGL.glPushMatrix();
        myGL.glTranslatef(0.8f, -2.5f, -3.0f);
        myGL.glRotatef((float) -waist, 1.0f, 0.0f, 0.0f);
        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.7f, 2.0f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glRotatef((float) knee, 1.0f, 0.0f, 0.0f);
        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.7f, 2.0f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -1.4f, 0.0f);
        myUT.glutWireSphere(0.4, 10, 8);

        myGL.glPopMatrix();
        myGL.glFlush();
// End Right Foot

// Left Foot
        myGL.glPushMatrix();
        myGL.glTranslatef(-0.8f, -2.5f, -3.0f);
        myGL.glRotatef((float) -waist, 1.0f, 0.0f, 0.0f);
        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.7f, 2.0f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glRotatef((float)knee, 1.0f, 0.0f, 0.0f);
        myGL.glTranslatef(0.0f, -1.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.7f, 2.0f, 0.7f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -1.4f, 0.0f);
        myUT.glutWireSphere(0.4, 10, 8);

        myGL.glPopMatrix();
        myGL.glFlush();
// End Left Foot
    }

    public void myReshape(int w, int h) {
        myGL.glViewport(0, 0, w, h);
        myGL.glMatrixMode(GL.GL_PROJECTION);
        myGL.glLoadIdentity();
        myGLU.gluPerspective(100.0, (double) w / (double) h, 1.0, 20.0);
        myGL.glMatrixMode(GL.GL_MODELVIEW);
        myGL.glLoadIdentity();
        myGL.glTranslatef(0.0f, 0.0f, -5.0f);
    }

    /* ARGSUSED1 */
    public void keyboard(char key, int x, int y) {
        switch (key) {
            case 's':
                shoulder = (shoulder + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'S':
                shoulder = (shoulder - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'e':
                elbow = (elbow + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'E':
                elbow = (elbow - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'r':
                body = (body + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'q':
                waist = (waist + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'Q':
                waist = (waist - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 't':
                knee = (knee + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'T':
                knee = (knee - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'w':
                if (!reverse) {
                    body = (body + 3) % 360;
                    elbow = (elbow + 3) % 360;
                    shoulder = (shoulder - 3) % 360;
                }else {
                    body = (body - 3) % 360;
                    elbow = (elbow - 3) % 360;
                    shoulder = (shoulder + 3) % 360;
                }
                if(body>=(120%360)){
                    reverse = true;
                }
                if(body<=0){
                    reverse = false;
                }
                myUT.glutPostRedisplay();
                break;
            case 27:
                System.exit(0);
            default:
                break;
        }
    }

    public void init() {
        myUT.glutInitWindowSize(400, 400);
        myUT.glutInitWindowPosition(0, 0);
        myUT.glutCreateWindow(this);
        myinit();
        myUT.glutDisplayFunc("display");
        myUT.glutReshapeFunc("myReshape");
        myUT.glutKeyboardFunc("keyboard");
        myUT.glutMainLoop();
    }

    static public void main(String args[]) throws IOException {
        Frame mainFrame = new Frame();
        mainFrame.setSize(408, 427);
        robot mainCanvas = new robot();
        mainCanvas.init();
        mainFrame.add(mainCanvas);
        mainFrame.setVisible(true);
    }

}
