package defpackage;
/* compiled from: PG */
/* renamed from: pjw  reason: default package */
/* loaded from: classes4.dex */
public final class pjw {
    private final pvz a;

    public pjw(pvz pvzVar) {
        this.a = pvzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjw) {
            return this.a.equals(((pjw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
