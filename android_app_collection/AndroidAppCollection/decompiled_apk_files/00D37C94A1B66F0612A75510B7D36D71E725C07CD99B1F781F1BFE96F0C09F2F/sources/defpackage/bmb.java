package defpackage;

import android.database.sqlite.SQLiteStatement;
/* compiled from: PG */
/* renamed from: bmb  reason: default package */
/* loaded from: classes2.dex */
public final class bmb extends bma implements bls {
    public final SQLiteStatement b;

    public bmb(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final void a() {
        this.b.executeUpdateDelete();
    }
}
