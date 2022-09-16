package defpackage;
/* compiled from: PG */
/* renamed from: znl  reason: default package */
/* loaded from: classes4.dex */
public final class znl {
    public final int a;

    public znl(int i) {
        this.a = i;
    }

    public static boolean a(znl znlVar) {
        if (znlVar != null) {
            int i = znlVar.a;
            return i == 1 || i == 2;
        }
        return false;
    }

    public static boolean b(znl znlVar) {
        return znlVar != null && znlVar.a == 2;
    }
}
