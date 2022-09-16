package defpackage;

import android.database.Cursor;
import j$.util.Iterator;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yml  reason: default package */
/* loaded from: classes4.dex */
public final class yml implements Iterator, yms {
    final /* synthetic */ Cursor a;
    final /* synthetic */ ymp b;

    public yml(ymp ympVar, Cursor cursor) {
        this.b = ympVar;
        this.a = cursor;
    }

    @Override // defpackage.yms
    public final void a() {
        Cursor cursor = this.a;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        this.a.close();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        Cursor cursor = this.a;
        if (cursor == null || cursor.isClosed() || this.a.getCount() <= 0 || this.a.isLast()) {
            a();
            return false;
        }
        return true;
    }

    @Override // j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        this.a.moveToNext();
        return this.b.c(this.a.getBlob(0));
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
