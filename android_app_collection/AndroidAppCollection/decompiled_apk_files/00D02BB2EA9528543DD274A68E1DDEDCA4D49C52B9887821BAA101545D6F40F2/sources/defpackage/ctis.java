package defpackage;

import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: ctis  reason: default package */
/* loaded from: classes5.dex */
public final class ctis extends SQLiteException {
    public ctis(Throwable th) {
        super("Error when executing transaction!!", th);
    }
}
