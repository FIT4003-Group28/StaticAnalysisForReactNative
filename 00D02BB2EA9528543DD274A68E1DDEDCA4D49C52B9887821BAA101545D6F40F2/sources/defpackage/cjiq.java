package defpackage;
/* compiled from: PG */
/* renamed from: cjiq  reason: default package */
/* loaded from: classes4.dex */
public final class cjiq extends cjiw {
    private final CharSequence a;
    private final mw<cjqm> b;
    private final cjtd c;
    private final boolean d;
    private final CharSequence e;
    private final mw<cjqm> f;
    private final cjtd g;
    private final boolean h;
    private final boolean i;

    public cjiq(CharSequence charSequence, mw<cjqm> mwVar, @dzsi cjtd cjtdVar, boolean z, CharSequence charSequence2, mw<cjqm> mwVar2, @dzsi cjtd cjtdVar2, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = mwVar;
        this.c = cjtdVar;
        this.d = z;
        this.e = charSequence2;
        this.f = mwVar2;
        this.g = cjtdVar2;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    @dzsi
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        cjtd cjtdVar;
        cjtd cjtdVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjiw) {
            cjiw cjiwVar = (cjiw) obj;
            if (this.a.equals(cjiwVar.b()) && this.b.equals(cjiwVar.n()) && ((cjtdVar = this.c) != null ? cjtdVar.equals(cjiwVar.d()) : cjiwVar.d() == null) && this.d == cjiwVar.e() && this.e.equals(cjiwVar.f()) && this.f.equals(cjiwVar.o()) && ((cjtdVar2 = this.g) != null ? cjtdVar2.equals(cjiwVar.h()) : cjiwVar.h() == null) && this.h == cjiwVar.i() && this.i == cjiwVar.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    public CharSequence f() {
        return this.e;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    @dzsi
    public cjtd h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cjtd cjtdVar = this.c;
        int i = 0;
        int i2 = 1237;
        int hashCode2 = (((((((hashCode ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        cjtd cjtdVar2 = this.g;
        if (cjtdVar2 != null) {
            i = cjtdVar2.hashCode();
        }
        int i3 = (((hashCode2 ^ i) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        if (true == this.i) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    public boolean i() {
        return this.h;
    }

    @Override // defpackage.cjiw, defpackage.cjio
    public boolean m() {
        return this.i;
    }

    @Override // defpackage.cjiw
    public final mw<cjqm> n() {
        return this.b;
    }

    @Override // defpackage.cjiw
    public final mw<cjqm> o() {
        return this.f;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        boolean z2 = this.h;
        boolean z3 = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 283 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("DualActionStyleActionBarViewModelImpl{promotedActionText=");
        sb.append(valueOf);
        sb.append(", promotedActionClickHandlerInternal=");
        sb.append(valueOf2);
        sb.append(", promotedActionLoggingParams=");
        sb.append(valueOf3);
        sb.append(", promotedActionEnabled=");
        sb.append(z);
        sb.append(", defaultActionText=");
        sb.append(valueOf4);
        sb.append(", defaultActionClickHandlerInternal=");
        sb.append(valueOf5);
        sb.append(", defaultActionLoggingParams=");
        sb.append(valueOf6);
        sb.append(", defaultActionEnabled=");
        sb.append(z2);
        sb.append(", elevated=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
