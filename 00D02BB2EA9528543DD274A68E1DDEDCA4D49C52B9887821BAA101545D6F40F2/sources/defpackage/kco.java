package defpackage;

import android.content.Context;
import android.text.Html;
import java.util.List;
/* compiled from: PG */
/* renamed from: kco  reason: default package */
/* loaded from: classes7.dex */
public class kco implements kcg {
    private final dier a;
    private final dcdc<cqix<?>> b;

    public kco(Context context, final bvrb bvrbVar, cfon cfonVar, final cfnr cfnrVar, final dier dierVar, final Runnable runnable) {
        dieo dieoVar;
        this.a = dierVar;
        dieq dieqVar = dierVar.b;
        dbsk.a((dieqVar == null ? dieq.f : dieqVar).b == 4);
        dddi j = cfnr.j(dierVar);
        mw<dspd> mwVar = new mw(bvrbVar, cfnrVar, dierVar, runnable) { // from class: kcm
            private final bvrb a;
            private final cfnr b;
            private final dier c;
            private final Runnable d;

            {
                this.a = bvrbVar;
                this.b = cfnrVar;
                this.c = dierVar;
                this.d = runnable;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                bvrb bvrbVar2 = this.a;
                final cfnr cfnrVar2 = this.b;
                final dier dierVar2 = this.c;
                final Runnable runnable2 = this.d;
                final dspd dspdVar = (dspd) obj;
                bvrbVar2.a(new Runnable(cfnrVar2, dspdVar, dierVar2, runnable2) { // from class: kcn
                    private final cfnr a;
                    private final dspd b;
                    private final dier c;
                    private final Runnable d;

                    {
                        this.a = cfnrVar2;
                        this.b = dspdVar;
                        this.c = dierVar2;
                        this.d = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cfnr cfnrVar3 = this.a;
                        dspd dspdVar2 = this.b;
                        dier dierVar3 = this.c;
                        Runnable runnable3 = this.d;
                        bvrj.BACKGROUND_THREADPOOL.c();
                        cfnrVar3.e(dspdVar2, dierVar3);
                        runnable3.run();
                    }
                }, bvrj.BACKGROUND_THREADPOOL, 300L);
            }
        };
        dccx F = dcdc.F();
        dieq dieqVar2 = dierVar.b;
        dieqVar2 = dieqVar2 == null ? dieq.f : dieqVar2;
        if (dieqVar2.b == 4) {
            dieoVar = (dieo) dieqVar2.c;
        } else {
            dieoVar = dieo.d;
        }
        for (dien dienVar : dieoVar.c) {
            F.g(cqgr.fT(new kby(), cfonVar.a(j, dienVar, mwVar)));
        }
        this.b = F.f();
    }

    @Override // defpackage.kcg
    public CharSequence a() {
        dieo dieoVar;
        dieq dieqVar = this.a.b;
        if (dieqVar == null) {
            dieqVar = dieq.f;
        }
        if (dieqVar.b == 4) {
            dieoVar = (dieo) dieqVar.c;
        } else {
            dieoVar = dieo.d;
        }
        return Html.fromHtml(dieoVar.b);
    }

    @Override // defpackage.kcg
    public List<cqix<?>> b() {
        return this.b;
    }
}
