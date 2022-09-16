package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lmb  reason: default package */
/* loaded from: classes3.dex */
public final class lmb implements aafl {
    public final aafo a;
    private final aaun b;
    private final Executor c;
    private final Context d;
    private final yzj e;
    private final aacz f;

    public lmb(aaun aaunVar, aafo aafoVar, Executor executor, Context context, aacz aaczVar, yzj yzjVar) {
        aaunVar.getClass();
        this.b = aaunVar;
        aafoVar.getClass();
        this.a = aafoVar;
        executor.getClass();
        this.c = executor;
        this.d = context;
        aaczVar.getClass();
        this.f = aaczVar;
        yzjVar.getClass();
        this.e = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        avtj avtjVar = (avtj) apzgVar.qm(avtj.b);
        List F = zgt.F(this.d.getPackageManager());
        atfw atfwVar = this.f.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apgv apgvVar = atfwVar.m;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        List r = apwt.r(F, apgvVar);
        aaun aaunVar = this.b;
        String str = avtjVar.c;
        int bd = awwc.bd(avtjVar.d);
        if (bd == 0) {
            bd = 2;
        }
        String str2 = avtjVar.e;
        anjk anjkVar = anjk.a;
        aaut aautVar = new aaut(aaunVar.e, aaunVar.a.c());
        aautVar.a = str;
        aautVar.b = r;
        aautVar.d = bd;
        aautVar.c = str2;
        ylx.k(aaunVar.c(arna.a, aaunVar.b, aass.t, aauh.d).b(aautVar, anjkVar), this.c, new gmb(this.e, 2), new ylw() { // from class: lma
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                lmb lmbVar = lmb.this;
                arna arnaVar = (arna) obj;
                if ((arnaVar.b & 4) != 0) {
                    aafo aafoVar = lmbVar.a;
                    apzg apzgVar2 = arnaVar.e;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar.a(apzgVar2);
                }
            }
        });
    }
}
