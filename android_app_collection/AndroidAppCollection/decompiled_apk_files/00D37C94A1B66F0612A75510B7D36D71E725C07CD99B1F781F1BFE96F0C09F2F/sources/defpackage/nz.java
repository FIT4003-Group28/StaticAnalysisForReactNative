package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nz  reason: default package */
/* loaded from: classes3.dex */
public final class nz implements abv {
    final /* synthetic */ oa a;

    public nz(oa oaVar) {
        this.a = oaVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        oc delegate = this.a.getDelegate();
        delegate.k();
        this.a.getSavedStateRegistry().a("androidx:appcompat");
        delegate.z();
    }
}
