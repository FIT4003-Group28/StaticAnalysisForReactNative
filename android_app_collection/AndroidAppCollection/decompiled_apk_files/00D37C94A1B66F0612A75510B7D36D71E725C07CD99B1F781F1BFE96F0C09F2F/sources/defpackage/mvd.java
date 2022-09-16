package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mvd  reason: default package */
/* loaded from: classes3.dex */
final class mvd implements View.OnFocusChangeListener {
    final /* synthetic */ mvf a;

    public mvd(mvf mvfVar) {
        this.a = mvfVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.i();
            mvf mvfVar = this.a;
            if (!mvfVar.i) {
                return;
            }
            mvfVar.b.setText(mvfVar.f.e);
            mvfVar.i = false;
            return;
        }
        mvf mvfVar2 = this.a;
        if (!mvfVar2.g) {
            return;
        }
        mui e = mvfVar2.e(mvfVar2.e.e);
        this.a.g(!e.a);
        if (e.a) {
            return;
        }
        mvf mvfVar3 = this.a;
        mvj.b(mvfVar3.d, new acte(mvfVar3.f.k), e.c);
    }
}
