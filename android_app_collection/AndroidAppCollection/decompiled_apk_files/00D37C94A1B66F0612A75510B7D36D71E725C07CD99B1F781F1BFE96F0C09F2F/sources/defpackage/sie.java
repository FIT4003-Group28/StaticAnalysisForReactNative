package defpackage;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sie  reason: default package */
/* loaded from: classes4.dex */
public final class sie implements skq, sku {
    private static final amzy g = amzy.l("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager");
    private static final amup h;
    public final long a;
    public final sht b;
    public skr c;
    public final Map f;
    private boolean i = false;
    public String d = "";
    public int e = 0;

    static {
        amum amumVar = new amum();
        amumVar.f(skt.ASSET, sid.ASSET);
        amumVar.f(skt.RENDER_INIT, sid.RENDER_INIT);
        amumVar.f(skt.CAMERA_INIT, sid.CAMERA_INIT);
        amumVar.f(skt.ASSET_DOWNLOAD, sid.ASSET_DOWNLOAD);
        amumVar.f(skt.PROTO_DOWNLOAD_AND_INIT, sid.PROTO_DOWNLOAD_AND_INIT);
        amumVar.f(skt.ASSET_SWITCH, sid.ASSET_SWITCH);
        h = amumVar.b();
    }

    public sie(sht shtVar) {
        EnumMap enumMap = new EnumMap(sid.class);
        this.f = enumMap;
        this.b = shtVar;
        this.a = new Random().nextLong();
        enumMap.put((EnumMap) sid.STARTUP, (sid) amqi.b(amok.a));
        enumMap.put((EnumMap) sid.EXPERIENCE, (sid) amqi.b(amok.a));
    }

    private final int h(sid sidVar) {
        long a = ((amqi) this.f.get(sidVar)).a(TimeUnit.MILLISECONDS);
        this.f.remove(sidVar);
        return (int) a;
    }

    @Override // defpackage.sku
    public final void a(anvn anvnVar) {
        if (!this.f.containsKey(sid.ASSET)) {
            return;
        }
        int i = this.e;
        anvnVar.copyOnWrite();
        ((anvo) anvnVar.instance).r(i);
        if (this.f.containsKey(sid.ASSET)) {
            int h2 = h(sid.ASSET);
            anvnVar.copyOnWrite();
            ((anvo) anvnVar.instance).l(h2);
        }
        anvf a = anvg.a();
        String str = this.d;
        a.copyOnWrite();
        anvg.e((anvg) a.instance, str);
        if (this.f.containsKey(sid.ASSET_SWITCH)) {
            int h3 = h(sid.ASSET_SWITCH);
            a.copyOnWrite();
            anvg.g((anvg) a.instance, h3);
        }
        a.copyOnWrite();
        anvg.f((anvg) a.instance, (anvo) anvnVar.mo39build());
        sht shtVar = this.b;
        aopa g2 = g();
        g2.copyOnWrite();
        anvu anvuVar = (anvu) g2.instance;
        anvg anvgVar = (anvg) a.mo39build();
        anvu anvuVar2 = anvu.a;
        anvgVar.getClass();
        anvuVar.d = anvgVar;
        anvuVar.c = 5;
        shtVar.a(g2);
    }

    @Override // defpackage.skq
    public final void b() {
        anvp anvpVar = anvp.LEFT_BY_UNKNOWN;
        if (this.i) {
            ((amzw) ((amzw) g.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "logLeftExperience", 231, "LoggingManager.java")).q("Already logged leaving experience.");
            return;
        }
        if (((amqi) this.f.get(sid.EXPERIENCE)).a) {
            ((amqi) this.f.get(sid.EXPERIENCE)).g();
        }
        long a = ((amqi) this.f.get(sid.EXPERIENCE)).a(TimeUnit.MILLISECONDS);
        anvq a2 = anvr.a();
        a2.copyOnWrite();
        anvr.c((anvr) a2.instance, (int) a);
        a2.copyOnWrite();
        anvr.d((anvr) a2.instance, anvpVar);
        anvr anvrVar = (anvr) a2.mo39build();
        sht shtVar = this.b;
        aopa g2 = g();
        g2.copyOnWrite();
        anvu anvuVar = (anvu) g2.instance;
        anvu anvuVar2 = anvu.a;
        anvrVar.getClass();
        anvuVar.d = anvrVar;
        anvuVar.c = 8;
        shtVar.a(g2);
        this.i = true;
    }

