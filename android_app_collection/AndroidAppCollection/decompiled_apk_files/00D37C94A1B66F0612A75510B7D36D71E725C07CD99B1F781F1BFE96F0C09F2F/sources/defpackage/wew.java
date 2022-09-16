package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wew  reason: default package */
/* loaded from: classes4.dex */
public final class wew implements View.OnClickListener {
    final /* synthetic */ wfh a;
    private final /* synthetic */ int b;

    public wew(wfh wfhVar) {
        this.a = wfhVar;
    }

    public /* synthetic */ wew(wfh wfhVar, int i) {
        this.b = i;
        this.a = wfhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.k();
        } else {
            this.a.k();
        }
    }
}
