package defpackage;
/* compiled from: PG */
/* renamed from: sha  reason: default package */
/* loaded from: classes4.dex */
public class sha {
    private final String a;

    public sha(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((sha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 31;
    }
}
