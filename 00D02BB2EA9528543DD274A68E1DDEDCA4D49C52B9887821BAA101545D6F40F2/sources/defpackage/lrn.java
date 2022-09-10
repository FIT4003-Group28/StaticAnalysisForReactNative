package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lrn  reason: default package */
/* loaded from: classes7.dex */
public class lrn implements lrl {
    private final crem a;
    private final lrk b;
    private final crek c = new crek(this) { // from class: lrm
        private final lrn a;

        {
            this.a = this;
        }

        @Override // defpackage.crek
        public final void a() {
            cqkx.p(this.a);
        }
    };

    public lrn(crem cremVar, lrk lrkVar, cqhn cqhnVar) {
        this.a = cremVar;
        this.b = lrkVar;
    }

    @Override // defpackage.lrl
    public cqkl a() {
        lju ljuVar = ((lja) this.b).a;
        ljt ljtVar = ljuVar.f;
        not notVar = ljuVar.q;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        ngp a = jvhVar.aB.a(jvhVar.y);
        jvh jvhVar2 = jvgVar.e;
        nfg nfgVar = jvhVar2.aR;
        cqkj cqkjVar = jvhVar2.v;
        kxu kxuVar = jvhVar2.C;
        lxh t = jvgVar.a.t();
        jvh jvhVar3 = jvgVar.e;
        kdg kdgVar = jvhVar3.u;
        final noo nooVar = jvhVar3.y;
        nooVar.getClass();
        Runnable runnable = new Runnable(nooVar) { // from class: jvb
            private final noo a;

            {
                this.a = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        final noo nooVar2 = jvgVar.e.y;
        nooVar2.getClass();
        ljuVar.p.k(nfgVar.a(cqkjVar, notVar, kxuVar, t, kdgVar, runnable, new Runnable(nooVar2) { // from class: jvc
            private final noo a;

            {
                this.a = nooVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, jvgVar.e.v.d.getString(R.string.MENU_GUIDANCE_AUDIO), false, dcdc.g(new nfz(5, a), new nfz(6, a)), jvgVar.e.bc, new cjsz(dtxm.cy), cjtd.a(dtxm.dW), cjtd.a(dtxm.dV)));
        ljuVar.l();
        ljuVar.D = lrj.a;
        return cqkl.a;
    }

    @Override // defpackage.lrl
    public Boolean b(cren crenVar) {
        return Boolean.valueOf(this.a.f() == crenVar);
    }

    public void c() {
        this.a.a(this.c);
    }

    public void d() {
        this.a.b(this.c);
    }
}
