package com.baidu.mapapi.map;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.AssetsLoadUtil;
import com.baidu.platform.comapi.map.GestureDetector$OnDoubleTapListenerC0136i;
import com.baidu.platform.comapi.map.InterfaceC0138k;
import com.baidu.platform.comapi.map.N;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import org.spongycastle.asn1.x509.DisplayText;
@TargetApi(20)
/* loaded from: classes.dex */
public class WearMapView extends ViewGroup implements View.OnApplyWindowInsetsListener {
    public static final int BT_INVIEW = 1;

    /* renamed from: c  reason: collision with root package name */
    private static String f1707c = null;
    private static int q = 0;
    private static int r = 0;
    private static int s = 10;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;

    /* renamed from: a  reason: collision with root package name */
    a f1708a;

    /* renamed from: d  reason: collision with root package name */
    private GestureDetector$OnDoubleTapListenerC0136i f1709d;
    private BaiduMap e;
    private ImageView f;
    private Bitmap g;
    private N h;
    private boolean i;
    private Point j;
    private Point k;
    private RelativeLayout l;
    private SwipeDismissView m;
    public AnimationTask mTask;
    public Timer mTimer;
    public b mTimerHandler;
    private TextView n;
    private TextView o;
    private ImageView p;
    private boolean t;
    private boolean v;
    private boolean w;
    private float x;
    private InterfaceC0138k y;
    private int z;

    /* renamed from: b  reason: collision with root package name */
    private static final String f1706b = MapView.class.getSimpleName();
    private static final SparseArray<Integer> u = new SparseArray<>();

