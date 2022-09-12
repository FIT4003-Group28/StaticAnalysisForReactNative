package defpackage;
/* compiled from: PG */
/* renamed from: cvkr  reason: default package */
/* loaded from: classes5.dex */
public final class cvkr extends Exception {
    public cvkr(String str, Throwable th) {
        super(str.length() != 0 ? "Column not found:".concat(str) : new String("Column not found:"), th);
    }
}
