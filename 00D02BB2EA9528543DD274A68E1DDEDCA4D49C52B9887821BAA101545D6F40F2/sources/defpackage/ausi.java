package defpackage;

import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
/* compiled from: PG */
/* renamed from: ausi  reason: default package */
/* loaded from: classes2.dex */
public final class ausi implements auso {
    private final cjqy a;
    private final cjqq b;
    private final ckcw c;
    private final aujx d;
    private final auui e;
    private final btwr f;
    private final auho g;

    public ausi(cjqy cjqyVar, cjqq cjqqVar, ckcw ckcwVar, aujx aujxVar, auui auuiVar, btwr btwrVar, auho auhoVar) {
        this.a = cjqyVar;
        this.b = cjqqVar;
        this.c = ckcwVar;
        this.d = aujxVar;
        this.e = auuiVar;
        this.f = btwrVar;
        this.g = auhoVar;
    }

    private final void g(ckgz ckgzVar, int i) {
        ((ckco) this.c.a(ckgzVar)).a(i);
    }

    private final cjtd h(@dzsi aujb aujbVar, @dzsi btlu btluVar, @dzsi Integer num, @dzsi String str, ddho ddhoVar, @dzsi String str2, @dzsi String str3, @dzsi cjtd cjtdVar, @dzsi cjsa cjsaVar, @dzsi String str4) {
        ddhj ddhjVar;
        btvo b = this.f.b(btluVar);
        if (aujbVar == null || (!aujbVar.m(b) && this.g.s(aujbVar.a))) {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        } else {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        ddgx bZ = ddgy.d.bZ();
        if (num != null) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddgy ddgyVar = (ddgy) bZ.b;
            ddgyVar.a |= 1;
            ddgyVar.b = intValue;
        }
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddgy ddgyVar2 = (ddgy) bZ.b;
            str.getClass();
            ddgyVar2.a |= 2;
            ddgyVar2.c = str;
        }
        cjta c = cjtd.c(cjtdVar);
        c.d = ddhoVar;
        c.g(str2);
        c.b = str3;
        c.w(ddhjVar);
        c.v(bZ.bK());
        c.i = cjsaVar;
        c.h = str4;
        return c.a();
    }

    @Override // defpackage.auso
    @dzsi
    public final cjql a(int i, @dzsi String str, cjtd cjtdVar, Iterable<cjtd> iterable, @dzsi ausn ausnVar, boolean z) {
        cjql c;
        auug d = this.e.d(auuh.c(str, i));
        if (d == null || z) {
            if (ausnVar != null) {
                aujt c2 = this.d.c(ausnVar.a());
                akqi f = ausnVar.b().f();
                aujw aujwVar = c2.a;
                if (aujwVar != null) {
                    aujwVar.d(f);
                }
                aujw aujwVar2 = c2.b;
                if (aujwVar2 != null) {
                    aujwVar2.d(f);
                }
            }
            c = this.b.g().c(cjtdVar);
            for (cjtd cjtdVar2 : iterable) {
                this.b.g().c(cjtdVar2);
            }
            g(ckht.g, i);
        } else {
            c = null;
        }
        if (d != null && !z) {
            g(ckht.h, i);
        }
        return c;
    }

    @Override // defpackage.auso
    public final void b(int i, @dzsi String str, @dzsi cjsh cjshVar, @dzsi cjtd cjtdVar, int i2) {
        if (cjtdVar != null) {
            this.e.a(auuh.c(str, i), cjshVar, cjtdVar, i2);
        }
        g(ckht.f, i);
    }

    @Override // defpackage.auso
    public final void c(NotificationLogger$IntentMetadata notificationLogger$IntentMetadata, int i, @dzsi String str, @dzsi cjsh cjshVar, @dzsi cjtd cjtdVar, @dzsi ausn ausnVar) {
        auug d;
        if (cjshVar == null && (d = this.e.d(auuh.c(str, i))) != null) {
            cjshVar = d.c();
        }
        auhv a = notificationLogger$IntentMetadata.a();
        deaf deafVar = a.f;
        if (cjtdVar != null && deafVar != null) {
            if (cjshVar == null || cjtdVar.d != null) {
                this.a.M(cjql.a, new cjte(deafVar), cjtdVar);
            } else {
                this.a.N(cjshVar, new cjte(deafVar), cjtdVar);
            }
        }
        if (notificationLogger$IntentMetadata.b()) {
            this.e.b(auuh.c(str, i));
        }
        if (i != 0) {
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                g(ckht.i, i);
            } else if (ordinal == 2) {
                g(ckht.l, i);
            } else if (ordinal == 3) {
                g(ckht.j, i);
            } else if (ordinal == 4) {
                g(ckht.k, i);
            }
        }
        if (ausnVar == null || deafVar == null) {
            return;
        }
        int ordinal2 = a.ordinal();
        if (ordinal2 == 1) {
            aujt c = this.d.c(ausnVar.a());
            akqi f = ausnVar.b().f();
            aujw aujwVar = c.a;
            if (aujwVar != null) {
                aujwVar.f(f);
            }
            aujw aujwVar2 = c.b;
            if (aujwVar2 == null) {
                return;
            }
            aujwVar2.f(f);
        } else if (ordinal2 != 2) {
        } else {
            aujt c2 = this.d.c(ausnVar.a());
            akqi f2 = ausnVar.b().f();
            aujw aujwVar3 = c2.a;
            if (aujwVar3 != null) {
                aujwVar3.e(f2);
            }
            aujw aujwVar4 = c2.b;
            if (aujwVar4 == null) {
                return;
            }
            aujwVar4.e(f2);
        }
    }

    @Override // defpackage.auso
    public final void d(String str) {
        ddcu a;
        ddcu ddcuVar = ddcu.JY;
        ddxx c = cjrx.c(str);
        if (c != null && (a = ddcu.a(c.d)) != null) {
            ddcuVar = a;
        }
        cjst d = cjsu.d();
        d.d(ddda.fu);
        cjry e = cjrz.e();
        e.b(ddcuVar);
        d.f(e.a());
        this.a.l(d.e());
    }

    @Override // defpackage.auso
    public final cjtd e(@dzsi aujb aujbVar, @dzsi btlu btluVar, @dzsi Integer num, @dzsi String str, @dzsi String str2, @dzsi String str3, ddho ddhoVar, @dzsi cjtd cjtdVar, @dzsi cjsa cjsaVar, @dzsi String str4) {
        return h(aujbVar, btluVar, num, str, ddhoVar, str2, str3, cjtdVar, cjsaVar, str4);
    }

    @Override // defpackage.auso
    public final cjtd f(@dzsi aujb aujbVar, @dzsi btlu btluVar, ddho ddhoVar, @dzsi String str, @dzsi String str2, @dzsi cjtd cjtdVar, @dzsi cjsa cjsaVar) {
        return h(aujbVar, btluVar, null, null, ddhoVar, str, str2, cjtdVar, cjsaVar, null);
    }
}
