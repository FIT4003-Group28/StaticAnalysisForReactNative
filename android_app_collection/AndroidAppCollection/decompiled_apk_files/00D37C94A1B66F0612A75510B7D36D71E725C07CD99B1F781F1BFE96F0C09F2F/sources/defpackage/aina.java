package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aina  reason: default package */
/* loaded from: classes.dex */
public final class aina extends aaqs {
    public String A;
    public String B;
    public long C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public String I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f51J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public atyk Q;
    public afhz R;
    public final List S;
    public boolean T;
    public atcp U;
    public int V;
    public int W;
    public int X;
    public int Y;
    private final zfq Z;
    public final Set a;
    private final aiix aa;
    private final Set ab;
    private String ac;
    private Integer ad;
    private String ae;
    public String b;
    public String c;
    public String d;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public asah y;
    public asai z;

    public aina(aaqf aaqfVar, afvm afvmVar, zfq zfqVar, Set set, aiix aiixVar) {
        super("player", aaqfVar, afvmVar, 3);
        this.s = -1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.ab = new HashSet();
        this.B = "";
        this.C = -1L;
        this.D = -1;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.I = "";
        this.f51J = false;
        this.ad = null;
        this.V = 1;
        this.W = 1;
        this.X = 1;
        this.L = "";
        this.M = -1;
        this.N = -1;
        this.O = 0;
        this.P = -1;
        this.Y = 1;
        this.S = new ArrayList();
        this.Z = zfqVar;
        this.a = new HashSet(set);
        this.aa = aiixVar;
    }

