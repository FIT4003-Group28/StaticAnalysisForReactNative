package defpackage;

import android.database.DataSetObserver;
/* compiled from: PG */
/* renamed from: amb  reason: default package */
/* loaded from: classes.dex */
final class amb extends DataSetObserver {
    final /* synthetic */ amc a;

    public amb(amc amcVar) {
        this.a = amcVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        amc amcVar = this.a;
        amcVar.b = true;
        amcVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        amc amcVar = this.a;
        amcVar.b = false;
        amcVar.notifyDataSetInvalidated();
    }
}
