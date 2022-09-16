package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mig  reason: default package */
/* loaded from: classes3.dex */
final class mig implements View.OnClickListener {
    final /* synthetic */ mih a;

    public mig(mih mihVar) {
        this.a = mihVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apul apulVar = this.a.b;
        if (apulVar != null) {
            apum apumVar = apulVar.d;
            if (apumVar == null) {
                apumVar = apum.a;
            }
            apoj apojVar = apumVar.b;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 16384) == 0) {
                return;
            }
            mih mihVar = this.a;
            aafo aafoVar = mihVar.a;
            apum apumVar2 = mihVar.b.d;
            if (apumVar2 == null) {
                apumVar2 = apum.a;
            }
            apoj apojVar2 = apumVar2.b;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apzg apzgVar = apojVar2.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
