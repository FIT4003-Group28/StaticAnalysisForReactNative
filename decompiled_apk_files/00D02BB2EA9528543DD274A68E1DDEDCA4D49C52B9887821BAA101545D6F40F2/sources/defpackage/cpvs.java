package defpackage;
/* compiled from: PG */
/* renamed from: cpvs  reason: default package */
/* loaded from: classes5.dex */
public class cpvs {
    private final String a;

    public cpvs(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((cpvs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 31;
    }
}
