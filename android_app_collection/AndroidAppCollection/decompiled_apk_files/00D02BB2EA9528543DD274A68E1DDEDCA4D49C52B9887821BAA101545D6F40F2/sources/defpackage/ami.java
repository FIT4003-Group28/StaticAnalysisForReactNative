package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: ami  reason: default package */
/* loaded from: classes2.dex */
final class ami extends ContentObserver {
    final /* synthetic */ amk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ami(amk amkVar) {
        super(new Handler());
        this.a = amkVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        amk amkVar = this.a;
        if (!amkVar.c || (cursor = amkVar.d) == null || cursor.isClosed()) {
            return;
        }
        amkVar.b = amkVar.d.requery();
    }
}
