package defpackage;

import android.database.sqlite.SQLiteTransactionListener;
/* compiled from: PG */
/* renamed from: vns  reason: default package */
/* loaded from: classes4.dex */
final class vns implements SQLiteTransactionListener {
    final /* synthetic */ vnt a;

    public vns(vnt vntVar) {
        this.a = vntVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (this.a.a) {
            return;
        }
        throw new vos();
    }
}
