package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zsj  reason: default package */
/* loaded from: classes4.dex */
public final class zsj implements zse {
    public final zsc a;
    private String h;
    public final Set b = Collections.newSetFromMap(new HashMap());
    public final Set c = Collections.newSetFromMap(new HashMap());
    public final Map d = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    public zno g = null;
    public boolean f = true;

    public zsj(zsc zscVar) {
        this.a = zscVar;
    }

    @Override // defpackage.zse
    public final zrj a(final zrm zrmVar) {
        FilterMapTable$FilterDescriptor a;
        synchronized (this.c) {
            zno znoVar = this.g;
            if (znoVar != null && (a = FilterMapTable$FilterDescriptor.a(znoVar.a(), this.h)) != null) {
                zrmVar.a(a);
            }
            zxq.b(this.c, zrmVar);
        }
        return new zrj() { // from class: zsg
            @Override // defpackage.zrj
            public final void a() {
                zsj zsjVar = zsj.this;
                zrm zrmVar2 = zrmVar;
                synchronized (zsjVar.c) {
                    zsjVar.c.remove(zrmVar2);
                }
            }
        };
    }

    @Override // defpackage.zse
    public final zrj b(final zsd zsdVar) {
        synchronized (this.b) {
            zno znoVar = this.g;
            if (znoVar != null) {
                zsdVar.a(znoVar);
            }
            zxq.b(this.b, zsdVar);
        }
        return new zrj() { // from class: zsh
            @Override // defpackage.zrj
            public final void a() {
                zsj zsjVar = zsj.this;
                zsd zsdVar2 = zsdVar;
                synchronized (zsjVar.b) {
                    zsjVar.b.remove(zsdVar2);
                }
            }
        };
    }

    @Override // defpackage.zse
    public final void c(String str) {
        if (str == null || FilterMapTable$FilterDescriptor.e(str, f())) {
            return;
        }
        this.h = str;
        h();
    }

    @Override // defpackage.zse
    public final void d(Map map) {
        zsc zscVar = this.a;
        synchronized (zscVar.q) {
            if (map != null) {
                if (!map.isEmpty()) {
                    if (zscVar.r != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            zscVar.n((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                        zscVar.o();
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            zscVar.q.put((String) entry2.getKey(), (Integer) entry2.getValue());
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.zse
    public final boolean e() {
        String str;
        zno znoVar = this.g;
        return znoVar != null && (str = this.h) != null && this.f && !str.equals(znoVar.c);
    }

    final String f() {
        if (this.f) {
            return this.h;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        zno znoVar = this.g;
        if (znoVar != null) {
            zxq.c(this.b, znoVar);
        }
    }

    public final void h() {
        FilterMapTable$FilterDescriptor a;
        zno znoVar = this.g;
        if (znoVar != null && (a = FilterMapTable$FilterDescriptor.a(znoVar.a(), this.h)) != null) {
            zxq.c(this.c, a);
        }
        zsc zscVar = this.a;
        avxu avxuVar = avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        String f = zscVar.k(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).f();
        if (!FilterMapTable$FilterDescriptor.h(f)) {
            avxuVar = avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        } else {
            f = zscVar.k(avxu.EFFECT_SUBPACKAGE_ID_PRESET).f();
            if (!FilterMapTable$FilterDescriptor.h(f)) {
                avxuVar = avxu.EFFECT_SUBPACKAGE_ID_PRESET;
            } else {
                f = zscVar.k(avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED).f();
                if (FilterMapTable$FilterDescriptor.h(f)) {
                    f = "NORMAL";
                }
            }
        }
        if (!f.equals(zscVar.t) || zscVar.v != avxuVar) {
            zscVar.t = f;
            zscVar.v = avxuVar;
            zscVar.p();
        }
    }

    public final void i(String str) {
        synchronized (this.d) {
            zsp zspVar = (zsp) this.d.get(str);
            if (zspVar != null && zspVar.a.isAvailable()) {
                zsc zscVar = this.a;
                zsi zsiVar = new zsi(this, str, zspVar);
                zdt zdtVar = zscVar.p;
                if (zdtVar != null) {
                    zdtVar.a(new zsq(str, zspVar, zsiVar));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        h();
    }
}
