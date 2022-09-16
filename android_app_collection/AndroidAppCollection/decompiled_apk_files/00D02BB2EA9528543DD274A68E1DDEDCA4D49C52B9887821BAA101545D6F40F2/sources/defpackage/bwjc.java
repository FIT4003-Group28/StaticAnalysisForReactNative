package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwjc  reason: default package */
/* loaded from: classes4.dex */
public final class bwjc implements View.OnClickListener {
    final /* synthetic */ bwje a;

    public bwjc(bwje bwjeVar) {
        this.a = bwjeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bwje bwjeVar = this.a;
        if (bwjeVar.aD) {
            bwjeVar.J().onBackPressed();
        }
    }
}
