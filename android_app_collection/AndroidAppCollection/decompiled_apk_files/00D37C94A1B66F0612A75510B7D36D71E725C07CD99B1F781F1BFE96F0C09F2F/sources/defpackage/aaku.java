package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aaku  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aaku implements ayqe {
    private final /* synthetic */ int u;
    public static final /* synthetic */ aaku t = new aaku(20);
    public static final /* synthetic */ aaku s = new aaku(19);
    public static final /* synthetic */ aaku r = new aaku(18);
    public static final /* synthetic */ aaku q = new aaku(17);
    public static final /* synthetic */ aaku p = new aaku(16);
    public static final /* synthetic */ aaku o = new aaku(15);
    public static final /* synthetic */ aaku n = new aaku(13);
    public static final /* synthetic */ aaku m = new aaku(12);
    public static final /* synthetic */ aaku l = new aaku(11);
    public static final /* synthetic */ aaku k = new aaku(10);
    public static final /* synthetic */ aaku j = new aaku(9);
    public static final /* synthetic */ aaku i = new aaku(8);
    public static final /* synthetic */ aaku h = new aaku(7);
    public static final /* synthetic */ aaku g = new aaku(6);
    public static final /* synthetic */ aaku f = new aaku(5);
    public static final /* synthetic */ aaku e = new aaku(4);
    public static final /* synthetic */ aaku d = new aaku(3);
    public static final /* synthetic */ aaku c = new aaku(2);
    public static final /* synthetic */ aaku b = new aaku(1);
    public static final /* synthetic */ aaku a = new aaku();

    private /* synthetic */ aaku() {
    }

    public /* synthetic */ aaku(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        avfo avfoVar;
        bahm b2;
        ayoi T;
        switch (this.u) {
            case 0:
                auqj auqjVar = (auqj) obj;
                int i2 = auqjVar.b;
                if ((i2 & 1) != 0) {
                    atof atofVar = auqjVar.c;
                    if (atofVar == null) {
                        atofVar = atof.a;
                    }
                    return ampq.j(ajna.g(atofVar));
                } else if ((i2 & 2) != 0) {
                    augq augqVar = auqjVar.d;
                    if (augqVar == null) {
                        augqVar = augq.a;
                    }
                    return ampq.j(ajna.g(augqVar));
                } else if ((i2 & 4) != 0) {
                    aumx aumxVar = auqjVar.e;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    return ampq.j(ajna.g(aumxVar));
                } else if ((i2 & 16) != 0) {
                    avia aviaVar = auqjVar.g;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                    return ampq.j(ajna.g(aviaVar));
                } else if ((i2 & 8) == 0) {
                    return amon.a;
                } else {
                    askw askwVar = auqjVar.f;
                    if (askwVar == null) {
                        askwVar = askw.a;
                    }
                    return ampq.j(ajna.g(askwVar));
                }
            case 1:
                arlw arlwVar = (arlw) obj;
                if (arlwVar.b == 58174010) {
                    avfoVar = (avfo) arlwVar.c;
                } else {
                    avfoVar = avfo.a;
                }
                return new aaky(avfoVar);
            case 2:
                return ampq.j((asgd) obj);
            case 3:
                return ((aajp) obj).c;
            case 4:
                asvx asvxVar = ((arhd) obj).m;
                if (asvxVar == null) {
                    asvxVar = asvx.a;
                }
                apvo apvoVar = asvxVar.f;
                return apvoVar == null ? apvo.a : apvoVar;
            case 5:
                atdy atdyVar = ((arhd) obj).i;
                if (atdyVar == null) {
                    atdyVar = atdy.a;
                }
                apmv apmvVar = atdyVar.e;
                return apmvVar == null ? apmv.a : apmvVar;
            case 6:
                return (byte[]) ((ampq) obj).c();
            case 7:
                try {
                    return ayoi.T((augt) aopi.parseFrom(augt.a, (byte[]) obj, aoos.b()));
                } catch (aopx e2) {
                    return ayoi.H(e2);
                }
            case 8:
                augt augtVar = (augt) obj;
                if ((augtVar.b & 32) == 0) {
                    baht k2 = baht.k();
                    if (k2 == null) {
                        throw new NullPointerException("Zone must not be null");
                    }
                    bahm bahmVar = new bahm(k2);
                    int n2 = 60 - bahmVar.n();
                    if (n2 < 15) {
                        n2 += 60;
                    }
                    b2 = bahmVar.b(n2);
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    augu auguVar = augtVar.e;
                    if (auguVar == null) {
                        auguVar = augu.a;
                    }
                    b2 = new bahm(timeUnit.toMillis(auguVar.c));
                }
                return new afom(b2, augtVar);
            case 9:
                return (byte[]) ((ampq) obj).c();
            case 10:
                ampq ampqVar = (ampq) obj;
                try {
                    if (!ampqVar.h()) {
                        aopa createBuilder = awpv.a.createBuilder();
                        createBuilder.copyOnWrite();
                        awpv awpvVar = (awpv) createBuilder.instance;
                        awpvVar.f = 1;
                        awpvVar.b |= 64;
                        T = ayoi.T((awpv) createBuilder.mo39build());
                    } else {
                        T = ayoi.T((awpv) aopi.parseFrom(awpv.a, (byte[]) ampqVar.c(), aoos.b()));
                    }
                    return T;
                } catch (aopx e3) {
                    return ayoi.H(e3);
                }
            case 11:
                try {
                    return ayoi.T((avfu) aopi.parseFrom(avfu.a, (byte[]) obj, aoos.b()));
                } catch (aopx e4) {
                    return ayoi.H(e4);
                }
            case 12:
                return ((Bundle) obj).getString("authtoken");
            case 13:
                atps atpsVar = ((arhd) obj).p;
                if (atpsVar == null) {
                    atpsVar = atps.a;
                }
                atpn atpnVar = atpsVar.h;
                return atpnVar == null ? atpn.a : atpnVar;
            case 14:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 0) {
                    return agcf.b();
                }
                boolean z = false;
                int i3 = 0;
                boolean z2 = true;
                for (Object obj2 : objArr) {
                    if (obj2 instanceof agcf) {
                        agcf agcfVar = (agcf) obj2;
                        z = z || agcfVar.a;
                        boolean z3 = agcfVar.c;
                        i3 += z3 ? 0 : agcfVar.b;
                        z2 = z2 && z3;
                    }
                }
                return agcf.a(z, i3, z2);
            case 15:
                return ((ahic) obj).a().X();
            case 16:
                return (aajj) ((ampq) obj).c();
            case 17:
                return Boolean.valueOf(((awvc) obj).d);
            case 18:
                final ajff a2 = ((ahic) obj).a();
                return a2.x().C(new ayqe() { // from class: aiab
                    @Override // defpackage.ayqe
                    public final Object a(Object obj3) {
                        return new Object[]{ajff.this, (afkn) obj3};
                    }
                });
            case 19:
                return ((ahic) obj).a().X();
            default:
                return ((ahic) obj).a().X();
        }
    }
}
