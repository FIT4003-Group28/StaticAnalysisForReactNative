package defpackage;
/* compiled from: PG */
/* renamed from: alvp  reason: default package */
/* loaded from: classes.dex */
final class alvp extends alya {
    private final Integer a;
    private final dcdn<Long, Long> b;

    public alvp(Integer num, dcdn<Long, Long> dcdnVar) {
        this.a = num;
        if (dcdnVar != null) {
            this.b = dcdnVar;
            return;
        }
        throw new NullPointerException("Null styleIdMappings");
    }

    @Override // defpackage.alya
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.alya
    public final dcdn<Long, Long> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alya) {
            alya alyaVar = (alya) obj;
            if (this.a.equals(alyaVar.a()) && this.b.equals(alyaVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("TagToTransforms{tag=");
        sb.append(valueOf);
        sb.append(", styleIdMappings=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
