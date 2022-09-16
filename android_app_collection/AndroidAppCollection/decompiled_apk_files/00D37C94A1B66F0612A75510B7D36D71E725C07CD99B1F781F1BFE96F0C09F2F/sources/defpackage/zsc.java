package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Effect;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: zsc  reason: default package */
/* loaded from: classes4.dex */
public final class zsc implements zrp, zrh {
    public zsn a;
    public ztl b;
    public boolean c;
    public Map f;
    public zso g;
    public zdt p;
    public znj r;
    public List s;
    public String t;
    public String u;
    public avxu v;
    public boolean w;
    public boolean x;
    public boolean y;
    private zrg z;
    public boolean d = true;
    public final Object e = new Object();
    public final Set i = Collections.newSetFromMap(new HashMap());
    public final Set j = Collections.newSetFromMap(new HashMap());
    public final Set k = Collections.newSetFromMap(new HashMap());
    public final Set l = Collections.newSetFromMap(new HashMap());
    public final Set m = Collections.newSetFromMap(new HashMap());
    public final Set n = Collections.newSetFromMap(new HashMap());
    public final Set o = Collections.newSetFromMap(new HashMap());
    public final Map q = new HashMap();
    private final Map A = new EnumMap(avxu.class);
    public final zrf h = new zrf(Executors.newSingleThreadExecutor());

    public static zrp j() {
        return new zsc();
    }

    @Override // defpackage.zrh
    public final void a(String str) {
        this.h.d(str);
    }

    @Override // defpackage.zrh
    public final void b() {
        o();
        r();
    }

    @Override // defpackage.zrp
    public final zrj c(final zrl zrlVar) {
        synchronized (this.i) {
            zrg zrgVar = this.z;
            if (zrgVar != null) {
                zrlVar.a(zrgVar);
            } else {
                zxq.b(this.i, zrlVar);
            }
        }
        return new zrj() { // from class: zrv
            @Override // defpackage.zrj
            public final void a() {
                zsc zscVar = zsc.this;
                zrl zrlVar2 = zrlVar;
                synchronized (zscVar.i) {
                    zscVar.i.remove(zrlVar2);
                }
            }
        };
    }

    @Override // defpackage.zrp
    public final zrj d(final zri zriVar) {
        this.h.a(zriVar);
        return new zrj() { // from class: zru
            @Override // defpackage.zrj
            public final void a() {
                zsc zscVar = zsc.this;
                zscVar.h.e(zriVar);
            }
        };
    }

    @Override // defpackage.zrp
    public final zrj e(final zrm zrmVar) {
        synchronized (this.n) {
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
            if (a != null) {
                zrmVar.a(a);
            }
            zxq.b(this.n, zrmVar);
        }
        return new zrj() { // from class: zry
            @Override // defpackage.zrj
            public final void a() {
                zsc zscVar = zsc.this;
                zrm zrmVar2 = zrmVar;
                synchronized (zscVar.n) {
                    zscVar.n.remove(zrmVar2);
                }
            }
        };
    }

