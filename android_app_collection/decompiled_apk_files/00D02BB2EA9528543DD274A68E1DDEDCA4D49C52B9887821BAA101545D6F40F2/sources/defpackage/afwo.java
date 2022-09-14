package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: afwo  reason: default package */
/* loaded from: classes.dex */
public interface afwo {
    public static final dcdn<afwm, Collection<afwm>> b;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(afwm.TRAFFIC, dcep.D(afwm.BICYCLING, afwm.TERRAIN, afwm.TRANSIT));
        dcdgVar.f(afwm.TRANSIT, dcep.D(afwm.BICYCLING, afwm.TERRAIN, afwm.TRAFFIC));
        dcdgVar.f(afwm.BICYCLING, dcep.C(afwm.TRAFFIC, afwm.TRANSIT));
        dcdgVar.f(afwm.SATELLITE, dcep.B(afwm.TERRAIN));
        dcdgVar.f(afwm.TERRAIN, dcep.D(afwm.TRAFFIC, afwm.TRANSIT, afwm.SATELLITE));
        b = dcdgVar.b();
    }

    void b(afwn... afwnVarArr);

    boolean c(afwm afwmVar, boolean z);

    boolean d(afwm afwmVar);

    void e(afwm afwmVar);

    @Deprecated
    void f(boolean z);

    @Deprecated
    void g(boolean z);

    @Deprecated
    void h(boolean z);

    @Deprecated
    void i(boolean z);

    @Deprecated
    void j(boolean z);
}
