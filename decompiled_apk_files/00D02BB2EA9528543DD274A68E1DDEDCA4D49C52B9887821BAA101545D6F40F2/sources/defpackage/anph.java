package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anph  reason: default package */
/* loaded from: classes2.dex */
public final class anph extends anps {
    private final dvas a;
    private final anpr b;
    private final int c;

    public anph(dvas dvasVar, anpr anprVar, int i) {
        if (dvasVar != null) {
            this.a = dvasVar;
            if (anprVar != null) {
                this.b = anprVar;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null listener");
        }
        throw new NullPointerException("Null candidate");
    }

    @Override // defpackage.anps
    public dvas a() {
        return this.a;
    }

    @Override // defpackage.anps
    public anpr b() {
        return this.b;
    }

    @Override // defpackage.anps
    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anps) {
            anps anpsVar = (anps) obj;
            if (this.a.equals(anpsVar.a()) && this.b.equals(anpsVar.b()) && this.c == anpsVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        dvas dvasVar = this.a;
        int i = dvasVar.bC;
        if (i == 0) {
            i = dsst.a.b(dvasVar).c(dvasVar);
            dvasVar.bC = i;
        }
        return this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71 + String.valueOf(valueOf2).length());
        sb.append("CandidateListItemViewModelImpl{candidate=");
        sb.append(valueOf);
        sb.append(", listener=");
        sb.append(valueOf2);
        sb.append(", rank=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
