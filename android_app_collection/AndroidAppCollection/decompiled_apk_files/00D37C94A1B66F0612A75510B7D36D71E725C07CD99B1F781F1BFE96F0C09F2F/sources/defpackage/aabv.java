package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: aabv  reason: default package */
/* loaded from: classes.dex */
public final class aabv implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public aabv(azqb azqbVar) {
        this.a = azqbVar;
    }

    public aabv(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static aabv A(azqb azqbVar) {
        return new aabv(azqbVar, 16);
    }

    public static aabv B(azqb azqbVar) {
        return new aabv(azqbVar, 17);
    }

    public static aabv C(azqb azqbVar) {
        return new aabv(azqbVar, 18);
    }

    public static aabv D(azqb azqbVar) {
        return new aabv(azqbVar, 19);
    }

    public static aabv E(azqb azqbVar) {
        return new aabv(azqbVar, 20);
    }

    public static aakl F(azqb azqbVar) {
        return new aakl(azqbVar);
    }

    public static abgb G() {
        return new abgb(null);
    }

    public static aabu a(aabt aabtVar) {
        return new aabu(aabtVar);
    }

    public static aaqj b(aaql aaqlVar) {
        return aaqlVar.a(gsh.q, false);
    }

    public static aacz c(aaau aaauVar) {
        aacz c = aaauVar.c();
        axzl.o(c);
        return c;
    }

    public static aadd d(aaau aaauVar) {
        aadd a = aaauVar.a();
        axzl.o(a);
        return a;
    }

    public static aaqd e(aaau aaauVar) {
        aaqd b = aaauVar.b();
        axzl.o(b);
        return b;
    }

    public static aarc f(Context context) {
        return new aarc(context);
    }

    public static aaqj g(aaql aaqlVar) {
        return aaqlVar.a(gsh.s, true);
    }

    public static yvk h(yvl yvlVar) {
        return yvlVar.a(aapz.p, aber.o, awtn.a);
    }

    public static acrm i(acrr acrrVar) {
        return new acrm(acrrVar);
    }

    public static acrq j(acrr acrrVar) {
        return new acrq(acrrVar);
    }

    public static CronetEngine k(Object obj) {
        return ((adxc) obj).a(false);
    }

    public static aabv l(azqb azqbVar) {
        return new aabv(azqbVar, 1);
    }

    public static aabv m(azqb azqbVar) {
        return new aabv(azqbVar, 2);
    }

    public static aabv n(azqb azqbVar) {
        return new aabv(azqbVar, 3);
    }

    public static aabv o(azqb azqbVar) {
        return new aabv(azqbVar, 4);
    }

    public static aabv p(azqb azqbVar) {
        return new aabv(azqbVar, 5);
    }

    public static aabv q(azqb azqbVar) {
        return new aabv(azqbVar, 6);
    }

    public static aabv r(azqb azqbVar) {
        return new aabv(azqbVar, 7);
    }

    public static aabv s(azqb azqbVar) {
        return new aabv(azqbVar, 8);
    }

    public static aabv t(azqb azqbVar) {
        return new aabv(azqbVar, 9);
    }

    public static aabv u(azqb azqbVar) {
        return new aabv(azqbVar, 10);
    }

    public static aabv v(azqb azqbVar) {
        return new aabv(azqbVar, 11);
    }

    public static aabv w(azqb azqbVar) {
        return new aabv(azqbVar, 12);
    }

    public static aabv x(azqb azqbVar) {
        return new aabv(azqbVar, 13);
    }

    public static aabv y(azqb azqbVar) {
        return new aabv(azqbVar, 14);
    }

    public static aabv z(azqb azqbVar) {
        return new aabv(azqbVar, 15);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return a((aabt) this.a.get());
            case 1:
                return b(((aaqm) this.a).get());
            case 2:
                return c((aaau) this.a.get());
            case 3:
                return d((aaau) this.a.get());
            case 4:
                return e((aaau) this.a.get());
            case 5:
                return F(this.a);
            case 6:
                aacz aaczVar = (aacz) this.a.get();
                return G();
            case 7:
                return new aakh((snc) this.a.get());
            case 8:
                return new aakk((Map) ((axov) this.a).a);
            case 9:
                return new aant(this.a);
            case 10:
                return new aapp((snc) this.a.get());
            case 11:
                return new aara((Context) ((axov) this.a).a);
            case 12:
                return f((Context) ((axov) this.a).a);
            case 13:
                return new aavm(this.a);
            case 14:
                return g(((aaqm) this.a).get());
            case 15:
                return new aavq((aavo) this.a.get());
            case 16:
                return new acrf((SharedPreferences) this.a.get());
            case 17:
                return h(((yvm) this.a).get());
            case 18:
                return i((acrr) this.a.get());
            case 19:
                return j((acrr) this.a.get());
            default:
                return k(this.a.get());
        }
    }
}
