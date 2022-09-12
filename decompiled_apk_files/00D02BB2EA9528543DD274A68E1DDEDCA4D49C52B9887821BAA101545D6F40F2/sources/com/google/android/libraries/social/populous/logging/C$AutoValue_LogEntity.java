package com.google.android.libraries.social.populous.logging;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.logging.$AutoValue_LogEntity  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_LogEntity extends LogEntity {
    public final EnumSet<cygl> a;
    public final EnumSet<cygl> b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final Integer q;
    public final int r;
    public final int s;

    public C$AutoValue_LogEntity(EnumSet<cygl> enumSet, EnumSet<cygl> enumSet2, @dzsi String str, String str2, int i, int i2, @dzsi String str3, @dzsi String str4, @dzsi String str5, @dzsi String str6, @dzsi Long l, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @dzsi Integer num) {
        if (enumSet != null) {
            this.a = enumSet;
            if (enumSet2 != null) {
                this.b = enumSet2;
                this.c = str;
                if (str2 != null) {
                    this.d = str2;
                    this.e = i;
                    this.f = i2;
                    this.g = str3;
                    this.h = str4;
                    this.i = str5;
                    this.j = str6;
                    this.k = l;
                    if (i3 != 0) {
                        this.r = i3;
                        if (i4 != 0) {
                            this.s = i4;
                            this.l = z;
                            this.m = z2;
                            this.n = z3;
                            this.o = z4;
                            this.p = z5;
                            this.q = num;
                            return;
                        }
                        throw new NullPointerException("Null personEntityType");
                    }
                    throw new NullPointerException("Null entityType");
                }
                throw new NullPointerException("Null fieldLoggingId");
            }
            throw new NullPointerException("Null provenance");
        }
        throw new NullPointerException("Null personProvenance");
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final EnumSet<cygl> a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final EnumSet<cygl> b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEntity) {
            LogEntity logEntity = (LogEntity) obj;
            if (this.a.equals(logEntity.a()) && this.b.equals(logEntity.b()) && ((str = this.c) != null ? str.equals(logEntity.c()) : logEntity.c() == null) && this.d.equals(logEntity.d()) && this.e == logEntity.e() && this.f == logEntity.f() && ((str2 = this.g) != null ? str2.equals(logEntity.g()) : logEntity.g() == null) && ((str3 = this.h) != null ? str3.equals(logEntity.h()) : logEntity.h() == null) && ((str4 = this.i) != null ? str4.equals(logEntity.i()) : logEntity.i() == null) && ((str5 = this.j) != null ? str5.equals(logEntity.j()) : logEntity.j() == null) && ((l = this.k) != null ? l.equals(logEntity.k()) : logEntity.k() == null) && this.r == logEntity.s() && this.s == logEntity.t() && this.l == logEntity.l() && this.m == logEntity.m() && this.n == logEntity.n() && this.o == logEntity.o() && this.p == logEntity.p() && ((num = this.q) != null ? num.equals(logEntity.q()) : logEntity.q() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final int f() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.i;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.j;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Long l = this.k;
        int i2 = 1237;
        int hashCode7 = (((((((((((((hashCode6 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.r) * 1000003) ^ this.s) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003;
        if (true == this.p) {
            i2 = 1231;
        }
        int i3 = (hashCode7 ^ i2) * 1000003;
        Integer num = this.q;
        if (num != null) {
            i = num.hashCode();
        }
        return i3 ^ i;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final String i() {
        return this.i;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final String j() {
        return this.j;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final Long k() {
        return this.k;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final boolean l() {
        return this.l;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final boolean m() {
        return this.m;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final boolean n() {
        return this.n;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final boolean o() {
        return this.o;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final boolean p() {
        return this.p;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    @dzsi
    public final Integer q() {
        return this.q;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final cyoz r() {
        return new cyoh(this);
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final int s() {
        return this.r;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEntity
    public final int t() {
        return this.s;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        int i = this.e;
        int i2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        String str5 = this.i;
        String str6 = this.j;
        String valueOf3 = String.valueOf(this.k);
        String a = cypa.a(this.r);
        String a2 = cypa.a(this.s);
        boolean z = this.l;
        boolean z2 = this.m;
        boolean z3 = this.n;
        boolean z4 = this.o;
        boolean z5 = this.p;
        String valueOf4 = String.valueOf(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = str2.length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        int length8 = String.valueOf(str6).length();
        int length9 = String.valueOf(valueOf3).length();
        int length10 = a.length();
        StringBuilder sb = new StringBuilder(length + 370 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + a2.length() + String.valueOf(valueOf4).length());
        sb.append("LogEntity{personProvenance=");
        sb.append(valueOf);
        sb.append(", provenance=");
        sb.append(valueOf2);
        sb.append(", personLoggingId=");
        sb.append(str);
        sb.append(", fieldLoggingId=");
        sb.append(str2);
        sb.append(", personLevelPosition=");
        sb.append(i);
        sb.append(", fieldLevelPosition=");
        sb.append(i2);
        sb.append(", displayName=");
        sb.append(str3);
        sb.append(", email=");
        sb.append(str4);
        sb.append(", phone=");
        sb.append(str5);
        sb.append(", encodedProfileId=");
        sb.append(str6);
        sb.append(", focusContactId=");
        sb.append(valueOf3);
        sb.append(", entityType=");
        sb.append(a);
        sb.append(", personEntityType=");
        sb.append(a2);
        sb.append(", hasDisplayNameMatches=");
        sb.append(z);
        sb.append(", hasFieldMatches=");
        sb.append(z2);
        sb.append(", hasAvatar=");
        sb.append(z3);
        sb.append(", boosted=");
        sb.append(z4);
        sb.append(", isExternalEventSource=");
        sb.append(z5);
        sb.append(", callbackLatency=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
