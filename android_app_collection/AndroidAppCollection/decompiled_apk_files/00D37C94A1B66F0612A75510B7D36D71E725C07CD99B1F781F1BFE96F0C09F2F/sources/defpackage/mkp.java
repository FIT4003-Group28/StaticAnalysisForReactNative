package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mkp  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mkp implements View.OnClickListener {
    public final /* synthetic */ mky a;
    private final /* synthetic */ int b;

    public /* synthetic */ mkp(mky mkyVar, int i) {
        this.b = i;
        this.a = mkyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            mky mkyVar = this.a;
            mkyVar.s = -1;
            mkyVar.a.c(mkyVar.g, mkyVar.h);
            mkyVar.d.d(new ajym(mkyVar.i));
            return;
        }
        this.a.k();
    }
}
