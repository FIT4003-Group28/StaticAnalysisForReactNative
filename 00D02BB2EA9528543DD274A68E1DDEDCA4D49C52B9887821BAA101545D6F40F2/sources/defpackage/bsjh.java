package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsjh  reason: default package */
/* loaded from: classes4.dex */
public final class bsjh extends bsjn {
    private final bsjm a;
    private final ddho b;
    private final cjqm c;
    private final boolean d;

    public bsjh(bsjm bsjmVar, ddho ddhoVar, cjqm cjqmVar, boolean z) {
        if (bsjmVar != null) {
            this.a = bsjmVar;
            this.b = ddhoVar;
            if (cjqmVar != null) {
                this.c = cjqmVar;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null getLoggedInteraction");
        }
        throw new NullPointerException("Null getModel");
    }

    @Override // defpackage.bsjn
    public final bsjm a() {
        return this.a;
    }

    @Override // defpackage.bsjn
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.bsjn
    public final cjqm c() {
        return this.c;
    }

    @Override // defpackage.bsjn
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsjn) {
            bsjn bsjnVar = (bsjn) obj;
            if (this.a.equals(bsjnVar.a()) && this.b.equals(bsjnVar.b()) && this.c.equals(bsjnVar.c()) && this.d == bsjnVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 95 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RefinementsResult{getModel=");
        sb.append(valueOf);
        sb.append(", getVeType=");
        sb.append(valueOf2);
        sb.append(", getLoggedInteraction=");
        sb.append(valueOf3);
        sb.append(", keepExistingSearchResult=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
