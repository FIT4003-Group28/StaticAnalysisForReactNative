package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bgsx  reason: default package */
/* loaded from: classes3.dex */
final class bgsx implements View.OnFocusChangeListener {
    final /* synthetic */ bgsy a;

    public bgsx(bgsy bgsyVar) {
        this.a = bgsyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        bgsy bgsyVar = this.a;
        if (bgsyVar.f != z) {
            bgsyVar.f = z;
            cqkx.p(bgsyVar);
        }
        if (z) {
            this.a.b.m(jjn.FULLY_EXPANDED);
            this.a.r();
            return;
        }
        jmw.d(this.a.a, null);
    }
}
