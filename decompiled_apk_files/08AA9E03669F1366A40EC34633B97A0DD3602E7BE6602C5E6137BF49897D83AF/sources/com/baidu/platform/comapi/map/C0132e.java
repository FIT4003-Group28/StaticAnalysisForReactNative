package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.baidu.mapapi.MessageCenter;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.ParcelItem;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.GestureDetector$OnDoubleTapListenerC0136i;
import com.baidu.platform.comjni.map.basemap.BaseMapCallback;
import com.baidu.platform.comjni.map.basemap.JNIBaseMap;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"NewApi"})
/* renamed from: com.baidu.platform.comapi.map.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0132e implements com.baidu.platform.comjni.map.basemap.b {
    private static int N;
    private static int O;
    private static List<JNIBaseMap> ai;
    static long k;
    private static final String o = GestureDetector$OnDoubleTapListenerC0136i.class.getSimpleName();
    private Context A;
    private List<AbstractC0131d> B;
    private z C;
    private C0134g D;
    private C0141n E;
    private G F;
    private J G;
    private r H;
    private C0140m I;
    private o J;
    private C0128a K;
    private p L;
    private H M;
    private int P;
    private int Q;
    private int R;
    private VelocityTracker T;
    private long U;
    private long V;
    private long W;
    private long X;
    private int Y;
    private float Z;
    private float aa;
    private boolean ab;
    private long ac;
    private long ad;
    private C0133f ae;
    private String af;
    private C0129b ag;
    private C0130c ah;
    com.baidu.platform.comjni.map.basemap.a g;
    long h;
    boolean i;
    public int j;
    boolean l;
    boolean m;
    boolean n;
    private boolean p;
    private boolean q;
    private L y;
    private K z;

    /* renamed from: a  reason: collision with root package name */
    public float f2056a = 22.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f2057b = 3.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f2058c = 22.0f;
    private boolean r = true;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f2059d = true;
    boolean e = true;
    private boolean w = true;
    private boolean x = false;
    private GestureDetector$OnDoubleTapListenerC0136i.a S = new GestureDetector$OnDoubleTapListenerC0136i.a();
    List<InterfaceC0138k> f = new ArrayList();

    public C0132e(Context context, String str) {
        this.A = context;
        this.af = str;
    }

    private void N() {
        if (!this.t && !this.q && !this.p && !this.u) {
            this.f2056a = this.f2058c;
            return;
        }
        if (this.f2056a > 20.0f) {
            this.f2056a = 20.0f;
        }
        if (D().f2026a <= 20.0f) {
            return;
        }
        D D = D();
        D.f2026a = 20.0f;
        a(D);
    }

    private Activity a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return a(((ContextWrapper) context).getBaseContext());
    }

    private boolean e(Bundle bundle) {
        if (this.g == null) {
            return false;
        }
        return this.g.e(bundle);
    }

    private boolean f(Bundle bundle) {
        if (bundle == null || this.g == null) {
            return false;
        }
        boolean d2 = this.g.d(bundle);
        if (d2) {
            c(d2);
            this.g.b(this.y.f2052a);
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 == com.baidu.platform.comapi.map.EnumC0135h.popup.ordinal()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r0 == com.baidu.platform.comapi.map.EnumC0135h.popup.ordinal()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        r0 = "layer_addr";
        r1 = r3.H.f2052a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = "layer_addr";
        r1 = r3.G.f2052a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "param"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = "param"
            java.lang.Object r4 = r4.get(r0)
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.ground
            int r1 = r1.ordinal()
            if (r0 != r1) goto L1f
            goto L3f
        L1f:
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.arc
            int r1 = r1.ordinal()
            if (r0 < r1) goto L28
            goto L51
        L28:
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.popup
            int r1 = r1.ordinal()
            if (r0 != r1) goto L67
            goto L60
        L31:
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.ground
            int r1 = r1.ordinal()
            if (r0 != r1) goto L49
        L3f:
            java.lang.String r0 = "layer_addr"
            com.baidu.platform.comapi.map.n r1 = r3.E
            long r1 = r1.f2052a
        L45:
            r4.putLong(r0, r1)
            return
        L49:
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.arc
            int r1 = r1.ordinal()
            if (r0 < r1) goto L58
        L51:
            java.lang.String r0 = "layer_addr"
            com.baidu.platform.comapi.map.m r1 = r3.I
            long r1 = r1.f2052a
            goto L45
        L58:
            com.baidu.platform.comapi.map.h r1 = com.baidu.platform.comapi.map.EnumC0135h.popup
            int r1 = r1.ordinal()
            if (r0 != r1) goto L67
        L60:
            java.lang.String r0 = "layer_addr"
            com.baidu.platform.comapi.map.r r1 = r3.H
            long r1 = r1.f2052a
            goto L45
        L67:
            java.lang.String r0 = "layer_addr"
            com.baidu.platform.comapi.map.J r1 = r3.G
            long r1 = r1.f2052a
            goto L45
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.map.C0132e.g(android.os.Bundle):void");
    }

    public static void j(boolean z) {
        ai = com.baidu.platform.comjni.map.basemap.a.d();
        if (ai == null || ai.size() == 0) {
            com.baidu.platform.comjni.map.basemap.a.b(0L, z);
            return;
        }
        com.baidu.platform.comjni.map.basemap.a.b(ai.get(0).f2140a, z);
        for (JNIBaseMap jNIBaseMap : ai) {
            jNIBaseMap.ClearLayer(jNIBaseMap.f2140a, -1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.m = false;
        this.l = false;
        for (InterfaceC0138k interfaceC0138k : this.f) {
            interfaceC0138k.c(D());
        }
    }

    public boolean B() {
        if (this.g != null) {
            return this.g.a(this.F.f2052a);
        }
        return false;
    }

    public boolean C() {
        if (this.g != null) {
            return this.g.a(this.ah.f2052a);
        }
        return false;
    }

    public D D() {
        if (this.g == null) {
            return null;
        }
        Bundle j = this.g.j();
        D d2 = new D();
        d2.a(j);
        return d2;
    }

    public LatLngBounds E() {
        if (this.g == null) {
            return null;
        }
        Bundle k2 = this.g.k();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int i = k2.getInt("maxCoorx");
        int i2 = k2.getInt("minCoorx");
        builder.include(CoordUtil.mc2ll(new GeoPoint(k2.getInt("minCoory"), i))).include(CoordUtil.mc2ll(new GeoPoint(k2.getInt("maxCoory"), i2)));
        return builder.build();
    }

    public int F() {
        return this.P;
    }

    public int G() {
        return this.Q;
    }

    public D H() {
        if (this.g == null) {
            return null;
        }
        Bundle l = this.g.l();
        D d2 = new D();
        d2.a(l);
        return d2;
    }

    public double I() {
        return D().m;
    }

    void J() {
        if (!this.l) {
            this.l = true;
            this.m = false;
            for (InterfaceC0138k interfaceC0138k : this.f) {
                interfaceC0138k.a(D());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        this.l = false;
        if (!this.m) {
            for (InterfaceC0138k interfaceC0138k : this.f) {
                interfaceC0138k.c(D());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L() {
        this.R = 0;
        this.S.e = false;
        this.S.h = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        if (this.g != null) {
            this.g.b();
            this.g = null;
        }
    }

    public float a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (!this.i) {
            return 12.0f;
        }
        if (this.g == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("left", i);
        bundle.putInt("right", i3);
        bundle.putInt("bottom", i4);
        bundle.putInt("top", i2);
        bundle.putInt("hasHW", 1);
        bundle.putInt("width", i5);
        bundle.putInt("height", i6);
        return this.g.c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2, int i3) {
        return com.baidu.platform.comjni.map.basemap.a.a(this.h, i, i2, i3);
    }

    @Override // com.baidu.platform.comjni.map.basemap.b
    public int a(Bundle bundle, long j, int i, Bundle bundle2) {
        if (j == this.D.f2052a) {
            bundle.putString("jsondata", this.D.a());
            bundle.putBundle("param", this.D.b());
            return this.D.g;
        } else if (j == this.C.f2052a) {
            bundle.putString("jsondata", this.C.a());
            bundle.putBundle("param", this.C.b());
            return this.C.g;
        } else if (j == this.J.f2052a) {
            bundle.putBundle("param", this.L.a(bundle2.getInt("x"), bundle2.getInt("y"), bundle2.getInt("zoom")));
            return this.J.g;
        } else if (j != this.y.f2052a) {
            return 0;
        } else {
            bundle.putBundle("param", this.z.a(bundle2.getInt("x"), bundle2.getInt("y"), bundle2.getInt("zoom"), this.A));
            return this.y.g;
        }
    }

    public Point a(GeoPoint geoPoint) {
        return this.M.a(geoPoint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.g = new com.baidu.platform.comjni.map.basemap.a();
        this.g.a();
        this.h = this.g.c();
        this.j = SysOSUtil.getDensityDpi() < 180 ? 18 : SysOSUtil.getDensityDpi() < 240 ? 25 : SysOSUtil.getDensityDpi() < 320 ? 37 : 50;
        String moduleFileName = SysOSUtil.getModuleFileName();
        String appSDCardPath = EnvironmentUtilities.getAppSDCardPath();
        String appCachePath = EnvironmentUtilities.getAppCachePath();
        String appSecondCachePath = EnvironmentUtilities.getAppSecondCachePath();
        int mapTmpStgMax = EnvironmentUtilities.getMapTmpStgMax();
        int domTmpStgMax = EnvironmentUtilities.getDomTmpStgMax();
        int itsTmpStgMax = EnvironmentUtilities.getItsTmpStgMax();
        String str = SysOSUtil.getDensityDpi() >= 180 ? "/h/" : "/l/";
        String str2 = moduleFileName + "/cfg";
        String str3 = appSDCardPath + "/vmp";
        String str4 = str2 + "/a/";
        String str5 = str2 + "/idrres/";
        String str6 = appCachePath + "/tmp/";
        String str7 = appSecondCachePath + "/tmp/";
        Display defaultDisplay = a(this.A).getWindowManager().getDefaultDisplay();
        this.g.a(str2 + str, str3 + str, str6, str7, str3 + str, str4, this.af, str5, defaultDisplay.getWidth(), defaultDisplay.getHeight(), SysOSUtil.getDensityDpi(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, 0);
        this.g.f();
    }

    public void a(float f, float f2) {
        this.f2056a = f;
        this.f2058c = f;
        this.f2057b = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        this.P = i;
        this.Q = i2;
    }

    public void a(Bitmap bitmap) {
        Bundle bundle;
        if (this.g == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("type", 0);
            jSONObject2.put("x", N);
            jSONObject2.put("y", O);
            jSONObject2.put("hidetime", NetstatsParserPatterns.NEW_TS_TO_MILLIS);
            jSONArray.put(jSONObject2);
            jSONObject.put(DataBufferSafeParcelable.DATA_FIELD, jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (bitmap == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            ArrayList arrayList = new ArrayList();
            ParcelItem parcelItem = new ParcelItem();
            Bundle bundle3 = new Bundle();
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(allocate);
            bundle3.putByteArray("imgdata", allocate.array());
            bundle3.putInt("imgindex", bitmap.hashCode());
            bundle3.putInt("imgH", bitmap.getHeight());
            bundle3.putInt("imgW", bitmap.getWidth());
            bundle3.putInt("hasIcon", 1);
            parcelItem.setBundle(bundle3);
            arrayList.add(parcelItem);
            if (arrayList.size() > 0) {
                ParcelItem[] parcelItemArr = new ParcelItem[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    parcelItemArr[i] = (ParcelItem) arrayList.get(i);
                }
                bundle2.putParcelableArray("icondata", parcelItemArr);
            }
            bundle = bundle2;
        }
        b(jSONObject.toString(), bundle);
        this.g.b(this.D.f2052a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Handler handler) {
        MessageCenter.registMessage(UIMsg.m_AppUI.MSG_APP_SAVESCREEN, handler);
        MessageCenter.registMessage(39, handler);
        MessageCenter.registMessage(41, handler);
        MessageCenter.registMessage(49, handler);
        MessageCenter.registMessage(UIMsg.m_AppUI.V_WM_VDATAENGINE, handler);
        MessageCenter.registMessage(50, handler);
        MessageCenter.registMessage(999, handler);
        BaseMapCallback.addLayerDataInterface(this.h, this);
    }

    public void a(LatLngBounds latLngBounds) {
        if (latLngBounds == null || this.g == null) {
            return;
        }
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
        int longitudeE6 = (int) ll2mc2.getLongitudeE6();
        int latitudeE6 = (int) ll2mc.getLatitudeE6();
        Bundle bundle = new Bundle();
        bundle.putInt("maxCoorx", (int) ll2mc.getLongitudeE6());
        bundle.putInt("minCoory", (int) ll2mc2.getLatitudeE6());
        bundle.putInt("minCoorx", longitudeE6);
        bundle.putInt("maxCoory", latitudeE6);
        this.g.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(B b2) {
        new D();
        if (b2 == null) {
            b2 = new B();
        }
        D d2 = b2.f2018a;
        this.v = b2.f;
        this.w = b2.f2021d;
        this.f2059d = b2.e;
        this.e = b2.g;
        this.g.a(d2.a(this));
        this.g.a(A.DEFAULT.ordinal());
        this.r = b2.f2019b;
        if (!b2.f2019b) {
            this.g.a(this.D.f2052a, false);
        } else {
            N = (int) (SysOSUtil.getDensity() * 40.0f);
            O = (int) (SysOSUtil.getDensity() * 40.0f);
            this.D.a(String.format("{\"data\":[{\"x\":%d,\"y\":%d,\"hidetime\":1000}]}", Integer.valueOf(N), Integer.valueOf(O)));
            this.g.a(this.D.f2052a, true);
        }
        int i = b2.f2020c;
        if (i == 2) {
            a(true);
        }
        if (i == 3) {
            this.g.a(this.ae.f2052a, false);
        }
    }

    public void a(D d2) {
        if (this.g == null) {
            return;
        }
        Bundle a2 = d2.a(this);
        a2.putInt("animation", 0);
        a2.putInt("animatime", 0);
        this.g.a(a2);
    }

    public void a(D d2, int i) {
        if (this.g == null) {
            return;
        }
        Bundle a2 = d2.a(this);
        a2.putInt("animation", 1);
        a2.putInt("animatime", i);
        z();
        this.g.a(a2);
    }

    public void a(K k2) {
        this.z = k2;
    }

    void a(AbstractC0131d abstractC0131d) {
        if (this.g == null) {
            return;
        }
        abstractC0131d.f2052a = this.g.a(abstractC0131d.f2054c, abstractC0131d.f2055d, abstractC0131d.f2053b);
        this.B.add(abstractC0131d);
    }

    public void a(InterfaceC0138k interfaceC0138k) {
        this.f.add(interfaceC0138k);
    }

    public void a(p pVar) {
        this.L = pVar;
    }

    public void a(String str, Bundle bundle) {
        if (this.g == null) {
            return;
        }
        this.C.a(str);
        this.C.a(bundle);
        this.g.b(this.C.f2052a);
    }

    public void a(List<Bundle> list) {
        if (this.g == null || list == null) {
            return;
        }
        int size = list.size();
        Bundle[] bundleArr = new Bundle[list.size()];
        for (int i = 0; i < size; i++) {
            g(list.get(i));
            bundleArr[i] = list.get(i);
        }
        this.g.a(bundleArr);
    }

    public void a(boolean z) {
        if (this.g == null) {
            return;
        }
        if (!this.g.a(this.ae.f2052a)) {
            this.g.a(this.ae.f2052a, true);
        }
        this.q = z;
        N();
        this.g.a(this.q);
    }

    @Override // com.baidu.platform.comjni.map.basemap.b
    public boolean a(long j) {
        Iterator<AbstractC0131d> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().f2052a == j) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Point point) {
        if (point != null && this.g != null && point.x >= 0 && point.y >= 0) {
            N = point.x;
            O = point.y;
            this.D.a(String.format("{\"data\":[{\"x\":%d,\"y\":%d,\"hidetime\":1000}]}", Integer.valueOf(N), Integer.valueOf(O)));
            this.g.b(this.D.f2052a);
            return true;
        }
        return false;
    }

    public boolean a(Bundle bundle) {
        if (this.g == null) {
            return false;
        }
        this.y = new L();
        long a2 = this.g.a(this.y.f2054c, this.y.f2055d, this.y.f2053b);
        if (a2 != 0) {
            this.y.f2052a = a2;
            this.B.add(this.y);
            bundle.putLong("sdktileaddr", a2);
            if (e(bundle) && f(bundle)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e0, code lost:
        if (2 == r4.R) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.map.C0132e.a(android.view.MotionEvent):boolean");
    }

    public boolean a(String str, String str2) {
        return this.g.a(str, str2);
    }

    public GeoPoint b(int i, int i2) {
        return this.M.a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.B = new ArrayList();
        this.ae = new C0133f();
        a(this.ae);
        this.ag = new C0129b();
        a(this.ag);
        if (this.g != null) {
            this.g.e(false);
        }
        this.E = new C0141n();
        a(this.E);
        this.J = new o();
        a(this.J);
        this.K = new C0128a();
        a(this.K);
        a(new q());
        this.F = new G();
        a(this.F);
        this.ah = new C0130c();
        a(this.ah);
        this.I = new C0140m();
        a(this.I);
        this.G = new J();
        a(this.G);
        this.D = new C0134g();
        a(this.D);
        this.C = new z();
        a(this.C);
        this.H = new r();
        a(this.H);
    }

    public void b(Bundle bundle) {
        if (this.g == null) {
            return;
        }
        g(bundle);
        this.g.f(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Handler handler) {
        MessageCenter.unregistMessage(UIMsg.m_AppUI.MSG_APP_SAVESCREEN, handler);
        MessageCenter.unregistMessage(41, handler);
        MessageCenter.unregistMessage(49, handler);
        MessageCenter.unregistMessage(39, handler);
        MessageCenter.unregistMessage(UIMsg.m_AppUI.V_WM_VDATAENGINE, handler);
        MessageCenter.unregistMessage(50, handler);
        MessageCenter.unregistMessage(999, handler);
        BaseMapCallback.removeLayerDataInterface(this.h);
    }

    void b(MotionEvent motionEvent) {
        if (this.S.e) {
            return;
        }
        this.ad = motionEvent.getDownTime();
        this.ac = (this.ad - this.ac >= 400 || Math.abs(motionEvent.getX() - this.Z) >= 120.0f || Math.abs(motionEvent.getY() - this.aa) >= 120.0f) ? this.ad : 0L;
        this.Z = motionEvent.getX();
        this.aa = motionEvent.getY();
        a(4, 0, (((int) motionEvent.getY()) << 16) | ((int) motionEvent.getX()));
        this.ab = true;
    }

    public void b(String str, Bundle bundle) {
        if (this.g == null) {
            return;
        }
        this.D.a(str);
        this.D.a(bundle);
        this.g.b(this.D.f2052a);
    }

    public void b(boolean z) {
        this.x = z;
    }

    public void c(Bundle bundle) {
        if (this.g == null) {
            return;
        }
        g(bundle);
        this.g.g(bundle);
    }

    public void c(boolean z) {
        if (this.g == null) {
            return;
        }
        this.g.a(this.y.f2052a, z);
    }

    public boolean c() {
        return this.x;
    }

    boolean c(int i, int i2) {
        return i >= 0 && i <= this.P + 0 && i2 >= 0 && i2 <= this.Q + 0;
    }

    boolean c(MotionEvent motionEvent) {
        if (!this.S.e && System.currentTimeMillis() - k >= 300) {
            if (this.n) {
                for (InterfaceC0138k interfaceC0138k : this.f) {
                    interfaceC0138k.d(b((int) motionEvent.getX(), (int) motionEvent.getY()));
                }
                return true;
            }
            float abs = Math.abs(motionEvent.getX() - this.Z);
            float abs2 = Math.abs(motionEvent.getY() - this.aa);
            float density = (float) (((double) SysOSUtil.getDensity()) > 1.5d ? SysOSUtil.getDensity() * 1.5d : SysOSUtil.getDensity());
            if (this.ab && abs / density <= 3.0f && abs2 / density <= 3.0f) {
                return true;
            }
            this.ab = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < 0) {
                x = 0;
            }
            if (y < 0) {
                y = 0;
            }
            if (this.f2059d) {
                J();
                a(3, 0, (y << 16) | x);
            }
            return false;
        }
        return true;
    }

    public void d(Bundle bundle) {
        if (this.g == null) {
            return;
        }
        g(bundle);
        this.g.h(bundle);
    }

    public void d(boolean z) {
        if (this.g == null) {
            return;
        }
        this.g.a(this.ae.f2052a, z);
    }

    public boolean d() {
        if (this.y == null || this.g == null) {
            return false;
        }
        return this.g.c(this.y.f2052a);
    }

    boolean d(MotionEvent motionEvent) {
        if (this.n) {
            for (InterfaceC0138k interfaceC0138k : this.f) {
                interfaceC0138k.e(b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
            this.n = false;
            return true;
        }
        boolean z = !this.S.e && motionEvent.getEventTime() - this.ad < 400 && Math.abs(motionEvent.getX() - this.Z) < 10.0f && Math.abs(motionEvent.getY() - this.aa) < 10.0f;
        L();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (z) {
            return false;
        }
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        a(5, 0, (y << 16) | x);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.g == null) {
            return;
        }
        this.M = new H(this.g);
    }

    public void e(boolean z) {
        if (this.g == null) {
            return;
        }
        this.u = z;
        this.g.b(this.u);
    }

    public void f(boolean z) {
        if (this.g == null) {
            return;
        }
        this.p = z;
        this.g.c(this.p);
    }

    public boolean f() {
        return this.p;
    }

    public String g() {
        if (this.g == null) {
            return null;
        }
        return this.g.e(this.D.f2052a);
    }

    public void g(boolean z) {
        if (this.g == null) {
            return;
        }
        this.g.d(z);
    }

    public void h(boolean z) {
        if (this.g == null) {
            return;
        }
        this.r = z;
        this.g.a(this.D.f2052a, z);
    }

    public boolean h() {
        return this.u;
    }

    public void i(boolean z) {
        this.g.e(z);
        this.g.d(this.ag.f2052a);
        this.g.d(this.ah.f2052a);
    }

    public boolean i() {
        if (this.g == null) {
            return false;
        }
        return this.g.m();
    }

    public boolean j() {
        return this.q;
    }

    public void k(boolean z) {
        if (this.g == null) {
            return;
        }
        this.s = z;
        this.g.a(this.C.f2052a, z);
    }

    public boolean k() {
        return this.g.a(this.ae.f2052a);
    }

    public void l(boolean z) {
        if (this.g == null) {
            return;
        }
        this.t = z;
        this.g.a(this.J.f2052a, z);
    }

    public boolean l() {
        if (this.g == null) {
            return false;
        }
        return this.g.q();
    }

    public void m() {
        if (this.g == null) {
            return;
        }
        this.g.d(this.E.f2052a);
        this.g.d(this.I.f2052a);
        this.g.d(this.G.f2052a);
        this.g.d(this.H.f2052a);
    }

    public void m(boolean z) {
        this.f2059d = z;
    }

    public void n() {
        if (this.g == null) {
            return;
        }
        this.g.r();
        this.g.b(this.J.f2052a);
    }

    public void n(boolean z) {
        this.e = z;
    }

    public MapBaseIndoorMapInfo o() {
        return this.g.s();
    }

    public void o(boolean z) {
        this.w = z;
    }

    public void p(boolean z) {
        this.v = z;
    }

    public boolean p() {
        return this.g.t();
    }

    public void q(boolean z) {
        if (this.g != null) {
            this.g.a(this.F.f2052a, z);
        }
    }

    public boolean q() {
        return this.r;
    }

    public void r(boolean z) {
        if (this.g != null) {
            this.g.a(this.ah.f2052a, z);
        }
    }

    public boolean r() {
        return this.s;
    }

    public void s() {
        if (this.g == null) {
            return;
        }
        this.g.b(this.J.f2052a);
    }

    public void t() {
        if (this.g == null) {
            return;
        }
        this.g.g();
    }

    public void u() {
        if (this.g == null) {
            return;
        }
        this.g.h();
    }

    public boolean v() {
        return this.f2059d;
    }

    public boolean w() {
        return this.e;
    }

    public boolean x() {
        return this.w;
    }

    public boolean y() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        if (this.l || this.m) {
            return;
        }
        this.m = true;
        for (InterfaceC0138k interfaceC0138k : this.f) {
            interfaceC0138k.a(D());
        }
    }
}