    @Override // defpackage.aapd
    public final String b() {
        String str = this.ac;
        if (str != null) {
            return str;
        }
        afrt e = e();
        if (this.aa.i()) {
            e.c("clickTrackingParams", "shared");
        } else {
            e.d("autoplay", this.G);
            e.d(ahfn.AUTONAV, this.H);
        }
        e.c("videoId", this.b);
        e.c("playlistId", g(this.d));
        e.b("playlistIndex", d(this.s));
        e.c("playerParams", g(this.c));
        e.b("dataExpiredForSeconds", d(this.P));
        e.d("isAdRequest", this.w);
        int i = this.V;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        e.b("adSystem", i2);
        int i3 = this.W;
        int i4 = i3 - 1;
        if (i3 != 0) {
            e.b("adType", i4);
            int i5 = this.X;
            int i6 = i5 - 1;
            if (i5 != 0) {
                e.b("instreamType", i6);
                e.c("hostVideoId", g(this.L));
                e.d("isOfflineRequest", this.v);
                int i7 = this.Y;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    e.b("offlineDownloadUserChoice", i8);
                    e.b("offlineStorageFormat", 0L);
                    e.e("offlineSharingWrappedKey", aadi.a);
                    e.d("scriptedPlay", this.f51J);
                    e.c("serializedThirdPartyEmbedConfig", this.x);
                    for (aimz aimzVar : this.ab) {
                        aimzVar.a(e);
                    }
                    String a = e.a();
                    this.ac = a;
                    return a;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.b.getClass();
        zgh.m(this.k);
        aopa s = s();
        boolean z = false;
        aqxo.y((((aroy) s.instance).b & 256) != 0);
        aror arorVar = ((aroy) s.instance).j;
        if (arorVar == null) {
            arorVar = aror.a;
        }
        boolean z2 = false;
        for (asmc asmcVar : arorVar.b) {
            if (asmcVar.e.equals("ms") && asmcVar.c == 2) {
                z2 = true;
            }
        }
        aqxo.y(z2);
        if ((((aroy) s.instance).b & 2) == 0) {
            if (this.w) {
                if (this.v) {
                    return;
                }
                zgh.m(this.L);
                return;
            }
            aqxo.y(true);
            if (this.ad != null) {
                return;
            }
            if (this.v || this.j) {
                z = true;
            }
            aqxo.y(z);
        }
    }

    @Override // defpackage.aapd
    public final Map h() {
        if (this.f == null) {
            super.h();
            if (this.ae == null) {
                this.ae = this.Z.b(9);
            }
            this.f.put("id", this.b);
            this.f.put("t", this.ae);
        }
        return this.f;
    }

    public final void t(aimz aimzVar) {
        this.ab.add(aimzVar);
    }

    public final void u(int i) {
        this.ad = Integer.valueOf(i);
    }

    @Override // defpackage.aaqs
    /* renamed from: v */
    public final aopa a() {
        aopa createBuilder = asag.a.createBuilder();
        boolean z = this.u;
        createBuilder.copyOnWrite();
        asag asagVar = (asag) createBuilder.instance;
        asagVar.b |= 8;
        asagVar.f = z;
        boolean z2 = this.t;
        createBuilder.copyOnWrite();
        asag asagVar2 = (asag) createBuilder.instance;
        asagVar2.b |= 4;
        asagVar2.e = z2;
        boolean z3 = this.v;
        createBuilder.copyOnWrite();
        asag asagVar3 = (asag) createBuilder.instance;
        asagVar3.b |= 32;
        asagVar3.h = z3;
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            asag asagVar4 = (asag) createBuilder.instance;
            str.getClass();
            asagVar4.b |= 2;
            asagVar4.d = str;
        }
        if (!TextUtils.isEmpty(this.K)) {
            String str2 = this.K;
            createBuilder.copyOnWrite();
            asag asagVar5 = (asag) createBuilder.instance;
            str2.getClass();
            asagVar5.b |= 1048576;
            asagVar5.o = str2;
        }
        aopa createBuilder2 = atyj.a.createBuilder();
        if (!TextUtils.isEmpty(this.c)) {
            String str3 = this.c;
            createBuilder.copyOnWrite();
            asag asagVar6 = (asag) createBuilder.instance;
            str3.getClass();
            asagVar6.b |= 2048;
            asagVar6.k = str3;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            createBuilder.copyOnWrite();
            asag asagVar7 = (asag) createBuilder.instance;
            str4.getClass();
            asagVar7.b |= 256;
            asagVar7.i = str4;
            int i = this.s;
            if (i >= 0) {
                createBuilder.copyOnWrite();
                asag asagVar8 = (asag) createBuilder.instance;
                asagVar8.b |= 512;
                asagVar8.j = i;
            }
        }
        if (!this.w) {
            aopa createBuilder3 = atyg.a.createBuilder();
            for (aimu aimuVar : this.a) {
                aimuVar.a(createBuilder3);
            }
            if (!TextUtils.isEmpty(this.B)) {
                String str5 = this.B;
                createBuilder3.copyOnWrite();
                atyg atygVar = (atyg) createBuilder3.instance;
                str5.getClass();
                atygVar.b |= 2;
                atygVar.c = str5;
            }
            long j = this.C;
            if (j != -1) {
                createBuilder3.copyOnWrite();
                atyg atygVar2 = (atyg) createBuilder3.instance;
                atygVar2.b |= 8;
                atygVar2.e = j;
            }
            int i2 = this.D;
            if (i2 != -1) {
                createBuilder3.copyOnWrite();
                atyg atygVar3 = (atyg) createBuilder3.instance;
                atygVar3.b |= 4;
                atygVar3.d = i2;
            }
            int i3 = this.F;
            if (i3 != -1) {
                createBuilder3.copyOnWrite();
                atyg atygVar4 = (atyg) createBuilder3.instance;
                atygVar4.b |= 16;
                atygVar4.f = i3;
            }
            Integer num = this.ad;
            if (num != null && num.intValue() != -1) {
                int intValue = this.ad.intValue();
                createBuilder3.copyOnWrite();
                atyg atygVar5 = (atyg) createBuilder3.instance;
                atygVar5.b |= 64;
                atygVar5.h = intValue;
            }
            int i4 = this.M;
            if (i4 != -1) {
                createBuilder3.copyOnWrite();
                atyg atygVar6 = (atyg) createBuilder3.instance;
                atygVar6.b |= 128;
                atygVar6.i = i4;
            }
            int i5 = this.N;
            if (i5 != -1) {
                createBuilder3.copyOnWrite();
                atyg atygVar7 = (atyg) createBuilder3.instance;
                atygVar7.b |= 256;
                atygVar7.j = i5;
            }
            int i6 = this.O;
            createBuilder3.copyOnWrite();
            atyg atygVar8 = (atyg) createBuilder3.instance;
            atygVar8.b |= 512;
            atygVar8.k = i6;
            boolean z4 = this.G;
            createBuilder3.copyOnWrite();
            atyg atygVar9 = (atyg) createBuilder3.instance;
            atygVar9.b |= 4096;
            atygVar9.m = z4;
            boolean z5 = this.H;
            createBuilder3.copyOnWrite();
            atyg atygVar10 = (atyg) createBuilder3.instance;
            atygVar10.b |= 33554432;
            atygVar10.p = z5;
            String str6 = this.I;
            createBuilder3.copyOnWrite();
            atyg atygVar11 = (atyg) createBuilder3.instance;
            str6.getClass();
            atygVar11.b |= 16384;
            atygVar11.o = str6;
            boolean z6 = this.f51J;
            createBuilder3.copyOnWrite();
            atyg atygVar12 = (atyg) createBuilder3.instance;
            atygVar12.b |= 2048;
            atygVar12.l = z6;
            int i7 = this.E;
            createBuilder3.copyOnWrite();
            atyg atygVar13 = (atyg) createBuilder3.instance;
            atygVar13.b |= 32;
            atygVar13.g = i7;
            if (this.U != null) {
                aopa createBuilder4 = atyh.a.createBuilder();
                atcp atcpVar = this.U;
                createBuilder4.copyOnWrite();
                atyh atyhVar = (atyh) createBuilder4.instance;
                atcpVar.getClass();
                atyhVar.c = atcpVar;
                atyhVar.b |= 8;
                atyh atyhVar2 = (atyh) createBuilder4.mo39build();
                createBuilder3.copyOnWrite();
                atyg atygVar14 = (atyg) createBuilder3.instance;
                atyhVar2.getClass();
                atygVar14.q = atyhVar2;
                atygVar14.b |= 268435456;
            }
            createBuilder2.copyOnWrite();
            atyj atyjVar = (atyj) createBuilder2.instance;
            atyg atygVar15 = (atyg) createBuilder3.mo39build();
            atygVar15.getClass();
            atyjVar.c = atygVar15;
            atyjVar.b |= 1;
            if (this.R != null) {
                aopa createBuilder5 = asal.a.createBuilder();
                aoob x = aoob.x(this.R.b);
                createBuilder5.copyOnWrite();
                asal asalVar = (asal) createBuilder5.instance;
                asalVar.b |= 1;
                asalVar.c = x;
                asal asalVar2 = (asal) createBuilder5.mo39build();
                createBuilder.copyOnWrite();
                asag asagVar9 = (asag) createBuilder.instance;
                asalVar2.getClass();
                asagVar9.r = asalVar2;
                asagVar9.b |= 8388608;
            }
        } else {
            aopa createBuilder6 = aozj.a.createBuilder();
            int i8 = this.V;
            createBuilder6.copyOnWrite();
            aozj aozjVar = (aozj) createBuilder6.instance;
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            aozjVar.c = i9;
            aozjVar.b |= 1;
            int i10 = this.W;
            createBuilder6.copyOnWrite();
            aozj aozjVar2 = (aozj) createBuilder6.instance;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            aozjVar2.d = i11;
            aozjVar2.b |= 2;
            int i12 = this.X;
            createBuilder6.copyOnWrite();
            aozj aozjVar3 = (aozj) createBuilder6.instance;
            int i13 = i12 - 1;
            if (i12 != 0) {
                aozjVar3.e = i13;
                aozjVar3.b |= 4;
                String str7 = this.L;
                createBuilder6.copyOnWrite();
                aozj aozjVar4 = (aozj) createBuilder6.instance;
                str7.getClass();
                aozjVar4.b |= 16;
                aozjVar4.f = str7;
                aozj aozjVar5 = (aozj) createBuilder6.mo39build();
                createBuilder2.copyOnWrite();
                atyj atyjVar2 = (atyj) createBuilder2.instance;
                aozjVar5.getClass();
                atyjVar2.d = aozjVar5;
                atyjVar2.b |= 2;
            } else {
                throw null;
            }
        }
        if (this.P != -1) {
            aopa createBuilder7 = atyl.a.createBuilder();
            int i14 = this.P;
            createBuilder7.copyOnWrite();
            atyl atylVar = (atyl) createBuilder7.instance;
            atylVar.b |= 1;
            atylVar.c = i14;
            atyl atylVar2 = (atyl) createBuilder7.mo39build();
            createBuilder2.copyOnWrite();
            atyj atyjVar3 = (atyj) createBuilder2.instance;
            atylVar2.getClass();
            atyjVar3.f = atylVar2;
            atyjVar3.b |= 8;
        }
        atyk atykVar = this.Q;
        if (atykVar != null) {
            createBuilder2.copyOnWrite();
            atyj atyjVar4 = (atyj) createBuilder2.instance;
            atyjVar4.e = atykVar;
            atyjVar4.b |= 4;
        }
        if (this.Y != 1) {
            aopa createBuilder8 = atyi.a.createBuilder();
            int i15 = this.Y;
            createBuilder8.copyOnWrite();
            atyi atyiVar = (atyi) createBuilder8.instance;
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            atyiVar.c = i16;
            atyiVar.b |= 1;
            createBuilder8.copyOnWrite();
            atyi atyiVar2 = (atyi) createBuilder8.instance;
            atyiVar2.d = 0;
            atyiVar2.b |= 4;
            createBuilder2.copyOnWrite();
            atyj atyjVar5 = (atyj) createBuilder2.instance;
            atyi atyiVar3 = (atyi) createBuilder8.mo39build();
            atyiVar3.getClass();
            atyjVar5.g = atyiVar3;
            atyjVar5.b |= 16;
        }
        createBuilder.copyOnWrite();
        asag asagVar10 = (asag) createBuilder.instance;
        atyj atyjVar6 = (atyj) createBuilder2.mo39build();
        atyjVar6.getClass();
        asagVar10.g = atyjVar6;
        asagVar10.b |= 16;
        List list = this.S;
        createBuilder.copyOnWrite();
        asag asagVar11 = (asag) createBuilder.instance;
        aopq aopqVar = asagVar11.l;
        if (!aopqVar.c()) {
            asagVar11.l = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll((Iterable) list, (List) asagVar11.l);
        String str8 = this.x;
        if (str8 != null) {
            createBuilder.copyOnWrite();
            asag asagVar12 = (asag) createBuilder.instance;
            asagVar12.b |= 65536;
            asagVar12.m = str8;
        }
        asah asahVar = this.y;
        if (asahVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar13 = (asag) createBuilder.instance;
            asagVar13.q = asahVar;
            asagVar13.b |= 4194304;
        }
        String str9 = this.A;
        if (str9 != null) {
            createBuilder.copyOnWrite();
            asag asagVar14 = (asag) createBuilder.instance;
            asagVar14.b |= 524288;
            asagVar14.n = str9;
        }
        asai asaiVar = this.z;
        if (asaiVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar15 = (asag) createBuilder.instance;
            asagVar15.s = asaiVar;
            asagVar15.b |= 16777216;
        }
        if (this.T) {
            createBuilder.copyOnWrite();
            asag asagVar16 = (asag) createBuilder.instance;
            asagVar16.b |= 2097152;
            asagVar16.p = true;
        }
        return createBuilder;
    }
}
