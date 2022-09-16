package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: agkg  reason: default package */
/* loaded from: classes.dex */
public final class agkg {
    public final zey a;
    public final String b;
    public final agyr c;
    private final azqb d;
    private final agkf e;
    private final agxr f;

    public agkg(zey zeyVar, String str, azqb azqbVar, agkf agkfVar, agxr agxrVar, agyr agyrVar) {
        this.a = zeyVar;
        this.b = str;
        this.d = azqbVar;
        this.e = agkfVar;
        this.f = agxrVar;
        this.c = agyrVar;
    }

    private final void i(String str, int i, agpw agpwVar) {
        ylr.b();
        this.c.c(this.b, str, i, agpwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        return String.format(Locale.US, "%s:%s:thumb", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(String str) {
        return String.format(Locale.US, "%s:%s:master", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(String str) {
        return String.format(Locale.US, "%s:%s", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, boolean z) {
        zgh.m(str);
        ylr.b();
        agqy agqyVar = new agqy();
        agxg.X(agqyVar, str);
        agxg.V(agqyVar, 2);
        agxg.E(agqyVar, z);
        agxg.S(agqyVar, this.a.a());
        i(a(str), 100, agqyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        this.c.j(String.format(Locale.US, "%s:%s:ad", this.b, str), 512);
    }

    public final void f(String str) {
        this.c.j(str, 512);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        f(c(str));
        f(b(str));
    }

    public final void h(String str, String str2, String str3, attl attlVar, String str4, int i, agqn agqnVar, int i2, boolean z, boolean z2, boolean z3) {
        atse u;
        ylr.b();
        String b = b(str);
        this.f.d();
        ampq a = this.f.a(b);
        if (!a.h() || (!((agxe) a.c()).d() && !((agxe) a.c()).b())) {
            agkf agkfVar = this.e;
            agqy agqyVar = new agqy();
            agxg.M(agqyVar, ahdp.a(attlVar, 360));
            if (str4 != null) {
                agxg.K(agqyVar, str4);
            }
            agxg.an(agqyVar, i);
            byte[] i3 = agkfVar.f.i(str);
            if (i3 == null) {
                i3 = aadi.b;
            }
            agxg.z(agqyVar, i3);
            agxg.X(agqyVar, str);
            boolean z4 = false;
            agxg.G(agqyVar, 1 == (i2 ^ 1));
            if (agqnVar == agqn.DEFER_FOR_DISCOUNTED_DATA) {
                z4 = true;
            }
            agxg.O(agqyVar, z4);
            agxg.E(agqyVar, z2);
            agxg.D(agqyVar, z3);
            agxg.S(agqyVar, agkfVar.a.a());
            if (str2 != null) {
                agxg.N(agqyVar, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                agxg.Y(agqyVar, str3);
            }
            if (z) {
                agkfVar.b.b(str);
            }
            agxg.R(agqyVar, agkfVar.c.c());
            agxg.T(agqyVar, agkfVar.d.b);
            agxg.I(agqyVar, agkfVar.d.c);
            agxg.x(agqyVar, agkfVar.d.d);
            agxg.J(agqyVar, agkfVar.d.e);
            arhd a2 = agkfVar.e.a();
            atqv atqvVar = a2.g;
            if (atqvVar == null) {
                atqvVar = atqv.a;
            }
            if (atqvVar.i) {
                atqv atqvVar2 = a2.g;
                if (atqvVar2 == null) {
                    atqvVar2 = atqv.a;
                }
                agxg.L(agqyVar, atqvVar2.j);
            }
            PlayerResponseModel m = agkfVar.f.m(str);
            if (m != null && (u = m.u()) != null) {
                aoob aoobVar = u.k;
                if (!aoobVar.H()) {
                    agxg.H(agqyVar, aoobVar.I());
                }
            }
            agxg.V(agqyVar, 4);
            aopa createBuilder = atsj.a.createBuilder();
            createBuilder.copyOnWrite();
            atsj atsjVar = (atsj) createBuilder.instance;
            str.getClass();
            atsjVar.b |= 1;
            atsjVar.d = str;
            int i4 = true != z2 ? 2 : 4;
            createBuilder.copyOnWrite();
            atsj atsjVar2 = (atsj) createBuilder.instance;
            atsjVar2.h = i4 - 1;
            atsjVar2.b |= 16;
            createBuilder.copyOnWrite();
            atsj atsjVar3 = (atsj) createBuilder.instance;
            atsjVar3.t = attlVar.k;
            atsjVar3.b |= 1048576;
            int b2 = agqnVar.b();
            createBuilder.copyOnWrite();
            atsj atsjVar4 = (atsj) createBuilder.instance;
            atsjVar4.r = b2 - 1;
            atsjVar4.b |= 65536;
            createBuilder.copyOnWrite();
            atsj atsjVar5 = (atsj) createBuilder.instance;
            atsjVar5.x = 4;
            atsjVar5.c |= 2;
            createBuilder.copyOnWrite();
            atsj atsjVar6 = (atsj) createBuilder.instance;
            atsjVar6.g = 1;
            atsjVar6.b |= 8;
            String s = agxg.s(agqyVar);
            if (s != null) {
                createBuilder.copyOnWrite();
                atsj atsjVar7 = (atsj) createBuilder.instance;
                atsjVar7.b = 2 | atsjVar7.b;
                atsjVar7.e = s;
            }
            String o = agxg.o(agqyVar);
            if (o != null) {
                createBuilder.copyOnWrite();
                atsj atsjVar8 = (atsj) createBuilder.instance;
                atsjVar8.b |= 524288;
                atsjVar8.s = o;
            }
            byte[] ak = agxg.ak(agqyVar);
            if (ak != null) {
                aoob x = aoob.x(ak);
                createBuilder.copyOnWrite();
                atsj atsjVar9 = (atsj) createBuilder.instance;
                atsjVar9.c |= 32;
                atsjVar9.z = x;
            }
            ((agpt) this.d.get()).c((atsj) createBuilder.mo39build());
            i(b, 1 != i2 ? 200 : 150, agqyVar);
        }
    }
}
