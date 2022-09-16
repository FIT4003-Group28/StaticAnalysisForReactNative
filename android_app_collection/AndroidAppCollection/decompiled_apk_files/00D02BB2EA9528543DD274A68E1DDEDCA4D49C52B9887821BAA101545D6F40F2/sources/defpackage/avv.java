package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* compiled from: PG */
/* renamed from: avv  reason: default package */
/* loaded from: classes3.dex */
public abstract class avv {
    public final int e;

    public avv(int i) {
        this.e = i;
    }

    public static final void c(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        String str2 = "deleting the database file: " + str;
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public abstract void a(avu avuVar, int i, int i2);
}
