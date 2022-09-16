package defpackage;
/* compiled from: PG */
/* renamed from: pju  reason: default package */
/* loaded from: classes4.dex */
public final class pju {
    public static final /* synthetic */ int b = 0;
    public final pvz a;

    static {
        pku.d(new pvy());
    }

    public pju(pvz pvzVar) {
        this.a = pvzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pju) {
            return this.a.equals(((pju) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
