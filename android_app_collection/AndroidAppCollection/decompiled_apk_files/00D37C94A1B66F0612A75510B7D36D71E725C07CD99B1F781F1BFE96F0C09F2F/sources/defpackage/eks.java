package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: eks  reason: default package */
/* loaded from: classes3.dex */
final class eks implements View.OnClickListener {
    final /* synthetic */ apsi a;
    final /* synthetic */ ekx b;

    public eks(ekx ekxVar, apsi apsiVar) {
        this.b = ekxVar;
        this.a = apsiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apsi apsiVar = this.a;
        if ((apsiVar.b & 1) != 0) {
            aafo aafoVar = this.b.b;
            apzg apzgVar = apsiVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
