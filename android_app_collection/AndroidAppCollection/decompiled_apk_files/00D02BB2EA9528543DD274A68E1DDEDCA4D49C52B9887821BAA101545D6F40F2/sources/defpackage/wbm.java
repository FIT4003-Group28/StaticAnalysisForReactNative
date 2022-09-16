package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wbm  reason: default package */
/* loaded from: classes7.dex */
public final class wbm extends wbo {
    public final int a;
    public final cqss b;
    public final cqss c;
    public final cqss d;

    public wbm(int i, cqss cqssVar, cqss cqssVar2, cqss cqssVar3) {
        this.a = i;
        this.b = cqssVar;
        this.c = cqssVar2;
        this.d = cqssVar3;
    }

    @Override // defpackage.wbo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.wbo
    public final cqss b() {
        return this.b;
    }

    @Override // defpackage.wbo
    public final cqss c() {
        return this.c;
    }

    @Override // defpackage.wbo
    public final cqss d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wbo) {
            wbo wboVar = (wbo) obj;
            if (this.a == wboVar.a() && this.b.equals(wboVar.b()) && this.c.equals(wboVar.c()) && this.d.equals(wboVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 94 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ButtonConfig{iconResourceId=");
        sb.append(i);
        sb.append(", iconTintColor=");
        sb.append(valueOf);
        sb.append(", circleStrokeColor=");
        sb.append(valueOf2);
        sb.append(", circleFillColor=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
