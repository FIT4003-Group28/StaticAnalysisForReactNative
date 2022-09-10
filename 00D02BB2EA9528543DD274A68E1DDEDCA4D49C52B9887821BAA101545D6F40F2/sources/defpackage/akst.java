package defpackage;
/* compiled from: PG */
/* renamed from: akst  reason: default package */
/* loaded from: classes2.dex */
public final class akst extends akud {
    public final dmpn a;
    private final int b;
    private final akuf c;
    private final dbsg<akqp> d;

    public akst(dmpn dmpnVar, int i, akuf akufVar, dbsg<akqp> dbsgVar) {
        if (dmpnVar != null) {
            this.a = dmpnVar;
            this.b = i;
            if (akufVar != null) {
                this.c = akufVar;
                this.d = dbsgVar;
                return;
            }
            throw new NullPointerException("Null visibility");
        }
        throw new NullPointerException("Null proto");
    }

    @Override // defpackage.akud
    public final dmpn a() {
        return this.a;
    }

    @Override // defpackage.akud
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akud
    public final akuf c() {
        return this.c;
    }

    @Override // defpackage.akud
    public final dbsg<akqp> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akud) {
            akud akudVar = (akud) obj;
            if (this.a.equals(akudVar.a()) && this.b == akudVar.b() && this.c.equals(akudVar.c()) && this.d.equals(akudVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dmpn dmpnVar = this.a;
        int i = dmpnVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmpnVar).c(dmpnVar);
            dmpnVar.bC = i;
        }
        return this.d.hashCode() ^ ((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TaggedLabel{proto=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(i);
        sb.append(", visibility=");
        sb.append(valueOf2);
        sb.append(", point=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
