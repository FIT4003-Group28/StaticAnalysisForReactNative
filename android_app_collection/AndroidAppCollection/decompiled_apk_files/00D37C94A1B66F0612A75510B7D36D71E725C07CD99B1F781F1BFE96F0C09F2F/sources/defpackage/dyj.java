package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyj  reason: default package */
/* loaded from: classes3.dex */
final class dyj implements azqb {
    private final dyk a;
    private final int b;

    public dyj(dyk dykVar, int i) {
        this.a = dykVar;
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
                dyk dykVar = this.a;
                aitp aitpVar = (aitp) dykVar.c.wa.get();
                aity aityVar = (aity) dykVar.c.wc.get();
                aiug j = dykVar.j();
                aiut fl = dykVar.c.fl();
                dyo dyoVar = dykVar.c;
                return new aitv(aitpVar, aityVar, j, fl, new aium(dyoVar.h, dyoVar.as, dyoVar.aw, dykVar.e, dyoVar.v, dykVar.d.G, dyoVar.gH, dykVar.f), (aadd) dykVar.c.K.get());
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
                dyk dykVar2 = this.a;
                Context context = dykVar2.c.b.a;
                azpa azpaVar = (azpa) dykVar2.h.get();
                axzl.o(azpaVar);
                return azpaVar;
            case 54:
                dyk dykVar3 = this.a;
                Context context2 = dykVar3.c.b.a;
                azpa azpaVar2 = (azpa) dykVar3.j.get();
                axzl.o(azpaVar2);
                return azpaVar2;
            case 55:
                dyk dykVar4 = this.a;
                Context context3 = dykVar4.c.b.a;
                azpa azpaVar3 = (azpa) dykVar4.k.get();
                axzl.o(azpaVar3);
                return azpaVar3;
            case 56:
                dyk dykVar5 = this.a;
                Context context4 = dykVar5.c.b.a;
                azpa azpaVar4 = (azpa) dykVar5.l.get();
                axzl.o(azpaVar4);
                return azpaVar4;
            case 57:
                dyk dykVar6 = this.a;
                Context context5 = dykVar6.c.b.a;
                azpa azpaVar5 = (azpa) dykVar6.m.get();
                axzl.o(azpaVar5);
                return azpaVar5;
            case 58:
                dyk dykVar7 = this.a;
                Context context6 = dykVar7.c.b.a;
                azpa azpaVar6 = (azpa) dykVar7.n.get();
                axzl.o(azpaVar6);
                return azpaVar6;
            case 59:
                dyk dykVar8 = this.a;
                Context context7 = dykVar8.c.b.a;
                azpa azpaVar7 = (azpa) dykVar8.o.get();
                axzl.o(azpaVar7);
                return azpaVar7;
            case 60:
                dyk dykVar9 = this.a;
                Context context8 = dykVar9.c.b.a;
                azpa azpaVar8 = (azpa) dykVar9.p.get();
                axzl.o(azpaVar8);
                return azpaVar8;
            case 61:
                dyk dykVar10 = this.a;
                Context context9 = dykVar10.c.b.a;
                azpa azpaVar9 = (azpa) dykVar10.q.get();
                axzl.o(azpaVar9);
                return azpaVar9;
            case 62:
                dyk dykVar11 = this.a;
                Context context10 = dykVar11.c.b.a;
                azpa azpaVar10 = (azpa) dykVar11.r.get();
                axzl.o(azpaVar10);
                return azpaVar10;
            case 63:
                dyk dykVar12 = this.a;
                Context context11 = dykVar12.c.b.a;
                azpa azpaVar11 = (azpa) dykVar12.s.get();
                axzl.o(azpaVar11);
                return azpaVar11;
            case 64:
                dyk dykVar13 = this.a;
                Context context12 = dykVar13.c.b.a;
                azpa azpaVar12 = (azpa) dykVar13.t.get();
                axzl.o(azpaVar12);
                return azpaVar12;
            case 65:
                dyk dykVar14 = this.a;
                Context context13 = dykVar14.c.b.a;
                azpa azpaVar13 = (azpa) dykVar14.u.get();
                axzl.o(azpaVar13);
                return azpaVar13;
            case 66:
                dyk dykVar15 = this.a;
                Context context14 = dykVar15.c.b.a;
                azpa azpaVar14 = (azpa) dykVar15.v.get();
                axzl.o(azpaVar14);
                return azpaVar14;
            case 67:
                dyk dykVar16 = this.a;
                Context context15 = dykVar16.c.b.a;
                azpa azpaVar15 = (azpa) dykVar16.w.get();
                axzl.o(azpaVar15);
                return azpaVar15;
            case 68:
                dyk dykVar17 = this.a;
                Context context16 = dykVar17.c.b.a;
                azpa azpaVar16 = (azpa) dykVar17.y.get();
                axzl.o(azpaVar16);
                return azpaVar16;
            case 69:
                dyk dykVar18 = this.a;
                Context context17 = dykVar18.c.b.a;
                azpa azpaVar17 = (azpa) dykVar18.z.get();
                axzl.o(azpaVar17);
                return azpaVar17;
            case 70:
                dyk dykVar19 = this.a;
                Context context18 = dykVar19.c.b.a;
                azpa azpaVar18 = (azpa) dykVar19.A.get();
                axzl.o(azpaVar18);
                return azpaVar18;
            case 71:
                dyk dykVar20 = this.a;
                Context context19 = dykVar20.c.b.a;
                azpd azpdVar = (azpd) dykVar20.B.get();
                axzl.o(azpdVar);
                return azpdVar;
            case 72:
                dyk dykVar21 = this.a;
                Context context20 = dykVar21.c.b.a;
                azpa azpaVar19 = (azpa) dykVar21.x.get();
                axzl.o(azpaVar19);
                return azpaVar19;
            case 73:
                dyk dykVar22 = this.a;
                Context context21 = dykVar22.c.b.a;
                azpw azpwVar = (azpw) dykVar22.C.get();
                axzl.o(azpwVar);
                return azpwVar;
            case 74:
                dyk dykVar23 = this.a;
                Context context22 = dykVar23.c.b.a;
                azpd azpdVar2 = (azpd) dykVar23.D.get();
                axzl.o(azpdVar2);
                return azpdVar2;
            case 75:
                dyk dykVar24 = this.a;
                Context context23 = dykVar24.c.b.a;
                azpd azpdVar3 = (azpd) dykVar24.E.get();
                axzl.o(azpdVar3);
                return azpdVar3;
            case 76:
                dyk dykVar25 = this.a;
                Context context24 = dykVar25.c.b.a;
                azpd azpdVar4 = (azpd) dykVar25.F.get();
                axzl.o(azpdVar4);
                return azpdVar4;
            case 77:
                dyk dykVar26 = this.a;
                Context context25 = dykVar26.c.b.a;
                azpa azpaVar20 = (azpa) dykVar26.G.get();
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
                dyk dykVar27 = this.a;
                Context context26 = dykVar27.c.b.a;
                azpa azpaVar21 = (azpa) dykVar27.H.get();
                axzl.o(azpaVar21);
                return azpaVar21;
            case 86:
                dyk dykVar28 = this.a;
                Context context27 = dykVar28.c.b.a;
                azpa azpaVar22 = (azpa) dykVar28.I.get();
                axzl.o(azpaVar22);
                return azpaVar22;
            case 87:
                dyk dykVar29 = this.a;
                Context context28 = dykVar29.c.b.a;
                azpa azpaVar23 = (azpa) dykVar29.f195J.get();
                axzl.o(azpaVar23);
                return azpaVar23;
            case 88:
                dyk dykVar30 = this.a;
                Context context29 = dykVar30.c.b.a;
                azpa azpaVar24 = (azpa) dykVar30.K.get();
                axzl.o(azpaVar24);
                return azpaVar24;
            case 89:
                dyk dykVar31 = this.a;
                Context context30 = dykVar31.c.b.a;
                azpa azpaVar25 = (azpa) dykVar31.L.get();
                axzl.o(azpaVar25);
                return azpaVar25;
            case 90:
                dyk dykVar32 = this.a;
                Context context31 = dykVar32.c.b.a;
                azpa azpaVar26 = (azpa) dykVar32.M.get();
                axzl.o(azpaVar26);
                return azpaVar26;
            case 91:
                dyk dykVar33 = this.a;
                Context context32 = dykVar33.c.b.a;
                azpa azpaVar27 = (azpa) dykVar33.N.get();
                axzl.o(azpaVar27);
                return azpaVar27;
            case 92:
                return new ajfj((snc) this.a.c.v.get());
            case 93:
                return ajnk.b();
            case 94:
                dyk dykVar34 = this.a;
                return new ajfa((Executor) dykVar34.c.x.get(), dykVar34.a, (snc) dykVar34.c.v.get());
            case 95:
                return null;
            case 96:
                return aiqx.i((zgz) this.a.R.get());
            case 97:
                return ajct.e((aitv) this.a.g.get());
            case 98:
                dyk dykVar35 = this.a;
                ajfa ajfaVar = (ajfa) dykVar35.Q.get();
                return adzp.l((zgz) dykVar35.S.get(), (ajbk) dykVar35.P.get());
            case 99:
                return ajct.d((ajfj) this.a.O.get());
            default:
                throw new AssertionError(i);
        }
    }
}
