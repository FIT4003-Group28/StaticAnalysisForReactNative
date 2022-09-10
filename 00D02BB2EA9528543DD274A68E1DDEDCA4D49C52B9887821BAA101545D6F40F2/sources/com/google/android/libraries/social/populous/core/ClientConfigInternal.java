package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ClientConfigInternal implements Parcelable, cydz {
    public static final Parcelable.Creator<ClientConfigInternal> CREATOR;
    public static final ClassLoader R;
    public static final long a;
    public static final long b;
    public static final long c;
    public final boolean A;
    public final cygp B;
    public final cygp C;
    public final boolean D;
    public final cyeh E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final SessionContextRuleSet I;
    public final Experiments J;
    public final dcep<dhfr> K;
    public final boolean L;
    public final boolean M;
    public final dcep<dhew> N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final int S;
    public final int T;
    public final boolean d;
    public final ClientId e;
    public final int f;
    public final dhdj g;
    public final dued h;
    public final dbsg<dued> i;
    public final duey j;
    public final boolean k;
    public final dcep<cydt> l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final long p;
    public final boolean q;
    public final dcep<dhdf> r;
    public final boolean s;
    public final SocialAffinityAllEventSource t;
    public final cyfk u;
    public final cyfk v;
    public final dcep<cyfk> w;
    public final boolean x;
    public final boolean y;
    public final cyei z;

    static {
        TimeUnit.HOURS.toMillis(1L);
        a = TimeUnit.DAYS.toMillis(1L);
        b = TimeUnit.DAYS.toMillis(1L) / 2;
        TimeUnit.DAYS.toMillis(7L);
        c = TimeUnit.DAYS.toMillis(14L);
        TimeUnit.DAYS.toMillis(30L);
        CREATOR = new cyeb();
        R = ClientConfigInternal.class.getClassLoader();
    }

    public ClientConfigInternal(boolean z, ClientId clientId, int i, dhdj dhdjVar, dued duedVar, dbsg<dued> dbsgVar, duey dueyVar, boolean z2, dcep<cydt> dcepVar, boolean z3, boolean z4, long j, long j2, boolean z5, dcep<dhdf> dcepVar2, boolean z6, int i2, SocialAffinityAllEventSource socialAffinityAllEventSource, cyfk cyfkVar, cyfk cyfkVar2, dcep<cyfk> dcepVar3, boolean z7, boolean z8, cyei cyeiVar, boolean z9, cygp cygpVar, cygp cygpVar2, boolean z10, cyeh cyehVar, boolean z11, boolean z12, boolean z13, SessionContextRuleSet sessionContextRuleSet, Experiments experiments, dcep<dhfr> dcepVar4, boolean z14, int i3, boolean z15, dcep<dhew> dcepVar5, boolean z16, boolean z17, boolean z18) {
        this.d = z;
        dbsk.s(clientId);
        this.e = clientId;
        this.f = i;
        dbsk.s(dhdjVar);
        this.g = dhdjVar;
        dbsk.s(duedVar);
        this.h = duedVar;
        dbsk.s(dbsgVar);
        this.i = dbsgVar;
        dbsk.s(dueyVar);
        this.j = dueyVar;
        this.k = z2;
        dbsk.s(dcepVar);
        this.l = dcepVar;
        this.m = z3;
        this.n = z4;
        this.o = j;
        this.p = j2;
        this.q = z5;
        dbsk.s(dcepVar2);
        this.r = dcepVar2;
        this.s = z6;
        if (i2 != 0) {
            this.S = i2;
            dbsk.s(socialAffinityAllEventSource);
            this.t = socialAffinityAllEventSource;
            dbsk.s(cyfkVar);
            this.u = cyfkVar;
            dbsk.s(cyfkVar2);
            this.v = cyfkVar2;
            dbsk.s(dcepVar3);
            this.w = dcepVar3;
            this.x = z7;
            this.y = z8;
            dbsk.s(cyeiVar);
            this.z = cyeiVar;
            this.A = z9;
            dbsk.s(cygpVar);
            this.B = cygpVar;
            dbsk.s(cygpVar2);
            this.C = cygpVar2;
            this.D = z10;
            dbsk.s(cyehVar);
            this.E = cyehVar;
            this.F = z11;
            this.G = z12;
            this.H = z13;
            dbsk.s(sessionContextRuleSet);
            this.I = sessionContextRuleSet;
            dbsk.s(experiments);
            this.J = experiments;
            dbsk.s(dcepVar4);
            this.K = dcepVar4;
            this.L = z14;
            this.T = i3;
            this.M = z15;
            dbsk.s(dcepVar5);
            this.N = dcepVar5;
            this.O = z16;
            this.P = z17;
            this.Q = z18;
            return;
        }
        throw null;
    }

    public static cyec f() {
        return new cyec();
    }

    @Override // defpackage.cydz
    public final ClientId a() {
        return this.e;
    }

    public final boolean b() {
        return dyat.a.a().i() ? dyat.a.a().m() : this.d;
    }

    public final int c() {
        return dyat.a.a().g() ? decl.b(dyat.a.a().e()) : this.f;
    }

    public final boolean d(ClientConfigInternal clientConfigInternal) {
        return this.h == clientConfigInternal.h && this.r.equals(clientConfigInternal.r) && this.s == clientConfigInternal.s && this.K.equals(clientConfigInternal.K) && this.L == clientConfigInternal.L && this.J.equals(clientConfigInternal.J) && this.M == clientConfigInternal.M && dbsd.a(this.N, clientConfigInternal.N);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final cyec e() {
        return new cyec(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientConfigInternal) {
            ClientConfigInternal clientConfigInternal = (ClientConfigInternal) obj;
            if (this.d == clientConfigInternal.d && this.e.equals(clientConfigInternal.e) && this.f == clientConfigInternal.f && this.g.equals(clientConfigInternal.g) && this.h.equals(clientConfigInternal.h) && this.i.equals(clientConfigInternal.i) && this.j.equals(clientConfigInternal.j) && this.k == clientConfigInternal.k && this.l.equals(clientConfigInternal.l) && this.m == clientConfigInternal.m && this.n == clientConfigInternal.n && this.o == clientConfigInternal.o && this.p == clientConfigInternal.p && this.q == clientConfigInternal.q && this.r.equals(clientConfigInternal.r) && this.s == clientConfigInternal.s && this.S == clientConfigInternal.S && this.t.equals(clientConfigInternal.t) && this.u.equals(clientConfigInternal.u) && this.v.equals(clientConfigInternal.v) && this.w.equals(clientConfigInternal.w) && this.x == clientConfigInternal.x && this.y == clientConfigInternal.y && this.z.equals(clientConfigInternal.z) && this.A == clientConfigInternal.A && this.B.equals(clientConfigInternal.B) && this.C.equals(clientConfigInternal.C) && this.D == clientConfigInternal.D && this.E.equals(clientConfigInternal.E) && this.F == clientConfigInternal.F && this.G == clientConfigInternal.G && this.H == clientConfigInternal.H && this.I.equals(clientConfigInternal.I) && this.J.equals(clientConfigInternal.J) && this.K.equals(clientConfigInternal.K) && this.L == clientConfigInternal.L && this.T == clientConfigInternal.T && this.M == clientConfigInternal.M && this.N.equals(clientConfigInternal.N) && this.O == clientConfigInternal.O && this.P == clientConfigInternal.P && this.Q == clientConfigInternal.Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003;
        int i2 = true != this.n ? 1237 : 1231;
        long j = this.o;
        long j2 = this.p;
        int hashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ dudf.a(this.S)) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ this.z.hashCode()) * 1000003) ^ (true != this.A ? 1237 : 1231)) * 1000003) ^ this.B.hashCode()) * 1000003) ^ this.C.hashCode()) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ this.E.hashCode()) * 1000003) ^ (true != this.F ? 1237 : 1231)) * 1000003) ^ (true != this.G ? 1237 : 1231)) * 1000003) ^ (true != this.H ? 1237 : 1231)) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ this.K.hashCode()) * 1000003) ^ (true != this.L ? 1237 : 1231)) * 1000003;
        int i3 = this.T;
        if (i3 != 0) {
            int hashCode3 = (((((((((hashCode2 ^ i3) * 1000003) ^ (true != this.M ? 1237 : 1231)) * 1000003) ^ this.N.hashCode()) * 1000003) ^ (true != this.O ? 1237 : 1231)) * 1000003) ^ (true != this.P ? 1237 : 1231)) * 1000003;
            if (true == this.Q) {
                i = 1231;
            }
            return hashCode3 ^ i;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.d));
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g.a());
        parcel.writeInt(this.h.cg);
        dbsg<dued> dbsgVar = this.i;
        parcel.writeByte(dbsgVar.a() ? (byte) 1 : (byte) 0);
        if (dbsgVar.a()) {
            parcel.writeInt(dbsgVar.b().a());
        }
        parcel.writeInt(this.j.r);
        parcel.writeValue(Boolean.valueOf(this.k));
        cybp.a(parcel, this.l);
        parcel.writeValue(Boolean.valueOf(this.m));
        parcel.writeValue(Boolean.valueOf(this.n));
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeValue(Boolean.valueOf(this.q));
        cybp.b(parcel, this.r);
        parcel.writeValue(Boolean.valueOf(this.s));
        parcel.writeInt(this.S - 1);
        parcel.writeParcelable(this.t, 0);
        parcel.writeInt(this.u.ordinal());
        parcel.writeInt(this.v.ordinal());
        cybp.a(parcel, this.w);
        parcel.writeValue(Boolean.valueOf(this.x));
        parcel.writeValue(Boolean.valueOf(this.y));
        parcel.writeInt(this.z.ordinal());
        parcel.writeValue(Boolean.valueOf(this.A));
        parcel.writeInt(this.B.ordinal());
        parcel.writeInt(this.C.ordinal());
        parcel.writeValue(Boolean.valueOf(this.D));
        parcel.writeInt(this.E.ordinal());
        parcel.writeValue(Boolean.valueOf(this.F));
        parcel.writeValue(Boolean.valueOf(this.G));
        parcel.writeValue(Boolean.valueOf(this.H));
        parcel.writeParcelable(this.I, 0);
        parcel.writeParcelable(this.J, 0);
        cybp.b(parcel, this.K);
        parcel.writeValue(Boolean.valueOf(this.L));
        parcel.writeInt(cydu.a(this.T));
        parcel.writeValue(Boolean.valueOf(this.M));
        cybp.b(parcel, this.N);
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeValue(Boolean.valueOf(this.P));
        parcel.writeInt(this.Q ? 1 : 0);
    }
}
