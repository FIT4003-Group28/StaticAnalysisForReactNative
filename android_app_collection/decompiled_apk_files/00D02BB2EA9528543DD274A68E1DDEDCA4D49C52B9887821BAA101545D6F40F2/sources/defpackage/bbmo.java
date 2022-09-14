package defpackage;
/* compiled from: PG */
/* renamed from: bbmo  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbmo {
    public abstract dppl a();

    public akqi b() {
        throw null;
    }

    public String c() {
        throw null;
    }

    public String d() {
        throw null;
    }

    public boolean e(dpqg dpqgVar) {
        throw null;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbmo) {
            return a().equals(((bbmo) obj).a());
        }
        return false;
    }

    public int hashCode() {
        dppl a = a();
        int i = a.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(a).c(a);
        a.bC = c;
        return c;
    }
}
