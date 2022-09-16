package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aevq  reason: default package */
/* loaded from: classes.dex */
public final class aevq implements atk {
    private final aflm a;
    private final Map b = new HashMap();

    public aevq(aflm aflmVar) {
        afms.a(aflmVar);
        this.a = aflmVar;
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i) {
        aevp aevpVar = (aevp) this.b.get(asvVar);
        if (aevpVar == null) {
            return;
        }
        if (aevpVar.c == 0 && i > 0) {
            this.a.B(aevpVar.a, aevpVar.b);
        }
        if (!aevpVar.b) {
            if (aevpVar.a) {
                long j = aevpVar.c;
                if (j < 102400 && j + i >= 102400) {
                    this.a.aw();
                }
            } else {
                long j2 = aevpVar.c;
                if (j2 < 40960 && j2 + i >= 40960) {
                    this.a.f();
                }
            }
        }
        aevpVar.c += i;
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        aevp aevpVar = (aevp) this.b.get(asvVar);
        if (aevpVar == null) {
            return;
        }
        if (aevpVar.b) {
            this.a.E(aevpVar.a);
        }
        this.b.remove(asvVar);
    }

    @Override // defpackage.atk
    public final synchronized void c(asv asvVar, asy asyVar, boolean z) {
        if ("/videoplayback".equals(asyVar.a.getPath())) {
            try {
                int parseInt = Integer.parseInt(asyVar.a.getQueryParameter("itag"));
                boolean z2 = asyVar.g == 0;
                Set c = aank.c();
                Integer valueOf = Integer.valueOf(parseInt);
                if (c.contains(valueOf)) {
                    this.b.put(asvVar, new aevp(true, z2));
                    this.a.ax(z2);
                } else if (aank.b().contains(valueOf)) {
                    this.b.put(asvVar, new aevp(false, z2));
                    this.a.g(z2);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        aevp aevpVar = (aevp) this.b.get(asvVar);
        if (aevpVar == null) {
            return;
        }
        this.a.ap(aevpVar.a, aevpVar.b);
    }
}
