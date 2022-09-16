package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akkf  reason: default package */
/* loaded from: classes.dex */
public final class akkf implements View.OnClickListener {
    final /* synthetic */ autk a;
    final /* synthetic */ akki b;

    public akkf(akki akkiVar, autk autkVar) {
        this.b = akkiVar;
        this.a = autkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.al.d(new akma());
        this.b.aK(this.a.c);
        this.b.dismiss();
    }
}
