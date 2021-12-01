package frontend.drawable;

import backend.model.Limits;
import backend.model.Line;
import backend.model.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawableLine extends Line implements Drawable, Movable {
    DrawConfiguration config;

    public DrawableLine(Point p1, Point p2, int zIndex, Color strokeColor, Color fillColor, double lineWidth){
        super(new Limits(p1,p2), zIndex);
        this.config = new DrawConfiguration(fillColor, strokeColor, lineWidth);
    }

    @Override
    public void drawFill(GraphicsContext gc){

    }

    @Override
    public void drawStroke(GraphicsContext gc){
        gc.strokeLine(getLimits().getStart().getX(), getLimits().getStart().getY(), getLimits().getEnd().getX(), getLimits().getEnd().getY());
    }

    @Override
    public DrawConfiguration getDrawConfiguration() {
        return config;
    }
}