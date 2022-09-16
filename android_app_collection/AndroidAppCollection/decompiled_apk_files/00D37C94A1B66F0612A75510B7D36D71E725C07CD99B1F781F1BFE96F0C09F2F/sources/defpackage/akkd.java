package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akkd  reason: default package */
/* loaded from: classes.dex */
final class akkd implements View.OnClickListener {
    final /* synthetic */ akki a;

    public akkd(akki akkiVar) {
        this.a = akkiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
