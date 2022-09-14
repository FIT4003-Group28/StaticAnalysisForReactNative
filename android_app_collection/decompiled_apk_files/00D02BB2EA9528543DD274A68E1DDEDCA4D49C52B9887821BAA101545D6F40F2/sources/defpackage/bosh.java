package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bosh  reason: default package */
/* loaded from: classes3.dex */
public final class bosh extends bosj {
    public final String a;
    public final byee b;
    public final byee c;
    public final bokf d;
    public final String e;
    public final Boolean f;
    public final Boolean g;
    public final Set<byea> h;

    public bosh(String str, @dzsi byee byeeVar, @dzsi byee byeeVar2, bokf bokfVar, String str2, Boolean bool, Boolean bool2, Set<byea> set) {
        this.a = str;
        this.b = byeeVar;
        this.c = byeeVar2;
        this.d = bokfVar;
        this.e = str2;
        this.f = bool;
        this.g = bool2;
        this.h = set;
    }

    @Override // defpackage.bosj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bosj
    @dzsi
    public final byee b() {
        return this.b;
    }

    @Override // defpackage.bosj
    @dzsi
    public final byee c() {
        return this.c;
    }

    @Override // defpackage.bosj
    public final bokf d() {
        return this.d;
    }

    @Override // defpackage.bosj
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        byee byeeVar;
        byee byeeVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bosj) {
            bosj bosjVar = (bosj) obj;
            if (this.a.equals(bosjVar.a()) && ((byeeVar = this.b) != null ? byeeVar.equals(bosjVar.b()) : bosjVar.b() == null) && ((byeeVar2 = this.c) != null ? byeeVar2.equals(bosjVar.c()) : bosjVar.c() == null) && this.d.equals(bosjVar.d()) && this.e.equals(bosjVar.e()) && this.f.equals(bosjVar.f()) && this.g.equals(bosjVar.g()) && this.h.equals(bosjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bosj
    public final Boolean f() {
        return this.f;
    }

    @Override // defpackage.bosj
    public final Boolean g() {
        return this.g;
    }

    @Override // defpackage.bosj
    public final Set<byea> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        byee byeeVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (byeeVar == null ? 0 : byeeVar.hashCode())) * 1000003;
        byee byeeVar2 = this.c;
        if (byeeVar2 != null) {
            i = byeeVar2.hashCode();
        }
        return ((((((((((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.bosj
    public final bosi i() {
        return new bosg(this);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 186 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("EditHoursModel{placeName=");
        sb.append(str);
        sb.append(", placemarkOpenHours=");
        sb.append(valueOf);
        sb.append(", placemarkLiveOpenHours=");
        sb.append(valueOf2);
        sb.append(", businessHoursPhotosPreview=");
        sb.append(valueOf3);
        sb.append(", timezoneId=");
        sb.append(str2);
        sb.append(", verifiedCorrectHours=");
        sb.append(valueOf4);
        sb.append(", verifiedIncorrectHours=");
        sb.append(valueOf5);
        sb.append(", daysVerifiedIncorrect=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
