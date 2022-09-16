package defpackage;
/* compiled from: PG */
/* renamed from: udf  reason: default package */
/* loaded from: classes4.dex */
public final class udf extends Exception {
    public udf(String str, Throwable th) {
        super(str.length() != 0 ? "Column not found:".concat(str) : new String("Column not found:"), th);
    }
}
