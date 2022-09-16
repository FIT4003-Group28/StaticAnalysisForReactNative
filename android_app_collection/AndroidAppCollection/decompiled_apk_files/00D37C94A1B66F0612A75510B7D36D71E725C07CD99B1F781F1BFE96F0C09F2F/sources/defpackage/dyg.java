package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyg  reason: default package */
/* loaded from: classes3.dex */
final class dyg implements azqb {
    private final dyh a;
    private final int b;

    public dyg(dyh dyhVar, int i) {
        this.a = dyhVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i / 100 != 0) {
            if (i == 100) {
                return afku.i();
            }
            if (i != 101) {
                throw new AssertionError(i);
            }
            return ajfk.b(this.a.b);
        }
        switch (i) {
            case 0:
                dyh dyhVar = this.a;
                aitp aitpVar = (aitp) dyhVar.c.wa.get();
                aity aityVar = (aity) dyhVar.c.wc.get();
                aiug j = dyhVar.j();
                aiut fl = dyhVar.c.fl();
                dyo dyoVar = dyhVar.c;
                return new aitv(aitpVar, aityVar, j, fl, new aium(dyoVar.h, dyoVar.as, dyoVar.aw, dyhVar.e, dyoVar.v, dyhVar.d.p, dyoVar.gH, dyhVar.f), (aadd) dyhVar.c.K.get());
            case 1:
                return new zdl(this.a.c.b.a);
            case 2:
                return null;
            case 3:
                return ((azpa) this.a.h.get()).I();
            case 4:
                return azpa.ar();
            case 5:
                return ((azpa) this.a.i.get()).I();
            case 6:
                return azpa.ar();
            case 7:
                return ((azpa) this.a.j.get()).I();
            case 8:
                return azpa.ar();
            case 9:
                return ((azpa) this.a.k.get()).I();
            case 10:
                return azpa.ar();
            case 11:
                return ((azpa) this.a.l.get()).I();
            case 12:
                return azpa.ar();
            case 13:
                return ajct.b((azpa) this.a.m.get());
            case 14:
                return azpa.ar();
            case 15:
                return ((azpa) this.a.n.get()).I();
            case 16:
                return azpa.ar();
            case 17:
                return ((azpa) this.a.o.get()).I();
            case 18:
                return azpa.ar();
            case 19:
                return ((azpa) this.a.p.get()).I();
            case 20:
                return azpa.ar();
            case 21:
                return ((azpa) this.a.q.get()).I();
            case 22:
                return azpa.ar();
            case 23:
                return ((azpa) this.a.r.get()).I();
            case 24:
                return azpa.ar();
            case 25:
                return ((azpa) this.a.s.get()).I();
            case 26:
                return azpa.ar();
            case 27:
                return ((azpa) this.a.t.get()).I();
            case 28:
                return azpa.ar();
            case 29:
                return ((azpa) this.a.u.get()).I();
            case 30:
                return azpa.ar();
            case 31:
                return ((azpa) this.a.v.get()).I();
            case 32:
                return azpa.ar();
            case 33:
                return ((azpa) this.a.w.get()).I();
            case 34:
                return azpa.ar();
            case 35:
                return ((azpa) this.a.x.get()).I();
            case 36:
                return azpa.ar();
            case 37:
                return ((azpa) this.a.y.get()).I();
            case 38:
                return azpa.ar();
            case 39:
                return ((azpa) this.a.z.get()).I();
            case 40:
                return azpa.ar();
            case 41:
                return ((azpa) this.a.A.get()).I();
            case 42:
                return azpa.ar();
            case 43:
                return ((azpd) this.a.B.get()).I();
            case 44:
                return azpd.ar();
            case 45:
                return azpw.Y();
            case 46:
                return ((azpd) this.a.D.get()).I();
            case 47:
                return azpd.ar();
            case 48:
                return ((azpd) this.a.E.get()).I();
            case 49:
                return azpd.ar();
            case 50:
                return ((azpd) this.a.F.get()).I();
            case 51:
                return azpd.ar();
            case 52:
                return azpa.ar();
            case 53:
                dyh dyhVar2 = this.a;
                Context context = dyhVar2.c.b.a;
                azpa azpaVar = (azpa) dyhVar2.h.get();
                axzl.o(azpaVar);
                return azpaVar;
            case 54:
                dyh dyhVar3 = this.a;
                Context context2 = dyhVar3.c.b.a;
                azpa azpaVar2 = (azpa) dyhVar3.j.get();
                axzl.o(azpaVar2);
                return azpaVar2;
            case 55:
                dyh dyhVar4 = this.a;
                Context context3 = dyhVar4.c.b.a;
                azpa azpaVar3 = (azpa) dyhVar4.k.get();
                axzl.o(azpaVar3);
                return azpaVar3;
            case 56:
                dyh dyhVar5 = this.a;
                Context context4 = dyhVar5.c.b.a;
                azpa azpaVar4 = (azpa) dyhVar5.l.get();
                axzl.o(azpaVar4);
                return azpaVar4;
            case 57:
                dyh dyhVar6 = this.a;
                Context context5 = dyhVar6.c.b.a;
                azpa azpaVar5 = (azpa) dyhVar6.m.get();
                axzl.o(azpaVar5);
                return azpaVar5;
            case 58:
                dyh dyhVar7 = this.a;
                Context context6 = dyhVar7.c.b.a;
                azpa azpaVar6 = (azpa) dyhVar7.n.get();
                axzl.o(azpaVar6);
                return azpaVar6;
            case 59:
                dyh dyhVar8 = this.a;
                Context context7 = dyhVar8.c.b.a;
                azpa azpaVar7 = (azpa) dyhVar8.o.get();
                axzl.o(azpaVar7);
                return azpaVar7;
            case 60:
                dyh dyhVar9 = this.a;
                Context context8 = dyhVar9.c.b.a;
                azpa azpaVar8 = (azpa) dyhVar9.p.get();
                axzl.o(azpaVar8);
                return azpaVar8;
            case 61:
                dyh dyhVar10 = this.a;
                Context context9 = dyhVar10.c.b.a;
                azpa azpaVar9 = (azpa) dyhVar10.q.get();
                axzl.o(azpaVar9);
                return azpaVar9;
            case 62:
                dyh dyhVar11 = this.a;
                Context context10 = dyhVar11.c.b.a;
                azpa azpaVar10 = (azpa) dyhVar11.r.get();
                axzl.o(azpaVar10);
                return azpaVar10;
            case 63:
                dyh dyhVar12 = this.a;
                Context context11 = dyhVar12.c.b.a;
                azpa azpaVar11 = (azpa) dyhVar12.s.get();
                axzl.o(azpaVar11);
                return azpaVar11;
            case 64:
                dyh dyhVar13 = this.a;
                Context context12 = dyhVar13.c.b.a;
                azpa azpaVar12 = (azpa) dyhVar13.t.get();
                axzl.o(azpaVar12);
                return azpaVar12;
            case 65:
                dyh dyhVar14 = this.a;
                Context context13 = dyhVar14.c.b.a;
                azpa azpaVar13 = (azpa) dyhVar14.u.get();
                axzl.o(azpaVar13);
                return azpaVar13;
            case 66:
                dyh dyhVar15 = this.a;
                Context context14 = dyhVar15.c.b.a;
                azpa azpaVar14 = (azpa) dyhVar15.v.get();
                axzl.o(azpaVar14);
                return azpaVar14;
            case 67:
                dyh dyhVar16 = this.a;
                Context context15 = dyhVar16.c.b.a;
                azpa azpaVar15 = (azpa) dyhVar16.w.get();
                axzl.o(azpaVar15);
                return azpaVar15;
            case 68:
                dyh dyhVar17 = this.a;
                Context context16 = dyhVar17.c.b.a;
                azpa azpaVar16 = (azpa) dyhVar17.y.get();
                axzl.o(azpaVar16);
                return azpaVar16;
            case 69:
                dyh dyhVar18 = this.a;
                Context context17 = dyhVar18.c.b.a;
                azpa azpaVar17 = (azpa) dyhVar18.z.get();
                axzl.o(azpaVar17);
                return azpaVar17;
            case 70:
                dyh dyhVar19 = this.a;
                Context context18 = dyhVar19.c.b.a;
                azpa azpaVar18 = (azpa) dyhVar19.A.get();
                axzl.o(azpaVar18);
                return azpaVar18;
            case 71:
                dyh dyhVar20 = this.a;
                Context context19 = dyhVar20.c.b.a;
                azpd azpdVar = (azpd) dyhVar20.B.get();
                axzl.o(azpdVar);
                return azpdVar;
            case 72:
                dyh dyhVar21 = this.a;
                Context context20 = dyhVar21.c.b.a;
                azpa azpaVar19 = (azpa) dyhVar21.x.get();
                axzl.o(azpaVar19);
                return azpaVar19;
            case 73:
                dyh dyhVar22 = this.a;
                Context context21 = dyhVar22.c.b.a;
                azpw azpwVar = (azpw) dyhVar22.C.get();
                axzl.o(azpwVar);
                return azpwVar;
            case 74:
                dyh dyhVar23 = this.a;
                Context context22 = dyhVar23.c.b.a;
                azpd azpdVar2 = (azpd) dyhVar23.D.get();
                axzl.o(azpdVar2);
                return azpdVar2;
            case 75:
                dyh dyhVar24 = this.a;
                Context context23 = dyhVar24.c.b.a;
                azpd azpdVar3 = (azpd) dyhVar24.E.get();
                axzl.o(azpdVar3);
                return azpdVar3;
            case 76:
                dyh dyhVar25 = this.a;
                Context context24 = dyhVar25.c.b.a;
                azpd azpdVar4 = (azpd) dyhVar25.F.get();
                axzl.o(azpdVar4);
                return azpdVar4;
            case 77:
                dyh dyhVar26 = this.a;
                Context context25 = dyhVar26.c.b.a;
                azpa azpaVar20 = (azpa) dyhVar26.G.get();
                axzl.o(azpaVar20);
                return azpaVar20;
            case 78:
                return azpa.ar();
            case 79:
                return azpa.ar();
            case 80:
                return azpa.ar();
            case 81:
                return azpa.ar();
            case 82:
                return azpa.ar();
            case 83:
                return azpa.ar();
            case 84:
                return azpa.ar();
            case 85:
                dyh dyhVar27 = this.a;
                Context context26 = dyhVar27.c.b.a;
                azpa azpaVar21 = (azpa) dyhVar27.H.get();
                axzl.o(azpaVar21);
                return azpaVar21;
            case 86:
                dyh dyhVar28 = this.a;
                Context context27 = dyhVar28.c.b.a;
                azpa azpaVar22 = (azpa) dyhVar28.I.get();
                axzl.o(azpaVar22);
                return azpaVar22;
            case 87:
                dyh dyhVar29 = this.a;
                Context context28 = dyhVar29.c.b.a;
                azpa azpaVar23 = (azpa) dyhVar29.f194J.get();
                axzl.o(azpaVar23);
                return azpaVar23;
            case 88:
                dyh dyhVar30 = this.a;
                Context context29 = dyhVar30.c.b.a;
                azpa azpaVar24 = (azpa) dyhVar30.K.get();
                axzl.o(azpaVar24);
                return azpaVar24;
            case 89:
                dyh dyhVar31 = this.a;
                Context context30 = dyhVar31.c.b.a;
                azpa azpaVar25 = (azpa) dyhVar31.L.get();
                axzl.o(azpaVar25);
                return azpaVar25;
            case 90:
                dyh dyhVar32 = this.a;
                Context context31 = dyhVar32.c.b.a;
                azpa azpaVar26 = (azpa) dyhVar32.M.get();
                axzl.o(azpaVar26);
                return azpaVar26;
            case 91:
                dyh dyhVar33 = this.a;
                Context context32 = dyhVar33.c.b.a;
                azpa azpaVar27 = (azpa) dyhVar33.N.get();
                axzl.o(azpaVar27);
                return azpaVar27;
            case 92:
                return new ajfj((snc) this.a.c.v.get());
            case 93:
                return ajnk.b();
            case 94:
                dyh dyhVar34 = this.a;
                return new ajfa((Executor) dyhVar34.c.x.get(), dyhVar34.a, (snc) dyhVar34.c.v.get());
            case 95:
                return null;
            case 96:
                return aiqx.i((zgz) this.a.R.get());
            case 97:
                return ajct.e((aitv) this.a.g.get());
            case 98:
                dyh dyhVar35 = this.a;
                ajfa ajfaVar = (ajfa) dyhVar35.Q.get();
                return adzp.l((zgz) dyhVar35.S.get(), (ajbk) dyhVar35.P.get());
            case 99:
                return ajct.d((ajfj) this.a.O.get());
            default:
                throw new AssertionError(i);
        }
    }
}
