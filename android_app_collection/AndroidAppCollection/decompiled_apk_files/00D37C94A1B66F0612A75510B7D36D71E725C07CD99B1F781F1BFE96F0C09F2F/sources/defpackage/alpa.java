package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: alpa  reason: default package */
/* loaded from: classes.dex */
final class alpa implements View.OnFocusChangeListener {
    final /* synthetic */ alpi a;

    public alpa(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        alpi alpiVar = this.a;
        alpiVar.a(alpiVar.d());
    }
}
