package defpackage;

import android.database.DataSetObserver;
/* compiled from: PG */
/* renamed from: amj  reason: default package */
/* loaded from: classes2.dex */
final class amj extends DataSetObserver {
    final /* synthetic */ amk a;

    public amj(amk amkVar) {
        this.a = amkVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        amk amkVar = this.a;
        amkVar.b = true;
        amkVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        amk amkVar = this.a;
        amkVar.b = false;
        amkVar.notifyDataSetInvalidated();
    }
}
