package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: blor  reason: default package */
/* loaded from: classes3.dex */
final class blor implements DialogInterface.OnClickListener {
    final /* synthetic */ blvu a;
    final /* synthetic */ blot b;

    public blor(blot blotVar, blvu blvuVar) {
        this.b = blotVar;
        this.a = blvuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        blot blotVar = this.b;
        String str = blot.a.keySet().v().get(i);
        blvu blvuVar = this.a;
        if (!blotVar.aD) {
            return;
        }
        blotVar.c.i(cjtd.a(dtya.bK));
        acgz b = achb.b();
        b.c("ReportAQuestionReason", str);
        if (blvuVar != null && blvuVar.a().a()) {
            b.c("Base64QuestionIdentity", blvuVar.a().b());
        }
        blotVar.aT();
        blotVar.b.a().k(false, false, achc.RIDDLER_QUESTION, b.b());
    }
}
