package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ajfk  reason: default package */
/* loaded from: classes.dex */
public final class ajfk implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public ajfk(azqb azqbVar) {
        this.a = azqbVar;
    }

    public ajfk(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static ajfk a(azqb azqbVar) {
        return new ajfk(azqbVar);
    }

    public static zgz b(acvg acvgVar) {
        return new aiiy(acvgVar);
    }

    public static amfd c(Looper looper) {
        return new amfd(looper);
    }

    public static ajfk d(azqb azqbVar) {
        return new ajfk(azqbVar, 1);
    }

    public static ajfk e(azqb azqbVar) {
        return new ajfk(azqbVar, 2);
    }

    public static ajfk f(azqb azqbVar) {
        return new ajfk(azqbVar, 3);
    }

    public static ajfk g(azqb azqbVar) {
        return new ajfk(azqbVar, 4);
    }

    public static ajfk h(azqb azqbVar) {
        return new ajfk(azqbVar, 14);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        String string;
        switch (this.b) {
            case 0:
                return new ajfj((snc) this.a.get());
            case 1:
                return b((acvg) ((axov) this.a).a);
            case 2:
                return new ajfm(((axpa) this.a).get());
            case 3:
                return new ajft((ScheduledExecutorService) this.a.get());
            case 4:
                return new akvo((acrr) this.a.get());
            case 5:
                return new alqx(((alrb) this.a).get());
            case 6:
                alqz alqzVar = (alqz) this.a.get();
                axzl.o(alqzVar);
                return alqzVar;
            case 7:
                return new alrj(((alrb) this.a).get());
            case 8:
                return new altm(((alts) this.a).get());
            case 9:
                File file = (File) this.a.get();
                if (file != null) {
                    return alus.a(file);
                }
                return null;
            case 10:
                Context context = ((alts) this.a).get();
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                        return new File(context.getExternalFilesDir(null), string);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
            case 11:
                altg altgVar = (altg) this.a.get();
                axzl.o(altgVar);
                return altgVar;
            case 12:
                return new alty(((alts) this.a).get());
            case 13:
                return new alua(((alts) this.a).get());
            default:
                return c((Looper) this.a.get());
        }
    }
}
