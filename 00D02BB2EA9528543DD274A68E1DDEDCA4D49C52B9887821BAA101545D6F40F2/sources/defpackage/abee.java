package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abee  reason: default package */
/* loaded from: classes2.dex */
public class abee implements abdr {
    private final dqps a;
    private final abda b;

    public abee(dqps dqpsVar, abcy abcyVar) {
        this.a = dqpsVar;
        abdf abdfVar = abcyVar.a;
        abcv abcvVar = abcyVar.b;
        String str = dqpsVar.a;
        if (abcvVar.c) {
            abcvVar.bF();
            abcvVar.c = false;
        }
        abcx abcxVar = (abcx) abcvVar.b;
        abcx abcxVar2 = abcx.j;
        str.getClass();
        abcxVar.a |= 8;
        abcxVar.e = str;
        abcx bK = abcvVar.bK();
        Executor a = abdfVar.a.a();
        abdf.a(a, 1);
        abdf.a(abdfVar.b.a(), 2);
        cqkj a2 = abdfVar.c.a();
        abdf.a(a2, 3);
        gdc a3 = abdfVar.d.a();
        abdf.a(a3, 4);
        abdn a4 = abdfVar.e.a();
        abdf.a(a4, 5);
        abdb a5 = abdfVar.f.a();
        abdf.a(a5, 6);
        abdf.a(bK, 7);
        abdf.a(dqpsVar, 8);
        this.b = new abde(a, a2, a3, a4, a5, bK, dqpsVar);
    }

    @Override // defpackage.abdr
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.abdr
    public Boolean b() {
        abde abdeVar = (abde) this.b;
        boolean z = true;
        if (abdeVar.f.b.size() <= 0 && !abde.b(abdeVar.f, abdeVar.g)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.abdr
    public cqkl c() {
        if (b().booleanValue()) {
            abda abdaVar = this.b;
            bvrj.UI_THREAD.c();
            final abde abdeVar = (abde) abdaVar;
            abdeVar.a();
            abdn abdnVar = abdeVar.c;
            abcx abcxVar = abdeVar.g;
            Runnable runnable = new Runnable(abdeVar) { // from class: abdc
                private final abde a;

                {
                    this.a = abdeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            };
            abdn.a(abcxVar, 1);
            abdn.a(runnable, 2);
            Activity activity = (Activity) ((dxjd) abdnVar.a).a;
            abdn.a(activity, 3);
            abdo a = abdnVar.b.a();
            abdn.a(a, 4);
            abdm abdmVar = new abdm(abcxVar, runnable, activity, a);
            if (abde.b(abdeVar.f, abdeVar.g)) {
                abdmVar.a(dbsg.i(abdeVar.f), true);
                abdeVar.i = abdeVar.d.a(abdeVar.f.c, abdeVar.g);
                deha.q(abdeVar.i, new abdd(abdmVar), abdeVar.e);
            } else {
                abdmVar.a(dbsg.i(abdeVar.f), false);
            }
            cqkf e = abdeVar.b.e(new abcq());
            e.e(abdmVar);
            gcz a2 = abdeVar.a.a();
            a2.j();
            a2.i = cjtd.a(dtyb.dE);
            abdeVar.h = a2.a();
            abdeVar.h.c(e.c());
            abdeVar.h.show();
        }
        return cqkl.a;
    }
}
