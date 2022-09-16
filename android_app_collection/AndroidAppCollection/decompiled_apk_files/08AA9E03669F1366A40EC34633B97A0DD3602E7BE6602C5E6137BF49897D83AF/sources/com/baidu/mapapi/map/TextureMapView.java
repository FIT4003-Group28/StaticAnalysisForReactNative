package com.baidu.mapapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.AssetsLoadUtil;
import com.baidu.platform.comapi.map.E;
import com.baidu.platform.comapi.map.InterfaceC0138k;
import com.baidu.platform.comapi.map.N;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.io.File;
import org.spongycastle.asn1.x509.DisplayText;
/* loaded from: classes.dex */
public final class TextureMapView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1690a = "TextureMapView";
    private static String i;
    private static final SparseArray<Integer> n = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private E f1691b;

    /* renamed from: c  reason: collision with root package name */
    private BaiduMap f1692c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f1693d;
    private Bitmap e;
    private N f;
    private Point g;
    private Point h;
    private RelativeLayout j;
    private TextView k;
    private TextView l;
    private ImageView m;
    private float o;
    private InterfaceC0138k p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    static {
        n.append(3, 2000000);
        n.append(4, 1000000);
        n.append(5, 500000);
        n.append(6, 200000);
        n.append(7, 100000);
        n.append(8, 50000);
        n.append(9, 25000);
        n.append(10, 20000);
        n.append(11, Integer.valueOf((int) b.a.a.a.a.b.a.DEFAULT_TIMEOUT));
        n.append(12, Integer.valueOf((int) UIMsg.m_AppUI.MSG_APP_GPS));
        n.append(13, Integer.valueOf((int) UIMsg.m_AppUI.MSG_APP_DATA_OK));
        n.append(14, Integer.valueOf((int) NetstatsParserPatterns.NEW_TS_TO_MILLIS));
        n.append(15, Integer.valueOf((int) UIMsg.d_ResultType.SHORT_URL));
        n.append(16, Integer.valueOf((int) DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE));
        n.append(17, 100);
        n.append(18, 50);
        n.append(19, 20);
        n.append(20, 10);
        n.append(21, 5);
        n.append(22, 2);
    }

    public TextureMapView(Context context) {
        super(context);
        this.q = LogoPosition.logoPostionleftBottom.ordinal();
        this.r = true;
        this.s = true;
        a(context, (BaiduMapOptions) null);
    }

    public TextureMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = LogoPosition.logoPostionleftBottom.ordinal();
        this.r = true;
        this.s = true;
        a(context, (BaiduMapOptions) null);
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.q = LogoPosition.logoPostionleftBottom.ordinal();
        this.r = true;
        this.s = true;
        a(context, (BaiduMapOptions) null);
    }

    public TextureMapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.q = LogoPosition.logoPostionleftBottom.ordinal();
        this.r = true;
        this.s = true;
        a(context, baiduMapOptions);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "logo_h.png"
            int r1 = com.baidu.mapapi.common.SysOSUtil.getDensityDpi()
            r2 = 180(0xb4, float:2.52E-43)
            if (r1 >= r2) goto Lc
            java.lang.String r0 = "logo_l.png"
        Lc:
            android.graphics.Bitmap r2 = com.baidu.platform.comapi.AssetsLoadUtil.loadAssetsFile(r0, r10)
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 <= r0) goto L30
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0 = 1073741824(0x40000000, float:2.0)
        L1b:
            r7.postScale(r0, r0)
            r3 = 0
            r4 = 0
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            r9.e = r0
            goto L40
        L30:
            r3 = 320(0x140, float:4.48E-43)
            if (r1 <= r3) goto L3e
            if (r1 > r0) goto L3e
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0 = 1069547520(0x3fc00000, float:1.5)
            goto L1b
        L3e:
            r9.e = r2
        L40:
            android.graphics.Bitmap r0 = r9.e
            if (r0 == 0) goto L57
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r10)
            r9.f1693d = r0
            android.widget.ImageView r10 = r9.f1693d
            android.graphics.Bitmap r0 = r9.e
            r10.setImageBitmap(r0)
            android.widget.ImageView r10 = r9.f1693d
            r9.addView(r10)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.TextureMapView.a(android.content.Context):void");
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        setBackgroundColor(-1);
        BMapManager.init();
        a(context, baiduMapOptions, i);
        this.f1692c = new BaiduMap(this.f1691b);
        a(context);
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.f.setVisibility(4);
        }
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.j.setVisibility(4);
        }
        if (baiduMapOptions != null && baiduMapOptions.j != null) {
            this.q = baiduMapOptions.j.ordinal();
        }
        if (baiduMapOptions != null && baiduMapOptions.l != null) {
            this.h = baiduMapOptions.l;
        }
        if (baiduMapOptions == null || baiduMapOptions.k == null) {
            return;
        }
        this.g = baiduMapOptions.k;
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str) {
        i = str;
        if (baiduMapOptions == null) {
            this.f1691b = new E(context, null, str);
        } else {
            this.f1691b = new E(context, baiduMapOptions.a(), str);
        }
        addView(this.f1691b);
        this.p = new q(this);
        this.f1691b.b().a(this.p);
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = layoutParams.width;
        int makeMeasureSpec = i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = layoutParams.height;
        view.measure(makeMeasureSpec, i3 > 0 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        float f = this.f1691b.b().D().f2026a;
        if (!this.f.a()) {
            return;
        }
        boolean z = true;
        this.f.b(f > this.f1691b.b().f2057b);
        N n2 = this.f;
        if (f >= this.f1691b.b().f2056a) {
            z = false;
        }
        n2.a(z);
    }

    private void b(Context context) {
        this.f = new N(context);
        if (!this.f.a()) {
            return;
        }
        this.f.b(new r(this));
        this.f.a(new s(this));
        addView(this.f);
    }

    private void c(Context context) {
        this.j = new RelativeLayout(context);
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.k = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.k.setTextColor(Color.parseColor("#FFFFFF"));
        this.k.setTextSize(2, 11.0f);
        this.k.setTypeface(this.k.getTypeface(), 1);
        this.k.setLayoutParams(layoutParams);
        this.k.setId(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.j.addView(this.k);
        this.l = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.l.setTextColor(Color.parseColor("#000000"));
        this.l.setTextSize(2, 11.0f);
        this.l.setLayoutParams(layoutParams2);
        this.j.addView(this.l);
        this.m = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.k.getId());
        this.m.setLayoutParams(layoutParams3);
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile("icon_scale.9.png", context);
        byte[] ninePatchChunk = loadAssetsFile.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        this.m.setBackgroundDrawable(new NinePatchDrawable(loadAssetsFile, ninePatchChunk, new Rect(), null));
        this.j.addView(this.m);
        addView(this.j);
    }

    public static void setCustomMapStylePath(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("customMapStylePath String is illegal");
        }
        if (!new File(str).exists()) {
            throw new RuntimeException("please check whether the customMapStylePath file exits");
        }
        i = str;
    }

    public static void setMapCustomEnable(boolean z) {
        E.a(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MapViewLayoutParams) {
            super.addView(view, layoutParams);
        }
    }

    public final LogoPosition getLogoPosition() {
        switch (this.q) {
            case 1:
                return LogoPosition.logoPostionleftTop;
            case 2:
                return LogoPosition.logoPostionCenterBottom;
            case 3:
                return LogoPosition.logoPostionCenterTop;
            case 4:
                return LogoPosition.logoPostionRightBottom;
            case 5:
                return LogoPosition.logoPostionRightTop;
            default:
                return LogoPosition.logoPostionleftBottom;
        }
    }

    public final BaiduMap getMap() {
        this.f1692c.f1551b = this;
        return this.f1692c;
    }

    public final int getMapLevel() {
        return n.get((int) this.f1691b.b().D().f2026a).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.y;
    }

    public int getScaleControlViewWidth() {
        return this.y;
    }

    public void onCreate(Context context, Bundle bundle) {
        BaiduMapOptions mapStatus;
        if (bundle == null) {
            return;
        }
        i = bundle.getString("customMapPath");
        if (bundle == null) {
            mapStatus = new BaiduMapOptions();
        } else {
            MapStatus mapStatus2 = (MapStatus) bundle.getParcelable("mapstatus");
            if (this.g != null) {
                this.g = (Point) bundle.getParcelable("scalePosition");
            }
            if (this.h != null) {
                this.h = (Point) bundle.getParcelable("zoomPosition");
            }
            this.r = bundle.getBoolean("mZoomControlEnabled");
            this.s = bundle.getBoolean("mScaleControlEnabled");
            this.q = bundle.getInt("logoPosition");
            setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
            mapStatus = new BaiduMapOptions().mapStatus(mapStatus2);
        }
        a(context, mapStatus);
    }

    public final void onDestroy() {
        this.f1691b.e();
        if (this.e != null && !this.e.isRecycled()) {
            this.e.recycle();
        }
        this.f.b();
        BMapManager.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"NewApi"})
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float f;
        int measuredHeight;
        int measuredWidth;
        int height;
        int width;
        int childCount = getChildCount();
        a(this.f1693d);
        float f2 = 1.0f;
        if (((getWidth() - this.t) - this.u) - this.f1693d.getMeasuredWidth() <= 0 || ((getHeight() - this.v) - this.w) - this.f1693d.getMeasuredHeight() <= 0) {
            this.t = 0;
            this.u = 0;
            this.w = 0;
            this.v = 0;
            f = 1.0f;
        } else {
            f2 = ((getWidth() - this.t) - this.u) / getWidth();
            f = ((getHeight() - this.v) - this.w) / getHeight();
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt == this.f1691b) {
                this.f1691b.layout(0, 0, getWidth(), getHeight());
            } else if (childAt == this.f1693d) {
                float f3 = f2 * 5.0f;
                int i7 = (int) (this.t + f3);
                int i8 = (int) (this.u + f3);
                float f4 = 5.0f * f;
                int i9 = (int) (this.v + f4);
                int i10 = (int) (this.w + f4);
                switch (this.q) {
                    case 1:
                        measuredHeight = this.f1693d.getMeasuredHeight() + i9;
                        measuredWidth = this.f1693d.getMeasuredWidth() + i7;
                        int i11 = measuredHeight;
                        width = i7;
                        height = i11;
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                    case 2:
                        height = getHeight() - i10;
                        i9 = height - this.f1693d.getMeasuredHeight();
                        width = (((getWidth() - this.f1693d.getMeasuredWidth()) + this.t) - this.u) / 2;
                        measuredWidth = (((getWidth() + this.f1693d.getMeasuredWidth()) + this.t) - this.u) / 2;
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                    case 3:
                        height = this.f1693d.getMeasuredHeight() + i9;
                        width = (((getWidth() - this.f1693d.getMeasuredWidth()) + this.t) - this.u) / 2;
                        measuredWidth = (((getWidth() + this.f1693d.getMeasuredWidth()) + this.t) - this.u) / 2;
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                    case 4:
                        height = getHeight() - i10;
                        i9 = height - this.f1693d.getMeasuredHeight();
                        measuredWidth = getWidth() - i8;
                        width = measuredWidth - this.f1693d.getMeasuredWidth();
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                    case 5:
                        height = this.f1693d.getMeasuredHeight() + i9;
                        measuredWidth = getWidth() - i8;
                        width = measuredWidth - this.f1693d.getMeasuredWidth();
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                    default:
                        measuredHeight = getHeight() - i10;
                        measuredWidth = this.f1693d.getMeasuredWidth() + i7;
                        i9 = measuredHeight - this.f1693d.getMeasuredHeight();
                        int i112 = measuredHeight;
                        width = i7;
                        height = i112;
                        this.f1693d.layout(width, i9, measuredWidth, height);
                        break;
                }
            } else if (childAt == this.f) {
                if (this.f.a()) {
                    a(this.f);
                    if (this.h == null) {
                        int height2 = (int) (((getHeight() - 15) * f) + this.v);
                        int width2 = (int) (((getWidth() - 15) * f2) + this.t);
                        int measuredWidth2 = width2 - this.f.getMeasuredWidth();
                        int measuredHeight2 = height2 - this.f.getMeasuredHeight();
                        if (this.q == 4) {
                            height2 -= this.f1693d.getMeasuredHeight();
                            measuredHeight2 -= this.f1693d.getMeasuredHeight();
                        }
                        this.f.layout(measuredWidth2, measuredHeight2, width2, height2);
                    } else {
                        this.f.layout(this.h.x, this.h.y, this.h.x + this.f.getMeasuredWidth(), this.h.y + this.f.getMeasuredHeight());
                    }
                }
            } else if (childAt == this.j) {
                a(this.j);
                if (this.g == null) {
                    this.y = this.j.getMeasuredWidth();
                    this.x = this.j.getMeasuredHeight();
                    int i12 = (int) (this.t + (5.0f * f2));
                    int height3 = (getHeight() - ((int) ((this.w + (f * 5.0f)) + 56.0f))) - this.f1693d.getMeasuredHeight();
                    this.j.layout(i12, height3, this.y + i12, this.x + height3);
                } else {
                    this.j.layout(this.g.x, this.g.y, this.g.x + this.j.getMeasuredWidth(), this.g.y + this.j.getMeasuredHeight());
                }
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MapViewLayoutParams) {
                    MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                    Point a2 = mapViewLayoutParams.f1635c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.f1634b : this.f1691b.b().a(CoordUtil.ll2mc(mapViewLayoutParams.f1633a));
                    a(childAt);
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    float f5 = mapViewLayoutParams.f1636d;
                    int i13 = (int) (a2.x - (f5 * measuredWidth3));
                    int i14 = ((int) (a2.y - (mapViewLayoutParams.e * measuredHeight3))) + mapViewLayoutParams.f;
                    childAt.layout(i13, i14, measuredWidth3 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    public final void onPause() {
        this.f1691b.d();
    }

    public final void onResume() {
        this.f1691b.c();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null || this.f1692c == null) {
            return;
        }
        bundle.putParcelable("mapstatus", this.f1692c.getMapStatus());
        if (this.g != null) {
            bundle.putParcelable("scalePosition", this.g);
        }
        if (this.h != null) {
            bundle.putParcelable("zoomPosition", this.h);
        }
        bundle.putBoolean("mZoomControlEnabled", this.r);
        bundle.putBoolean("mScaleControlEnabled", this.s);
        bundle.putInt("logoPosition", this.q);
        bundle.putInt("paddingLeft", this.t);
        bundle.putInt("paddingTop", this.v);
        bundle.putInt("paddingRight", this.u);
        bundle.putInt("paddingBottom", this.w);
        bundle.putString("customMapPath", i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f1693d) {
            return;
        }
        super.removeView(view);
    }

    public final void setLogoPosition(LogoPosition logoPosition) {
        if (logoPosition == null) {
            this.q = LogoPosition.logoPostionleftBottom.ordinal();
        }
        this.q = logoPosition.ordinal();
        requestLayout();
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.t = i2;
        this.v = i3;
        this.u = i4;
        this.w = i5;
    }

    public void setScaleControlPosition(Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.g = point;
            requestLayout();
        }
    }

    public void setZoomControlsPosition(Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.h = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
        this.s = z;
    }

    public void showZoomControls(boolean z) {
        if (this.f.a()) {
            this.f.setVisibility(z ? 0 : 8);
            this.r = z;
        }
    }
}
