package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blx  reason: default package */
/* loaded from: classes3.dex */
public final class blx {
    public final List<bne> a;
    public final double b;
    private final char c;
    private final String d;
    private final String e;

    public blx(List<bne> list, char c, double d, String str, String str2) {
        this.a = list;
        this.c = c;
        this.b = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return a(this.c, this.e, this.d);
    }
}
