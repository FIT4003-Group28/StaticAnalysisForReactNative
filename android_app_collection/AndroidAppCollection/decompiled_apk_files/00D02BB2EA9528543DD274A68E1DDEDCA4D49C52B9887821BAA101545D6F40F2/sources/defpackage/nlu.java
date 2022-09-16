package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nlu  reason: default package */
/* loaded from: classes7.dex */
public final class nlu extends nlw {
    public final String a;
    public final akqq b;
    public final amvh c;
    public final String d;
    public final Intent e;
    public final boolean f;
    public final int g;
    public final String h;
    public final int i;
    public final dowa j;
    public final dpej k;
    public final String l;
    public final dcdc<akqq> m;
    public final ddjr n;
    public final int o;
    public final dpjs p;

    public nlu(String str, @dzsi akqq akqqVar, @dzsi amvh amvhVar, String str2, Intent intent, boolean z, int i, String str3, int i2, dowa dowaVar, @dzsi dpej dpejVar, @dzsi String str4, dcdc<akqq> dcdcVar, @dzsi ddjr ddjrVar, int i3, dpjs dpjsVar) {
        this.a = str;
        this.b = akqqVar;
        this.c = amvhVar;
        this.d = str2;
        this.e = intent;
        this.f = z;
        this.g = i;
        this.h = str3;
        this.i = i2;
        this.j = dowaVar;
        this.k = dpejVar;
        this.l = str4;
        this.m = dcdcVar;
        this.n = ddjrVar;
        this.o = i3;
        this.p = dpjsVar;
    }

    @Override // defpackage.nlw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.nlw
    @dzsi
    public final String b() {
        return null;
    }

    @Override // defpackage.nlw
    @dzsi
    public final akqq c() {
        return this.b;
    }

    @Override // defpackage.nlw
    @dzsi
    public final amvh d() {
        return this.c;
    }

    @Override // defpackage.nlw
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        akqq akqqVar;
        amvh amvhVar;
        dpej dpejVar;
        String str;
        ddjr ddjrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nlw) {
            nlw nlwVar = (nlw) obj;
            if (this.a.equals(nlwVar.a()) && nlwVar.b() == null && ((akqqVar = this.b) != null ? akqqVar.equals(nlwVar.c()) : nlwVar.c() == null) && ((amvhVar = this.c) != null ? amvhVar.equals(nlwVar.d()) : nlwVar.d() == null) && this.d.equals(nlwVar.e()) && this.e.equals(nlwVar.f()) && this.f == nlwVar.g() && this.g == nlwVar.h() && this.h.equals(nlwVar.i()) && this.i == nlwVar.j() && this.j.equals(nlwVar.k()) && ((dpejVar = this.k) != null ? dpejVar.equals(nlwVar.l()) : nlwVar.l() == null) && ((str = this.l) != null ? str.equals(nlwVar.m()) : nlwVar.m() == null) && dchl.m(this.m, nlwVar.n()) && ((ddjrVar = this.n) != null ? ddjrVar.equals(nlwVar.o()) : nlwVar.o() == null) && this.o == nlwVar.p() && this.p.equals(nlwVar.q())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nlw
    public final Intent f() {
        return this.e;
    }

    @Override // defpackage.nlw
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.nlw
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * (-721379959);
        akqq akqqVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003;
        amvh amvhVar = this.c;
        int hashCode3 = (((((((((((((((hashCode2 ^ (amvhVar == null ? 0 : amvhVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003;
        dpej dpejVar = this.k;
        int hashCode4 = (hashCode3 ^ (dpejVar == null ? 0 : dpejVar.hashCode())) * 1000003;
        String str = this.l;
        int hashCode5 = (((hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.m.hashCode()) * 1000003;
        ddjr ddjrVar = this.n;
        if (ddjrVar != null) {
            i = ddjrVar.hashCode();
        }
        return ((((hashCode5 ^ i) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.nlw
    public final String i() {
        return this.h;
    }

    @Override // defpackage.nlw
    public final int j() {
        return this.i;
    }

    @Override // defpackage.nlw
    public final dowa k() {
        return this.j;
    }

    @Override // defpackage.nlw
    @dzsi
    public final dpej l() {
        return this.k;
    }

    @Override // defpackage.nlw
    @dzsi
    public final String m() {
        return this.l;
    }

    @Override // defpackage.nlw
    public final dcdc<akqq> n() {
        return this.m;
    }

    @Override // defpackage.nlw
    @dzsi
    public final ddjr o() {
        return this.n;
    }

    @Override // defpackage.nlw
    public final int p() {
        return this.o;
    }

    @Override // defpackage.nlw
    public final dpjs q() {
        return this.p;
    }

    @Override // defpackage.nlw
    public final nlv r() {
        return new nlt(this);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        boolean z = this.f;
        int i = this.g;
        String str3 = this.h;
        int i2 = this.i;
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        String str4 = this.l;
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.n);
        int i3 = this.o;
        String valueOf8 = String.valueOf(this.p);
        int length = String.valueOf(str).length();
        int length2 = "null".length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(str3).length();
        int length8 = String.valueOf(valueOf4).length();
        int length9 = String.valueOf(valueOf5).length();
        int length10 = String.valueOf(str4).length();
        int length11 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 227 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("Suggestion{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append((String) null);
        sb.append(", location=");
        sb.append(valueOf);
        sb.append(", destination=");
        sb.append(valueOf2);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", intent=");
        sb.append(valueOf3);
        sb.append(", hasRoute=");
        sb.append(z);
        sb.append(", eta=");
        sb.append(i);
        sb.append(", formattedEta=");
        sb.append(str3);
        sb.append(", distance=");
        sb.append(i2);
        sb.append(", distanceUnit=");
        sb.append(valueOf4);
        sb.append(", traffic=");
        sb.append(valueOf5);
        sb.append(", via=");
        sb.append(str4);
        sb.append(", waypoints=");
        sb.append(valueOf6);
        sb.append(", entryPoint=");
        sb.append(valueOf7);
        sb.append(", index=");
        sb.append(i3);
        sb.append(", entityType=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
