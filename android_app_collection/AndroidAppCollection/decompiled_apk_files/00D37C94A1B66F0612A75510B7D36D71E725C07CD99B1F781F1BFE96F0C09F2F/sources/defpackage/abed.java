package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: abed  reason: default package */
/* loaded from: classes.dex */
public final class abed extends aaqs {
    public asge A;
    public boolean B;
    public atcp C;
    public boolean D;
    public boolean E;
    public int F;
    private String G;
    private String H;
    private final List I;
    public String a;
    public int b;
    public String c;
    public String d;
    public boolean s;
    public asgp t;
    public String u;
    public long v;
    public long w;
    public String x;
    public String y;
    public String z;

    public abed(String str, aaqf aaqfVar, afvm afvmVar, boolean z, Optional optional) {
        super(str, aaqfVar, afvmVar, optional);
        this.b = 0;
        this.s = false;
        this.I = new ArrayList();
        this.v = -1L;
        this.w = -1L;
        this.B = false;
        this.D = false;
        this.E = false;
        this.i = z;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("videoId", this.G);
        e.c("playlistId", this.a);
        e.b("playlistIndex", d(this.b));
        e.c("gamingEventId", null);
        e.c("params", this.H);
        e.c("adParams", this.c);
        e.c("continuation", this.d);
        e.d("isAdPlayback", this.s);
        e.d("mdxUseDevServer", false);
        e.c("forceAdUrls", "null");
        e.c("forceAdGroupId", null);
        e.c("forceViralAdResponseUrl", null);
        e.d("isAudioOnly", false);
        int i = this.F;
        if (i != 0) {
            e.b("autonavState", i - 1);
        }
        e.c("serializedThirdPartyEmbedConfig", this.u);
        e.b("playerTimestamp", this.v);
        e.c("lastScrubbedInlinePlaybackId", this.x);
        e.c("lastAudioTurnedOnInlinePlaybackId", this.y);
        e.c("lastAudioTurnedOffInlinePlaybackId", this.z);
        e.d("captionsRequested", this.B);
        e.d("allowAdultContent", this.E);
        e.d("allowControversialContent", this.D);
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(null)) {
            z = false;
        }
        aqxo.y(z);
    }

    public final void t(int i) {
        this.I.add(Integer.valueOf(i));
    }

    public final void u(String str) {
        str.getClass();
        this.H = str;
    }

    public final void v(String str) {
        str.getClass();
        this.G = str;
    }

    @Override // defpackage.aaqs
    /* renamed from: w */
    public final aopa a() {
        aopa createBuilder = asgs.a.createBuilder();
        boolean z = this.s;
        createBuilder.copyOnWrite();
        asgs asgsVar = (asgs) createBuilder.instance;
        asgsVar.b |= 256;
        asgsVar.j = z;
        createBuilder.copyOnWrite();
        asgs asgsVar2 = (asgs) createBuilder.instance;
        asgsVar2.b |= 4096;
        asgsVar2.n = false;
        createBuilder.copyOnWrite();
        asgs asgsVar3 = (asgs) createBuilder.instance;
        asgsVar3.b |= 16777216;
        asgsVar3.p = false;
        createBuilder.copyOnWrite();
        asgs asgsVar4 = (asgs) createBuilder.instance;
        asgsVar4.b |= 134217728;
        asgsVar4.r = false;
        boolean z2 = this.B;
        createBuilder.copyOnWrite();
        asgs asgsVar5 = (asgs) createBuilder.instance;
        asgsVar5.c |= 512;
        asgsVar5.A = z2;
        boolean z3 = this.E;
        createBuilder.copyOnWrite();
        asgs asgsVar6 = (asgs) createBuilder.instance;
        asgsVar6.b |= 2048;
        asgsVar6.m = z3;
        boolean z4 = this.D;
        createBuilder.copyOnWrite();
        asgs asgsVar7 = (asgs) createBuilder.instance;
        asgsVar7.b |= 1024;
        asgsVar7.l = z4;
        if (!TextUtils.isEmpty(this.G)) {
            String str = this.G;
            createBuilder.copyOnWrite();
            asgs asgsVar8 = (asgs) createBuilder.instance;
            str.getClass();
            asgsVar8.b |= 2;
            asgsVar8.e = str;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str2 = this.a;
            createBuilder.copyOnWrite();
            asgs asgsVar9 = (asgs) createBuilder.instance;
            str2.getClass();
            asgsVar9.b |= 4;
            asgsVar9.f = str2;
        }
        if (TextUtils.isEmpty(null)) {
            int i = this.b;
            if (i > 0) {
                createBuilder.copyOnWrite();
                asgs asgsVar10 = (asgs) createBuilder.instance;
                asgsVar10.b |= 64;
                asgsVar10.i = i;
            }
            String str3 = this.H;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar11 = (asgs) createBuilder.instance;
                asgsVar11.b |= 16;
                asgsVar11.g = str3;
            }
            String str4 = this.c;
            if (str4 != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar12 = (asgs) createBuilder.instance;
                asgsVar12.b |= 512;
                asgsVar12.k = str4;
            }
            String str5 = this.d;
            if (str5 != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar13 = (asgs) createBuilder.instance;
                asgsVar13.b |= 32;
                asgsVar13.h = str5;
            }
            List list = this.I;
            createBuilder.copyOnWrite();
            asgs asgsVar14 = (asgs) createBuilder.instance;
            aopq aopqVar = asgsVar14.o;
            if (!aopqVar.c()) {
                asgsVar14.o = aopi.mutableCopy(aopqVar);
            }
            aonk.addAll((Iterable) list, (List) asgsVar14.o);
            int i2 = this.F;
            if (i2 != 0 && i2 != 1) {
                createBuilder.copyOnWrite();
                asgs asgsVar15 = (asgs) createBuilder.instance;
                asgsVar15.q = i2 - 1;
                asgsVar15.b |= 67108864;
            }
            asgp asgpVar = this.t;
            if (asgpVar != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar16 = (asgs) createBuilder.instance;
                asgsVar16.u = asgpVar;
                asgsVar16.c |= 4;
            }
            String str6 = this.u;
            if (str6 != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar17 = (asgs) createBuilder.instance;
                asgsVar17.c |= 1;
                asgsVar17.t = str6;
            }
            long j = this.v;
            if (j != -1) {
                createBuilder.copyOnWrite();
                asgs asgsVar18 = (asgs) createBuilder.instance;
                asgsVar18.c |= 8;
                asgsVar18.v = j;
            }
            if (!TextUtils.isEmpty(null)) {
                aopa createBuilder2 = aqzk.a.createBuilder();
                createBuilder2.copyOnWrite();
                aqzk aqzkVar = (aqzk) createBuilder2.instance;
                throw null;
            } else if (TextUtils.isEmpty(null)) {
                if (!TextUtils.isEmpty(this.x)) {
                    String str7 = this.x;
                    createBuilder.copyOnWrite();
                    asgs asgsVar19 = (asgs) createBuilder.instance;
                    str7.getClass();
                    asgsVar19.c |= 32;
                    asgsVar19.w = str7;
                }
                if (!TextUtils.isEmpty(this.y)) {
                    String str8 = this.y;
                    createBuilder.copyOnWrite();
                    asgs asgsVar20 = (asgs) createBuilder.instance;
                    str8.getClass();
                    asgsVar20.c |= 64;
                    asgsVar20.x = str8;
                }
                if (!TextUtils.isEmpty(this.z)) {
                    String str9 = this.z;
                    createBuilder.copyOnWrite();
                    asgs asgsVar21 = (asgs) createBuilder.instance;
                    str9.getClass();
                    asgsVar21.c |= 128;
                    asgsVar21.y = str9;
                }
                asge asgeVar = this.A;
                if (asgeVar != null) {
                    createBuilder.copyOnWrite();
                    asgs asgsVar22 = (asgs) createBuilder.instance;
                    asgsVar22.z = asgeVar;
                    asgsVar22.c |= 256;
                }
                atcp atcpVar = this.C;
                if (atcpVar != null) {
                    createBuilder.copyOnWrite();
                    asgs asgsVar23 = (asgs) createBuilder.instance;
                    asgsVar23.B = atcpVar;
                    asgsVar23.c |= 1024;
                }
                aopa createBuilder3 = asgo.a.createBuilder();
                long j2 = this.w;
                createBuilder3.copyOnWrite();
                asgo asgoVar = (asgo) createBuilder3.instance;
                asgoVar.b = 1 | asgoVar.b;
                asgoVar.c = j2;
                createBuilder.copyOnWrite();
                asgs asgsVar24 = (asgs) createBuilder.instance;
                asgo asgoVar2 = (asgo) createBuilder3.mo39build();
                asgoVar2.getClass();
                asgsVar24.s = asgoVar2;
                asgsVar24.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                return createBuilder;
            } else {
                aopa createBuilder4 = aqzl.a.createBuilder();
                createBuilder4.copyOnWrite();
                aqzl aqzlVar = (aqzl) createBuilder4.instance;
                throw null;
            }
        }
        createBuilder.copyOnWrite();
        asgs asgsVar25 = (asgs) createBuilder.instance;
        throw null;
    }
}
