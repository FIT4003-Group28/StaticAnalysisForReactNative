package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: yry  reason: default package */
/* loaded from: classes4.dex */
public final class yry implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public yry(azqb azqbVar) {
        this.a = azqbVar;
    }

    public yry(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static yry A(azqb azqbVar) {
        return new yry(azqbVar, 16);
    }

    public static yry B(azqb azqbVar) {
        return new yry(azqbVar, 18);
    }

    public static yry C(azqb azqbVar) {
        return new yry(azqbVar, 19);
    }

    public static yry D(azqb azqbVar) {
        return new yry(azqbVar, 20);
    }

    public static yry a(azqb azqbVar) {
        return new yry(azqbVar);
    }

    public static ExperimentalCronetEngine b(CronetEngine cronetEngine) {
        if (!(cronetEngine instanceof ExperimentalCronetEngine)) {
            throw new IllegalStateException("Could not create ExperimentalCronetEngine");
        }
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) cronetEngine;
        axzl.o(experimentalCronetEngine);
        return experimentalCronetEngine;
    }

    public static yuc c(ampq ampqVar) {
        return (yuc) ampqVar.e(yuc.a);
    }

    public static yvd d(Set set) {
        return new yvd(set);
    }

    public static ywr e() {
        return new ywr();
    }

    public static zdj f(Context context) {
        return new zdj(context);
    }

    public static Integer g(Context context) {
        Pair r;
        int i = 720;
        if (!zew.t(context, 720) && !zew.v(context)) {
            i = 480;
        } else if (zew.t(context, 1080) || zew.z(1080)) {
            if (zew.t(context, 1440) || zew.z(1440)) {
                if (!zew.t(context, 2160) && !zew.z(2160)) {
                    if (zew.a == 0) {
                        zew.s(context);
                    }
                    if (zew.a < 3840 && ((r = zew.r()) == null || Math.max(((Integer) r.first).intValue(), ((Integer) r.second).intValue()) < 3840)) {
                        i = 1440;
                    }
                }
                i = 2160;
            } else {
                i = 1080;
            }
        }
        return Integer.valueOf(i);
    }

    public static zen h(Context context, String str) {
        return new zen(context, str);
    }

    public static ces i(aaay aaayVar) {
        return new afrw(aaayVar.a);
    }

    public static aaqf j(azqb azqbVar) {
        return new aaqf(azqbVar);
    }

    public static aaqj k(aaql aaqlVar) {
        return aaqlVar.a(gsh.p, false);
    }

    public static yry l(azqb azqbVar) {
        return new yry(azqbVar, 1);
    }

    public static yry m(azqb azqbVar) {
        return new yry(azqbVar, 2);
    }

    public static yry n(azqb azqbVar) {
        return new yry(azqbVar, 3);
    }

    public static yry o(azqb azqbVar) {
        return new yry(azqbVar, 4);
    }

    public static yry p(azqb azqbVar) {
        return new yry(azqbVar, 5);
    }

    public static yry q(azqb azqbVar) {
        return new yry(azqbVar, 6);
    }

    public static yry r(azqb azqbVar) {
        return new yry(azqbVar, 7);
    }

    public static yry s(azqb azqbVar) {
        return new yry(azqbVar, 8);
    }

    public static yry t(azqb azqbVar) {
        return new yry(azqbVar, 9);
    }

    public static yry u(azqb azqbVar) {
        return new yry(azqbVar, 10);
    }

    public static yry v(azqb azqbVar) {
        return new yry(azqbVar, 11);
    }

    public static yry w(azqb azqbVar) {
        return new yry(azqbVar, 12);
    }

    public static yry x(azqb azqbVar) {
        return new yry(azqbVar, 13);
    }

    public static yry y(azqb azqbVar) {
        return new yry(azqbVar, 14);
    }

    public static yry z(azqb azqbVar) {
        return new yry(azqbVar, 15);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return b((CronetEngine) this.a.get());
            case 1:
                return c((ampq) ((axov) this.a).a);
            case 2:
                return new ysi((String) this.a.get());
            case 3:
                return new ysr((String) this.a.get());
            case 4:
                return yvv.c((Context) ((axov) this.a).a);
            case 5:
                return d((Set) ((axov) this.a).a);
            case 6:
                Context context = (Context) ((axov) this.a).a;
                return e();
            case 7:
                return new zah((snc) this.a.get());
            case 8:
                return f((Context) ((axov) this.a).a);
            case 9:
                return new zdl((Context) ((axov) this.a).a);
            case 10:
                return new zdw((Context) ((axov) this.a).a);
            case 11:
                return g((Context) ((axov) this.a).a);
            case 12:
                return new zeh((Context) ((axov) this.a).a);
            case 13:
                return h((Context) ((axov) this.a).a, "android_embedded_player");
            case 14:
                return new zfq(axot.a(this.a));
            case 15:
                return new zgr((zgq) this.a.get());
            case 16:
                return new zgq((Context) ((axov) this.a).a);
            case 17:
                return amvn.r(((vwo) this.a).a());
            case 18:
                return i((aaay) ((axov) this.a).a);
            case 19:
                return j(this.a);
            default:
                return k(((aaqm) this.a).get());
        }
    }
}
