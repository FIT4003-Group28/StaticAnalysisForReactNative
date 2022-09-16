package defpackage;
/* compiled from: PG */
/* renamed from: aljv  reason: default package */
/* loaded from: classes2.dex */
final class aljv extends aljz {
    private final dmsl a;
    private final amgj b;
    private final amgj c;
    private final amgj d;

    public aljv(dmsl dmslVar, @dzsi amgj amgjVar, @dzsi amgj amgjVar2, @dzsi amgj amgjVar3) {
        if (dmslVar != null) {
            this.a = dmslVar;
            this.b = amgjVar;
            this.c = amgjVar2;
            this.d = amgjVar3;
            return;
        }
        throw new NullPointerException("Null strokeStyle");
    }

    @Override // defpackage.aljz
    public final dmsl a() {
        return this.a;
    }

    @Override // defpackage.aljz
    @dzsi
    public final amgj b() {
        return this.b;
    }

    @Override // defpackage.aljz
    @dzsi
    public final amgj c() {
        return this.c;
    }

    @Override // defpackage.aljz
    @dzsi
    public final amgj d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        amgj amgjVar;
        amgj amgjVar2;
        amgj amgjVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aljz) {
            aljz aljzVar = (aljz) obj;
            if (this.a.equals(aljzVar.a()) && ((amgjVar = this.b) != null ? amgjVar.equals(aljzVar.b()) : aljzVar.b() == null) && ((amgjVar2 = this.c) != null ? amgjVar2.equals(aljzVar.c()) : aljzVar.c() == null) && ((amgjVar3 = this.d) != null ? amgjVar3.equals(aljzVar.d()) : aljzVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dmsl dmslVar = this.a;
        int i = dmslVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmslVar).c(dmslVar);
            dmslVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        amgj amgjVar = this.b;
        int i3 = 0;
        int hashCode = (i2 ^ (amgjVar == null ? 0 : amgjVar.hashCode())) * 1000003;
        amgj amgjVar2 = this.c;
        int hashCode2 = (hashCode ^ (amgjVar2 == null ? 0 : amgjVar2.hashCode())) * 1000003;
        amgj amgjVar3 = this.d;
        if (amgjVar3 != null) {
            i3 = amgjVar3.hashCode();
        }
        return hashCode2 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 99 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("BitmapLineDefinitionInternal{strokeStyle=");
        sb.append(valueOf);
        sb.append(", lineTextureKey=");
        sb.append(valueOf2);
        sb.append(", startCapTextureKey=");
        sb.append(valueOf3);
        sb.append(", endCapTextureKey=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
