package defpackage;
/* compiled from: PG */
/* renamed from: hww  reason: default package */
/* loaded from: classes6.dex */
public final class hww extends hxm {
    public final dcdc<jho> a;
    public final dcdc<jho> b;

    public hww(dcdc<jho> dcdcVar, dcdc<jho> dcdcVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dcdcVar2 != null) {
                this.b = dcdcVar2;
                return;
            }
            throw new NullPointerException("Null overflowMenuItems");
        }
        throw new NullPointerException("Null actionMenuItems");
    }

    @Override // defpackage.hxm
    public final dcdc<jho> a() {
        return this.a;
    }

    @Override // defpackage.hxm
    public final dcdc<jho> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxm) {
            hxm hxmVar = (hxm) obj;
            if (dchl.m(this.a, hxmVar.a()) && dchl.m(this.b, hxmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("SplitMenuItems{actionMenuItems=");
        sb.append(valueOf);
        sb.append(", overflowMenuItems=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
