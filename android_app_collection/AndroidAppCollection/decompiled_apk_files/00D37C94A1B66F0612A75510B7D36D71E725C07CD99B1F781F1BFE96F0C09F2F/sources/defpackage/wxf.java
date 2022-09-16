package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service.b;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wxf  reason: default package */
/* loaded from: classes4.dex */
public final class wxf implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public wxf(azqb azqbVar) {
        this.a = azqbVar;
    }

    public wxf(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static wxf A(azqb azqbVar) {
        return new wxf(azqbVar, 18);
    }

    public static wxf B(azqb azqbVar) {
        return new wxf(azqbVar, 19);
    }

    public static wxf C(azqb azqbVar) {
        return new wxf(azqbVar, 20);
    }

    public static wwz a(azqb azqbVar) {
        wwy wwyVar = (wwy) azqbVar.get();
        wwyVar.a.getClass();
        return new wwz(wwyVar);
    }

    public static wxf b(azqb azqbVar) {
        return new wxf(azqbVar);
    }

    public static yme c(yme ymeVar) {
        return ymeVar != null ? ymeVar : yme.a;
    }

    public static Handler d(Context context) {
        return new Handler(context.getMainLooper());
    }

    public static yrd e(yrh yrhVar) {
        return new yrd(yrhVar);
    }

    public static yri f(snc sncVar) {
        return new yri(sncVar);
    }

    public static aynx g(ypx ypxVar) {
        return ypxVar.h.f(new ypv(ypxVar, 1));
    }

    public static aynx h(ypx ypxVar) {
        return ypxVar.h.f(new ypv(ypxVar));
    }

    public static yrl i(ampq ampqVar) {
        return (yrl) ampqVar.e(yrl.a);
    }

    public static wxf j(azqb azqbVar) {
        return new wxf(azqbVar, 1);
    }

    public static wxf k(azqb azqbVar) {
        return new wxf(azqbVar, 2);
    }

    public static wxf l(azqb azqbVar) {
        return new wxf(azqbVar, 3);
    }

    public static wxf m(azqb azqbVar) {
        return new wxf(azqbVar, 4);
    }

    public static wxf n(azqb azqbVar) {
        return new wxf(azqbVar, 5);
    }

    public static wxf o(azqb azqbVar) {
        return new wxf(azqbVar, 6);
    }

    public static wxf p(azqb azqbVar) {
        return new wxf(azqbVar, 7);
    }

    public static wxf q(azqb azqbVar) {
        return new wxf(azqbVar, 8);
    }

    public static wxf r(azqb azqbVar) {
        return new wxf(azqbVar, 9);
    }

    public static wxf s(azqb azqbVar) {
        return new wxf(azqbVar, 10);
    }

    public static wxf t(azqb azqbVar) {
        return new wxf(azqbVar, 11);
    }

    public static wxf u(azqb azqbVar) {
        return new wxf(azqbVar, 12);
    }

    public static wxf v(azqb azqbVar) {
        return new wxf(azqbVar, 13);
    }

    public static wxf w(azqb azqbVar) {
        return new wxf(azqbVar, 14);
    }

    public static wxf x(azqb azqbVar) {
        return new wxf(azqbVar, 15);
    }

    public static wxf y(azqb azqbVar) {
        return new wxf(azqbVar, 16);
    }

    public static wxf z(azqb azqbVar) {
        return new wxf(azqbVar, 17);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return a(this.a);
            case 1:
                return new wxc((wkl) this.a.get());
            case 2:
                return new wyz((xio) this.a.get());
            case 3:
                return new xeo(this.a);
            case 4:
                return new xeq(this.a);
            case 5:
                return new xfd((wwm) this.a.get());
            case 6:
                return new xin(this.a);
            case 7:
                return new xix((wzx) this.a.get());
            case 8:
                return c(((b) this.a).get());
            case 9:
                qrq qrqVar = qrq.a;
                return Integer.valueOf(qse.a((Context) ((axov) this.a).a));
            case 10:
                return new yjl(this.a);
            case 11:
                return new yjm(((axor) this.a).a);
            case 12:
                return brq.h((Context) ((axov) this.a).a);
            case 13:
                return new ylb((Executor) this.a.get());
            case 14:
                Context context = (Context) ((axov) this.a).a;
                return false;
            case 15:
                return d((Context) ((axov) this.a).a);
            case 16:
                return e(((yrz) this.a).get());
            case 17:
                return f((snc) this.a.get());
            case 18:
                return g((ypx) this.a.get());
            case 19:
                return h((ypx) this.a.get());
            default:
                return i((ampq) ((axov) this.a).a);
        }
    }
}
