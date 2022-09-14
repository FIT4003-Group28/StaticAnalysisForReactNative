package defpackage;
/* compiled from: PG */
/* renamed from: anpi  reason: default package */
/* loaded from: classes2.dex */
public final class anpi extends anro {
    public final cqss a;
    public final cqss b;
    public final cqss c;
    public final cqss d;

    public anpi(cqss cqssVar, cqss cqssVar2, cqss cqssVar3, cqss cqssVar4) {
        if (cqssVar != null) {
            this.a = cqssVar;
            if (cqssVar2 != null) {
                this.b = cqssVar2;
                if (cqssVar3 != null) {
                    this.c = cqssVar3;
                    if (cqssVar4 != null) {
                        this.d = cqssVar4;
                        return;
                    }
                    throw new NullPointerException("Null buttonColor");
                }
                throw new NullPointerException("Null bodyTextColor");
            }
            throw new NullPointerException("Null titleTextColor");
        }
        throw new NullPointerException("Null backgroundColor");
    }

    @Override // defpackage.anro
    public final cqss a() {
        return this.a;
    }

    @Override // defpackage.anro
    public final cqss b() {
        return this.b;
    }

    @Override // defpackage.anro
    public final cqss c() {
        return this.c;
    }

    @Override // defpackage.anro
    public final cqss d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anro) {
            anro anroVar = (anro) obj;
            if (this.a.equals(anroVar.a()) && this.b.equals(anroVar.b()) && this.c.equals(anroVar.c()) && this.d.equals(anroVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 78 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SegmentSwatch{backgroundColor=");
        sb.append(valueOf);
        sb.append(", titleTextColor=");
        sb.append(valueOf2);
        sb.append(", bodyTextColor=");
        sb.append(valueOf3);
        sb.append(", buttonColor=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
