package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: xbk  reason: default package */
/* loaded from: classes7.dex */
public final class xbk {
    public final eeu a;
    public final amrg b;
    public final xbq c;
    public final vtn d;
    public final btti e;
    public final Map<akqi, xbp> f = new dzqz();
    public dcep<String> g = dcmr.a;

    public xbk(eeu eeuVar, akox akoxVar, xbq xbqVar, vtn vtnVar, btti bttiVar) {
        this.a = eeuVar;
        this.b = akoxVar.aj().ak();
        this.c = xbqVar;
        this.d = vtnVar;
        this.e = bttiVar;
    }

    public final void a() {
        dcdc r;
        synchronized (this) {
            r = dcdc.r(((dznt) this.f).values());
            this.f.clear();
            this.g = dcmr.a;
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ((xbp) r.get(i)).a(this.b);
        }
    }
}
