package defpackage;

import java.util.Map;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: cuo  reason: default package */
/* loaded from: classes5.dex */
public final class cuo {
    public final Map<String, cul> a = dcjz.d();
    public final dclb<String> b = dcci.n();
    public final Map<String, djie> c = dcjz.d();
    public final dehq d;
    @dzsi
    public ScheduledFuture<?> e;
    public final dxio<ckcw> f;
    public final cvj g;
    private final dxio<amfi> h;
    private final cqat i;
    private final cjqy j;
    private final cvv k;
    private final dxio<akox> l;

    public cuo(dxio<amfi> dxioVar, cqat cqatVar, dxio<ckcw> dxioVar2, cjqy cjqyVar, dehq dehqVar, cvv cvvVar, dxio<akox> dxioVar3, cvj cvjVar) {
        this.h = dxioVar;
        this.i = cqatVar;
        this.f = dxioVar2;
        this.j = cjqyVar;
        this.d = dehqVar;
        this.k = cvvVar;
        this.l = dxioVar3;
        this.g = cvjVar;
        for (djie djieVar : cvjVar.d) {
            this.c.put(a(djieVar.b), djieVar);
            this.a.put(djieVar.b, cul.LOG_STATUS_NOT_LOGGED);
        }
    }

    public static String a(String str) {
        String valueOf = String.valueOf(Long.toHexString(akqi.b(str).c));
        return valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
    }

    public final void b(djie djieVar) {
        if (!this.a.containsKey(djieVar.b) || this.a.get(djieVar.b) == cul.LOG_STATUS_NOT_LOGGED) {
            String str = djieVar.b;
            akqi f = akqi.f(str);
            if (f == null) {
                bvoo.h("Invalid feature id in promoted places response %s", str);
            } else {
                decs n = f.n();
                cjug cjugVar = new cjug();
                cjugVar.a = new cjte(deaf.AUTOMATED);
                cjugVar.j = this.i;
                cjugVar.h = n;
                cjugVar.g = ddda.Ki;
                cjugVar.k = this.j.G();
                this.j.u(cjugVar.a());
            }
            this.a.put(str, cul.LOG_STATUS_BEING_LOGGED);
            c(djieVar);
        }
    }

    public final void c(djie djieVar) {
        dhph dhphVar = djieVar.f;
        if (dhphVar == null) {
            dhphVar = dhph.e;
        }
        String str = dhphVar.b;
        if (this.g.n) {
            dhjj bZ = dhjl.c.bZ();
            dpwz dpwzVar = dpwz.UNKNOWN_MAP_CONTENT_TYPE;
            int ordinal = this.l.a().A.ordinal();
            if (ordinal == 4) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjl dhjlVar = (dhjl) bZ.b;
                dhjlVar.b = 2;
                dhjlVar.a |= 1;
            } else if (ordinal == 5) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhjl dhjlVar2 = (dhjl) bZ.b;
                dhjlVar2.b = 1;
                dhjlVar2.a |= 1;
            }
            String i = ddae.e.h().i(bZ.bK().bS());
            debv a = debv.a(str);
            a.d("avpromotedplace", i);
            str = a.toString();
        }
        cvg cvgVar = this.g.l;
        if (cvgVar == null) {
            cvgVar = cvg.f;
        }
        if (cvgVar.b) {
            this.k.a(str, new cuk(this));
        } else {
            this.h.a().b(str, "PromotedPlaceDelayedImpressionLogger#EventBusListener#onViewportUpdateEvent", new cun(this, djieVar.b, this.d), true);
        }
    }

    public final void d(String str) {
        if (this.b.contains(str)) {
            this.b.h(str);
            this.a.put(str, cul.LOG_STATUS_NOT_LOGGED);
        }
    }
}
