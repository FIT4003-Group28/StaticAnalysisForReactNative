package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jex  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jex implements View.OnClickListener {
    public final /* synthetic */ jfa a;
    private final /* synthetic */ int b;

    public /* synthetic */ jex(jfa jfaVar, int i) {
        this.b = i;
        this.a = jfaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            jfa jfaVar = this.a;
            jfaVar.a.d(jfaVar.h, jfaVar.o.b);
        } else if (i != 1) {
            jfa jfaVar2 = this.a;
            jfaVar2.b.f(jfaVar2.h, ahbt.a(false));
        } else {
            jfa jfaVar3 = this.a;
            jfaVar3.a.b(jfaVar3.q ? aspb.INDIFFERENT : aspb.LIKE, jfaVar3.h);
        }
    }
}
