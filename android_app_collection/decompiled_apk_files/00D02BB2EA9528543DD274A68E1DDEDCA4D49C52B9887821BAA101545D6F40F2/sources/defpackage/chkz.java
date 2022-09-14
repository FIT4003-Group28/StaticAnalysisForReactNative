package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chkz  reason: default package */
/* loaded from: classes4.dex */
public class chkz implements chmw {
    private static final cqss r;
    private static final cqss s;
    private static final dcdn<djes, cqss> t;
    private static final dcdn<djes, cqss> u;
    private static final dcdn<djeu, cqtd> v;
    private static final cqss w;
    private static final cqss x;
    public final Activity a;
    public final dxio<afha> b;
    private final djev c;
    private final chlr d;
    private final dzsj<ccif> e;
    private final dzsj<cafi> f;
    private final dzsj<chnm> g;
    private final dzsj<cdfx> h;
    private final dzsj<bwft> i;
    private final dzsj<bjbu> j;
    private final dzsj<ckcw> k;
    private final dzsj<buzm> l;
    private final Executor m;
    private final ddho n;
    private final ddho o;
    private final String p;
    @dzsi
    private final ilo q;

    static {
        iuv b = ibm.b();
        r = b;
        cqss x2 = ibm.x();
        s = x2;
        t = dcdn.n(djes.WHITE, x2, djes.BLUE, b, djes.ORANGE, ibm.t(), djes.TRANSPARENT, b);
        u = dcdn.n(djes.WHITE, b, djes.BLUE, ibm.x(), djes.ORANGE, cqrt.c(R.color.local_guide_promo_color), djes.TRANSPARENT, cqta.f());
        v = dcdn.k(djeu.SHARE, iup.e(R.raw.ic_share_thick_18dp));
        w = x2;
        x = b;
    }

    public chkz(chlr chlrVar, djev djevVar, ddho ddhoVar, ddho ddhoVar2, String str, @dzsi ilo iloVar, dzsj<ccif> dzsjVar, dzsj<cafi> dzsjVar2, dzsj<chnm> dzsjVar3, dzsj<cdfx> dzsjVar4, dzsj<bwft> dzsjVar5, dzsj<bjbu> dzsjVar6, dzsj<ckcw> dzsjVar7, dzsj<buzm> dzsjVar8, Executor executor, Activity activity, dxio<afha> dxioVar) {
        this.d = chlrVar;
        this.e = dzsjVar;
        this.f = dzsjVar2;
        this.g = dzsjVar3;
        this.a = activity;
        this.c = djevVar;
        this.n = ddhoVar;
        this.o = ddhoVar2;
        this.h = dzsjVar4;
        this.i = dzsjVar5;
        this.j = dzsjVar6;
        this.k = dzsjVar7;
        this.l = dzsjVar8;
        this.m = executor;
        this.p = str;
        this.q = iloVar;
        this.b = dxioVar;
    }

    @Override // defpackage.chmw
    public CharSequence a() {
        return this.c.b;
    }

    @Override // defpackage.chmw
    public cjtd b() {
        cjta b = cjtd.b();
        b.g(this.c.d);
        b.b = this.p;
        b.d = this.o;
        return b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
        if (r1 == defpackage.dkcp.CONTRIBUTE) goto L41;
     */
    @Override // defpackage.chmw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl c() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkz.c():cqkl");
    }

    @Override // defpackage.chmw
    public cqss d() {
        dcdn<djes, cqss> dcdnVar = t;
        djes b = djes.b(this.c.g);
        if (b == null) {
            b = djes.UNKNOWN_COLOR;
        }
        return dcdnVar.getOrDefault(b, w);
    }

    @Override // defpackage.chmw
    public cqss e() {
        dcdn<djes, cqss> dcdnVar = u;
        djes b = djes.b(this.c.g);
        if (b == null) {
            b = djes.UNKNOWN_COLOR;
        }
        return dcdnVar.getOrDefault(b, x);
    }

    @Override // defpackage.chmw
    @dzsi
    public cqtd f() {
        if ((this.c.a & 8) != 0) {
            dcdn<djeu, cqtd> dcdnVar = v;
            djeu b = djeu.b(this.c.e);
            if (b == null) {
                b = djeu.UNKNOWN_ICON;
            }
            return (cqtd) dbsg.j(dcdnVar.get(b)).h(new dbrn(this) { // from class: chkw
                private final chkz a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return cqrt.i((cqtd) obj, this.a.d());
                }
            }).f();
        }
        return null;
    }
}
