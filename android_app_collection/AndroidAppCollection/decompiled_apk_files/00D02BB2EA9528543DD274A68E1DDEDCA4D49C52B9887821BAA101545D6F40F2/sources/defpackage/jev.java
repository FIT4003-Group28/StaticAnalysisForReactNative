package defpackage;
/* compiled from: PG */
/* renamed from: jev  reason: default package */
/* loaded from: classes7.dex */
class jev extends jfo {
    public final int a;
    public final int b;
    public final int c;
    private final boolean h;
    private final boolean i;
    private final dbsg<cqtv> j;
    private final cqtv k;

    public jev(boolean z, boolean z2, int i, int i2, int i3, dbsg<cqtv> dbsgVar, cqtv cqtvVar) {
        this.h = z;
        this.i = z2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (dbsgVar != null) {
            this.j = dbsgVar;
            if (cqtvVar != null) {
                this.k = cqtvVar;
                return;
            }
            throw new NullPointerException("Null interStarPadding");
        }
        throw new NullPointerException("Null starSize");
    }

    @Override // defpackage.jfo
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.jfo
    public final boolean b() {
        return this.i;
    }

    @Override // defpackage.jfo
    public final int c() {
        return this.a;
    }

    @Override // defpackage.jfo
    public final int d() {
        return this.b;
    }

    @Override // defpackage.jfo
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jfo) {
            jfo jfoVar = (jfo) obj;
            if (this.h == jfoVar.a() && this.i == jfoVar.b() && this.a == jfoVar.c() && this.b == jfoVar.d() && this.c == jfoVar.e() && this.j.equals(jfoVar.f()) && this.k.equals(jfoVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jfo
    public final dbsg<cqtv> f() {
        return this.j;
    }

    @Override // defpackage.jfo
    public final cqtv g() {
        return this.k;
    }

    @Override // defpackage.jfo
    public final jfn h() {
        return new jeu(this);
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.h ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        return ((((((((((i2 ^ i) * 1000003) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        boolean z = this.h;
        boolean z2 = this.i;
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String valueOf = String.valueOf(this.j);
        String valueOf2 = String.valueOf(this.k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 188 + String.valueOf(valueOf2).length());
        sb.append("FiveStarViewProperties{isInteractive=");
        sb.append(z);
        sb.append(", showRatingCommentary=");
        sb.append(z2);
        sb.append(", resourceStar=");
        sb.append(i);
        sb.append(", resourceStarEmpty=");
        sb.append(i2);
        sb.append(", resourceStarHalf=");
        sb.append(i3);
        sb.append(", starSize=");
        sb.append(valueOf);
        sb.append(", interStarPadding=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
