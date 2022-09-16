package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
/* compiled from: PG */
/* renamed from: bln  reason: default package */
/* loaded from: classes2.dex */
public final class bln {
    public final int a;
    public bkl b;
    public final bkt c;
    public final String d;
    public final String e;

    public bln() {
        this.a = 12;
    }

    public bln(bkl bklVar, bkt bktVar) {
        this();
        this.b = bklVar;
        this.c = bktVar;
        this.d = "c103703e120ae8cc73c9248622f3cd1e";
        this.e = "49f946663a8deb7054212b8adda248c6";
    }

    public static final void a(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: " + str);
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static void c(blv blvVar) {
        blvVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        blvVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0070 A[EDGE_INSN: B:85:0x0070->B:35:0x0070 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.blv r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bln.b(blv, int, int):void");
    }
}
