package defpackage;
/* compiled from: PG */
/* renamed from: bywb  reason: default package */
/* loaded from: classes4.dex */
public final class bywb extends byxu {
    public final dlkv a;

    public bywb(dlkv dlkvVar) {
        if (dlkvVar != null) {
            this.a = dlkvVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    @Override // defpackage.byxu
    public final dlkv a() {
        return this.a;
    }

    @Override // defpackage.byxu
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byxu) {
            byxu byxuVar = (byxu) obj;
            if (this.a.equals(byxuVar.a()) && !byxuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dlkv dlkvVar = this.a;
        int i = dlkvVar.bC;
        if (i == 0) {
            i = dsst.a.b(dlkvVar).c(dlkvVar);
            dlkvVar.bC = i;
        }
        return ((i ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("MaybeModifiedPayload{payload=");
        sb.append(valueOf);
        sb.append(", wasModified=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}
