package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xvh  reason: default package */
/* loaded from: classes4.dex */
final class xvh implements View.OnFocusChangeListener {
    final /* synthetic */ xvj a;

    public xvh(xvj xvjVar) {
        this.a = xvjVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        xxe xxeVar;
        if (z || (xxeVar = this.a.am) == null) {
            return;
        }
        xxeVar.c();
    }
}
