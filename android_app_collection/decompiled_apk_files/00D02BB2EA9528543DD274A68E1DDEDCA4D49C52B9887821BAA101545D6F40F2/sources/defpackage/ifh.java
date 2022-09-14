package defpackage;
/* compiled from: PG */
/* renamed from: ifh  reason: default package */
/* loaded from: classes.dex */
final class ifh extends igu {
    private final cqtv a;
    private final cqtv b;
    private final iuv c;
    private final cqtv d;
    private final cqtv e;
    private final iuv f;
    private final cqtv g;
    private final cqtv h;

    public ifh(cqtv cqtvVar, cqtv cqtvVar2, iuv iuvVar, cqtv cqtvVar3, cqtv cqtvVar4, iuv iuvVar2, cqtv cqtvVar5, cqtv cqtvVar6) {
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = iuvVar;
        this.d = cqtvVar3;
        this.e = cqtvVar4;
        this.f = iuvVar2;
        this.g = cqtvVar5;
        this.h = cqtvVar6;
    }

    @Override // defpackage.igu
    public final cqtv a() {
        return this.a;
    }

    @Override // defpackage.igu
    public final cqtv b() {
        return this.b;
    }

    @Override // defpackage.igu
    public final iuv c() {
        return this.c;
    }

    @Override // defpackage.igu
    public final cqtv d() {
        return this.d;
    }

    @Override // defpackage.igu
    public final cqtv e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof igu) {
            igu iguVar = (igu) obj;
            if (this.a.equals(iguVar.a()) && this.b.equals(iguVar.b()) && this.c.equals(iguVar.c()) && this.d.equals(iguVar.d()) && this.e.equals(iguVar.e()) && this.f.equals(iguVar.f()) && this.g.equals(iguVar.g()) && this.h.equals(iguVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.igu
    public final iuv f() {
        return this.f;
    }

    @Override // defpackage.igu
    public final cqtv g() {
        return this.g;
    }

    @Override // defpackage.igu
    public final cqtv h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((cqrp) this.d).a) * 1000003) ^ ((cqrp) this.e).a) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ((cqrp) this.g).a) * 1000003) ^ ((cqrp) this.h).a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 208 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("ModCarouselHeaderViewProperties{titlePaddingStart=");
        sb.append(valueOf);
        sb.append(", titlePaddingEnd=");
        sb.append(valueOf2);
        sb.append(", actionIconTintColor=");
        sb.append(valueOf3);
        sb.append(", actionIconPaddingStart=");
        sb.append(valueOf4);
        sb.append(", actionIconPaddingEnd=");
        sb.append(valueOf5);
        sb.append(", actionLabelColor=");
        sb.append(valueOf6);
        sb.append(", actionLabelPaddingStart=");
        sb.append(valueOf7);
        sb.append(", actionLabelPaddingEnd=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
