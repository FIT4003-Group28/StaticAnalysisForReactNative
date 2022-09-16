package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: eiq  reason: default package */
/* loaded from: classes3.dex */
final class eiq implements DialogInterface.OnClickListener {
    final /* synthetic */ eir a;

    public eiq(eir eirVar) {
        this.a = eirVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        eir eirVar = this.a;
        apvf apvfVar = eirVar.e;
        if ((apvfVar.b & 64) != 0) {
            aafo aafoVar = eirVar.c;
            apzg apzgVar = apvfVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
