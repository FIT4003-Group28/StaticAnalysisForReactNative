package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cwam  reason: default package */
/* loaded from: classes5.dex */
final class cwam extends cwas {
    private final dbsg<cwat> a;
    private final dbsg<String> b;
    private final dbsg<Drawable> c;
    private final dbsg<cwao> d;
    private final int e;

    public cwam(int i, dbsg<cwat> dbsgVar, dbsg<String> dbsgVar2, dbsg<Drawable> dbsgVar3, dbsg<cwao> dbsgVar4) {
        this.e = i;
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
    }

    @Override // defpackage.cwas
    public final dbsg<cwat> a() {
        return this.a;
    }

    @Override // defpackage.cwas
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cwas
    public final dbsg<Drawable> c() {
        return this.c;
    }

    @Override // defpackage.cwas
    public final dbsg<cwao> d() {
        return this.d;
    }

    @Override // defpackage.cwas
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwas)) {
            return false;
        }
        cwas cwasVar = (cwas) obj;
        int i = this.e;
        int e = cwasVar.e();
        if (i == 0) {
            throw null;
        }
        return e == 1 && this.a.equals(cwasVar.a()) && this.b.equals(cwasVar.b()) && this.c.equals(cwasVar.c()) && this.d.equals(cwasVar.d());
    }

    public final int hashCode() {
        if (this.e != 0) {
            return -154780446;
        }
        throw null;
    }

    public final String toString() {
        String str = this.e != 1 ? "null" : "INITIAL";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("StateInfo{state=");
        sb.append(str);
        sb.append(", uploadInfo=");
        sb.append(valueOf);
        sb.append(", customDescription=");
        sb.append(valueOf2);
        sb.append(", customIcon=");
        sb.append(valueOf3);
        sb.append(", customContentInfo=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
