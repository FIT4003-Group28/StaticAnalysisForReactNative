package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ansz  reason: default package */
/* loaded from: classes2.dex */
public final class ansz extends anwo {
    private final cqss a;
    private final cqss b;
    private final cqss c;
    private final cqss d;

    public ansz(cqss cqssVar, cqss cqssVar2, cqss cqssVar3, cqss cqssVar4) {
        if (cqssVar != null) {
            this.a = cqssVar;
            if (cqssVar2 != null) {
                this.b = cqssVar2;
                if (cqssVar3 != null) {
                    this.c = cqssVar3;
                    this.d = cqssVar4;
                    return;
                }
                throw new NullPointerException("Null circleColor");
            }
            throw new NullPointerException("Null bottomLineColor");
        }
        throw new NullPointerException("Null topLineColor");
    }

    @Override // defpackage.anwo, defpackage.anwn
    public cqss a() {
        return this.a;
    }

    @Override // defpackage.anwo, defpackage.anwn
    public cqss b() {
        return this.b;
    }

    @Override // defpackage.anwo, defpackage.anwn
    public cqss c() {
        return this.c;
    }

    @Override // defpackage.anwo, defpackage.anwn
    public cqss d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anwo) {
            anwo anwoVar = (anwo) obj;
            if (this.a.equals(anwoVar.a()) && this.b.equals(anwoVar.b()) && this.c.equals(anwoVar.c()) && this.d.equals(anwoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 102 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DayStopSegmentSchematicViewModelImpl{topLineColor=");
        sb.append(valueOf);
        sb.append(", bottomLineColor=");
        sb.append(valueOf2);
        sb.append(", circleColor=");
        sb.append(valueOf3);
        sb.append(", innerCircleColor=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
