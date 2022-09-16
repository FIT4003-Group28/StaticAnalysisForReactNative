package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tky  reason: default package */
/* loaded from: classes4.dex */
public final class tky extends tjy {
    private static final Map s;
    private static final Map t;
    private static final Map u;
    private static final Map v;
    private int A;
    private final tlc[] B;
    private final List C;
    public tkz h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public int p;
    public int q;
    public int r;
    private boolean w;
    private boolean x;
    private boolean y;
    private final Set z;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("atos", tly.e(tju.AUDIBLE_TOS));
        linkedHashMap.put("avt", tly.f(tju.AUDIBLE_TOS, hashSet));
        linkedHashMap.put("davs", tly.a(tju.AUDIBLE_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dafvs", tly.a(tju.AUDIBLE_FULLY_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dav", tly.a(tju.AUDIBLE_VIEWABLE_TIME_DELTA));
        linkedHashMap.put("ss", tly.d(tju.SCREEN_SHARE, tjr.b));
        linkedHashMap.put("ssb", tly.g(tju.SCREEN_SHARE_BUCKETS, null, true));
        linkedHashMap.put("t", tly.a(tju.TIMESTAMP));
        s = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("c", tly.d(tju.COVERAGE, tjr.b));
        linkedHashMap2.put("ss", tly.d(tju.SCREEN_SHARE, tjr.b));
        linkedHashMap2.put("a", tly.d(tju.VOLUME, tjr.c));
        linkedHashMap2.put("dur", tly.a(tju.DURATION));
        linkedHashMap2.put("p", tly.e(tju.POSITION));
        linkedHashMap2.put("gmm", tly.a(tju.GROUPM_MEASURABLE_VERSION));
        linkedHashMap2.put("gdr", tly.a(tju.GROUPM_DURATION_REACHED));
        linkedHashMap2.put("t", tly.a(tju.TIMESTAMP));
        HashSet hashSet2 = new HashSet();
        hashSet2.add(0);
        hashSet2.add(2);
        hashSet2.add(4);
        linkedHashMap2.put("at", tly.a(tju.AUDIBLE_TIME));
        linkedHashMap2.put("atos", tly.f(tju.AUDIBLE_TOS, hashSet2));
        linkedHashMap2.put("tos", tly.c(tju.TOS, hashSet2));
        linkedHashMap2.put("mtos", tly.f(tju.MAX_CONSECUTIVE_TOS, hashSet2));
        linkedHashMap2.put("vsv", tly.b("a5"));
        t = Collections.unmodifiableMap(linkedHashMap2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(0);
        hashSet3.add(2);
        hashSet3.add(4);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("a", tly.d(tju.VOLUME, tjr.c));
        linkedHashMap3.put("tos", tly.c(tju.TOS, hashSet3));
        linkedHashMap3.put("at", tly.a(tju.AUDIBLE_TIME));
        linkedHashMap3.put("c", tly.d(tju.COVERAGE, tjr.b));
        linkedHashMap3.put("mtos", tly.f(tju.MAX_CONSECUTIVE_TOS, hashSet3));
        linkedHashMap3.put("dur", tly.a(tju.DURATION));
        linkedHashMap3.put("fs", tly.a(tju.FULLSCREEN));
        linkedHashMap3.put("p", tly.e(tju.POSITION));
        linkedHashMap3.put("vpt", tly.a(tju.PLAY_TIME));
        linkedHashMap3.put("vsv", tly.b("ias_a2"));
        linkedHashMap3.put("gmm", tly.a(tju.GROUPM_MEASURABLE_VERSION));
        linkedHashMap3.put("gdr", tly.a(tju.GROUPM_DURATION_REACHED));
        linkedHashMap3.put("t", tly.a(tju.TIMESTAMP));
        u = Collections.unmodifiableMap(linkedHashMap3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(0);
        hashSet4.add(2);
        hashSet4.add(4);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("tos", tly.c(tju.TOS, hashSet4));
        linkedHashMap4.put("at", tly.a(tju.AUDIBLE_TIME));
        linkedHashMap4.put("c", tly.d(tju.COVERAGE, tjr.b));
        linkedHashMap4.put("mtos", tly.f(tju.MAX_CONSECUTIVE_TOS, hashSet4));
        linkedHashMap4.put("p", tly.e(tju.POSITION));
        linkedHashMap4.put("vpt", tly.a(tju.PLAY_TIME));
        linkedHashMap4.put("vsv", tly.b("dv_a4"));
        linkedHashMap4.put("gmm", tly.a(tju.GROUPM_MEASURABLE_VERSION));
        linkedHashMap4.put("gdr", tly.a(tju.GROUPM_DURATION_REACHED));
        linkedHashMap4.put("t", tly.a(tju.TIMESTAMP));
        linkedHashMap4.put("mv", tly.d(tju.MAX_VOLUME, tjr.b));
        linkedHashMap4.put("qmpt", tly.f(tju.QUARTILE_MAX_CONSECUTIVE_TOS, hashSet4));
        linkedHashMap4.put("qvs", new tkq(tju.QUARTILE_MIN_COVERAGE, new int[]{100, 50, 0}));
        linkedHashMap4.put("qmv", tly.d(tju.QUARTILE_MAX_VOLUME, tjr.b));
        linkedHashMap4.put("qa", tly.a(tju.QUARTILE_AUDIBLE_SINCE_START));
        linkedHashMap4.put("a", tly.d(tju.VOLUME, tjr.c));
        v = Collections.unmodifiableMap(linkedHashMap4);
    }

    public tky(tkz tkzVar, tjq tjqVar) {
        super(new tlc(tjqVar.c));
        this.k = -1L;
        this.A = 1;
        this.B = new tlc[4];
        this.C = new ArrayList();
        this.r = 2;
        this.z = EnumSet.noneOf(tla.class);
        this.h = tkzVar;
    }

    public static final tjt q(tla tlaVar, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sv", tly.b("83"));
        linkedHashMap.put("cb", tly.b("a"));
        linkedHashMap.put("sdk", tly.a(tju.SDK));
        linkedHashMap.put("gmm", tly.a(tju.GROUPM_MEASURABLE_VERSION));
        linkedHashMap.put("a", tly.d(tju.VOLUME, tjr.c));
        linkedHashMap.put("nv", tly.d(tju.MIN_VOLUME, tjr.c));
        linkedHashMap.put("mv", tly.d(tju.MAX_VOLUME, tjr.c));
        linkedHashMap.put("c", tly.d(tju.COVERAGE, tjr.b));
        linkedHashMap.put("nc", tly.d(tju.MIN_COVERAGE, tjr.b));
        linkedHashMap.put("mc", tly.d(tju.MAX_COVERAGE, tjr.b));
        linkedHashMap.put("tos", tly.e(tju.TOS));
        linkedHashMap.put("mtos", tly.e(tju.MAX_CONSECUTIVE_TOS));
        linkedHashMap.put("amtos", tly.e(tju.AUDIBLE_MTOS));
        linkedHashMap.put("p", tly.e(tju.POSITION));
        linkedHashMap.put("cp", tly.e(tju.CONTAINER_POSITION));
        linkedHashMap.put("bs", tly.e(tju.VIEWPORT_SIZE));
        linkedHashMap.put("ps", tly.e(tju.APP_SIZE));
        linkedHashMap.put("scs", tly.e(tju.SCREEN_SIZE));
        linkedHashMap.put("at", tly.a(tju.AUDIBLE_TIME));
        linkedHashMap.put("as", tly.a(tju.AUDIBLE_SINCE_START));
        linkedHashMap.put("dur", tly.a(tju.DURATION));
        linkedHashMap.put("vmtime", tly.a(tju.CURRENT_MEDIA_TIME));
        linkedHashMap.put("dvs", tly.a(tju.VISIBLE_TIME_DELTA));
        linkedHashMap.put("dfvs", tly.a(tju.FULLY_VISIBLE_TIME_DELTA));
        linkedHashMap.put("dtos", tly.a(tju.TOS_DELTA));
        linkedHashMap.put("dtoss", tly.a(tju.TOS_DELTA_SEQUENCE));
        linkedHashMap.put("std", tly.a(tju.GROUPM_VIEWABLE));
        linkedHashMap.put("tcm", tly.a(tju.TIME_CALCULATION_MODE));
        linkedHashMap.put("bt", tly.a(tju.BUFFERING_TIME));
        linkedHashMap.put("pst", tly.a(tju.PLAYBACK_STARTED_TIME));
        linkedHashMap.put("nmt", tly.a(tju.NEGATIVE_MEDIA_TIME));
        linkedHashMap.put("ft", tly.a(tju.FULLSCREEN_TIME));
        linkedHashMap.put("dat", tly.a(tju.AUDIBLE_TIME_DELTA));
        linkedHashMap.put("dft", tly.a(tju.FULLSCREEN_TIME_DELTA));
        linkedHashMap.put("is", tly.a(tju.INSTANTANEOUS_STATE));
        linkedHashMap.put("i0", tly.a(tju.INSTANTANEOUS_STATE_AT_START));
        linkedHashMap.put("i1", tly.a(tju.INSTANTANEOUS_STATE_AT_Q1));
        linkedHashMap.put("i2", tly.a(tju.INSTANTANEOUS_STATE_AT_Q2));
        linkedHashMap.put("i3", tly.a(tju.INSTANTANEOUS_STATE_AT_Q3));
        linkedHashMap.put("ic", tly.a(tju.IMPRESSION_COUNTING_STATE));
        linkedHashMap.put("cs", tly.a(tju.CUMULATIVE_STATE));
        linkedHashMap.put("vpt", tly.a(tju.PLAY_TIME));
        linkedHashMap.put("dvpt", tly.a(tju.PLAY_TIME_DELTA));
        linkedHashMap.put("lte", tly.b("1"));
        linkedHashMap.put("avms", tly.b("nl"));
        if (tlaVar != null && (tlaVar.a() || tlaVar.b())) {
            linkedHashMap.put("qmt", tly.e(tju.QUARTILE_MAX_CONSECUTIVE_TOS));
            linkedHashMap.put("qnc", tly.d(tju.QUARTILE_MIN_COVERAGE, tjr.b));
            linkedHashMap.put("qmv", tly.d(tju.QUARTILE_MAX_VOLUME, tjr.c));
            linkedHashMap.put("qnv", tly.d(tju.QUARTILE_MIN_VOLUME, tjr.c));
        }
        if (tlaVar != null && tlaVar.b()) {
            linkedHashMap.put("c0", tly.h(tju.EXPOSURE_STATE_AT_START, tjr.b));
            linkedHashMap.put("c1", tly.h(tju.EXPOSURE_STATE_AT_Q1, tjr.b));
            linkedHashMap.put("c2", tly.h(tju.EXPOSURE_STATE_AT_Q2, tjr.b));
            linkedHashMap.put("c3", tly.h(tju.EXPOSURE_STATE_AT_Q3, tjr.b));
            linkedHashMap.put("a0", tly.h(tju.VOLUME_STATE_AT_START, tjr.c));
            linkedHashMap.put("a1", tly.h(tju.VOLUME_STATE_AT_Q1, tjr.c));
            linkedHashMap.put("a2", tly.h(tju.VOLUME_STATE_AT_Q2, tjr.c));
            linkedHashMap.put("a3", tly.h(tju.VOLUME_STATE_AT_Q3, tjr.c));
            linkedHashMap.put("ss0", tly.h(tju.SCREEN_SHARE_STATE_AT_START, tjr.b));
            linkedHashMap.put("ss1", tly.h(tju.SCREEN_SHARE_STATE_AT_Q1, tjr.b));
            linkedHashMap.put("ss2", tly.h(tju.SCREEN_SHARE_STATE_AT_Q2, tjr.b));
            linkedHashMap.put("ss3", tly.h(tju.SCREEN_SHARE_STATE_AT_Q3, tjr.b));
            linkedHashMap.put("p0", tly.e(tju.POSITION_AT_START));
            linkedHashMap.put("p1", tly.e(tju.POSITION_AT_Q1));
            linkedHashMap.put("p2", tly.e(tju.POSITION_AT_Q2));
            linkedHashMap.put("p3", tly.e(tju.POSITION_AT_Q3));
            linkedHashMap.put("cp0", tly.e(tju.CONTAINER_POSITION_AT_START));
            linkedHashMap.put("cp1", tly.e(tju.CONTAINER_POSITION_AT_Q1));
            linkedHashMap.put("cp2", tly.e(tju.CONTAINER_POSITION_AT_Q2));
            linkedHashMap.put("cp3", tly.e(tju.CONTAINER_POSITION_AT_Q3));
            amvn t2 = amvn.t(0, 2, 4);
            linkedHashMap.put("mtos1", tly.g(tju.MAX_CONSECUTIVE_TOS_AT_Q1, t2, false));
            linkedHashMap.put("mtos2", tly.g(tju.MAX_CONSECUTIVE_TOS_AT_Q2, t2, false));
            linkedHashMap.put("mtos3", tly.g(tju.MAX_CONSECUTIVE_TOS_AT_Q3, t2, false));
        }
        linkedHashMap.put("psm", tly.a(tju.PER_SECOND_MEASURABLE));
        linkedHashMap.put("psv", tly.a(tju.PER_SECOND_VIEWABLE));
        linkedHashMap.put("psfv", tly.a(tju.PER_SECOND_FULLY_VIEWABLE));
        linkedHashMap.put("psa", tly.a(tju.PER_SECOND_AUDIBLE));
        String b = tjw.b(map, Collections.unmodifiableMap(linkedHashMap), null, null);
        String b2 = tjw.b(map, s, null, null);
        String b3 = tjw.b(map, t, "h", "kArwaWEsTs");
        String b4 = tjw.b(map, u, "h", "b96YPMzfnx");
        String b5 = tjw.b(map, v, "h", "yb8Wev6QDg");
        tjs a = tjt.a();
        a.a = b;
        a.b = b3;
        a.c = b2;
        a.d = b4;
        a.e = b5;
        return a.a();
    }

    @Override // defpackage.tjy
    public final boolean f() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final tjt i(tla tlaVar) {
        boolean z = false;
        if (!this.z.contains(tlaVar) && this.h.b(tlaVar).contains("VIEWABILITY")) {
            z = true;
        }
        Map k = k(z);
        if (tlaVar == tla.GROUPM_VIEWABLE_IMPRESSION) {
            k.put(tju.GROUPM_VIEWABLE, "csm");
        }
        return q(tlaVar, k);
    }

    public final tlc j() {
        tlc[] tlcVarArr = this.B;
        int i = this.A - 1;
        if (tlcVarArr[i] == null) {
            tlcVarArr[i] = new tlc();
        }
        return this.B[this.A - 1];
    }

    public final Map k(boolean z) {
        Map c = c();
        c.put(tju.GROUPM_MEASURABLE_VERSION, 4);
        c.put(tju.VOLUME, Double.valueOf(this.o));
        c.put(tju.DURATION, Integer.valueOf(this.p));
        c.put(tju.CURRENT_MEDIA_TIME, Integer.valueOf(this.q));
        tju tjuVar = tju.TIME_CALCULATION_MODE;
        int i = this.r;
        if (i != 0) {
            c.put(tjuVar, Integer.valueOf(i - 1));
            c.put(tju.BUFFERING_TIME, Long.valueOf(this.i));
            c.put(tju.FULLSCREEN, Boolean.valueOf(this.n));
            c.put(tju.PLAYBACK_STARTED_TIME, Long.valueOf(this.k));
            c.put(tju.NEGATIVE_MEDIA_TIME, Long.valueOf(this.j));
            c.put(tju.MIN_VOLUME, Double.valueOf(((tlc) this.e).g));
            c.put(tju.MAX_VOLUME, Double.valueOf(((tlc) this.e).h));
            c.put(tju.AUDIBLE_TOS, ((tlc) this.e).u.g(1, true));
            c.put(tju.AUDIBLE_MTOS, ((tlc) this.e).u.g(2, false));
            c.put(tju.AUDIBLE_TIME, Long.valueOf(((tlc) this.e).k.b(1)));
            c.put(tju.AUDIBLE_SINCE_START, Boolean.valueOf(((tlc) this.e).h()));
            c.put(tju.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(((tlc) this.e).h()));
            c.put(tju.PLAY_TIME, Long.valueOf(((tlc) this.e).f()));
            c.put(tju.FULLSCREEN_TIME, Long.valueOf(((tlc) this.e).i));
            c.put(tju.GROUPM_DURATION_REACHED, Boolean.valueOf(((tlc) this.e).i()));
            c.put(tju.INSTANTANEOUS_STATE, Integer.valueOf(((tlc) this.e).q.a()));
            if (this.C.size() > 0) {
                tkx tkxVar = (tkx) this.C.get(0);
                c.put(tju.INSTANTANEOUS_STATE_AT_START, tkxVar.d);
                c.put(tju.EXPOSURE_STATE_AT_START, new Double[]{Double.valueOf(tkxVar.a)});
                c.put(tju.VOLUME_STATE_AT_START, new Double[]{Double.valueOf(tkxVar.b)});
                c.put(tju.SCREEN_SHARE_STATE_AT_START, new Double[]{Double.valueOf(tkxVar.c)});
                c.put(tju.POSITION_AT_START, tkxVar.f());
                Integer[] e = tkxVar.e();
                if (e != null && !Arrays.equals(e, tkxVar.f())) {
                    c.put(tju.CONTAINER_POSITION_AT_START, e);
                }
            }
            if (this.C.size() >= 2) {
                tkx tkxVar2 = (tkx) this.C.get(1);
                c.put(tju.INSTANTANEOUS_STATE_AT_Q1, tkxVar2.d);
                c.put(tju.EXPOSURE_STATE_AT_Q1, tkxVar2.b());
                c.put(tju.VOLUME_STATE_AT_Q1, tkxVar2.d());
                c.put(tju.SCREEN_SHARE_STATE_AT_Q1, tkxVar2.c());
                c.put(tju.POSITION_AT_Q1, tkxVar2.f());
                c.put(tju.MAX_CONSECUTIVE_TOS_AT_Q1, tkxVar2.e);
                Integer[] e2 = tkxVar2.e();
                if (e2 != null && !Arrays.equals(e2, tkxVar2.f())) {
                    c.put(tju.CONTAINER_POSITION_AT_Q1, e2);
                }
            }
            if (this.C.size() >= 3) {
                tkx tkxVar3 = (tkx) this.C.get(2);
                c.put(tju.INSTANTANEOUS_STATE_AT_Q2, tkxVar3.d);
                c.put(tju.EXPOSURE_STATE_AT_Q2, tkxVar3.b());
                c.put(tju.VOLUME_STATE_AT_Q2, tkxVar3.d());
                c.put(tju.SCREEN_SHARE_STATE_AT_Q2, tkxVar3.c());
                c.put(tju.POSITION_AT_Q2, tkxVar3.f());
                c.put(tju.MAX_CONSECUTIVE_TOS_AT_Q2, tkxVar3.e);
                Integer[] e3 = tkxVar3.e();
                if (e3 != null && !Arrays.equals(e3, tkxVar3.f())) {
                    c.put(tju.CONTAINER_POSITION_AT_Q2, e3);
                }
            }
            if (this.C.size() >= 4) {
                tkx tkxVar4 = (tkx) this.C.get(3);
                c.put(tju.INSTANTANEOUS_STATE_AT_Q3, tkxVar4.d);
                c.put(tju.EXPOSURE_STATE_AT_Q3, tkxVar4.b());
                c.put(tju.VOLUME_STATE_AT_Q3, tkxVar4.d());
                c.put(tju.SCREEN_SHARE_STATE_AT_Q3, tkxVar4.c());
                c.put(tju.POSITION_AT_Q3, tkxVar4.f());
                c.put(tju.MAX_CONSECUTIVE_TOS_AT_Q3, tkxVar4.e);
                Integer[] e4 = tkxVar4.e();
                if (e4 != null && !Arrays.equals(e4, tkxVar4.f())) {
                    c.put(tju.CONTAINER_POSITION_AT_Q3, e4);
                }
            }
            tju tjuVar2 = tju.CUMULATIVE_STATE;
            int i2 = 0;
            for (tke tkeVar : ((tlc) this.e).q.b.keySet()) {
                i2 |= tkeVar.p;
            }
            c.put(tjuVar2, Integer.valueOf(i2));
            if (z) {
                if (((tlc) this.e).c()) {
                    c.put(tju.TOS_DELTA, Integer.valueOf((int) ((tlc) this.e).l.a()));
                    tju tjuVar3 = tju.TOS_DELTA_SEQUENCE;
                    tlc tlcVar = (tlc) this.e;
                    int i3 = tlcVar.o;
                    tlcVar.o = i3 + 1;
                    c.put(tjuVar3, Integer.valueOf(i3));
                    c.put(tju.AUDIBLE_VIEWABLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).n.a()));
                }
                c.put(tju.VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).e.b(tkh.HALF.f)));
                c.put(tju.FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).e.b(tkh.FULL.f)));
                c.put(tju.AUDIBLE_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).u.b(tkh.HALF.f)));
                c.put(tju.AUDIBLE_FULLY_VISIBLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).u.b(tkh.FULL.f)));
                tju tjuVar4 = tju.IMPRESSION_COUNTING_STATE;
                tkf tkfVar = ((tlc) this.e).q;
                int i4 = 0;
                for (tke tkeVar2 : tkfVar.b.keySet()) {
                    if (!((Boolean) tkfVar.b.get(tkeVar2)).booleanValue()) {
                        i4 |= tkeVar2.o;
                        tkfVar.b.put((EnumMap) tkeVar2, (tke) true);
                    }
                }
                c.put(tjuVar4, Integer.valueOf(i4));
                ((tlc) this.e).u.f();
                ((tlc) this.e).e.f();
                c.put(tju.AUDIBLE_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).k.a()));
                c.put(tju.PLAY_TIME_DELTA, Integer.valueOf((int) ((tlc) this.e).j.a()));
                tju tjuVar5 = tju.FULLSCREEN_TIME_DELTA;
                tlc tlcVar2 = (tlc) this.e;
                int i5 = tlcVar2.m;
                tlcVar2.m = 0;
                c.put(tjuVar5, Integer.valueOf(i5));
            }
            c.put(tju.QUARTILE_MAX_CONSECUTIVE_TOS, j().d());
            c.put(tju.QUARTILE_MIN_COVERAGE, Double.valueOf(j().a));
            c.put(tju.QUARTILE_MAX_VOLUME, Double.valueOf(j().h));
            c.put(tju.QUARTILE_AUDIBLE_SINCE_START, Boolean.valueOf(j().h()));
            c.put(tju.QUARTILE_MIN_VOLUME, Double.valueOf(j().g));
            c.put(tju.PER_SECOND_MEASURABLE, Integer.valueOf(((tlc) this.e).r.b));
            c.put(tju.PER_SECOND_VIEWABLE, Integer.valueOf(((tlc) this.e).r.a));
            c.put(tju.PER_SECOND_FULLY_VIEWABLE, Integer.valueOf(((tlc) this.e).s.a));
            c.put(tju.PER_SECOND_AUDIBLE, Integer.valueOf(((tlc) this.e).t.a));
            return c;
        }
        throw null;
    }

    public final void l() {
        if (!this.w) {
            this.h.d(i(tla.MEASURABLE_IMPRESSION));
            this.w = true;
        }
    }

    public final void m() {
        if (g() && !this.x) {
            this.h.e(i(tla.VIEWABLE_IMPRESSION));
            this.z.add(tla.VIEWABLE_IMPRESSION);
            this.x = true;
        }
        tlc tlcVar = (tlc) this.e;
        if (!tlcVar.j(tlcVar.u.c(1, tkh.FULL.f)) || this.y) {
            return;
        }
        this.h.c(i(tla.GROUPM_VIEWABLE_IMPRESSION));
        this.z.add(tla.GROUPM_VIEWABLE_IMPRESSION);
        this.y = true;
    }

    public final void n(tla tlaVar) {
        this.z.add(tlaVar);
    }

    public final void o(tla tlaVar) {
        if (tlaVar.t < 0) {
            return;
        }
        for (int size = this.C.size(); size <= tlaVar.t; size++) {
            this.C.add(tkx.a().a());
        }
        tjz tjzVar = this.f;
        if (tjzVar == null) {
            return;
        }
        tlc j = j();
        tkw a = tkx.a();
        a.b(tjzVar.a);
        a.k(this.o);
        a.j(tjzVar.b);
        a.a = tjzVar.c;
        a.b = tjzVar.d;
        a.c = Integer.valueOf(((tlc) this.e).q.a());
        if (!tlaVar.equals(tla.START)) {
            a.f(j.a);
            a.c(j.b);
            a.h(j.g);
            a.e(j.h);
            a.g(j.c);
            a.d(j.d);
            a.i(amuk.p(j.e(false)));
        } else {
            a.f(tjzVar.a);
            a.c(tjzVar.a);
            a.h(this.o);
            a.e(this.o);
            a.g(tjzVar.b);
            a.d(tjzVar.b);
        }
        this.C.set(tlaVar.t, a.a());
    }

    public final void p(int i) {
        if (i <= 0 || i > 4) {
            return;
        }
        this.A = i;
    }

    public final void r() {
        this.m = true;
    }
}
