package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abgp  reason: default package */
/* loaded from: classes.dex */
public final class abgp implements aafl {
    public final aafo a;
    public Map b;
    private final Executor c;
    private final aaxi d;

    public abgp(aaxi aaxiVar, Executor executor, aafo aafoVar) {
        executor.getClass();
        this.c = executor;
        aafoVar.getClass();
        this.a = aafoVar;
        aaxiVar.getClass();
        this.d = aaxiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.b = map;
        if (apzgVar == null || !apzgVar.qn(ardj.a)) {
            return;
        }
        final ardi ardiVar = (ardi) apzgVar.qm(ardj.a);
        aaxi aaxiVar = this.d;
        aoob aoobVar = apzgVar.c;
        aaxh aaxhVar = new aaxh(aaxiVar.e, aaxiVar.a.c());
        aaxhVar.j(aoobVar);
        arvh arvhVar = ardiVar.c;
        if (arvhVar == null) {
            arvhVar = arvh.a;
        }
        aaxhVar.a = arvhVar;
        aaxhVar.b = ardiVar.d;
        ylx.k(aaxiVar.b.b(aaxhVar, anjk.a), this.c, new ylv() { // from class: abgn
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                abgp abgpVar = abgp.this;
                ardi ardiVar2 = ardiVar;
                if ((ardiVar2.b & 4) != 0) {
                    aafo aafoVar = abgpVar.a;
                    apzg apzgVar2 = ardiVar2.e;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar.a(apzgVar2);
                }
            }
        }, new ylw() { // from class: abgo
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                acti actiVar;
                abgp abgpVar = abgp.this;
                ardl ardlVar = (ardl) obj;
                Map map2 = abgpVar.b;
                if (map2 != null && (ardlVar.b & 8) != 0 && (actiVar = (acti) zew.K(map2, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class)) != null) {
                    actiVar.n(new acte(ardlVar.e));
                }
                if ((ardlVar.b & 2) != 0) {
                    aafo aafoVar = abgpVar.a;
                    apzg apzgVar2 = ardlVar.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar.a(apzgVar2);
                }
            }
        });
    }
}
