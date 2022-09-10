package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxtc  reason: default package */
/* loaded from: classes5.dex */
public final class cxtc implements View.OnClickListener {
    final /* synthetic */ cxti a;

    public cxtc(cxti cxtiVar) {
        this.a = cxtiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cxti cxtiVar = this.a;
        cxtiVar.f.d(cxtiVar.g);
    }
}
