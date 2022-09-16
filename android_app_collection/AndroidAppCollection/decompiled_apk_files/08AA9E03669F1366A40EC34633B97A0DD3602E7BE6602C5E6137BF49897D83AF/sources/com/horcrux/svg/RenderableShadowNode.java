package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.aq;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class RenderableShadowNode extends am {
    private static final int CAP_BUTT = 0;
    private static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    private static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    private static final int JOIN_ROUND = 1;
    protected aq mAttributeList;
    public com.facebook.react.bridge.am mFill;
    private com.facebook.react.bridge.am mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    protected Path mPath;
    protected com.facebook.react.bridge.am mPropList;
    public com.facebook.react.bridge.am mStroke;
    public String[] mStrokeDasharray;
    public String mStrokeWidth = "1";
    public float mStrokeOpacity = 1.0f;
    public float mStrokeMiterlimit = 4.0f;
    public float mStrokeDashoffset = BitmapDescriptorFactory.HUE_RED;
    public Paint.Cap mStrokeLinecap = Paint.Cap.ROUND;
    public Paint.Join mStrokeLinejoin = Paint.Join.ROUND;
    public float mFillOpacity = 1.0f;
    public Path.FillType mFillRule = Path.FillType.WINDING;

    @Override // com.horcrux.svg.am
    protected abstract Path getPath(Canvas canvas, Paint paint);

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "clipRule", e = 1)
    public /* bridge */ /* synthetic */ void clipRule(int i) {
        super.clipRule(i);
    }

    @Override // com.horcrux.svg.am
    public /* bridge */ /* synthetic */ boolean isResponsible() {
        return super.isResponsible();
    }

    @Override // com.horcrux.svg.am, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public /* bridge */ /* synthetic */ boolean isVirtual() {
        return super.isVirtual();
    }

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "clipPath")
    public /* bridge */ /* synthetic */ void setClipPath(String str) {
        super.setClipPath(str);
    }

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "matrix")
    public /* bridge */ /* synthetic */ void setMatrix(com.facebook.react.bridge.am amVar) {
        super.setMatrix(amVar);
    }

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "name")
    public /* bridge */ /* synthetic */ void setName(String str) {
        super.setName(str);
    }

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "opacity", d = 1.0f)
    public /* bridge */ /* synthetic */ void setOpacity(float f) {
        super.setOpacity(f);
    }

    @Override // com.horcrux.svg.am
    @com.facebook.react.uimanager.a.a(a = "responsible")
    public /* bridge */ /* synthetic */ void setResponsible(boolean z) {
        super.setResponsible(z);
    }

    @com.facebook.react.uimanager.a.a(a = "fill")
    public void setFill(com.facebook.react.bridge.am amVar) {
        this.mFill = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "fillOpacity", d = 1.0f)
    public void setFillOpacity(float f) {
        this.mFillOpacity = f;
        markUpdated();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @com.facebook.react.uimanager.a.a(a = "fillRule", e = 1)
    public void setFillRule(int i) {
        switch (i) {
            case 0:
                this.mFillRule = Path.FillType.EVEN_ODD;
                break;
            case 1:
                break;
            default:
                throw new com.facebook.react.bridge.n("fillRule " + this.mFillRule + " unrecognized");
        }
        this.mPath = null;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "stroke")
    public void setStroke(com.facebook.react.bridge.am amVar) {
        this.mStroke = amVar;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeOpacity", d = 1.0f)
    public void setStrokeOpacity(float f) {
        this.mStrokeOpacity = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeDasharray")
    public void setStrokeDasharray(com.facebook.react.bridge.am amVar) {
        if (amVar != null) {
            int size = amVar.size();
            this.mStrokeDasharray = new String[size];
            for (int i = 0; i < size; i++) {
                this.mStrokeDasharray[i] = amVar.getString(i);
            }
        } else {
            this.mStrokeDasharray = null;
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.mStrokeDashoffset = f * this.mScale;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeWidth")
    public void setStrokeWidth(String str) {
        this.mStrokeWidth = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeMiterlimit", d = 4.0f)
    public void setStrokeMiterlimit(float f) {
        this.mStrokeMiterlimit = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeLinecap", e = 1)
    public void setStrokeLinecap(int i) {
        switch (i) {
            case 0:
                this.mStrokeLinecap = Paint.Cap.BUTT;
                break;
            case 1:
                this.mStrokeLinecap = Paint.Cap.ROUND;
                break;
            case 2:
                this.mStrokeLinecap = Paint.Cap.SQUARE;
                break;
            default:
                throw new com.facebook.react.bridge.n("strokeLinecap " + this.mStrokeLinecap + " unrecognized");
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeLinejoin", e = 1)
    public void setStrokeLinejoin(int i) {
        switch (i) {
            case 0:
                this.mStrokeLinejoin = Paint.Join.MITER;
                break;
            case 1:
                this.mStrokeLinejoin = Paint.Join.ROUND;
                break;
            case 2:
                this.mStrokeLinejoin = Paint.Join.BEVEL;
                break;
            default:
                throw new com.facebook.react.bridge.n("strokeLinejoin " + this.mStrokeLinejoin + " unrecognized");
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "propList")
    public void setPropList(com.facebook.react.bridge.am amVar) {
        if (amVar != null) {
            aq a2 = com.facebook.react.bridge.b.a();
            for (int i = 0; i < amVar.size(); i++) {
                a2.pushString(propertyNameToFieldName(amVar.getString(i)));
            }
            this.mAttributeList = a2;
            this.mPropList = a2;
        }
        markUpdated();
    }

    @Override // com.horcrux.svg.am
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        if (f2 > 0.01f) {
            this.mPath = getPath(canvas, paint);
            this.mPath.setFillType(this.mFillRule);
            clip(canvas, paint);
            if (setupFillPaint(paint, this.mFillOpacity * f2)) {
                canvas.drawPath(this.mPath, paint);
            }
            if (!setupStrokePaint(paint, f2 * this.mStrokeOpacity)) {
                return;
            }
            canvas.drawPath(this.mPath, paint);
        }
    }

    private boolean setupFillPaint(Paint paint, float f) {
        if (this.mFill == null || this.mFill.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.mFill);
        return true;
    }

    private boolean setupStrokePaint(Paint paint, float f) {
        paint.reset();
        double relativeOnOther = relativeOnOther(this.mStrokeWidth);
        if (relativeOnOther == 0.0d || this.mStroke == null || this.mStroke.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.mStrokeLinecap);
        paint.setStrokeJoin(this.mStrokeLinejoin);
        paint.setStrokeMiter(this.mStrokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f, this.mStroke);
        if (this.mStrokeDasharray == null) {
            return true;
        }
        int length = this.mStrokeDasharray.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.mStrokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.mStrokeDashoffset));
        return true;
    }

    private void setupPaint(Paint paint, float f, com.facebook.react.bridge.am amVar) {
        int i = amVar.getInt(0);
        if (i == 0) {
            paint.setARGB((int) (amVar.size() > 4 ? amVar.getDouble(4) * f * 255.0d : f * 255.0f), (int) (amVar.getDouble(1) * 255.0d), (int) (amVar.getDouble(2) * 255.0d), (int) (amVar.getDouble(3) * 255.0d));
        } else if (i != 1) {
        } else {
            RectF rectF = new RectF();
            this.mPath.computeBounds(rectF, true);
            b definedBrush = getSvgShadowNode().getDefinedBrush(amVar.getString(1));
            if (definedBrush == null) {
                return;
            }
            definedBrush.a(paint, rectF, this.mScale, f);
        }
    }

    @Override // com.horcrux.svg.am
    public int hitTest(Point point, Matrix matrix) {
        if (this.mPath == null) {
            return -1;
        }
        Matrix matrix2 = new Matrix(this.mMatrix);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        if (!pathContainsPoint(this.mPath, matrix2, point)) {
            return -1;
        }
        Path clipPath = getClipPath();
        if (clipPath != null && !pathContainsPoint(clipPath, matrix2, point)) {
            return -1;
        }
        return getReactTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean pathContainsPoint(Path path, Matrix matrix, Point point) {
        Path path2 = new Path(path);
        path2.transform(matrix);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path2, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains(point.x, point.y);
    }

    private aq getAttributeList() {
        return this.mAttributeList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mergeProperties(RenderableShadowNode renderableShadowNode) {
        aq attributeList = renderableShadowNode.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = clonePropList();
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String string = attributeList.getString(i);
                Field field = getClass().getField(string);
                Object obj = field.get(renderableShadowNode);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(string)) {
                    this.mAttributeList.pushString(string);
                    field.set(this, obj);
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        this.mLastMergedList = attributeList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetProperties() {
        if (this.mLastMergedList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = this.mLastMergedList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.getString(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = clonePropList();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private aq clonePropList() {
        aq a2 = com.facebook.react.bridge.b.a();
        if (this.mPropList != null) {
            for (int i = 0; i < this.mPropList.size(); i++) {
                a2.pushString(this.mPropList.getString(i));
            }
        }
        return a2;
    }

    private String propertyNameToFieldName(String str) {
        Matcher matcher = Pattern.compile("^(\\w)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer("m");
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private boolean hasOwnProperty(String str) {
        if (this.mAttributeList == null) {
            return false;
        }
        for (int size = this.mAttributeList.size() - 1; size >= 0; size--) {
            if (this.mAttributeList.getString(size).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
