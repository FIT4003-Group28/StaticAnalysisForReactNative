package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import com.facebook.react.uimanager.ao;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.am;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SvgViewShadowNode extends com.facebook.react.uimanager.g {
    private String mAlign;
    private Canvas mCanvas;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private float mVbHeight;
    private float mVbWidth;
    private Matrix mViewBoxMatrix;
    private boolean mResponsible = false;
    private final Map<String, am> mDefinedClipPaths = new HashMap();
    private final Map<String, am> mDefinedTemplates = new HashMap();
    private final Map<String, b> mDefinedBrushes = new HashMap();
    private final float mScale = com.facebook.react.uimanager.b.b().density;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    @com.facebook.react.uimanager.a.a(a = "minX")
    public void setMinX(float f) {
        this.mMinX = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "minY")
    public void setMinY(float f) {
        this.mMinY = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "vbWidth")
    public void setVbWidth(float f) {
        this.mVbWidth = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "vbHeight")
    public void setVbHeight(float f) {
        this.mVbHeight = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        aoVar.a(getReactTag(), drawOutput());
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void setReactTag(int i) {
        super.setReactTag(i);
        SvgViewManager.setShadowNode(this);
    }

    private Object drawOutput() {
        Bitmap createBitmap = Bitmap.createBitmap((int) getLayoutWidth(), (int) getLayoutHeight(), Bitmap.Config.ARGB_8888);
        this.mCanvas = new Canvas(createBitmap);
        drawChildren(this.mCanvas);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    private void drawChildren(final Canvas canvas) {
        if (this.mAlign != null) {
            this.mViewBoxMatrix = al.a(getViewBox(), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getLayoutWidth(), getLayoutHeight()), this.mAlign, this.mMeetOrSlice);
            canvas.concat(this.mViewBoxMatrix);
        }
        final Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        traverseChildren(new am.a() { // from class: com.horcrux.svg.SvgViewShadowNode.1
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                amVar.saveDefinition();
            }
        });
        traverseChildren(new am.a() { // from class: com.horcrux.svg.SvgViewShadowNode.2
            @Override // com.horcrux.svg.am.a
            public void a(am amVar) {
                int saveAndSetupCanvas = amVar.saveAndSetupCanvas(canvas);
                amVar.draw(canvas, paint, 1.0f);
                amVar.restoreCanvas(canvas, saveAndSetupCanvas);
                amVar.markUpdateSeen();
                if (!amVar.isResponsible() || SvgViewShadowNode.this.mResponsible) {
                    return;
                }
                SvgViewShadowNode.this.mResponsible = true;
            }
        });
    }

    private RectF getViewBox() {
        return new RectF(this.mMinX * this.mScale, this.mMinY * this.mScale, (this.mMinX + this.mVbWidth) * this.mScale, (this.mMinY + this.mVbHeight) * this.mScale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toDataURL() {
        Bitmap createBitmap = Bitmap.createBitmap((int) getLayoutWidth(), (int) getLayoutHeight(), Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(createBitmap));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enableTouchEvents() {
        if (!this.mResponsible) {
            this.mResponsible = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int hitTest(Point point) {
        if (!this.mResponsible) {
            return -1;
        }
        int i = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0 && (!(getChildAt(childCount) instanceof am) || (i = ((am) getChildAt(childCount)).hitTest(point, this.mViewBoxMatrix)) == -1); childCount--) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineClipPath(am amVar, String str) {
        this.mDefinedClipPaths.put(str, amVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineTemplate(am amVar, String str) {
        this.mDefinedTemplates.put(str, amVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineBrush(b bVar, String str) {
        this.mDefinedBrushes.put(str, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    void traverseChildren(am.a aVar) {
        for (int i = 0; i < getChildCount(); i++) {
            com.facebook.react.uimanager.x childAt = getChildAt(i);
            if (childAt instanceof am) {
                aVar.a((am) childAt);
            }
        }
    }
}
