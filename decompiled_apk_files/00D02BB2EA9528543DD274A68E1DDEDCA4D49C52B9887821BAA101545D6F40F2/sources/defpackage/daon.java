package defpackage;
/* compiled from: PG */
/* renamed from: daon  reason: default package */
/* loaded from: classes5.dex */
public final class daon {
    public static void a(String str, String str2, int i, int i2) {
        daof.c(str, String.format("%s cannot be null.", str2));
        int length = str.length();
        daof.a(length <= i2 && length >= i, String.format("Length of %s should be in the range [%s-%s]", str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
