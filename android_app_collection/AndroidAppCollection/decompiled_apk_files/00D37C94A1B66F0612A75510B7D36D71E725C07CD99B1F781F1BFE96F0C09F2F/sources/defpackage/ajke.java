package defpackage;

import android.text.TextUtils;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ajke  reason: default package */
/* loaded from: classes.dex */
public final class ajke {
    private static final amuk N;
    private static final amuk O;
    private static final amuk P;
    private static final amuk Q;
    private static final amuk R;
    public static final amuk a;
    public static final Map b;
    public final boolean A;
    public final float B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J  reason: collision with root package name */
    public final float f57J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    private final amup S;
    private final boolean T;
    private final int U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    public final int c;
    public final int d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ajko a2 = ajko.a(1, ajju.g, ajjy.j, ajjs.k);
        ajko a3 = ajko.a(false, ajjt.b, ajjx.t, ajjs.d);
        ajko a4 = ajko.a(false, ajju.c, ajjy.b, ajjs.f);
        ajko a5 = ajko.a(false, ajjt.l, ajjx.u, ajjs.e);
        ajko a6 = ajko.a(false, ajjt.q, ajjy.d, ajjs.i);
        ajko a7 = ajko.a(4, ajju.i, ajjy.c, ajjs.h);
        ajko a8 = ajko.a(false, ajjt.m, ajjy.a, ajjs.g);
        ajko a9 = ajko.a(false, ajjt.a, ajjy.e, ajjs.j);
        ajko a10 = ajko.a(false, ajjt.u, ajjx.r, ajjs.a);
        ajko a11 = ajko.a(false, ajjt.n, ajjx.j, ajjz.e);
        ajko a12 = ajko.a(true, ajjt.i, ajjy.k, ajjs.p);
        ajko a13 = ajko.a(false, ajjt.t, ajjx.o, ajjz.j);
        Float valueOf = Float.valueOf(0.0f);
        N = amuk.A(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, ajko.a(false, ajjt.o, ajjx.k, ajjz.f), ajko.a(Float.valueOf(4.0f), ajju.d, ajjx.b, ajjs.q), ajko.a(false, ajjt.s, ajjx.n, ajjz.i), ajko.a(false, ajjt.p, ajjx.l, ajjz.g), ajko.a(0, ajju.j, ajjx.h, ajjz.c), ajko.a(true, ajju.b, ajjx.p, ajjz.k), ajko.a(true, ajjt.j, ajjx.e, ajjs.u), ajko.a(true, ajjt.r, ajjx.m, ajjz.h), ajko.a(true, ajju.a, ajjx.q, ajjs.b), ajko.a(false, ajjt.d, ajjx.c, ajjs.s), ajko.a(false, ajjt.c, ajjx.a, ajjs.r), ajko.a(false, ajjt.f, ajjy.i, ajjs.o), new ajko(valueOf, ajju.e, ajjy.g, ajjs.m, zto.r), ajko.a("{\"NativeLibLoading\":0.1,\"PbToFb\":0.0,\"FirstRootPreparation\":0.002,\"NativeLibChecking\":0.025,\"FirstRootMeasurement\":0.002,\"TemplateResolution\":3.0E-4,\"FirstRootMaterialization\":0.002,\"TemplateFetching\":3.0E-4,\"ComponentMaterialization\":3.0E-4}", ajju.k, ajjx.i, ajjz.d), ajko.a(1, ajju.h, ajjy.f, ajjs.l), ajko.a(false, ajjt.e, ajjy.h, ajjs.n), ajko.a(valueOf, ajju.f, ajjx.g, ajjz.a), ajko.a(false, ajjt.h, ajjx.d, ajjs.t), ajko.a(false, ajjt.g, ajjx.f, ajjz.b), ajko.a(false, ajjt.k, ajjx.s, ajjs.c));
        O = amuk.z(ajkh.c("litho_layout_thread_pool_multiplier", Float.valueOf(1.0f), ajjv.g), ajkh.c("use_arena_eko_processor", true, ajjv.d), ajkh.c("support_elements_command_extension", true, ajjv.c), ajkh.c("use_elements_logging_contract", true, ajjv.e), ajkh.d("android_image_client", 2, ajjv.i, amup.l("glide_framework", 1, "yt_downloader", 2)), ajkh.c("litho_set_layout_thread_pool_on_rb", false, ajjv.a), ajkh.c("eko_processor_max_lru_cache_size", 30, ajjv.h), ajkh.d("thumbnail_resolution_type", 0, ajjv.j, amup.n("default", 0, "high_resolution_all", 1, "high_resolution_center_crop", 2, "high_resolution_on_center_crop_ratio", 3)), ajkh.c("use_entities_config_resolver_v2", true, ajjv.f), ajkh.c("setup_default_properties", false, ajjv.b));
        ajkh c = ajkh.c("litho_init_range", 4, ajjw.e);
        Float valueOf2 = Float.valueOf(0.5f);
        a = amuk.A(c, ajkh.c("litho_range_ratio", valueOf2, ajjw.c), ajkh.c("recycler_view_item_prefetch", true, ajjv.o), ajkh.c("recycler_view_fixed_size", true, ajjv.n), ajkh.c("recycler_view_disable_view_cache", true, ajjv.m), ajkh.c("use_incremental_mount_for_rb", true, ajjv.s), ajkh.c("use_legacy_visible", false, ajjv.t), ajkh.c("use_size_spec_youtube_element", false, ajjv.u), ajkh.c("use_async_presenter_preparation", false, ajjv.p), ajkh.c("async_prepare_init_range", 4, ajjw.d), ajkh.c("async_prepare_range_ratio", valueOf2, ajjw.a), ajkh.c("use_incremental_mount_for_async_prepare", true, ajjv.r), ajkh.c("use_flatbuffer_runtime", false, ajjv.q), ajkh.c("rebind_after_detach", false, ajjv.l), ajkh.c("horizontal_collection_touch_interceptor", false, ajjv.k), ajkh.c("use_swipe_to_camera_local_config", true, ajjw.b));
        amuk s = amuk.s(ajkh.c("use_incremental_mount_for_rb", false, ajjv.s), ajkh.c("use_incremental_mount_for_async_prepare", false, ajjv.r));
        P = s;
        amuk s2 = amuk.s(ajkh.c("use_incremental_mount_for_rb", false, ajjv.s), ajkh.c("use_incremental_mount_for_async_prepare", false, ajjv.r));
        Q = s2;
        amuk r = amuk.r(ajkh.c("horizontal_collection_touch_interceptor", true, ajjv.k));
        R = r;
        EnumMap enumMap = new EnumMap(ajkb.class);
        b = enumMap;
        enumMap.put((EnumMap) ajkb.ENGAGEMENT, (ajkb) s);
        enumMap.put((EnumMap) ajkb.WATCH, (ajkb) s2);
        enumMap.put((EnumMap) ajkb.HOME, (ajkb) r);
    }

    public ajke() {
    }

    public ajke(amup amupVar, int i, int i2, float f, boolean z, boolean z2, boolean z3, boolean z4, float f2, String str, int i3, boolean z5, int i4, boolean z6, boolean z7, int i5, boolean z8, boolean z9, boolean z10, boolean z11, int i6, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, float f3, boolean z19, boolean z20, int i7, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, float f4, boolean z28, boolean z29, boolean z30) {
        this.S = amupVar;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = z;
        this.T = z2;
        this.g = z3;
        this.h = z4;
        this.i = f2;
        this.j = str;
        this.k = i3;
        this.l = z5;
        this.U = i4;
        this.m = z6;
        this.n = z7;
        this.o = i5;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.t = i6;
        this.u = z12;
        this.v = z13;
        this.w = z14;
        this.x = z15;
        this.y = z16;
        this.z = z17;
        this.A = z18;
        this.B = f3;
        this.C = z19;
        this.D = z20;
        this.E = i7;
        this.V = z21;
        this.F = z22;
        this.G = z23;
        this.W = z24;
        this.H = z25;
        this.I = z26;
        this.X = z27;
        this.f57J = f4;
        this.K = z28;
        this.L = z29;
        this.M = z30;
    }

    public static ajke b(aacz aaczVar) {
        ajkb[] values;
        apyy b2 = aaczVar.b();
        if (b2 == null) {
            return c().a();
        }
        ajka c = c();
        aunf aunfVar = b2.l;
        if (aunfVar == null) {
            aunfVar = aunf.a;
        }
        String str = aunfVar.h;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                amuk amukVar = O;
                int i = ((amxx) amukVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    ajkh ajkhVar = (ajkh) amukVar.get(i2);
                    try {
                        ajkhVar.b(jSONObject, c, "");
                    } catch (ajkg | JSONException e) {
                        String str2 = ajkhVar.a;
                        afus.c(2, 23, str2.length() != 0 ? "Error parsing ElementsLaunchConfig".concat(str2) : new String("Error parsing ElementsLaunchConfig"), e);
                    }
                }
                EnumMap enumMap = new EnumMap(ajkb.class);
                for (ajkb ajkbVar : ajkb.values()) {
                    ajkc a2 = ajkd.a(ajkbVar);
                    d(a2, jSONObject, null);
                    d(a2, jSONObject, ajkbVar);
                    aunf aunfVar2 = b2.l;
                    if (aunfVar2 == null) {
                        aunfVar2 = aunf.a;
                    }
                    if (aunfVar2.i) {
                        a2.b(true);
                    }
                    a2.c = ajkbVar;
                    enumMap.put((EnumMap) ajkbVar, (ajkb) a2.a());
                }
                c.b(enumMap);
            } catch (JSONException e2) {
                afus.c(2, 23, "Error parsing ElementsLaunchConfig", e2);
            }
        }
        aunf aunfVar3 = b2.l;
        if (aunfVar3 == null) {
            aunfVar3 = aunf.a;
        }
        amuk amukVar2 = N;
        int i3 = ((amxx) amukVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ajko ajkoVar = (ajko) amukVar2.get(i4);
            try {
                if (ajkoVar.d.a(aunfVar3)) {
                    Object a3 = ajkoVar.c.a(aunfVar3);
                    ampt amptVar = ajkoVar.e;
                    if (amptVar != null && !amptVar.a(a3)) {
                        String valueOf = String.valueOf(a3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                        sb.append("Value outside of constraint: ");
                        sb.append(valueOf);
                        throw new ajkn(sb.toString());
                    }
                    ajkoVar.b.a(c, a3);
                }
            } catch (ajkn e3) {
                afus.c(2, 23, "Error parsing Mendel ElementsLaunchConfig", e3);
            }
        }
        return c.a();
    }

    public static ajka c() {
        ajkb[] values;
        ajka ajkaVar = new ajka();
        amuk amukVar = O;
        int i = ((amxx) amukVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ajkh) amukVar.get(i2)).a(ajkaVar);
        }
        amuk amukVar2 = N;
        int i3 = ((amxx) amukVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ajko ajkoVar = (ajko) amukVar2.get(i4);
            ajkoVar.b.a(ajkaVar, ajkoVar.a);
        }
        EnumMap enumMap = new EnumMap(ajkb.class);
        for (ajkb ajkbVar : ajkb.values()) {
            ajkc a2 = ajkd.a(ajkbVar);
            a2.c = ajkbVar;
            enumMap.put((EnumMap) ajkbVar, (ajkb) a2.a());
        }
        ajkaVar.b(enumMap);
        return ajkaVar;
    }

    public static void d(ajkc ajkcVar, JSONObject jSONObject, ajkb ajkbVar) {
        String str = ajkbVar != null ? ajkbVar.k : "";
        amuk amukVar = a;
        int i = ((amxx) amukVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ajkh ajkhVar = (ajkh) amukVar.get(i2);
            try {
                ajkhVar.b(jSONObject, ajkcVar, str);
            } catch (ajkg | JSONException e) {
                String str2 = ajkhVar.a;
                afus.c(2, 23, str2.length() != 0 ? "Error parsing ElementsLaunchConfig.SurfaceConfig.".concat(str2) : new String("Error parsing ElementsLaunchConfig.SurfaceConfig."), e);
            }
        }
    }

    public final ajkd a(ajkb ajkbVar) {
        return (ajkd) this.S.get(ajkbVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajke) {
            ajke ajkeVar = (ajke) obj;
            if (this.S.equals(ajkeVar.S) && this.c == ajkeVar.c && this.d == ajkeVar.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(ajkeVar.e) && this.f == ajkeVar.f && this.T == ajkeVar.T && this.g == ajkeVar.g && this.h == ajkeVar.h && Float.floatToIntBits(this.i) == Float.floatToIntBits(ajkeVar.i) && this.j.equals(ajkeVar.j) && this.k == ajkeVar.k && this.l == ajkeVar.l && this.U == ajkeVar.U && this.m == ajkeVar.m && this.n == ajkeVar.n && this.o == ajkeVar.o && this.p == ajkeVar.p && this.q == ajkeVar.q && this.r == ajkeVar.r && this.s == ajkeVar.s && this.t == ajkeVar.t && this.u == ajkeVar.u && this.v == ajkeVar.v && this.w == ajkeVar.w && this.x == ajkeVar.x && this.y == ajkeVar.y && this.z == ajkeVar.z && this.A == ajkeVar.A && Float.floatToIntBits(this.B) == Float.floatToIntBits(ajkeVar.B) && this.C == ajkeVar.C && this.D == ajkeVar.D && this.E == ajkeVar.E && this.V == ajkeVar.V && this.F == ajkeVar.F && this.G == ajkeVar.G && this.W == ajkeVar.W && this.H == ajkeVar.H && this.I == ajkeVar.I && this.X == ajkeVar.X && Float.floatToIntBits(this.f57J) == Float.floatToIntBits(ajkeVar.f57J) && this.K == ajkeVar.K && this.L == ajkeVar.L && this.M == ajkeVar.M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.S.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.T ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.U) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ this.t) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ (true != this.A ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.B)) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ this.E) * 1000003) ^ (true != this.V ? 1237 : 1231)) * 1000003) ^ (true != this.F ? 1237 : 1231)) * 1000003) ^ (true != this.G ? 1237 : 1231)) * 1000003) ^ (true != this.W ? 1237 : 1231)) * 1000003) ^ (true != this.H ? 1237 : 1231)) * 1000003) ^ (true != this.I ? 1237 : 1231)) * 1000003) ^ (true != this.X ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f57J)) * 1000003) ^ (true != this.K ? 1237 : 1231)) * 1000003) ^ (true != this.L ? 1237 : 1231)) * 1000003;
        if (true == this.M) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.S);
        int i = this.c;
        int i2 = this.d;
        float f = this.e;
        boolean z = this.f;
        boolean z2 = this.T;
        boolean z3 = this.g;
        boolean z4 = this.h;
        float f2 = this.i;
        String str = this.j;
        int i3 = this.k;
        boolean z5 = this.l;
        int i4 = this.U;
        boolean z6 = this.m;
        boolean z7 = this.n;
        int i5 = this.o;
        boolean z8 = this.p;
        boolean z9 = this.q;
        boolean z10 = this.r;
        boolean z11 = this.s;
        int i6 = this.t;
        boolean z12 = this.u;
        boolean z13 = this.v;
        boolean z14 = this.w;
        boolean z15 = this.x;
        boolean z16 = this.y;
        boolean z17 = this.z;
        boolean z18 = this.A;
        float f3 = this.B;
        boolean z19 = this.C;
        boolean z20 = this.D;
        int i7 = this.E;
        boolean z21 = this.V;
        boolean z22 = this.F;
        boolean z23 = this.G;
        boolean z24 = this.W;
        boolean z25 = this.H;
        boolean z26 = this.I;
        boolean z27 = this.X;
        float f4 = this.f57J;
        boolean z28 = this.K;
        boolean z29 = this.L;
        boolean z30 = this.M;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1611 + String.valueOf(str).length());
        sb.append("ElementsLaunchConfig{surfaceConfigMap=");
        sb.append(valueOf);
        sb.append(", elementsImageClient=");
        sb.append(i);
        sb.append(", ekoReleaseChannel=");
        sb.append(i2);
        sb.append(", lithoPoolMultiplier=");
        sb.append(f);
        sb.append(", lithoPoolOnRB=");
        sb.append(z);
        sb.append(", useArenaEkoProcessor=");
        sb.append(z2);
        sb.append(", supportElementsCommandExtension=");
        sb.append(z3);
        sb.append(", enableElementsPerformanceMetric=");
        sb.append(z4);
        sb.append(", elementsPerformanceMetricSampleRate=");
        sb.append(f2);
        sb.append(", elementsPerformanceMetricSubSampleRate=");
        sb.append(str);
        sb.append(", elementsPerformanceMetricPipeline=");
        sb.append(i3);
        sb.append(", useElementsLoggingContract=");
        sb.append(z5);
        sb.append(", ekoProcessorMaxLruCacheSize=");
        sb.append(i4);
        sb.append(", useEntitiesConfigResolverV2=");
        sb.append(z6);
        sb.append(", defaultProperties=");
        sb.append(z7);
        sb.append(", thumbnailResolutionType=");
        sb.append(i5);
        sb.append(", androidHorizontalCollectionSwipeProtectorV2=");
        sb.append(z8);
        sb.append(", useStateUpdateReconciliation=");
        sb.append(z9);
        sb.append(", lithoLayoutCanMoveBetweenThreads=");
        sb.append(z10);
        sb.append(", androidUseClipBounds=");
        sb.append(z11);
        sb.append(", lithoPoolMaxSize=");
        sb.append(i6);
        sb.append(", lithoRecyclerBinderOnBindViewHolderListener=");
        sb.append(z12);
        sb.append(", useDynamicProps=");
        sb.append(z13);
        sb.append(", useGlobalLegacyVisible=");
        sb.append(z14);
        sb.append(", reportMissingImageSources=");
        sb.append(z15);
        sb.append(", useFullTreeVisibilityMode=");
        sb.append(z16);
        sb.append(", sectionsConfigurationUseBackgroundChangeSets=");
        sb.append(z17);
        sb.append(", enableIntersectionObserver=");
        sb.append(z18);
        sb.append(", collectionRangeRatio=");
        sb.append(f3);
        sb.append(", useExecutorLithoHandler=");
        sb.append(z19);
        sb.append(", useCompositeDisposableForCommands=");
        sb.append(z20);
        sb.append(", materializationBloatMs=");
        sb.append(i7);
        sb.append(", useImprovedTruncationClickableArea=");
        sb.append(z21);
        sb.append(", useEstimatedViewportCount=");
        sb.append(z22);
        sb.append(", enableNonContainerPadding=");
        sb.append(z23);
        sb.append(", useImprovedTruncationClickableAreaAllVersions=");
        sb.append(z24);
        sb.append(", disableNotifyDataSetChangedOnOrientationChange=");
        sb.append(z25);
        sb.append(", disableMountOnConfigurationChange=");
        sb.append(z26);
        sb.append(", enableElementsPbToFbMetric=");
        sb.append(z27);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(f4);
        sb.append(", enableHorizontalSwipeProtectorForShorts=");
        sb.append(z28);
        sb.append(", enableHorizontalFadedScrim=");
        sb.append(z29);
        sb.append(", enableVerticalFadedScrim=");
        sb.append(z30);
        sb.append("}");
        return sb.toString();
    }
}
