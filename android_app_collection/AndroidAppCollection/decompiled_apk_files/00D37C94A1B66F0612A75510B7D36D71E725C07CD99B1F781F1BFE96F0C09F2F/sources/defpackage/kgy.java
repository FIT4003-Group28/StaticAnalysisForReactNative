package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kgy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgy implements View.OnClickListener {
    public final /* synthetic */ khc a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgy(khc khcVar) {
        this.a = khcVar;
    }

    public /* synthetic */ kgy(khc khcVar, int i) {
        this.b = i;
        this.a = khcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            khc khcVar = this.a;
            khcVar.c.c(new abkb(khcVar.p == 2));
            return;
        }
        this.a.e.g();
    }
}
