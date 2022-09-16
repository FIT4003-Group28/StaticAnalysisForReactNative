package defpackage;
/* compiled from: PG */
/* renamed from: cwph  reason: default package */
/* loaded from: classes5.dex */
public final class cwph extends cwqp {
    public final cwqi a;
    public final cwqi b;
    public final cwqi c;
    public final int d;

    public cwph(cwqi cwqiVar, cwqi cwqiVar2, cwqi cwqiVar3, int i) {
        this.a = cwqiVar;
        this.b = cwqiVar2;
        this.c = cwqiVar3;
        this.d = i;
    }

    @Override // defpackage.cwqp
    public final cwqi a() {
        return this.a;
    }

    @Override // defpackage.cwqp
    public final cwqi b() {
        return this.b;
    }

    @Override // defpackage.cwqp
    public final cwqi c() {
        return this.c;
    }

    @Override // defpackage.cwqp
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwqp) {
            cwqp cwqpVar = (cwqp) obj;
            if (this.a.equals(cwqpVar.a()) && this.b.equals(cwqpVar.b()) && this.c.equals(cwqpVar.c()) && this.d == cwqpVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 96 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ViewProviders{headerViewProvider=");
        sb.append(valueOf);
        sb.append(", contentViewProvider=");
        sb.append(valueOf2);
        sb.append(", footerViewProvider=");
        sb.append(valueOf3);
        sb.append(", title=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
