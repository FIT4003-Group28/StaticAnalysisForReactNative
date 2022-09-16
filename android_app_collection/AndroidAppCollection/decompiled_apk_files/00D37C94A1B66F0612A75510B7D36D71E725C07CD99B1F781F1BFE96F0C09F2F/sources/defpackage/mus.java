package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mus  reason: default package */
/* loaded from: classes3.dex */
final class mus implements View.OnFocusChangeListener {
    final /* synthetic */ muu a;

    public mus(muu muuVar) {
        this.a = muuVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.j();
            muu muuVar = this.a;
            if (!muuVar.l) {
                return;
            }
            muuVar.i();
            return;
        }
        muu muuVar2 = this.a;
        if (!muuVar2.h) {
            return;
        }
        mui e = muuVar2.e(muuVar2.f.e);
        this.a.g(!e.a);
        if (e.a) {
            return;
        }
        muu muuVar3 = this.a;
        mvj.b(muuVar3.e, new acte(muuVar3.g.l), e.c);
    }
}
