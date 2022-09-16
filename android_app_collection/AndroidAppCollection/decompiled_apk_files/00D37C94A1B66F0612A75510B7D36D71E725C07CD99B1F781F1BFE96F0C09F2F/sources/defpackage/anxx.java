package defpackage;
/* compiled from: PG */
/* renamed from: anxx  reason: default package */
/* loaded from: classes.dex */
public final class anxx {
    public final boolean a;
    private final Class b;

    public anxx(Class cls, boolean z) {
        this.b = cls;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anxx) {
            anxx anxxVar = (anxx) obj;
            if (anxxVar.b.equals(this.b) && anxxVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
