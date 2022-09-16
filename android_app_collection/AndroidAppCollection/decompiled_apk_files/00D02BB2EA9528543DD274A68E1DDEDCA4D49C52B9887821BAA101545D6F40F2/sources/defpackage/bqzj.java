package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqzj  reason: default package */
/* loaded from: classes4.dex */
public final class bqzj implements View.OnClickListener {
    final /* synthetic */ gga a;
    final /* synthetic */ bqzm b;

    public bqzj(bqzm bqzmVar, gga ggaVar) {
        this.b = bqzmVar;
        this.a = ggaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b.aD) {
            this.a.s();
        }
    }
}
