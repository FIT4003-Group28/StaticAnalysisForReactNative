package defpackage;
/* compiled from: PG */
/* renamed from: csfs  reason: default package */
/* loaded from: classes5.dex */
public final class csfs {
    @dzsi
    public final String a;
    public final int b;

    public csfs(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static csfs a(String str) {
        dbsk.s(str);
        return new csfs(1, str);
    }

    public static csfs b() {
        return new csfs(2, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof csfs) {
            csfs csfsVar = (csfs) obj;
            if (csfsVar.b - 1 == this.b - 1 && dbsd.a(csfsVar.a, this.a)) {
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
