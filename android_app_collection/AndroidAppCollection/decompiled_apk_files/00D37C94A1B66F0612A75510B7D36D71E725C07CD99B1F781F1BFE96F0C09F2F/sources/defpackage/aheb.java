package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
/* compiled from: PG */
/* renamed from: aheb  reason: default package */
/* loaded from: classes.dex */
public final class aheb implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public aheb(azqb azqbVar) {
        this.a = azqbVar;
    }

    public aheb(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static aheb A(azqb azqbVar) {
        return new aheb(azqbVar, 18);
    }

    public static aheb B(azqb azqbVar) {
        return new aheb(azqbVar, 19);
    }

    public static aheb C(azqb azqbVar) {
        return new aheb(azqbVar, 20);
    }

    public static aynx D(aidn aidnVar) {
        aynx ad = aidnVar.a.ad();
        axzl.o(ad);
        return ad;
    }

    public static aynx E(aidn aidnVar) {
        aynx ac = aidnVar.a.ac();
        axzl.o(ac);
        return ac;
    }

    public static ajdz F(aidn aidnVar) {
        ajdz S = aidnVar.a.S();
        axzl.o(S);
        return S;
    }

    public static aikh G(aidn aidnVar) {
        aikh aF = aidnVar.a.aF();
        axzl.o(aF);
        return aF;
    }

    public static aivt H(aidn aidnVar) {
        aivt K = aidnVar.a.K();
        axzl.o(K);
        return K;
    }

    public static aidn I(airv airvVar) {
        return new aidn(airvVar);
    }

    public static aheb a(azqb azqbVar) {
        return new aheb(azqbVar);
    }

    public static Intent b(Context context) {
        return new Intent(context, BackgroundPlayerService.class);
    }

    public static afsw c(afsv afsvVar) {
        afsw e = afsvVar.e();
        axzl.o(e);
        return e;
    }

    public static afsw d(afsv afsvVar) {
        afsw f = afsvVar.f();
        axzl.o(f);
        return f;
    }

    public static aizp e(airw airwVar) {
        aizp aizpVar = new aizp();
        airwVar.P().c = aizpVar;
        return aizpVar;
    }

    public static aigw f(aynx aynxVar) {
        return new aigw(aynxVar);
    }

    public static aiko g(snc sncVar) {
        return new aiko(sncVar);
    }

    public static ainp h(aizn aiznVar) {
        return new ainp(aiznVar);
    }

    public static aipq i(ajag ajagVar) {
        return new aipq(ajagVar);
    }

    public static aheb j(azqb azqbVar) {
        return new aheb(azqbVar, 1);
    }

    public static aheb k(azqb azqbVar) {
        return new aheb(azqbVar, 2);
    }

    public static aheb l(azqb azqbVar) {
        return new aheb(azqbVar, 3);
    }

    public static aheb m(azqb azqbVar) {
        return new aheb(azqbVar, 4);
    }

    public static aheb n(azqb azqbVar) {
        return new aheb(azqbVar, 5);
    }

    public static aheb o(azqb azqbVar) {
        return new aheb(azqbVar, 6);
    }

    public static aheb p(azqb azqbVar) {
        return new aheb(azqbVar, 7);
    }

    public static aheb q(azqb azqbVar) {
        return new aheb(azqbVar, 8);
    }

    public static aheb r(azqb azqbVar) {
        return new aheb(azqbVar, 9);
    }

    public static aheb s(azqb azqbVar) {
        return new aheb(azqbVar, 10);
    }

    public static aheb t(azqb azqbVar) {
        return new aheb(azqbVar, 11);
    }

    public static aheb u(azqb azqbVar) {
        return new aheb(azqbVar, 12);
    }

    public static aheb v(azqb azqbVar) {
        return new aheb(azqbVar, 13);
    }

    public static aheb w(azqb azqbVar) {
        return new aheb(azqbVar, 14);
    }

    public static aheb x(azqb azqbVar) {
        return new aheb(azqbVar, 15);
    }

    public static aheb y(azqb azqbVar) {
        return new aheb(azqbVar, 16);
    }

    public static aheb z(azqb azqbVar) {
        return new aheb(azqbVar, 17);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return D((aidn) this.a.get());
            case 1:
                return E((aidn) this.a.get());
            case 2:
                return F((aidn) this.a.get());
            case 3:
                return G((aidn) this.a.get());
            case 4:
                return H((aidn) this.a.get());
            case 5:
                return I((airv) this.a.get());
            case 6:
                return b((Context) ((axov) this.a).a);
            case 7:
                return c((afsv) this.a.get());
            case 8:
                return d((afsv) this.a.get());
            case 9:
                return fq.a((Context) ((axov) this.a).a);
            case 10:
                return e((airw) this.a.get());
            case 11:
                return new ahjr((Context) ((axov) this.a).a);
            case 12:
                return new ahxw((ahxv) this.a.get());
            case 13:
                return new aicx(this.a);
            case 14:
                return f((aynx) this.a.get());
            case 15:
                Context context = (Context) ((axov) this.a).a;
                return new aijg();
            case 16:
                return new aikf((Context) ((axov) this.a).a);
            case 17:
                return new aikh((yni) this.a.get());
            case 18:
                return g((snc) this.a.get());
            case 19:
                return h((aizn) this.a.get());
            default:
                return i(((ajap) this.a).get());
        }
    }
}
