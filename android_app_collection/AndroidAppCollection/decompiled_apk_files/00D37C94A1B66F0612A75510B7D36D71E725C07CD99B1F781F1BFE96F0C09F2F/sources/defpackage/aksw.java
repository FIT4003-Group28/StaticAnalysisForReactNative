package defpackage;

import android.app.Application;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetector;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorV2;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aksw  reason: default package */
/* loaded from: classes.dex */
public final class aksw {
    private final azqb a;
    private final aksv b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final amum g = new amum();
    private final amum h = new amum();
    private boolean i;

    public aksw(azqb azqbVar, aksv aksvVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = aksvVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
    }

    public final void a() {
        this.i = true;
        avff avffVar = ((akwr) this.a.get()).get();
        if (avffVar.c) {
            akus akusVar = (akus) this.f.get();
            for (Map.Entry entry : this.g.b().entrySet()) {
                String str = (String) entry.getKey();
                akwl akwlVar = (akwl) ((azqb) entry.getValue()).get();
                akuu akuuVar = (akuu) akusVar.e.get();
                synchronized (akuuVar.a) {
                    akuuVar.b.put(str, akwlVar);
                }
            }
            for (Map.Entry entry2 : this.h.b().entrySet()) {
                String str2 = (String) entry2.getKey();
                aktk aktkVar = (aktk) ((azqb) entry2.getValue()).get();
                akut akutVar = (akut) akusVar.d.get();
                synchronized (akutVar.a) {
                    akutVar.e.put(str2, aktkVar);
                }
            }
            akusVar.b(avffVar);
        }
        yxk yxkVar = this.b.a.e;
        if (yxkVar.q == 0) {
            akvx akvxVar = (akvx) this.c.get();
            if (akvxVar.a > 0) {
                akvxVar.e.start();
            }
        }
        if (yxkVar.r == 0) {
            ((NativeCrashDetector) this.d.get()).b();
        }
    }

    public final void d(String str, azqb azqbVar) {
        if (this.i) {
            throw new IllegalStateException("Capturer cannot be added once SystemInitializer has been initialized ");
        }
        this.h.f(str, azqbVar);
    }

    public final void e(String str, azqb azqbVar) {
        if (this.i) {
            throw new IllegalStateException("Transmitter cannot be added once SystemInitializer has been initialized");
        }
        this.g.f(str, azqbVar);
    }

    public final void b() {
        aksv aksvVar = this.b;
        yxk yxkVar = aksvVar.a.e;
        int i = yxkVar.q;
        if (i == 2) {
            akwe c = aksvVar.c();
            int i2 = akvp.a;
            akwd akwdVar = new akwd();
            c.f.set(akwdVar);
            Application application = (Application) c.h.b;
            application.registerActivityLifecycleCallbacks(akwdVar);
            application.registerComponentCallbacks(akwdVar);
        } else if (i == 1) {
            aksvVar.b().d.set((akvq) this.e.get());
        }
        if (yxkVar.s == 1) {
            this.b.d();
        }
        final akuz akuzVar = (akuz) this.b.c.get();
        akvf akvfVar = (akvf) akuzVar.b.get();
        if (akvfVar.f() != 3) {
            return;
        }
        float f = akvfVar.b;
        if (f < 0.0f) {
            akve akveVar = akvfVar.a;
            f = ThreadLocalRandom.current().nextFloat();
            akvfVar.b = f;
        }
        if (f > akvfVar.a()) {
            return;
        }
        final long g = akuzVar.d.g();
        akuzVar.g = akvfVar.e();
        int max = Math.max(akvfVar.b() - ((int) (g - akuzVar.f)), 0);
        akvc a = akvd.a(akuzVar.a, akvfVar.d());
        a.d = akvfVar.c();
        a.e = max;
        a.a = new Runnable() { // from class: akux
            @Override // java.lang.Runnable
            public final void run() {
                akuz akuzVar2 = akuz.this;
                akuzVar2.h.add(akuzVar2.g.call());
            }
        };
        a.c = khv.m;
        a.b = new Runnable() { // from class: akuy
            @Override // java.lang.Runnable
            public final void run() {
                akuz akuzVar2 = akuz.this;
                long j = g;
                arrf a2 = arrh.a();
                aopa createBuilder = avem.a.createBuilder();
                aopa createBuilder2 = aven.a.createBuilder();
                aopa createBuilder3 = avei.a.createBuilder();
                aopa createBuilder4 = aqeq.a.createBuilder();
                createBuilder4.aa(akuzVar2.h);
                int i3 = akuzVar2.e;
                createBuilder4.copyOnWrite();
                aqeq aqeqVar = (aqeq) createBuilder4.instance;
                aqeqVar.b |= 1;
                aqeqVar.d = i3;
                aqeq aqeqVar2 = (aqeq) createBuilder4.mo39build();
                createBuilder3.copyOnWrite();
                avei aveiVar = (avei) createBuilder3.instance;
                aqeqVar2.getClass();
                aveiVar.c = aqeqVar2;
                aveiVar.b |= 1;
                akvf akvfVar2 = (akvf) akuzVar2.b.get();
                long g2 = akuzVar2.d.g();
                aopa createBuilder5 = aveh.a.createBuilder();
                int b = akvfVar2.b();
                createBuilder5.copyOnWrite();
                aveh avehVar = (aveh) createBuilder5.instance;
                avehVar.b |= 8;
                avehVar.f = b / 1000.0f;
                createBuilder5.copyOnWrite();
                aveh avehVar2 = (aveh) createBuilder5.instance;
                avehVar2.b |= 2;
                avehVar2.d = ((float) (g2 - j)) / 1000.0f;
                int d = akvfVar2.d();
                createBuilder5.copyOnWrite();
                aveh avehVar3 = (aveh) createBuilder5.instance;
                avehVar3.b |= 1;
                avehVar3.c = d / 1000.0f;
                float a3 = akvfVar2.a();
                createBuilder5.copyOnWrite();
                aveh avehVar4 = (aveh) createBuilder5.instance;
                avehVar4.b |= 16;
                avehVar4.g = a3;
                createBuilder5.copyOnWrite();
                aveh avehVar5 = (aveh) createBuilder5.instance;
                avehVar5.e = 2;
                avehVar5.b |= 4;
                aveh avehVar6 = (aveh) createBuilder5.mo39build();
                createBuilder3.copyOnWrite();
                avei aveiVar2 = (avei) createBuilder3.instance;
                avehVar6.getClass();
                aveiVar2.d = avehVar6;
                aveiVar2.b |= 2;
                avei aveiVar3 = (avei) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                aven avenVar = (aven) createBuilder2.instance;
                aveiVar3.getClass();
                avenVar.j = aveiVar3;
                avenVar.b |= 1024;
                aven avenVar2 = (aven) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                avem avemVar = (avem) createBuilder.instance;
                avenVar2.getClass();
                avemVar.c = avenVar2;
                avemVar.b |= 1;
                a2.copyOnWrite();
                ((arrh) a2.instance).dH((avem) createBuilder.mo39build());
                ((acrr) akuzVar2.c.get()).c((arrh) a2.mo39build());
            }
        };
        akuzVar.i = a.a();
        akuzVar.i.d();
    }

