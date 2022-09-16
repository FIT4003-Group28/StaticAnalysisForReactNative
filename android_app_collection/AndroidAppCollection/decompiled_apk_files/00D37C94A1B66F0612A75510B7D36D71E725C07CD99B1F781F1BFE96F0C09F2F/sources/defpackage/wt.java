package defpackage;

import android.database.DataSetObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wt  reason: default package */
/* loaded from: classes4.dex */
public final class wt extends DataSetObserver {
    final /* synthetic */ ww a;

    public wt(ww wwVar) {
        this.a = wwVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
