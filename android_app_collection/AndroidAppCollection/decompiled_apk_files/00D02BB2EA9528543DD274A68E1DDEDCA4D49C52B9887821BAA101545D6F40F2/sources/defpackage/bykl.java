package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bykl  reason: default package */
/* loaded from: classes4.dex */
public final class bykl implements View.OnClickListener {
    final /* synthetic */ byko a;

    public bykl(byko bykoVar) {
        this.a = bykoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byko bykoVar = this.a;
        if (((ges) bykoVar.b).aD) {
            bykoVar.a.onBackPressed();
        }
    }
}