    public final void c(boolean z, azqb azqbVar) {
        File[] listFiles;
        aphi aphiVar;
        File[] fileArr;
        aksv aksvVar = this.b;
        yxk yxkVar = aksvVar.a.e;
        if (!z) {
            if (yxkVar.r != 0) {
                return;
            }
            NativeCrashDetector nativeCrashDetector = (NativeCrashDetector) this.d.get();
            avfc avfcVar = nativeCrashDetector.a.get().l;
            if (avfcVar == null) {
                avfcVar = avfc.a;
            }
            if (!avfcVar.b) {
                return;
            }
            File a = nativeCrashDetector.a();
            if (!a.exists() || (listFiles = a.listFiles()) == null) {
                return;
            }
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    zgd.D(file);
                } else if (file.delete()) {
                    aopa createBuilder = aphi.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aphi aphiVar2 = (aphi) createBuilder.instance;
                    aphiVar2.c = 10;
                    aphiVar2.b |= 1;
                    acrr acrrVar = nativeCrashDetector.b;
                    arrf a2 = arrh.a();
                    a2.copyOnWrite();
                    ((arrh) a2.instance).bY((aphi) createBuilder.mo39build());
                    acrrVar.c((arrh) a2.mo39build());
                } else {
                    afus.b(1, 27, "Unable to delete native crash dumps.");
                }
            }
            return;
        }
        int i = yxkVar.q;
        if (i == 2) {
            akvu.b(aksvVar.c().h, azqbVar);
        } else if (i == 1) {
            akvu.b(aksvVar.b().e, azqbVar);
        }
        if (yxkVar.r == 1) {
            NativeCrashDetectorV2 nativeCrashDetectorV2 = (NativeCrashDetectorV2) this.b.b.get();
            File a3 = nativeCrashDetectorV2.a();
            try {
                fileArr = a3.listFiles();
            } catch (SecurityException e) {
                afus.c(1, 27, String.format("!list '%s'", a3), e);
                fileArr = null;
            }
            if (fileArr != null) {
                acrr acrrVar2 = (acrr) azqbVar.get();
                String l = Long.toString(nativeCrashDetectorV2.a.c);
                for (File file2 : fileArr) {
                    if (!file2.getName().equals(l)) {
                        if (file2.isDirectory()) {
                            zgd.D(file2);
                        } else if (file2.delete()) {
                            aopa createBuilder2 = aphi.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            aphi aphiVar3 = (aphi) createBuilder2.instance;
                            aphiVar3.c = 10;
                            aphiVar3.b |= 1;
                            arrf a4 = arrh.a();
                            a4.copyOnWrite();
                            ((arrh) a4.instance).bY((aphi) createBuilder2.mo39build());
                            acrrVar2.c((arrh) a4.mo39build());
                        } else {
                            afus.b(1, 27, String.format("!del '%s'", file2));
                        }
                    }
                }
            }
        }
        if (yxkVar.s != 1) {
            return;
        }
        for (File file3 : akpq.d(this.b.d().a, akwi.JAVA_CRASH)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file3);
                aphiVar = (aphi) aopi.parseFrom(aphi.a, fileInputStream, aoos.b());
                fileInputStream.close();
            } catch (Exception e2) {
                akpq.f(String.format("JavaCrashJournalV2 !read '%s'", file3), e2);
                aphiVar = null;
            }
            if (aphiVar != null) {
                String.valueOf(String.valueOf(aphiVar)).length();
                arrf a5 = arrh.a();
                a5.copyOnWrite();
                ((arrh) a5.instance).bY(aphiVar);
                arrh arrhVar = (arrh) a5.mo39build();
                aven avenVar = aphiVar.e;
                if (avenVar == null) {
                    avenVar = aven.a;
                }
                avej avejVar = avenVar.g;
                if (avejVar == null) {
                    avejVar = avej.a;
                }
                ((acrr) azqbVar.get()).f(arrhVar, avejVar.e);
            }
            akpq.e(file3);
        }
    }
}
