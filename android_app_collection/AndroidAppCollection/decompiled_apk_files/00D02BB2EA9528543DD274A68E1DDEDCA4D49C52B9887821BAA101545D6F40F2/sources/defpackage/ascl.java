package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ascl  reason: default package */
/* loaded from: classes2.dex */
final class ascl implements View.OnClickListener {
    final /* synthetic */ ascu a;

    public ascl(ascu ascuVar) {
        this.a = ascuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ascu ascuVar = this.a;
        if (!ascuVar.aD) {
            return;
        }
        ascuVar.ba.v();
    }
}
