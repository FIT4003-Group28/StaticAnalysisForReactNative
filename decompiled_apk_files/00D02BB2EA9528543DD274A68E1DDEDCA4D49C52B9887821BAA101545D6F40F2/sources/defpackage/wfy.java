package defpackage;
/* compiled from: PG */
/* renamed from: wfy  reason: default package */
/* loaded from: classes7.dex */
public final class wfy extends wfz {
    private final ddho a;
    private final ddho b;
    private final ddho c;
    private final ddho d;
    private final ddho e;
    private final ddho f;
    private final ddho g;
    private final ddho h;

    public wfy(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5, ddho ddhoVar6, ddho ddhoVar7, ddho ddhoVar8) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
        this.e = ddhoVar5;
        this.f = ddhoVar6;
        this.g = ddhoVar7;
        this.h = ddhoVar8;
    }

    @Override // defpackage.wfz
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.wfz
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.wfz
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.wfz
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.wfz
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wfz) {
            wfz wfzVar = (wfz) obj;
            if (this.a.equals(wfzVar.a()) && this.b.equals(wfzVar.b()) && this.c.equals(wfzVar.c()) && this.d.equals(wfzVar.d()) && this.e.equals(wfzVar.e()) && this.f.equals(wfzVar.f()) && this.g.equals(wfzVar.g()) && this.h.equals(wfzVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wfz
    public final ddho f() {
        return this.f;
    }

    @Override // defpackage.wfz
    public final ddho g() {
        return this.g;
    }

    @Override // defpackage.wfz
    public final ddho h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
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
        StringBuilder sb = new StringBuilder(length + 139 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("BookmarksVes{carouselVe=");
        sb.append(valueOf);
        sb.append(", editButtonVe=");
        sb.append(valueOf2);
        sb.append(", addButtonVe=");
        sb.append(valueOf3);
        sb.append(", homeButtonVe=");
        sb.append(valueOf4);
        sb.append(", workButtonVe=");
        sb.append(valueOf5);
        sb.append(", setHomeButtonVe=");
        sb.append(valueOf6);
        sb.append(", setWorkButtonVe=");
        sb.append(valueOf7);
        sb.append(", nicknameButtonVe=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
