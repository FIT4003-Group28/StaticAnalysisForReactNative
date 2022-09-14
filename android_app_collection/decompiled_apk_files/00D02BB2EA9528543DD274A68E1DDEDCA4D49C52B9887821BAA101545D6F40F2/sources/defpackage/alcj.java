package defpackage;
/* compiled from: PG */
/* renamed from: alcj  reason: default package */
/* loaded from: classes2.dex */
public final class alcj extends aldq {
    public final aldo a;
    public final dqvj b;
    public final dcdc<dpeo> c;
    public final boolean d;

    public alcj(aldo aldoVar, dqvj dqvjVar, dcdc<dpeo> dcdcVar, boolean z) {
        this.a = aldoVar;
        if (dqvjVar != null) {
            this.b = dqvjVar;
            if (dcdcVar != null) {
                this.c = dcdcVar;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null roadStretches");
        }
        throw new NullPointerException("Null travelMode");
    }

    @Override // defpackage.aldq
    public final aldo a() {
        return this.a;
    }

    @Override // defpackage.aldq
    public final dqvj b() {
        return this.b;
    }

    @Override // defpackage.aldq
    public final dcdc<dpeo> c() {
        return this.c;
    }

    @Override // defpackage.aldq
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aldq) {
            aldq aldqVar = (aldq) obj;
            if (this.a.equals(aldqVar.a()) && this.b.equals(aldqVar.b()) && dchl.m(this.c, aldqVar.c()) && this.d == aldqVar.d()) {
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
        StringBuilder sb = new StringBuilder(length + 85 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RenderingProperties{vertexBreak=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append(", roadStretches=");
        sb.append(valueOf3);
        sb.append(", isIndeterminate=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
