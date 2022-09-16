package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aghc  reason: default package */
/* loaded from: classes.dex */
public final class aghc implements aghe, agpi, agvp {
    public final agpj a;
    public final agvq b;
    public volatile agpz c;
    public volatile agpz d;
    private final aghf e;
    private final ywa f;
    private final Map g = new HashMap();
    private final List h = new ArrayList();
    private final axnm i;
    private File j;

    public aghc(aghf aghfVar, agpj agpjVar, agvq agvqVar, ywa ywaVar, axnm axnmVar) {
        this.e = aghfVar;
        this.a = agpjVar;
        this.b = agvqVar;
        this.f = ywaVar;
        this.i = axnmVar;
    }

    private final agpz k(File file, String str) {
        return new agpz(this.e.a(file), str);
    }

    private final synchronized void l() {
        this.j = null;
    }

    @Override // defpackage.aghe
    public final synchronized agpz a() {
        if (this.d == null || !this.a.v()) {
            return this.c;
        }
        return this.d;
    }

    @Override // defpackage.aghe
    public final synchronized agpz b() {
        return this.c;
    }

    @Override // defpackage.aghe
    public final synchronized agpz c() {
        return this.d;
    }

    @Override // defpackage.aghe
    public final synchronized File d() {
        if (this.j == null) {
            agpz a = a();
            File file = null;
            String str = a != null ? a.a : null;
            if (str != null) {
                file = (File) this.g.get(str);
            }
            this.j = file;
        }
        return this.j;
    }

    @Override // defpackage.aghe
    public final synchronized File e(String str) {
        return (File) this.g.get(str);
    }

    @Override // defpackage.amqo
    /* renamed from: f */
    public final synchronized List get() {
        return amuk.o(this.h);
    }

    @Override // defpackage.aghe
    public final synchronized List g() {
        return amuk.o(this.h);
    }

    public final synchronized void h() {
        File o;
        this.e.b();
        l();
        this.c = null;
        this.d = null;
        this.g.clear();
        this.h.clear();
        File o2 = this.a.o(true, null);
        if (o2 != null) {
            String valueOf = String.valueOf(o2.getAbsolutePath());
            if (valueOf.length() != 0) {
                "[Offline] Primary cache dir: ".concat(valueOf);
            }
            afjw.a(o2);
            String d = this.f.d();
            try {
                agpz k = k(o2, d);
                if (k.o()) {
                    this.g.put(d, o2);
                    this.h.add(k);
                    this.c = k;
                }
            } catch (RuntimeException e) {
                zep.d("[Offline] Exception while creating cache", e);
                afus.c(2, 28, "[Offline] Error creating offlineCache", e);
            }
        }
        String y = this.b.y(this.f);
        Map h = this.f.h();
        for (String str : h.keySet()) {
            if (((Boolean) h.get(str)).booleanValue() && (o = this.a.o(false, str)) != null) {
                String valueOf2 = String.valueOf(o.getAbsolutePath());
                if (valueOf2.length() != 0) {
                    "[Offline] SD card cache dir: ".concat(valueOf2);
                }
                afjw.a(o);
                String str2 = (String) this.f.g().get(str);
                try {
                    agpz k2 = k(o, str2);
                    if (k2.o()) {
                        this.h.add(k2);
                        if (str.equals(y)) {
                            this.d = k2;
                        }
                        if (str2 != null) {
                            this.g.put(str2, o);
                        }
                    }
                } catch (RuntimeException e2) {
                    zep.d("[Offline] Exception while creating SD cache", e2);
                    afus.c(2, 28, "Error creating sdCardOfflineCache", e2);
                }
            }
        }
        this.h.addAll((Collection) this.i.get());
    }

    public final boolean i() {
        return (a() == null && d() == null) ? false : true;
    }

    @Override // defpackage.agvp
    public final void j() {
        l();
    }
}
