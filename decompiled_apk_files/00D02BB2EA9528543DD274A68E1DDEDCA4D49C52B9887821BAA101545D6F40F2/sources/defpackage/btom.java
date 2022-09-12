package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: btom  reason: default package */
/* loaded from: classes4.dex */
final class btom implements Iterator<btos> {
    final /* synthetic */ int a;
    final /* synthetic */ Cursor b;

    public btom(int i, Cursor cursor) {
        this.a = i;
        this.b = cursor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > this.b.getPosition() + 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ btos next() {
        if (this.b.moveToNext()) {
            return new btos(this.b);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
