package defpackage;
/* compiled from: PG */
/* renamed from: bvwa  reason: default package */
/* loaded from: classes4.dex */
final class bvwa extends bvwj {
    private final drtc a;
    private final String b;

    public bvwa(drtc drtcVar, String str) {
        this.a = drtcVar;
        this.b = str;
    }

    @Override // defpackage.bvwj
    public final drtc a() {
        return this.a;
    }

    @Override // defpackage.bvwj
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvwj) {
            bvwj bvwjVar = (bvwj) obj;
            if (this.a.equals(bvwjVar.a()) && this.b.equals(bvwjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
