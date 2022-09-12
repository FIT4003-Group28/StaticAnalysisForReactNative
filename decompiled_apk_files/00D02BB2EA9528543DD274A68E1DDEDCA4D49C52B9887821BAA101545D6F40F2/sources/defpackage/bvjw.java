package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: bvjw  reason: default package */
/* loaded from: classes.dex */
public abstract class bvjw extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bvjw(android.content.Context r4, defpackage.afec r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            affr r0 = defpackage.affp.a(r4)
            boolean r1 = r0.d()
            r2 = 0
            if (r1 == 0) goto L12
            boolean r5 = r0.a()
            if (r5 == 0) goto L19
            goto L18
        L12:
            boolean r5 = r5.a()
            if (r5 == 0) goto L19
        L18:
            r6 = r2
        L19:
            r3.<init>(r4, r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvjw.<init>(android.content.Context, afec, java.lang.String, int):void");
    }

    public final SQLiteDatabase a() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            throw new bvjv(e);
        }
    }

    public final SQLiteDatabase b() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            throw new bvjv(e);
        }
    }
}
