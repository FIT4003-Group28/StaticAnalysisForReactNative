package defpackage;
/* compiled from: PG */
/* renamed from: dfkw  reason: default package */
/* loaded from: classes6.dex */
public final class dfkw {
    public static String a(String str) {
        return str.replaceAll("[ ./&;]", "-").toLowerCase();
    }

    public static String b(String str) {
        return str.replaceAll("[ /&;]", "-").toLowerCase();
    }
}