    /* loaded from: classes.dex */
    public class AnimationTask extends TimerTask {
        public AnimationTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 1;
            WearMapView.this.mTimerHandler.sendMessage(message);
        }
    }

    /* loaded from: classes.dex */
    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    /* loaded from: classes.dex */
    enum a {
        ROUND,
        RECTANGLE,
        UNDETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Context> f1716b;

        public b(Context context) {
            this.f1716b = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f1716b.get() == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what != 1 || WearMapView.this.h == null) {
                return;
            }
            WearMapView.this.a(true);
        }
    }

    static {
        u.append(3, 2000000);
        u.append(4, 1000000);
        u.append(5, 500000);
        u.append(6, 200000);
        u.append(7, 100000);
        u.append(8, 50000);
        u.append(9, 25000);
        u.append(10, 20000);
        u.append(11, Integer.valueOf((int) b.a.a.a.a.b.a.DEFAULT_TIMEOUT));
        u.append(12, Integer.valueOf((int) UIMsg.m_AppUI.MSG_APP_GPS));
        u.append(13, Integer.valueOf((int) UIMsg.m_AppUI.MSG_APP_DATA_OK));
        u.append(14, Integer.valueOf((int) NetstatsParserPatterns.NEW_TS_TO_MILLIS));
        u.append(15, Integer.valueOf((int) UIMsg.d_ResultType.SHORT_URL));
        u.append(16, Integer.valueOf((int) DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE));
        u.append(17, 100);
        u.append(18, 50);
        u.append(19, 20);
        u.append(20, 10);
        u.append(21, 5);
        u.append(22, 2);
    }

    public WearMapView(Context context) {
        super(context);
        this.i = true;
        this.t = true;
        this.f1708a = a.ROUND;
        this.v = true;
        this.w = true;
        a(context, (BaiduMapOptions) null);
    }

    public WearMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        this.t = true;
        this.f1708a = a.ROUND;
        this.v = true;
        this.w = true;
        a(context, (BaiduMapOptions) null);
    }

    public WearMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        this.t = true;
        this.f1708a = a.ROUND;
        this.v = true;
        this.w = true;
        a(context, (BaiduMapOptions) null);
    }

    public WearMapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.i = true;
        this.t = true;
        this.f1708a = a.ROUND;
        this.v = true;
        this.w = true;
        a(context, baiduMapOptions);
    }

    private int a(int i, int i2) {
        return i - ((int) Math.sqrt(Math.pow(i, 2.0d) - Math.pow(i2, 2.0d)));
    }

    private void a(int i) {
        if (this.f1709d == null) {
            return;
        }
        switch (i) {
            case 0:
                this.f1709d.onPause();
                b();
                return;
            case 1:
                this.f1709d.onResume();
                c();
                return;
            default:
                return;
        }
    }

    private static void a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        q = point.x;
        r = point.y;
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        a(context);
        setOnApplyWindowInsetsListener(this);
        this.mTimerHandler = new b(context);
        this.mTimer = new Timer();
        if (this.mTimer != null && this.mTask != null) {
            this.mTask.cancel();
        }
        this.mTask = new AnimationTask();
        this.mTimer.schedule(this.mTask, 5000L);
        BMapManager.init();
        a(context, baiduMapOptions, f1707c);
        this.e = new BaiduMap(this.f1709d);
        this.f1709d.a().p(false);
        this.f1709d.a().o(false);
        c(context);
        d(context);
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.h.setVisibility(4);
        }
        e(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.l.setVisibility(4);
        }
        if (baiduMapOptions != null && baiduMapOptions.l != null) {
            this.k = baiduMapOptions.l;
        }
        if (baiduMapOptions == null || baiduMapOptions.k == null) {
            return;
        }
        this.j = baiduMapOptions.k;
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str) {
        if (baiduMapOptions == null) {
            this.f1709d = new GestureDetector$OnDoubleTapListenerC0136i(context, null, str);
        } else {
            this.f1709d = new GestureDetector$OnDoubleTapListenerC0136i(context, baiduMapOptions.a(), str);
        }
        addView(this.f1709d);
        this.y = new u(this);
        this.f1709d.a().a(this.y);
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = layoutParams.width;
        int makeMeasureSpec = i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = layoutParams.height;
        view.measure(makeMeasureSpec, i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void a(View view, boolean z) {
        AnimatorSet animatorSet;
        if (z) {
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, -50.0f), ObjectAnimator.ofFloat(view, "alpha", 1.0f, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED));
            animatorSet.addListener(new x(this, view));
        } else {
            view.setVisibility(0);
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", -50.0f, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(view, "alpha", com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f));
        }
        animatorSet.setDuration(1200L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!this.i) {
            return;
        }
        a(this.h, z);
    }

    private void b() {
        if (this.f1709d != null && !this.t) {
            d();
            this.t = true;
        }
    }

    private void b(Context context) {
        this.m = new SwipeDismissView(context, this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) ((context.getResources().getDisplayMetrics().density * 34.0f) + 0.5f), r);
        this.m.setBackgroundColor(Color.argb(0, 0, 0, 0));
        this.m.setLayoutParams(layoutParams);
        addView(this.m);
    }

    private void c() {
        if (this.f1709d != null && this.t) {
            e();
            this.t = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(android.content.Context r10) {
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
            r9.g = r0
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
            r9.g = r2
        L40:
            android.graphics.Bitmap r0 = r9.g
            if (r0 == 0) goto L57
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r10)
            r9.f = r0
            android.widget.ImageView r10 = r9.f
            android.graphics.Bitmap r0 = r9.g
            r10.setImageBitmap(r0)
            android.widget.ImageView r10 = r9.f
            r9.addView(r10)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.WearMapView.c(android.content.Context):void");
    }

    private void d() {
        if (this.f1709d == null) {
            return;
        }
        this.f1709d.c();
    }

    private void d(Context context) {
        this.h = new N(context, true);
        if (!this.h.a()) {
            return;
        }
        this.h.b(new v(this));
        this.h.a(new w(this));
        addView(this.h);
    }

    private void e() {
        if (this.f1709d == null) {
            return;
        }
        this.f1709d.d();
    }

    private void e(Context context) {
        this.l = new RelativeLayout(context);
        this.l.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.n = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.n.setTextColor(Color.parseColor("#FFFFFF"));
        this.n.setTextSize(2, 11.0f);
        this.n.setTypeface(this.n.getTypeface(), 1);
        this.n.setLayoutParams(layoutParams);
        this.n.setId(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.l.addView(this.n);
        this.o = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.o.setTextColor(Color.parseColor("#000000"));
        this.o.setTextSize(2, 11.0f);
        this.o.setLayoutParams(layoutParams2);
        this.l.addView(this.o);
        this.p = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.n.getId());
        this.p.setLayoutParams(layoutParams3);
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile("icon_scale.9.png", context);
        byte[] ninePatchChunk = loadAssetsFile.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        this.p.setBackgroundDrawable(new NinePatchDrawable(loadAssetsFile, ninePatchChunk, new Rect(), null));
        this.l.addView(this.p);
        addView(this.l);
    }

    public static void setCustomMapStylePath(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("customMapStylePath String is illegal");
        }
        if (!new File(str).exists()) {
            throw new RuntimeException("please check whether the customMapStylePath file exits");
        }
        f1707c = str;
    }

    public static void setMapCustomEnable(boolean z) {
        GestureDetector$OnDoubleTapListenerC0136i.a(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MapViewLayoutParams) {
            super.addView(view, layoutParams);
        }
    }

    public final BaiduMap getMap() {
        this.e.f1552c = this;
        return this.e;
    }

    public final int getMapLevel() {
        return u.get((int) this.f1709d.a().D().f2026a).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.D;
    }

    public int getScaleControlViewWidth() {
        return this.E;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f1708a = windowInsets.isRound() ? a.ROUND : a.RECTANGLE;
        return windowInsets;
    }

    public void onCreate(Context context, Bundle bundle) {
        BaiduMapOptions mapStatus;
        if (bundle == null) {
            return;
        }
        f1707c = bundle.getString("customMapPath");
        if (bundle == null) {
            mapStatus = new BaiduMapOptions();
        } else {
            MapStatus mapStatus2 = (MapStatus) bundle.getParcelable("mapstatus");
            if (this.j != null) {
                this.j = (Point) bundle.getParcelable("scalePosition");
            }
            if (this.k != null) {
                this.k = (Point) bundle.getParcelable("zoomPosition");
            }
            this.v = bundle.getBoolean("mZoomControlEnabled");
            this.w = bundle.getBoolean("mScaleControlEnabled");
            setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
            mapStatus = new BaiduMapOptions().mapStatus(mapStatus2);
        }
        a(context, mapStatus);
    }

    public final void onDestroy() {
        this.f1709d.b();
        if (this.g != null && !this.g.isRecycled()) {
            this.g.recycle();
            this.g = null;
        }
        this.h.b();
        BMapManager.destroy();
        if (this.mTask != null) {
            this.mTask.cancel();
        }
    }

    public final void onDismiss() {
        removeAllViews();
    }

    public final void onEnterAmbient(Bundle bundle) {
        a(0);
    }

    public void onExitAmbient() {
        a(1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (this.h.getVisibility() != 0) {
                    if (this.h.getVisibility() == 4) {
                        if (this.mTimer != null) {
                            if (this.mTask != null) {
                                this.mTask.cancel();
                            }
                            this.mTimer.cancel();
                            this.mTask = null;
                            this.mTimer = null;
                        }
                        a(false);
                        break;
                    }
                } else if (this.mTimer != null) {
                    if (this.mTask != null) {
                        this.mTimer.cancel();
                        this.mTask.cancel();
                    }
                    this.mTimer = null;
                    this.mTask = null;
                    break;
                }
                break;
            case 1:
                this.mTimer = new Timer();
                if (this.mTimer != null && this.mTask != null) {
                    this.mTask.cancel();
                }
                this.mTask = new AnimationTask();
                this.mTimer.schedule(this.mTask, 5000L);
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(20)
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        a(this.f);
        float f2 = 1.0f;
        if (((getWidth() - this.z) - this.A) - this.f.getMeasuredWidth() <= 0 || ((getHeight() - this.B) - this.C) - this.f.getMeasuredHeight() <= 0) {
            this.z = 0;
            this.A = 0;
            this.C = 0;
            this.B = 0;
            f = 1.0f;
        } else {
            f2 = ((getWidth() - this.z) - this.A) / getWidth();
            f = ((getHeight() - this.B) - this.C) / getHeight();
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt == this.f1709d) {
                this.f1709d.layout(0, 0, getWidth(), getHeight());
            } else if (childAt == this.f) {
                int i10 = (int) (this.C + (12.0f * f));
                if (this.f1708a == a.ROUND) {
                    a(this.h);
                    int i11 = q / 2;
                    i8 = a(i11, this.h.getMeasuredWidth() / 2);
                    i7 = s + ((q / 2) - a(i11, i11 - i8));
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i12 = (r - i8) - i10;
                int i13 = q - i7;
                this.f.layout(i13 - this.f.getMeasuredWidth(), i12 - this.f.getMeasuredHeight(), i13, i12);
            } else if (childAt == this.h) {
                if (this.h.a()) {
                    a(this.h);
                    if (this.k == null) {
                        int a2 = (int) ((12.0f * f) + this.B + (this.f1708a == a.ROUND ? a(r / 2, this.h.getMeasuredWidth() / 2) : 0));
                        int measuredWidth = (q - this.h.getMeasuredWidth()) / 2;
                        this.h.layout(measuredWidth, a2, this.h.getMeasuredWidth() + measuredWidth, this.h.getMeasuredHeight() + a2);
                    } else {
                        this.h.layout(this.k.x, this.k.y, this.k.x + this.h.getMeasuredWidth(), this.k.y + this.h.getMeasuredHeight());
                    }
                }
            } else if (childAt == this.l) {
                if (this.f1708a == a.ROUND) {
                    a(this.h);
                    int i14 = q / 2;
                    i6 = a(i14, this.h.getMeasuredWidth() / 2);
                    i5 = s + ((q / 2) - a(i14, i14 - i6));
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                a(this.l);
                if (this.j == null) {
                    int i15 = (int) (this.C + (12.0f * f));
                    this.E = this.l.getMeasuredWidth();
                    this.D = this.l.getMeasuredHeight();
                    int i16 = (int) (this.z + (5.0f * f2) + i5);
                    int i17 = (r - i15) - i6;
                    this.l.layout(i16, i17 - this.l.getMeasuredHeight(), this.E + i16, i17);
                } else {
                    this.l.layout(this.j.x, this.j.y, this.j.x + this.l.getMeasuredWidth(), this.j.y + this.l.getMeasuredHeight());
                }
            } else if (childAt == this.m) {
                a(this.m);
                this.m.layout(0, 0, this.m.getMeasuredWidth(), r);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MapViewLayoutParams) {
                    MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                    Point a3 = mapViewLayoutParams.f1635c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.f1634b : this.f1709d.a().a(CoordUtil.ll2mc(mapViewLayoutParams.f1633a));
                    a(childAt);
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    float f3 = mapViewLayoutParams.f1636d;
                    float f4 = mapViewLayoutParams.e;
                    int i18 = (int) (a3.x - (f3 * measuredWidth2));
                    int i19 = ((int) (a3.y - (f4 * measuredHeight))) + mapViewLayoutParams.f;
                    childAt.layout(i18, i19, measuredWidth2 + i18, measuredHeight + i19);
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null || this.e == null) {
            return;
        }
        bundle.putParcelable("mapstatus", this.e.getMapStatus());
        if (this.j != null) {
            bundle.putParcelable("scalePosition", this.j);
        }
        if (this.k != null) {
            bundle.putParcelable("zoomPosition", this.k);
        }
        bundle.putBoolean("mZoomControlEnabled", this.v);
        bundle.putBoolean("mScaleControlEnabled", this.w);
        bundle.putInt("paddingLeft", this.z);
        bundle.putInt("paddingTop", this.B);
        bundle.putInt("paddingRight", this.A);
        bundle.putInt("paddingBottom", this.C);
        bundle.putString("customMapPath", f1707c);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f) {
            return;
        }
        super.removeView(view);
    }

    public void setOnDismissCallbackListener(OnDismissCallback onDismissCallback) {
        if (this.m == null) {
            return;
        }
        this.m.setCallback(onDismissCallback);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.z = i;
        this.B = i2;
        this.A = i3;
        this.C = i4;
    }

    public void setScaleControlPosition(Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.j = point;
            requestLayout();
        }
    }

    public void setShape(a aVar) {
        this.f1708a = aVar;
    }

    public void setViewAnimitionEnable(boolean z) {
        this.i = z;
    }

    public void setZoomControlsPosition(Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.k = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
        this.w = z;
    }

    public void showZoomControls(boolean z) {
        if (this.h.a()) {
            this.h.setVisibility(z ? 0 : 8);
            this.v = z;
        }
    }
}
