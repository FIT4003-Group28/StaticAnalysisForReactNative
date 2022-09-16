package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wbk  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wbk implements View.OnClickListener {
    public final /* synthetic */ wbc a;
    private final /* synthetic */ int b;

    public /* synthetic */ wbk(wbc wbcVar, int i) {
        this.b = i;
        this.a = wbcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.j(7);
        } else if (i == 1) {
            this.a.b();
        } else if (i == 2) {
            this.a.b();
        } else if (i == 3) {
            this.a.j(7);
        } else if (i == 4) {
            this.a.j(6);
        } else {
            this.a.b();
        }
    }
}
