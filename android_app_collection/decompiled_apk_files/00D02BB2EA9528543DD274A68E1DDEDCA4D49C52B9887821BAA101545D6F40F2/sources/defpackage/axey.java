package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axey  reason: default package */
/* loaded from: classes3.dex */
public final class axey extends axgh {
    public final axgg a;
    public final dimp b;
    public final boolean c;
    public final Throwable d;

    public axey(axgg axggVar, dimp dimpVar, boolean z, @dzsi Throwable th) {
        this.a = axggVar;
        this.b = dimpVar;
        this.c = z;
        this.d = th;
    }

    @Override // defpackage.axgh
    public final axgg a() {
        return this.a;
    }

    @Override // defpackage.axgh
    public final dimp b() {
        return this.b;
    }

    @Override // defpackage.axgh
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.axgh
    @dzsi
    public final Throwable d() {
        return this.d;
    }

    @Override // defpackage.axgh
    public final axgf e() {
        return new axex(this);
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof axgh) {
            axgh axghVar = (axgh) obj;
            if (this.a.equals(axghVar.a()) && this.b.equals(axghVar.b()) && this.c == axghVar.c() && ((th = this.d) != null ? th.equals(axghVar.d()) : axghVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dimp dimpVar = this.b;
        int i = dimpVar.bC;
        if (i == 0) {
            i = dsst.a.b(dimpVar).c(dimpVar);
            dimpVar.bC = i;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        Throwable th = this.d;
        return i2 ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("State{status=");
        sb.append(valueOf);
        sb.append(", followList=");
        sb.append(valueOf2);
        sb.append(", areFollowersRemovable=");
        sb.append(z);
        sb.append(", throwable=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
