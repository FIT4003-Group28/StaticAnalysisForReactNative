package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wjl  reason: default package */
/* loaded from: classes4.dex */
final class wjl implements View.OnClickListener {
    final /* synthetic */ wjn a;
    private final /* synthetic */ int b;

    public wjl(wjn wjnVar) {
        this.a = wjnVar;
    }

    public wjl(wjn wjnVar, int i) {
        this.b = i;
        this.a = wjnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wjm wjmVar = this.a.ag;
            if (wjmVar == null) {
                return;
            }
            wjmVar.a();
            return;
        }
        wjn wjnVar = this.a;
        aqxo.p(wjn.p(wjnVar.a));
        wjnVar.ah.getClass();
        wjnVar.ag.getClass();
        wjnVar.b.b();
        whv whvVar = new whv(wjnVar, wjnVar.ah);
        asbk asbkVar = wjnVar.e;
        String str = wjnVar.ae;
        String str2 = wjnVar.af;
        atvv atvvVar = wjnVar.a.f;
        if (atvvVar == null) {
            atvvVar = atvv.a;
        }
        apoj apojVar = atvvVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        apzg apzgVar = apojVar.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        whvVar.c(asbkVar, str, str2, apzgVar);
        wjnVar.c.setEnabled(false);
        wjnVar.d.setEnabled(false);
    }
}
