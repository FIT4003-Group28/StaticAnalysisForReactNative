package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ntu  reason: default package */
/* loaded from: classes7.dex */
final class ntu implements View.OnClickListener {
    final /* synthetic */ nud a;

    public ntu(nud nudVar) {
        this.a = nudVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.callOnClick();
    }
}
