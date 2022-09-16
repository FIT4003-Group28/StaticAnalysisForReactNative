package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: wpp  reason: default package */
/* loaded from: classes4.dex */
public final class wpp implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public wpp(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public wpp(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static wpp A(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 12, (char[]) null);
    }

    public static wpp B(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 13);
    }

    public static wpp C(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 14);
    }

    public static wpp D(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 15, (short[]) null);
    }

    public static wpp E(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 16, (int[]) null);
    }

    public static wpp F(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 17);
    }

    public static wpp G(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 18);
    }

    public static wpp H(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 19, (boolean[]) null);
    }

    public static wpp I(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 20, (float[]) null);
    }

    public static wpp a(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2);
    }

    public static wpo b(azqb azqbVar, azqb azqbVar2) {
        return new wpo(azqbVar, azqbVar2);
    }

    public static wrc c(azqb azqbVar, wwf wwfVar) {
        return new wrc(azqbVar, wwfVar);
    }

    public static wtv d(azqb azqbVar, azqb azqbVar2) {
        return new wtv(azqbVar, azqbVar2);
    }

    public static wvu e(azqb azqbVar, wwf wwfVar) {
        return new wvu(azqbVar);
    }

    public static wwc f(aadd aaddVar, wvw wvwVar) {
        return new wwc(aaddVar, wvwVar);
    }

    public static wwf g() {
        return new wwf();
    }

    public static wwi h(Context context, Executor executor) {
        return new wwi(context, executor);
    }

    public static SharedPreferences i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        axzl.o(sharedPreferences);
        return sharedPreferences;
    }

    public static yzj j(azqb azqbVar, ampq ampqVar) {
        return (yzj) ampqVar.d(new uvy(azqbVar, 2));
    }

    public static yjs k(azqb azqbVar, yjr yjrVar) {
        return new yjs(azqbVar, yjrVar);
    }

    public static ankx l(ampq ampqVar, ankx ankxVar) {
        if (ampqVar.h()) {
            ankxVar = anlz.f((ScheduledExecutorService) ampqVar.c());
        }
        axzl.o(ankxVar);
        return ankxVar;
    }

    public static yky m(azqb azqbVar) {
        yky ykyVar = new yky((ylo) azqbVar.get());
        Logger.getLogger(anlz.g(qrj.c).getClass().getName()).addHandler(ykyVar);
        return ykyVar;
    }

    public static ayor n(Executor executor, ywk ywkVar) {
        if ((ywkVar.c(ywk.K) & 4) != 0) {
            return new azmw(executor);
        }
        return azpj.b(executor);
    }

    public static wpo o(azqb azqbVar, azqb azqbVar2) {
        return new wpo(azqbVar, azqbVar2, 2);
    }

    public static wpp p(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 1);
    }

    public static wpp q(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 2);
    }

    public static wpp r(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 3);
    }

    public static wpp s(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 4, (byte[]) null);
    }

    public static wpp t(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 5);
    }

    public static wpp u(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 6);
    }

    public static wpp v(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 7);
    }

    public static wpp w(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 8);
    }

    public static wpp x(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 9);
    }

    public static wpp y(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 10);
    }

    public static wpp z(azqb azqbVar, azqb azqbVar2) {
        return new wpp(azqbVar, azqbVar2, 11);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return o(this.a, this.b);
            case 1:
                return b(this.a, this.b);
            case 2:
                return c(this.a, (wwf) this.b.get());
            case 3:
                return new wrj(this.a, (amup) this.b.get());
            case 4:
                azqb azqbVar = this.b;
                azqb azqbVar2 = this.a;
                amum h = amup.h();
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar2);
                h.f(apcd.SLOT_TYPE_IN_PLAYER, usw.f);
                h.f(apcd.SLOT_TYPE_LOCKSCREEN, usw.g);
                h.f(apcd.SLOT_TYPE_FIXED_FOOTER, usw.h);
                h.f(apcd.SLOT_TYPE_FORECASTING, usw.i);
                h.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar);
                return h.b();
            case 5:
                return new wtg(this.a, this.b);
            case 6:
                return d(this.a, this.b);
            case 7:
                return new wvc(this.a, (amup) this.b.get());
            case 8:
                return new wvt(this.a, this.b);
            case 9:
                return e(this.a, (wwf) this.b.get());
            case 10:
                return f((aadd) this.a.get(), (wvw) this.b.get());
            case 11:
                Context context = (Context) ((axov) this.a).a;
                aadd aaddVar = (aadd) this.b.get();
                return g();
            case 12:
                return h((Context) ((axov) this.b).a, (Executor) this.a.get());
            case 13:
                return new wxb((wwm) this.a.get(), (Executor) this.b.get());
            case 14:
                return i((Context) ((axov) this.a).a, ((yin) this.b).b());
            case 15:
                return j(this.b, (ampq) ((axov) this.a).a);
            case 16:
                return k(this.b, (yjr) this.a.get());
            case 17:
                return l((ampq) ((axov) this.a).a, (ankx) this.b.get());
            case 18:
                Context context2 = (Context) ((axov) this.a).a;
                return m(this.b);
            case 19:
                return n((Executor) this.b.get(), (ywk) this.a.get());
            default:
                return new yni((Executor) this.b.get(), (snc) this.a.get());
        }
    }
}
