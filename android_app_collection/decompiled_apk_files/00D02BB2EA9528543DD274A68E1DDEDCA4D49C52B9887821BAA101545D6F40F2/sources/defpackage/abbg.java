package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: abbg  reason: default package */
/* loaded from: classes2.dex */
public final class abbg implements abaz {
    public final abbe a;
    public final Runnable b;
    @dzsi
    private final alax c;
    @dzsi
    private final akqi d;
    private final akox e;
    private final hwe f;
    private final gll g;
    private final dxio<akzh> h;
    private final abbf i;
    private final Resources j;
    private final abba k;

    public abbg(abbe abbeVar, final Runnable runnable, alay alayVar, akox akoxVar, hwe hweVar, gll gllVar, dxio<akzh> dxioVar, btrm btrmVar, Resources resources, bvrb bvrbVar, final abba abbaVar) {
        Object b;
        this.a = abbeVar;
        Runnable runnable2 = new Runnable(this, abbaVar, runnable) { // from class: abbb
            private final abbg a;
            private final abba b;
            private final Runnable c;

            {
                this.a = this;
                this.b = abbaVar;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                abbg abbgVar = this.a;
                abba abbaVar2 = this.b;
                Runnable runnable3 = this.c;
                abbaVar2.b(((abaw) abbgVar.a).b);
                runnable3.run();
            }
        };
        this.b = runnable2;
        dmni dmniVar = ((abaw) abbeVar).c;
        akqi akqiVar = null;
        if (dmniVar != null) {
            this.c = alay.c(dmniVar, akoxVar, new abbc(bvrbVar, runnable2));
            dmpp dmppVar = dmniVar.e;
            if ((dmppVar == null ? dmpp.b : dmppVar).a.size() == 1) {
                dmpp dmppVar2 = dmniVar.e;
                dmpn dmpnVar = (dmppVar2 == null ? dmpp.b : dmppVar2).a.get(0);
                dsqv<dmpn, dmol> dsqvVar = dmnl.L;
                dmpnVar.f(dsqvVar);
                Object l = dmpnVar.V.l(dsqvVar.d);
                if (l == null) {
                    b = dsqvVar.b;
                } else {
                    b = dsqvVar.b(l);
                }
                dmol dmolVar = (dmol) b;
                int i = dmolVar.a;
                if ((i & 8) != 0 && (i & 16) != 0) {
                    akqiVar = new akqi(dmolVar.e, dmolVar.f);
                }
            }
            this.d = akqiVar;
        } else {
            this.c = null;
            this.d = null;
        }
        this.i = new abbf(this, btrmVar);
        this.e = akoxVar;
        this.f = hweVar;
        this.g = gllVar;
        this.h = dxioVar;
        this.j = resources;
        this.k = abbaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        r4 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r8 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        r1.e(r4);
        r46.c.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbg.a():void");
    }

    public final void b() {
        akyc n;
        akqs akqsVar = ((abaw) this.a).f;
        if (akqsVar == null) {
            return;
        }
        bnuw A = this.h.a().A();
        Rect e = this.g.e();
        if (e.width() <= 0 || e.height() <= 0) {
            n = akyt.n(akqsVar, 0, 0, 0, 0);
        } else {
            n = akqo.l(akqsVar, e.height(), e.width(), (double) this.h.a().B()) > 17.0d ? akyt.j(akqsVar.c(), 17.0f, e) : akyt.n(akqsVar, e.left, A.a() - e.right, e.top, A.b() - e.bottom);
        }
        n.b = 250;
        this.e.p(n);
    }

    @Override // defpackage.abaz
    public final void c() {
        if (((abaw) this.a).e != null) {
            abbf abbfVar = this.i;
            if (abbfVar.b) {
                abbfVar.a.a(abbfVar);
                abbfVar.b = false;
            }
            this.f.c();
        }
        if (((abaw) this.a).d != null) {
            this.e.Q("MAJOR_EVENT_LAYER");
        }
        alax alaxVar = this.c;
        if (alaxVar != null) {
            alaxVar.b();
        }
        alax alaxVar2 = this.c;
        if (alaxVar2 != null) {
            alaxVar2.c();
        }
    }
}
