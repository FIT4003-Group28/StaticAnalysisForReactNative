package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bjjb  reason: default package */
/* loaded from: classes3.dex */
final class bjjb implements View.OnFocusChangeListener {
    final /* synthetic */ bjjd a;

    public bjjb(bjjd bjjdVar) {
        this.a = bjjdVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.b = z;
    }
}
