package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class VirtualView extends com.facebook.react.views.view.f {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<C0205r> elements;
    private double fontSize;
    private j glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    private boolean mOnLayout;
    float mOpacity;
    Path mPath;
    com.facebook.react.uimanager.r mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private l mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9535a = new int[SVGLength.UnitType.values().length];

        static {
            try {
                f9535a[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9535a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9535a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9535a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9535a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9535a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9535a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = com.facebook.react.uimanager.c.a().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            }
            virtualView.clearCache();
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (a.f9535a[sVGLength.f9526b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.f9525a * fontSizeFromContext * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d2 = this.canvasDiagonal;
        if (d2 != -1.0d) {
            return d2;
        }
        this.canvasDiagonal = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        return this.canvasDiagonal;
    }

    private float getCanvasHeight() {
        float f2 = this.canvasHeight;
        if (f2 != -1.0f) {
            return f2;
        }
        l textRoot = getTextRoot();
        this.canvasHeight = textRoot == null ? getSvgView().getCanvasBounds().height() : textRoot.a().c();
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f2 = this.canvasWidth;
        if (f2 != -1.0f) {
            return f2;
        }
        l textRoot = getTextRoot();
        this.canvasWidth = textRoot == null ? getSvgView().getCanvasBounds().width() : textRoot.a().d();
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d2 = this.fontSize;
        if (d2 != -1.0d) {
            return d2;
        }
        l textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.a();
        }
        this.fontSize = this.glyphContext.b();
        return this.fontSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas, Paint paint, float f2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.mClientRect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            c cVar = (c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (cVar != null) {
                Path path = cVar.mClipRule == 0 ? cVar.getPath(canvas, paint) : cVar.a(canvas, paint, Region.Op.UNION);
                path.transform(cVar.mMatrix);
                path.transform(cVar.mTransform);
                int i = cVar.mClipRule;
                if (i == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    c.d.d.e.a.d("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                c.d.d.e.a.d("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l getParentTextRoot() {
        ViewParent parent = getParent();
        if (!(parent instanceof VirtualView)) {
            return null;
        }
        return ((VirtualView) parent).getTextRoot();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgView getSvgView() {
        SvgView svgView;
        SvgView svgView2 = this.svgView;
        if (svgView2 != null) {
            return svgView2;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            svgView = (SvgView) parent;
        } else if (!(parent instanceof VirtualView)) {
            c.d.d.e.a.b("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
            return this.svgView;
        } else {
            svgView = ((VirtualView) parent).getSvgView();
        }
        this.svgView = svgView;
        return this.svgView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof l) {
                    l lVar = (l) virtualView;
                    if (lVar.a() != null) {
                        this.mTextRoot = lVar;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if (!(this instanceof RenderableView) || this.mPath != null) {
            clearCache();
            clearParentCache();
            super.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof l)) {
            setLeft((int) Math.floor(rectF.left));
            setTop((int) Math.floor(this.mClientRect.top));
            setRight((int) Math.ceil(this.mClientRect.right));
            setBottom((int) Math.ceil(this.mClientRect.bottom));
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    protected void onMeasure(int i, int i2) {
        RectF rectF = this.mClientRect;
        int ceil = rectF != null ? (int) Math.ceil(rectF.width()) : ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i);
        RectF rectF2 = this.mClientRect;
        setMeasuredDimension(ceil, rectF2 != null ? (int) Math.ceil(rectF2.height()) : ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnHeight(SVGLength sVGLength) {
        double d2;
        float canvasHeight;
        SVGLength.UnitType unitType = sVGLength.f9526b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d2 = sVGLength.f9525a;
            canvasHeight = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d2 = sVGLength.f9525a / 100.0d;
            canvasHeight = getCanvasHeight();
        }
        return d2 * canvasHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnOther(SVGLength sVGLength) {
        double d2;
        double canvasDiagonal;
        SVGLength.UnitType unitType = sVGLength.f9526b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d2 = sVGLength.f9525a;
            canvasDiagonal = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d2 = sVGLength.f9525a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        }
        return d2 * canvasDiagonal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnWidth(SVGLength sVGLength) {
        double d2;
        float canvasWidth;
        SVGLength.UnitType unitType = sVGLength.f9526b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d2 = sVGLength.f9525a;
            canvasWidth = this.mScale;
        } else if (unitType != SVGLength.UnitType.PERCENTAGE) {
            return fromRelativeFast(sVGLength);
        } else {
            d2 = sVGLength.f9525a / 100.0d;
            canvasWidth = getCanvasWidth();
        }
        return d2 * canvasWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void render(Canvas canvas, Paint paint, float f2) {
        draw(canvas, paint, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            RectF rectF3 = this.mClientRect;
            if (rectF3 == null) {
                return;
            }
            int ceil = (int) Math.ceil(rectF3.width());
            int ceil2 = (int) Math.ceil(this.mClientRect.height());
            int floor = (int) Math.floor(this.mClientRect.left);
            int floor2 = (int) Math.floor(this.mClientRect.top);
            int ceil3 = (int) Math.ceil(this.mClientRect.right);
            int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(ceil, ceil2);
            if (!(this instanceof l)) {
                setLeft(floor);
                setTop(floor2);
                setRight(ceil3);
                setBottom(ceil4);
            }
            if (!this.mOnLayout) {
                return;
            }
            ((UIManagerModule) this.mContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.facebook.react.uimanager.p.b(getId(), floor, floor2, ceil, ceil2));
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "clipPath")
    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "display")
    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerEnd")
    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerMid")
    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "markerStart")
    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "mask")
    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        boolean z;
        ReadableType type = dynamic.getType();
        if (dynamic.isNull() || !type.equals(ReadableType.Array)) {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            z = true;
        } else {
            int a2 = w.a(dynamic.asArray(), sRawMatrix, this.mScale);
            if (a2 != 6) {
                if (a2 != -1) {
                    c.d.d.e.a.d("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
                super.invalidate();
                clearParentCache();
            }
            if (this.mMatrix == null) {
                this.mMatrix = new Matrix();
                this.mInvMatrix = new Matrix();
            }
            this.mMatrix.setValues(sRawMatrix);
            z = this.mMatrix.invert(this.mInvMatrix);
        }
        this.mInvertible = z;
        super.invalidate();
        clearParentCache();
    }

    @com.facebook.react.uimanager.e1.a(name = "name")
    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "onLayout")
    public void setOnLayout(boolean z) {
        this.mOnLayout = z;
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f2) {
        this.mOpacity = f2;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPointerEvents(com.facebook.react.uimanager.r rVar) {
        this.mPointerEvents = rVar;
    }

    @com.facebook.react.uimanager.e1.a(name = "responsible")
    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }
}
