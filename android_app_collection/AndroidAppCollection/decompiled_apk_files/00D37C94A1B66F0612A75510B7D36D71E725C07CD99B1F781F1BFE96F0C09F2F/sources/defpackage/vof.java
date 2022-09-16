package defpackage;

import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: vof  reason: default package */
/* loaded from: classes4.dex */
final class vof extends SQLiteException {
    public vof(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
