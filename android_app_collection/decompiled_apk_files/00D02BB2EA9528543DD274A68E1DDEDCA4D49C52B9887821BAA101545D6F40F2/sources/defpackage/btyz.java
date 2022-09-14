package defpackage;
/* compiled from: PG */
/* renamed from: btyz  reason: default package */
/* loaded from: classes4.dex */
final class btyz extends btzs {
    private final btzr<?> a;
    private final btzy b;

    public btyz(btzr<?> btzrVar, btzy btzyVar) {
        this.a = btzrVar;
        if (btzyVar != null) {
            this.b = btzyVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.btzs
    public final btzr<?> a() {
        return this.a;
    }

    @Override // defpackage.btzs
    public final btzy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btzs) {
            btzs btzsVar = (btzs) obj;
            if (this.a.equals(btzsVar.a()) && this.b.equals(btzsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
