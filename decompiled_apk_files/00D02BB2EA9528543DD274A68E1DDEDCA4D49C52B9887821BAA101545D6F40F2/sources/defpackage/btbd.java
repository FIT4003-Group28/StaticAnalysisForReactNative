package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btbd  reason: default package */
/* loaded from: classes4.dex */
public final class btbd {
    private final dxio<Context> a;
    private final dxio<Context> b;
    private final dxio<bvjj> c;
    private final dxio<btbp> d;

    public btbd(dxio<Context> dxioVar, dxio<Context> dxioVar2, dxio<bvjj> dxioVar3, dxio<btbp> dxioVar4) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
    }

    private static void b(Locale locale, Resources resources) {
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        Locale.setDefault(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public final void a() {
        this.d.a();
        dbsg<Locale> b = btbp.b(this.c.a().z(bvjk.Q, null));
        if (b.a()) {
            dajk.d(this.b.a());
            Context a = this.a.a();
            dajk dajkVar = dajk.a.get();
            if (dajkVar == null) {
                throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
            }
            dajkVar.c.b(a, dajkVar.a());
            Locale b2 = b.b();
            b(b2, this.a.a().getResources());
            b(b2, this.b.a().getResources());
        }
    }
}
