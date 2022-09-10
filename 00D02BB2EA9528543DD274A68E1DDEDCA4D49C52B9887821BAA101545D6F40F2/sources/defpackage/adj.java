package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adj  reason: default package */
/* loaded from: classes2.dex */
public final class adj implements View.OnClickListener {
    final /* synthetic */ adv a;

    public adj(adv advVar) {
        this.a = advVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        adv advVar = this.a;
        if (view == advVar.c) {
            advVar.r();
        } else if (view == advVar.e) {
            advVar.q();
        } else if (view == advVar.d) {
            advVar.p();
        } else if (view == advVar.i) {
            advVar.s();
        } else if (view != advVar.a) {
        } else {
            advVar.u();
        }
    }
}