    @Override // defpackage.skq
    public final void c(skr skrVar) {
        this.c = skrVar;
    }

    @Override // defpackage.sku
    public final void d() {
        if (this.f.containsKey(sid.STARTUP) || this.f.containsKey(sid.CAMERA_INIT)) {
            anvj a = anvk.a();
            if (this.f.containsKey(sid.STARTUP)) {
                int h2 = h(sid.STARTUP);
                a.copyOnWrite();
                anvk.c((anvk) a.instance, h2);
            }
            if (this.f.containsKey(sid.CAMERA_INIT)) {
                int h3 = h(sid.CAMERA_INIT);
                a.copyOnWrite();
                anvk.g((anvk) a.instance, h3);
            }
            if (this.f.containsKey(sid.ASSET_DOWNLOAD)) {
                int h4 = h(sid.ASSET_DOWNLOAD);
                a.copyOnWrite();
                anvk.f((anvk) a.instance, h4);
            }
            if (this.f.containsKey(sid.PROTO_DOWNLOAD_AND_INIT)) {
                int h5 = h(sid.PROTO_DOWNLOAD_AND_INIT);
                a.copyOnWrite();
                anvk.i((anvk) a.instance, h5);
            }
            if (this.f.containsKey(sid.RENDER_INIT)) {
                int h6 = h(sid.RENDER_INIT);
                a.copyOnWrite();
                anvk.h((anvk) a.instance, h6);
            }
            skr skrVar = this.c;
            if (skrVar != null) {
                anvh anvhVar = ((sif) skrVar.e.b()).a;
                boolean z = true;
                if (anvhVar != anvh.GRANTED && anvhVar != anvh.DENIED) {
                    z = false;
                }
                a.copyOnWrite();
                anvk.d((anvk) a.instance, z);
                a.copyOnWrite();
                anvk.e((anvk) a.instance, anvhVar);
            }
            sht shtVar = this.b;
            aopa g2 = g();
            anvk anvkVar = (anvk) a.mo39build();
            g2.copyOnWrite();
            anvu anvuVar = (anvu) g2.instance;
            anvu anvuVar2 = anvu.a;
            anvkVar.getClass();
            anvuVar.d = anvkVar;
            anvuVar.c = 3;
            shtVar.a(g2);
        }
    }

    @Override // defpackage.sku
    public final void e(skt sktVar) {
        Map map = this.f;
        amup amupVar = h;
        if (!map.containsKey(amupVar.get(sktVar))) {
            amzy amzyVar = g;
            ((amzw) ((amzw) amzyVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 96, "LoggingManager.java")).q("Timer doesn't exist for event, nothing to complete: ");
            ((amzw) ((amzw) amzyVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 97, "LoggingManager.java")).p(sktVar);
            return;
        }
        if (((amqi) this.f.get(amupVar.get(sktVar))).a) {
            ((amqi) this.f.get(amupVar.get(sktVar))).g();
        } else {
            amzy amzyVar2 = g;
            ((amzw) ((amzw) amzyVar2.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 104, "LoggingManager.java")).q("Timer not running for event, nothing to stop: ");
            ((amzw) ((amzw) amzyVar2.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 105, "LoggingManager.java")).p(sktVar);
        }
        if (sktVar != skt.CAMERA_INIT || this.f.containsKey(sid.STARTUP)) {
            return;
        }
        d();
    }

    @Override // defpackage.sku
    public final void f(skt sktVar) {
        Map map = this.f;
        amup amupVar = h;
        if (map.containsKey(amupVar.get(sktVar))) {
            amzy amzyVar = g;
            ((amzw) ((amzw) amzyVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventStarted", 83, "LoggingManager.java")).q("Event already exists, resetting timer: ");
            ((amzw) ((amzw) amzyVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventStarted", 84, "LoggingManager.java")).p(sktVar);
            ((amqi) this.f.get(amupVar.get(sktVar))).e();
            ((amqi) this.f.get(amupVar.get(sktVar))).f();
            return;
        }
        this.f.put((sid) amupVar.get(sktVar), amqi.b(amok.a));
    }

    public final aopa g() {
        aopa createBuilder = anvu.a.createBuilder();
        long j = this.a;
        createBuilder.copyOnWrite();
        anvu anvuVar = (anvu) createBuilder.instance;
        anvuVar.b |= 1;
        anvuVar.e = j;
        return createBuilder;
    }
}
