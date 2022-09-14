package defpackage;
/* compiled from: PG */
/* renamed from: dsng  reason: default package */
/* loaded from: classes6.dex */
public final class dsng {
    public static int a(String str, int i) {
        while (i < str.length() && str.charAt(i) != '-') {
            i++;
        }
        return i;
    }

    public static int b(dsnf dsnfVar) {
        return dsnfVar.d - dsnfVar.c;
    }

    public static String c(String str, dsnf dsnfVar) {
        int i = dsnfVar.b;
        return str.substring(dsnfVar.c + i, i + dsnfVar.d);
    }
}
