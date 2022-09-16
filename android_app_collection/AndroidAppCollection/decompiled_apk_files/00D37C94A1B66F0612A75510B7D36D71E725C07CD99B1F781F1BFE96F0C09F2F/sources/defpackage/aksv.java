package defpackage;

import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aksv  reason: default package */
/* loaded from: classes.dex */
public final class aksv {
    public final akwh a;
    public final azqb b;
    public final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;

    public aksv(akwh akwhVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = akwhVar;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.b = azqbVar4;
        this.c = azqbVar5;
        this.g = azqbVar6;
    }

    public final ywk a() {
        return this.a.f;
    }

    public final akwb b() {
        return (akwb) this.d.get();
    }

    public final akwe c() {
        return (akwe) this.e.get();
    }

    public final akwf d() {
        return (akwf) this.f.get();
    }

    public final void e() {
        yxk yxkVar = this.a.e;
        int i = yxkVar.q;
        if (i == 1) {
            akwb akwbVar = (akwb) this.d.get();
            if (akwbVar.a > 0) {
                akwbVar.f.start();
            }
        } else if (i == 2) {
            akwe akweVar = (akwe) this.e.get();
            int i2 = akvp.a;
            akweVar.e.post(new akwc(akweVar));
            akweVar.i.schedule(new akwc(akweVar, 1), akweVar.a + 50, TimeUnit.MILLISECONDS);
        }
        if (yxkVar.s == 1) {
            akwf akwfVar = (akwf) this.f.get();
            akwfVar.b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(akwfVar);
        }
        if (yxkVar.r == 1) {
            ((NativeCrashDetectorV2) this.b.get()).b();
        }
        akuz akuzVar = (akuz) this.c.get();
        akuzVar.f = akuzVar.d.g();
        amxp amxpVar = (amxp) this.g.get();
    }
}
