package defpackage;
/* compiled from: PG */
/* renamed from: bvvy  reason: default package */
/* loaded from: classes4.dex */
public final class bvvy extends bvwc {
    private final drtc a;

    public bvvy(drtc drtcVar) {
        this.a = drtcVar;
    }

    @Override // defpackage.bvwc
    public final drtc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvwc)) {
            return false;
        }
        return this.a.equals(((bvwc) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
