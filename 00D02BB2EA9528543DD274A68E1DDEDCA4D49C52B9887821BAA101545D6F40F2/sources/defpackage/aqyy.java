package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqyy  reason: default package */
/* loaded from: classes.dex */
public final class aqyy implements View.OnClickListener {
    final /* synthetic */ aqzc a;

    public aqyy(aqzc aqzcVar) {
        this.a = aqzcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.w()) {
            this.a.q.i(cjtd.a(dtxv.ej));
            this.a.i(true, false);
        }
    }
}
