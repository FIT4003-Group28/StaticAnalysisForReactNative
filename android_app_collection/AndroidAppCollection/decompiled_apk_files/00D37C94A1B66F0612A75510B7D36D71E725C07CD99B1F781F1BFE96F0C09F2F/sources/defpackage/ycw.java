package defpackage;

import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ycw  reason: default package */
/* loaded from: classes4.dex */
public class ycw implements aafl {
    private final aaqp a;
    protected final ybo r;
    public final yzj s;
    protected final aafo t;
    public final ydq u;
    protected final abff v;
    public ydi w;

    public ycw(ybo yboVar, yzj yzjVar, aafo aafoVar, ydq ydqVar, abff abffVar, aaqp aaqpVar) {
        this.r = yboVar;
        this.s = yzjVar;
        this.t = aafoVar;
        this.u = ydqVar;
        this.v = abffVar;
        this.a = aaqpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(apzg apzgVar, Map map) {
        ybm ybmVar = (ybm) zew.K(map, "OnYpcTransactionListener", ybm.class);
        if (ybmVar != null) {
            this.r.k = ybmVar;
        }
        this.w = (ydi) zew.K(map, "YpcTransactionListener", ydi.class);
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apzgVar.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
        if (this.w == null && (ypcGetCartEndpoint$YPCGetCartEndpoint.b & 2) != 0) {
            this.w = new ycv(this);
        }
        ydi ydiVar = this.w;
        if (ydiVar != null) {
            this.r.n = new ycu(ydiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(ashp ashpVar, apzg apzgVar) {
        this.r.b(ashpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
            return;
        }
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apzgVar.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
        if (ypcGetCartEndpoint$YPCGetCartEndpoint.c.isEmpty()) {
            if ((ypcGetCartEndpoint$YPCGetCartEndpoint.b & 2) == 0 || ypcGetCartEndpoint$YPCGetCartEndpoint.d.d() <= 0) {
                if (ypcGetCartEndpoint$YPCGetCartEndpoint.j.isEmpty()) {
                    if (ypcGetCartEndpoint$YPCGetCartEndpoint.m.isEmpty()) {
                        return;
                    }
                    ybo yboVar = this.r;
                    String str = ypcGetCartEndpoint$YPCGetCartEndpoint.m;
                    avka avkaVar = ypcGetCartEndpoint$YPCGetCartEndpoint.l;
                    if (avkaVar == null) {
                        avkaVar = avka.a;
                    }
                    aoob aoobVar = apzgVar.c;
                    abfa b = this.v.b();
                    b.d = abfa.g(str);
                    b.c = avkaVar;
                    b.j(aoobVar);
                    yboVar.g(b);
                    return;
                }
                ybo yboVar2 = this.r;
                String str2 = ypcGetCartEndpoint$YPCGetCartEndpoint.j;
                long j = ypcGetCartEndpoint$YPCGetCartEndpoint.k;
                avka avkaVar2 = ypcGetCartEndpoint$YPCGetCartEndpoint.l;
                if (avkaVar2 == null) {
                    avkaVar2 = avka.a;
                }
                aoob aoobVar2 = apzgVar.c;
                abfa b2 = this.v.b();
                b2.u(str2);
                b2.b = j;
                b2.c = avkaVar2;
                b2.j(aoobVar2);
                yboVar2.g(b2);
                return;
            } else if (!ypcGetCartEndpoint$YPCGetCartEndpoint.e.isEmpty()) {
                ybo yboVar3 = this.r;
                String str3 = ypcGetCartEndpoint$YPCGetCartEndpoint.e;
                byte[] I = ypcGetCartEndpoint$YPCGetCartEndpoint.d.I();
                aoob aoobVar3 = apzgVar.c;
                abfa b3 = this.v.b();
                b3.t(I);
                if (b3.s == null) {
                    b3.s = apox.a.createBuilder();
                }
                aopa aopaVar = b3.s;
                aopaVar.copyOnWrite();
                apox apoxVar = (apox) aopaVar.instance;
                apox apoxVar2 = apox.a;
                str3.getClass();
                apoxVar.c = 5;
                apoxVar.d = str3;
                b3.j(aoobVar3);
                yboVar3.g(b3);
                return;
            } else {
                ybo yboVar4 = this.r;
                byte[] I2 = ypcGetCartEndpoint$YPCGetCartEndpoint.d.I();
                long j2 = ypcGetCartEndpoint$YPCGetCartEndpoint.f;
                String str4 = ypcGetCartEndpoint$YPCGetCartEndpoint.g;
                assu assuVar = ypcGetCartEndpoint$YPCGetCartEndpoint.h;
                if (assuVar == null) {
                    assuVar = assu.a;
                }
                aoob aoobVar4 = apzgVar.c;
                abfa b4 = this.v.b();
                b4.t(I2);
                if (b4.s == null) {
                    b4.s = apox.a.createBuilder();
                }
                aopa aopaVar2 = b4.s;
                aopaVar2.copyOnWrite();
                apox apoxVar3 = (apox) aopaVar2.instance;
                apox apoxVar4 = apox.a;
                apoxVar3.b |= 2;
                apoxVar3.f = j2;
                if (assuVar != null) {
                    if (b4.s == null) {
                        b4.s = apox.a.createBuilder();
                    }
                    aopa aopaVar3 = b4.s;
                    aopaVar3.copyOnWrite();
                    apox apoxVar5 = (apox) aopaVar3.instance;
                    apoxVar5.d = assuVar;
                    apoxVar5.c = 4;
                } else {
                    if (b4.s == null) {
                        b4.s = apox.a.createBuilder();
                    }
                    aopa aopaVar4 = b4.s;
                    aopaVar4.copyOnWrite();
                    apox apoxVar6 = (apox) aopaVar4.instance;
                    str4.getClass();
                    apoxVar6.c = 3;
                    apoxVar6.d = str4;
                }
                b4.j(aoobVar4);
                yboVar4.g(b4);
                return;
            }
        }
        ybo yboVar5 = this.r;
        String str5 = ypcGetCartEndpoint$YPCGetCartEndpoint.c;
        aoob aoobVar5 = apzgVar.c;
        abfa b5 = this.v.b();
        b5.a = abfa.g(str5);
        b5.j(aoobVar5);
        yboVar5.g(b5);
    }

    @Override // defpackage.aafl
    public void kD(apzg apzgVar, Map map) {
        awhr awhrVar;
        awhr awhrVar2;
        b(apzgVar, map);
        ashp ashpVar = null;
        if (apzgVar.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
            YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apzgVar.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            awhq awhqVar = ypcGetCartEndpoint$YPCGetCartEndpoint.i;
            if (awhqVar == null) {
                awhqVar = awhq.a;
            }
            if (awhqVar.b == 95698847) {
                awhrVar = (awhr) awhqVar.c;
            } else {
                awhrVar = awhr.a;
            }
            if ((awhrVar.b & 1) != 0) {
                aaqp aaqpVar = this.a;
                awhq awhqVar2 = ypcGetCartEndpoint$YPCGetCartEndpoint.i;
                if (awhqVar2 == null) {
                    awhqVar2 = awhq.a;
                }
                if (awhqVar2.b == 95698847) {
                    awhrVar2 = (awhr) awhqVar2.c;
                } else {
                    awhrVar2 = awhr.a;
                }
                ashpVar = (ashp) aaqpVar.a(awhrVar2.c.I(), ashp.a);
            }
        }
        if (ashpVar == null) {
            e(apzgVar);
        } else {
            c(ashpVar, apzgVar);
        }
    }
}