    @Override // defpackage.zrp
    public final zrj f(zrn zrnVar) {
        zrnVar.getClass();
        this.p = zrnVar;
        synchronized (this.A) {
            for (zsj zsjVar : this.A.values()) {
                synchronized (zsjVar.d) {
                    Iterator it = zsjVar.e.keySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!zsjVar.d.containsKey(str)) {
                            zsjVar.d.put(str, (zsp) zsjVar.e.get(str));
                        }
                        it.remove();
                    }
                    for (Map.Entry entry : zsjVar.d.entrySet()) {
                        zsjVar.i((String) entry.getKey());
                    }
                }
            }
        }
        return new zrj() { // from class: zrq
            @Override // defpackage.zrj
            public final void a() {
                zsc.this.p = null;
            }
        };
    }

    @Override // defpackage.zrp
    public final zrk g() {
        if (this.t != null) {
            Map map = amyc.b;
            if (this.v == avxu.EFFECT_SUBPACKAGE_ID_PRESET) {
                float f = true != FilterMapTable$FilterDescriptor.e(this.t, "AUTO") ? 0.5f : 0.8f;
                Map hashMap = new HashMap();
                hashMap.put("intensity", Float.valueOf(f));
                map = hashMap;
            }
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
            String str = this.t;
            return new zrk(str, a == null ? str : a.c, FilterMapTable$FilterDescriptor.e(str, "NORMAL") ? avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED : this.v, map);
        }
        return zrk.a;
    }

    @Override // defpackage.zrp
    public final void h(zsn zsnVar) {
        aqxo.y(this.a == null);
        zsnVar.getClass();
        this.a = zsnVar;
        zrr zrrVar = new zrr(this, zsnVar);
        synchronized (zsnVar.e) {
            zsnVar.h = zrrVar;
            zsnVar.c();
        }
    }

    @Override // defpackage.zrp
    public final void i(ztl ztlVar) {
        aqxo.y(this.b == null);
        ztlVar.getClass();
        this.b = ztlVar;
        zrs zrsVar = new zrs(this, ztlVar);
        synchronized (ztlVar.c) {
            ztlVar.m = zrsVar;
            ztlVar.b();
        }
    }

    public final zsj k(avxu avxuVar) {
        zsj zsjVar;
        synchronized (this.A) {
            zsjVar = (zsj) this.A.get(avxuVar);
            if (zsjVar == null) {
                zsjVar = new zsj(this);
                this.A.put(avxuVar, zsjVar);
            }
        }
        return zsjVar;
    }

    public final void l(List list, List list2, znk znkVar) {
        synchronized (this.q) {
            this.r = znkVar.a(list);
            for (Map.Entry entry : this.q.entrySet()) {
                n((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.q.clear();
            this.s = list;
            o();
        }
        p();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            zno znoVar = (zno) it.next();
            avxu avxuVar = znoVar.a;
            zsj k = k(avxuVar);
            k.g = znoVar;
            k.g();
            k.h();
            if (avxuVar == avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE) {
                k.a(new zsb(this));
            } else if (avxuVar == avxu.EFFECT_SUBPACKAGE_ID_PRESET) {
                k.a(new zsb(this, 1));
            } else if (avxuVar == avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED) {
                zep.l("Loaded unspecified subpackage");
            } else {
                String valueOf = String.valueOf(avxuVar.name());
                zep.b(valueOf.length() != 0 ? "Ignoring selected effect from unknown subpackage: ".concat(valueOf) : new String("Ignoring selected effect from unknown subpackage: "));
            }
        }
    }

    public final void m(Set set) {
        synchronized (this.i) {
            zrg zrgVar = new zrg(set);
            this.z = zrgVar;
            zxq.c(this.i, zrgVar);
            this.i.clear();
        }
    }

    public final void o() {
        List list = this.s;
        if (list != null) {
            zxq.c(this.m, list);
            for (zsj zsjVar : this.A.values()) {
                zsjVar.g();
            }
        }
    }

    public final void p() {
        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.s, this.t);
        if (a != null) {
            zxq.c(this.n, a);
        }
        r();
    }

    public final void q() {
        k(avxu.EFFECT_SUBPACKAGE_ID_PRESET).j(true);
        k(avxu.EFFECT_SUBPACKAGE_ID_EXPRESSIVE).j(false);
    }

    public final void r() {
        Effect a;
        if (!this.d) {
            return;
        }
        String str = this.t;
        FilterMapTable$FilterDescriptor a2 = FilterMapTable$FilterDescriptor.a(this.s, str);
        if (a2 == null || a2.b) {
            str = "NORMAL";
        }
        if (FilterMapTable$FilterDescriptor.e(str, this.u)) {
            return;
        }
        this.u = str;
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "EffectProvider::updateAppliedEffect setXenoEffect to ".concat(valueOf) : new String("EffectProvider::updateAppliedEffect setXenoEffect to ");
        if (this.y) {
            zep.c("PresetFilterDebug", concat);
        }
        if (!this.x || (a = this.b.a(this.u)) == null) {
            return;
        }
        if (!this.y || !this.u.equals("bw_med_contrast_shorts")) {
            zxq.c(this.o, a);
        } else {
            zxq.c(this.o, null);
        }
    }

    public final void n(String str, int i) {
        if (i != 1) {
            if (i == 2) {
                this.r.a(str);
                return;
            }
            throw new AssertionError(i);
        }
        znx znxVar = (znx) this.r;
        anii.h(anii.h(znxVar.c(znx.e(str)), ydy.h, anjk.a), new znu(znxVar, str, 1), anjk.a);
        FilterMapTable$FilterDescriptor b = znxVar.b(str);
        if (b == null) {
            return;
        }
        b.d = new znl(1);
    }
}
