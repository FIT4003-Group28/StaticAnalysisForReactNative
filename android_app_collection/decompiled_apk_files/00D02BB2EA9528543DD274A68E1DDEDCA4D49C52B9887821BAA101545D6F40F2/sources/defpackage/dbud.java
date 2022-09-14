package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbud  reason: default package */
/* loaded from: classes.dex */
public final class dbud {
    public static <T> dbty<T> a(dbty<T> dbtyVar) {
        if ((dbtyVar instanceof dbub) || (dbtyVar instanceof dbua)) {
            return dbtyVar;
        }
        if (dbtyVar instanceof Serializable) {
            return new dbua(dbtyVar);
        }
        return new dbub(dbtyVar);
    }

    public static <T> dbty<T> b(T t) {
        return new dbuc(t);
    }
}
