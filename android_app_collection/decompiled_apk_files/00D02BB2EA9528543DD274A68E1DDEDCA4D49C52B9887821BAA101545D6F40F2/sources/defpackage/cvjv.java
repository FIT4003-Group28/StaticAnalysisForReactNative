package defpackage;
/* compiled from: PG */
/* renamed from: cvjv  reason: default package */
/* loaded from: classes5.dex */
public final class cvjv extends cvkc {
    public final Long a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final cviv f;
    public final Long g;
    public final int h;
    public final Long i;

    public cvjv(@dzsi Long l, String str, @dzsi String str2, Long l2, Long l3, cviv cvivVar, Long l4, int i, Long l5) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = cvivVar;
        this.g = l4;
        this.h = i;
        this.i = l5;
    }

    @Override // defpackage.cvkc
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.cvkc
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvkc
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cvkc
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.cvkc
    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkc) {
            cvkc cvkcVar = (cvkc) obj;
            Long l = this.a;
            if (l != null ? l.equals(cvkcVar.a()) : cvkcVar.a() == null) {
                if (this.b.equals(cvkcVar.b()) && ((str = this.c) != null ? str.equals(cvkcVar.c()) : cvkcVar.c() == null) && this.d.equals(cvkcVar.d()) && this.e.equals(cvkcVar.e()) && this.f.equals(cvkcVar.f()) && this.g.equals(cvkcVar.g()) && this.h == cvkcVar.h() && this.i.equals(cvkcVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvkc
    public final cviv f() {
        return this.f;
    }

    @Override // defpackage.cvkc
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.cvkc
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.cvkc
    public final Long i() {
        return this.i;
    }

    @Override // defpackage.cvkc
    public final cvju j() {
        return new cvju(this);
    }
}
