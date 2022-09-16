package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: weq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class weq implements View.OnClickListener {
    public final /* synthetic */ wet a;
    private final /* synthetic */ int b;

    public /* synthetic */ weq(wet wetVar, int i) {
        this.b = i;
        this.a = wetVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wet wetVar = this.a;
            if (!wetVar.b.o()) {
                wetVar.c.b();
                return;
            } else {
                wetVar.i.c(wetVar.a, null, null);
                return;
            }
        }
        this.a.d();
    }
}
