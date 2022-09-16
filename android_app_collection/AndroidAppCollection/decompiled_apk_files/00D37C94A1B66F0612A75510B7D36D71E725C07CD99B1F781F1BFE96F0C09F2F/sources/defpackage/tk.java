package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: tk  reason: default package */
/* loaded from: classes4.dex */
public final class tk extends sr {
    final /* synthetic */ tq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(tq tqVar, Context context, tb tbVar, View view) {
        super(context, tbVar, view, false);
        this.d = tqVar;
        if (!tbVar.k.o()) {
            View view2 = tqVar.g;
            this.a = view2 == null ? (View) tqVar.f : view2;
        }
        e(tqVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sr
    public final void c() {
        this.d.l = null;
        super.c();
    }
}
