package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: ama  reason: default package */
/* loaded from: classes.dex */
final class ama extends ContentObserver {
    final /* synthetic */ amc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ama(amc amcVar) {
        super(new Handler());
        this.a = amcVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        amc amcVar = this.a;
        if (!amcVar.c || (cursor = amcVar.d) == null || cursor.isClosed()) {
            return;
        }
        amcVar.b = amcVar.d.requery();
    }
}
