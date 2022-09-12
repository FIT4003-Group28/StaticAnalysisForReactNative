package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bhdm  reason: default package */
/* loaded from: classes3.dex */
final class bhdm extends bhdt {
    private final String b;
    private final String c;
    private final View.OnClickListener d;
    private final jht e;
    private final jhp f;
    private final String g;
    private final jic h;
    private final cjtd i;
    private final cjtd j;

    public bhdm(String str, @dzsi String str2, @dzsi View.OnClickListener onClickListener, @dzsi jht jhtVar, @dzsi jhp jhpVar, @dzsi String str3, @dzsi jic jicVar, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2) {
        this.b = str;
        this.c = str2;
        this.d = onClickListener;
        this.e = jhtVar;
        this.f = jhpVar;
        this.g = str3;
        this.h = jicVar;
        this.i = cjtdVar;
        this.j = cjtdVar2;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    public String b() {
        return this.b;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public String c() {
        return this.c;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public View.OnClickListener d() {
        return this.d;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public jht e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        View.OnClickListener onClickListener;
        jht jhtVar;
        jhp jhpVar;
        String str2;
        jic jicVar;
        cjtd cjtdVar;
        cjtd cjtdVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhdt) {
            bhdt bhdtVar = (bhdt) obj;
            if (this.b.equals(bhdtVar.b()) && ((str = this.c) != null ? str.equals(bhdtVar.c()) : bhdtVar.c() == null) && ((onClickListener = this.d) != null ? onClickListener.equals(bhdtVar.d()) : bhdtVar.d() == null) && ((jhtVar = this.e) != null ? jhtVar.equals(bhdtVar.e()) : bhdtVar.e() == null) && ((jhpVar = this.f) != null ? jhpVar.equals(bhdtVar.f()) : bhdtVar.f() == null) && ((str2 = this.g) != null ? str2.equals(bhdtVar.g()) : bhdtVar.g() == null) && ((jicVar = this.h) != null ? jicVar.equals(bhdtVar.h()) : bhdtVar.h() == null) && ((cjtdVar = this.i) != null ? cjtdVar.equals(bhdtVar.i()) : bhdtVar.i() == null) && ((cjtdVar2 = this.j) != null ? cjtdVar2.equals(bhdtVar.j()) : bhdtVar.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public jhp f() {
        return this.f;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public String g() {
        return this.g;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public jic h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int hashCode3 = (hashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        jht jhtVar = this.e;
        int hashCode4 = (hashCode3 ^ (jhtVar == null ? 0 : jhtVar.hashCode())) * 1000003;
        jhp jhpVar = this.f;
        int hashCode5 = (hashCode4 ^ (jhpVar == null ? 0 : jhpVar.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode6 = (hashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        jic jicVar = this.h;
        int hashCode7 = (hashCode6 ^ (jicVar == null ? 0 : jicVar.hashCode())) * 1000003;
        cjtd cjtdVar = this.i;
        int hashCode8 = (hashCode7 ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        cjtd cjtdVar2 = this.j;
        if (cjtdVar2 != null) {
            i = cjtdVar2.hashCode();
        }
        return hashCode8 ^ i;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.bhdt, defpackage.bhdk
    @dzsi
    public cjtd j() {
        return this.j;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String str3 = this.g;
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 153 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("TaskCardViewModelImpl{headline=");
        sb.append(str);
        sb.append(", ctaText=");
        sb.append(str2);
        sb.append(", onCtaClicked=");
        sb.append(valueOf);
        sb.append(", overflowMenuProperties=");
        sb.append(valueOf2);
        sb.append(", image=");
        sb.append(valueOf3);
        sb.append(", bodyText=");
        sb.append(str3);
        sb.append(", avatar=");
        sb.append(valueOf4);
        sb.append(", taskCardLoggingParams=");
        sb.append(valueOf5);
        sb.append(", ctaLoggingParams=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
