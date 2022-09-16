package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mji  reason: default package */
/* loaded from: classes3.dex */
final class mji implements View.OnClickListener {
    final /* synthetic */ mjk a;

    public mji(mjk mjkVar) {
        this.a = mjkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mjk mjkVar = this.a;
        apzg apzgVar = mjkVar.c;
        if (apzgVar != null) {
            mjkVar.a.c(apzgVar, null);
        }
    }
}
