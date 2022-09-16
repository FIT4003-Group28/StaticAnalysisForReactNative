package defpackage;
/* compiled from: PG */
/* renamed from: qzy  reason: default package */
/* loaded from: classes4.dex */
public final class qzy {
    public final String a;

    public qzy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qzy) {
            return this.a.equals(((qzy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
