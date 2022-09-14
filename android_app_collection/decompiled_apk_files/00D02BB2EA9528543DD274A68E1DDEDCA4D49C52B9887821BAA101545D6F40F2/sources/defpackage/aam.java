package defpackage;

import android.database.DataSetObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aam  reason: default package */
/* loaded from: classes2.dex */
public final class aam extends DataSetObserver {
    final /* synthetic */ aaq a;

    public aam(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.m()) {
            this.a.MY();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
