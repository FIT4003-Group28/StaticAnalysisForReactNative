package defpackage;

import android.database.sqlite.SQLiteStatement;
/* compiled from: PG */
/* renamed from: awj  reason: default package */
/* loaded from: classes3.dex */
public final class awj extends awi implements awa {
    private final SQLiteStatement a;

    public awj(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final int a() {
        return this.a.executeUpdateDelete();
    }

    public final long b() {
        return this.a.executeInsert();
    }
}
