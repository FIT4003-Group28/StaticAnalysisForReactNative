package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lah  reason: default package */
/* loaded from: classes3.dex */
public final class lah implements View.OnClickListener {
    final /* synthetic */ awdc a;
    final /* synthetic */ laj b;

    public lah(laj lajVar, awdc awdcVar) {
        this.b = lajVar;
        this.a = awdcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awdc awdcVar = this.a;
        if ((awdcVar.b & 8) != 0) {
            aafo aafoVar = this.b.a;
            apzg apzgVar = awdcVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
