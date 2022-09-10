package defpackage;

import android.database.DataSetObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafx  reason: default package */
/* loaded from: classes5.dex */
public final class dafx extends DataSetObserver {
    final /* synthetic */ dagg a;

    public dafx(dagg daggVar) {
        this.a = daggVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.m();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
