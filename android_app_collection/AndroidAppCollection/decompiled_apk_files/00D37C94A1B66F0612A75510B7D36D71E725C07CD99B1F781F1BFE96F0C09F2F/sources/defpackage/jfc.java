package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jfc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jfc implements View.OnClickListener {
    public final /* synthetic */ jff a;
    private final /* synthetic */ int b;

    public /* synthetic */ jfc(jff jffVar, int i) {
        this.b = i;
        this.a = jffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            jff jffVar = this.a;
            jffVar.a.d(jffVar.h, jffVar.o.b);
        } else if (i == 1) {
            jff jffVar2 = this.a;
            jffVar2.a.b(jffVar2.q ? aspb.INDIFFERENT : aspb.LIKE, jffVar2.h);
        } else if (i == 2) {
            jff jffVar3 = this.a;
            jffVar3.b.f(jffVar3.h, ahbt.a(false));
        } else {
            this.a.t.performClick();
        }
    }
}
