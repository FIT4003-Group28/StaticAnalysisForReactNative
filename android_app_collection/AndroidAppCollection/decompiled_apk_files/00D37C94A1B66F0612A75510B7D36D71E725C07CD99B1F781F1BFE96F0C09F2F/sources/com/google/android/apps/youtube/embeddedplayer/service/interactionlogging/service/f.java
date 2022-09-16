package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ynl {
    private final azqb c;
    private final zey d;
    private int f = 0;
    public int b = -1;
    private final Map e = new HashMap();
    final Map a = new HashMap();

    public f(azqb azqbVar, zey zeyVar) {
        this.c = azqbVar;
        this.d = zeyVar;
    }

    public static void g(int i) {
        StringBuilder sb = new StringBuilder(52);
        sb.append("InteractionLogger with ID ");
        sb.append(i);
        sb.append(" doesn't exist.");
        afus.c(1, 4, sb.toString(), new Throwable());
    }

    public final synchronized int a(int i) {
        int i2;
        i2 = this.f;
        this.f = i2 + 1;
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        e eVar = (e) map.get(valueOf);
        if (eVar == null) {
            eVar = new e(this.d.a());
            eVar.b = 1;
            this.a.put(valueOf, eVar);
        } else {
            eVar.b++;
        }
        this.e.put(Integer.valueOf(i2), new d(this.c, i, eVar.a));
        return i2;
    }

    public final Optional b() {
        return c(this.b);
    }

    final Optional c(int i) {
        return Optional.ofNullable((d) this.e.get(Integer.valueOf(i)));
    }

    public final synchronized void d(int i, arrb arrbVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        if (dVar.b.a) {
            b bVar = new b(a.ATTACH, arrbVar.e.I());
            if (!dVar.j(bVar)) {
                dVar.b.a(bVar, null);
            }
        }
    }

    final synchronized void e(ahhm ahhmVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        aijx aijxVar = aijx.NEW;
        int ordinal = ahhmVar.c().ordinal();
        if (ordinal == 3) {
            dVar.d(ahhmVar.b(), Optional.ofNullable(ahhmVar.d()));
            return;
        }
        if (ordinal == 4) {
            dVar.d(ahhmVar.b(), Optional.ofNullable(ahhmVar.d()));
            WatchNextResponseModel a = ahhmVar.a();
            if (!dVar.c.a) {
                afus.b(2, 4, "handleWatchNextResponse called without any EmbedWatchPage logged");
            } else if (a == null) {
                afus.b(2, 4, "handleWatchNextResponse called wtih an empty watchNextResponse");
            } else {
                b bVar = new b(a.ATTACH, a.d());
                if (!dVar.j(bVar)) {
                    dVar.i(bVar);
                }
            }
        }
    }

    final synchronized void h(ahhw ahhwVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        dVar.h = Optional.ofNullable(ahhwVar.e());
        if (d.k(dVar.h)) {
            return;
        }
        dVar.c();
    }

    public final synchronized void i(acup acupVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
        } else {
            ((d) b.get()).i(new b(a.CLICK, acupVar));
        }
    }

    public final synchronized void j(byte[] bArr) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
        } else {
            ((d) b.get()).i(new b(a.CLICK, bArr));
        }
    }

    public final synchronized void k(int i, acup acupVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).e(new b(a.CLICK, acupVar));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                e((ahhm) obj);
                return null;
            } else if (i == 1) {
                h((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhm.class, ahhw.class};
    }

    public final synchronized void l(int i, byte[] bArr) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).e(new b(a.CLICK, bArr));
        }
    }

    public final synchronized void m(int i, Optional optional, boolean z) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        if (!dVar.a.a) {
            afus.b(2, 4, "logNewApiVideoLoad before logNewEmbedPage");
            return;
        }
        dVar.g = Optional.empty();
        dVar.c();
        dVar.b.c();
        dVar.c.c();
        dVar.i = null;
        if (z) {
            dVar.f(optional);
            return;
        }
        c cVar = dVar.a;
        if (!cVar.a) {
            afus.b(2, 4, "logNewEmbedPreviewPage called before logNewEmbedPage");
            return;
        }
        dVar.i = dVar.b;
        cVar.d(optional);
        dVar.b();
        dVar.b.b(acuo.a(32594), optional, dVar.a(null));
        dVar.h = Optional.empty();
        b bVar = new b(a.ATTACH, acuo.b(28572));
        if (!dVar.j(bVar)) {
            dVar.e(bVar);
        }
        dVar.h(acuo.b(28572));
    }

    public final synchronized void n(int i) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        c cVar = dVar.a;
        if (cVar.a) {
            afus.b(2, 4, "logNewEmbedPage called more than once");
            return;
        }
        dVar.i = cVar;
        cVar.b(acuo.a(16623), Optional.empty(), dVar.a(null));
    }

    public final synchronized void o(int i, Optional optional) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).g(optional, null);
        }
    }

    public final synchronized void p(acup acupVar) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        b bVar = new b(a.VISIBILITY_UPDATE, acupVar);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.i(bVar);
    }

    public final synchronized void q(byte[] bArr) {
        Optional b = b();
        if (!b.isPresent()) {
            g(this.b);
            return;
        }
        d dVar = (d) b.get();
        b bVar = new b(a.VISIBILITY_UPDATE, bArr);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.i(bVar);
    }

    public final synchronized void r(int i, acup acupVar) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
        } else {
            ((d) c.get()).h(acupVar);
        }
    }

    public final synchronized void s(int i, byte[] bArr) {
        Optional c = c(i);
        if (!c.isPresent()) {
            g(i);
            return;
        }
        d dVar = (d) c.get();
        b bVar = new b(a.VISIBILITY_UPDATE, bArr);
        if (dVar.j(bVar)) {
            return;
        }
        dVar.e(bVar);
    }

    public final synchronized void t(int i) {
        Optional c = c(i);
        if (!c.isPresent()) {
            return;
        }
        d dVar = (d) c.get();
        this.e.remove(Integer.valueOf(i));
        e eVar = (e) this.a.get(Integer.valueOf(dVar.d));
        if (eVar != null) {
            int i2 = eVar.b - 1;
            eVar.b = i2;
            if (i2 != 0) {
                return;
            }
            this.a.remove(Integer.valueOf(dVar.d));
            return;
        }
        int i3 = dVar.d;
        StringBuilder sb = new StringBuilder(85);
        sb.append("Activity identifier ");
        sb.append(i3);
        sb.append(" doesn't have associated embedded playback host nonce.");
        afus.b(2, 4, sb.toString());
    }

    public final synchronized void u(int i, apzg apzgVar) {
        m(i, Optional.of(apzgVar), true);
    }
}
