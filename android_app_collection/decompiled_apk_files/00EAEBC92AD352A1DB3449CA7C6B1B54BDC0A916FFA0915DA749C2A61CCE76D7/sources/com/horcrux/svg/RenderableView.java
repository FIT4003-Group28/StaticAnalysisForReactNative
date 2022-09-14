package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9511a = new int[y.values().length];

        static {
            try {
                f9511a[y.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9511a[y.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9511a[y.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private static double saturate(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 < 1.0d) {
            return d2;
        }
        return 1.0d;
    }

    private void setupPaint(Paint paint, float f2, ReadableArray readableArray) {
        int round;
        ReadableArray readableArray2;
        RenderableView renderableView;
        int i = readableArray.getInt(0);
        if (i != 0) {
            if (i == 1) {
                com.horcrux.svg.a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
                if (definedBrush == null) {
                    return;
                }
                definedBrush.a(paint, this.mBox, this.mScale, f2);
                return;
            } else if (i != 2) {
                if (i == 3) {
                    RenderableView renderableView2 = contextElement;
                    if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                        return;
                    }
                } else if (i != 4 || (renderableView = contextElement) == null || (readableArray2 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f2, readableArray2);
                return;
            } else {
                round = getSvgView().mTintColor;
            }
        } else if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f2 * 255.0d : f2 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
            return;
        } else {
            int i2 = readableArray.getInt(1);
            round = (Math.round((i2 >>> 24) * f2) << 24) | (i2 & 16777215);
        }
        paint.setColor(round);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        float f3 = f2 * this.mOpacity;
        boolean z = false;
        boolean z2 = ((VirtualView) this).mPath == null;
        if (z2) {
            ((VirtualView) this).mPath = getPath(canvas, paint);
            ((VirtualView) this).mPath.setFillType(this.fillRule);
        }
        if (this.vectorEffect == 1) {
            z = true;
        }
        Path path = ((VirtualView) this).mPath;
        if (z) {
            path = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path);
            canvas.setMatrix(null);
        }
        if (z2 || path != ((VirtualView) this).mPath) {
            this.mBox = new RectF();
            path.computeBounds(this.mBox, true);
        }
        RectF rectF = new RectF(this.mBox);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f3)) {
            if (z2) {
                this.mFillPath = new Path();
                paint.getFillPath(path, this.mFillPath);
            }
            canvas.drawPath(path, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f3)) {
            if (z2) {
                this.mStrokePath = new Path();
                paint.getFillPath(path, this.mStrokePath);
            }
            canvas.drawPath(path, paint);
        }
        renderMarkers(canvas, paint, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == com.facebook.react.uimanager.r.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(round, round2)) || ((region = this.mStrokeRegion) != null && (region.contains(round, round2) || ((region2 = this.mMarkerRegion) != null && region2.contains(round, round2))))) {
            if (getClipPath() != null && !this.mClipRegion.contains(round, round2)) {
                return -1;
            }
            return getId();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            this.mFillBounds = new RectF();
            this.mFillPath.computeBounds(this.mFillBounds, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            this.mFillBounds = new RectF();
            ((VirtualView) this).mPath.computeBounds(this.mFillBounds, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            this.mStrokeBounds = new RectF();
            this.mStrokePath.computeBounds(this.mStrokeBounds, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            this.mMarkerBounds = new RectF();
            this.mMarkerPath.computeBounds(this.mMarkerBounds, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        this.mClipBounds = new RectF();
        clipPath.computeBounds(this.mClipBounds, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        ArrayList<String> arrayList = this.mPropList;
        this.mAttributeList = arrayList == null ? new ArrayList<>() : new ArrayList<>(arrayList);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String str = attributeList.get(i);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f2) {
        q qVar = this.mMask != null ? (q) getSvgView().getDefinedMask(this.mMask) : null;
        if (qVar == null) {
            draw(canvas, paint, f2);
            return;
        }
        Rect clipBounds = canvas.getClipBounds();
        int height = clipBounds.height();
        int width = clipBounds.width();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        Canvas canvas3 = new Canvas(createBitmap);
        Canvas canvas4 = new Canvas(createBitmap3);
        canvas3.clipRect((float) relativeOnWidth(qVar.f9680d), (float) relativeOnHeight(qVar.f9681e), (float) relativeOnWidth(qVar.f9682f), (float) relativeOnHeight(qVar.f9683g));
        Paint paint2 = new Paint(1);
        qVar.draw(canvas3, paint2, 1.0f);
        int i = width * height;
        int[] iArr = new int[i];
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            iArr[i2] = ((int) ((i3 >>> 24) * saturate((((((i3 >> 16) & 255) * 0.299d) + (((i3 >> 8) & 255) * 0.587d)) + ((i3 & 255) * 0.144d)) / 255.0d))) << 24;
            i2++;
            i = i;
            paint2 = paint2;
        }
        Paint paint3 = paint2;
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        draw(canvas2, paint, f2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas4.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
        canvas4.drawBitmap(createBitmap, 0.0f, 0.0f, paint3);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, paint);
    }

    void renderMarkers(Canvas canvas, Paint paint, float f2) {
        p pVar = (p) getSvgView().getDefinedMarker(this.mMarkerStart);
        p pVar2 = (p) getSvgView().getDefinedMarker(this.mMarkerMid);
        p pVar3 = (p) getSvgView().getDefinedMarker(this.mMarkerEnd);
        if (this.elements != null) {
            if (pVar == null && pVar2 == null && pVar3 == null) {
                return;
            }
            contextElement = this;
            ArrayList<x> a2 = x.a(this.elements);
            SVGLength sVGLength = this.strokeWidth;
            float relativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator<x> it = a2.iterator();
            while (it.hasNext()) {
                x next = it.next();
                int i = a.f9511a[next.f9719a.ordinal()];
                p pVar4 = i != 1 ? i != 2 ? i != 3 ? null : pVar3 : pVar2 : pVar;
                if (pVar4 != null) {
                    pVar4.a(canvas, paint, f2, next, relativeOnOther);
                    this.mMarkerPath.addPath(pVar4.getPath(canvas, paint), pVar4.p);
                }
            }
            contextElement = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "fill")
    public void setFill(Dynamic dynamic) {
        ReadableArray asArray;
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            asArray = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (!type.equals(ReadableType.Array)) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.fill = javaOnlyArray;
            invalidate();
        } else {
            asArray = dynamic.asArray();
        }
        this.fill = asArray;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f2) {
        this.fillOpacity = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        if (i == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i + " unrecognized");
        }
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        RenderableViewManager.setRenderableView(i, this);
    }

    @com.facebook.react.uimanager.e1.a(name = "propList")
    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "stroke")
    public void setStroke(Dynamic dynamic) {
        ReadableArray asArray;
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            asArray = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (!type.equals(ReadableType.Array)) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.stroke = javaOnlyArray;
            invalidate();
        } else {
            asArray = dynamic.asArray();
        }
        this.stroke = asArray;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeDasharray")
    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.strokeDasharray = new SVGLength[size];
            for (int i = 0; i < size; i++) {
                this.strokeDasharray[i] = SVGLength.b(readableArray.getDynamic(i));
            }
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f2) {
        this.strokeDashoffset = f2 * this.mScale;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        Paint.Cap cap;
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i != 2) {
            throw new JSApplicationIllegalArgumentException("strokeLinecap " + i + " unrecognized");
        } else {
            cap = Paint.Cap.SQUARE;
        }
        this.strokeLinecap = cap;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else if (i != 2) {
            throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i + " unrecognized");
        } else {
            join = Paint.Join.BEVEL;
        }
        this.strokeLinejoin = join;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f2) {
        this.strokeMiterlimit = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f2) {
        this.strokeOpacity = f2;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "vectorEffect")
    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupFillPaint(Paint paint, float f2) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f2, this.fill);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupStrokePaint(Paint paint, float f2) {
        ReadableArray readableArray;
        paint.reset();
        double relativeOnOther = relativeOnOther(this.strokeWidth);
        if (relativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f2, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }
}
