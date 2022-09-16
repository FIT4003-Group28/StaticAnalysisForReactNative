package defpackage;
/* compiled from: PG */
/* renamed from: tlf  reason: default package */
/* loaded from: classes4.dex */
public final class tlf {
    public final String a;
    public final int b;

    public tlf(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static tlf a(String str) {
        str.getClass();
        return new tlf(1, str);
    }

    public static tlf b() {
        return new tlf(2, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tlf) {
            tlf tlfVar = (tlf) obj;
            if (tlfVar.b - 1 == this.b - 1 && akzj.f(tlfVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b - 1;
        String str = this.a;
        return i + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
