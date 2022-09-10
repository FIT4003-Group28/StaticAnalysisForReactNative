package defpackage;

import android.database.Cursor;
/* compiled from: PG */
/* renamed from: btot  reason: default package */
/* loaded from: classes4.dex */
final class btot<T> extends btor<T> {
    private final int a;
    private final bton<T> b;

    /* JADX INFO: Access modifiers changed from: protected */
    public btot(int i, bton<T> btonVar) {
        dbsk.a(i >= 0);
        this.a = i;
        this.b = btonVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btor
    public final dbsg<T> a(Cursor cursor) {
        try {
            if (!cursor.isNull(this.a)) {
                return dbsg.j(this.b.a(cursor, this.a));
            }
        } catch (RuntimeException e) {
            bvoo.f(e);
        }
        return dbpy.a;
    }
}
