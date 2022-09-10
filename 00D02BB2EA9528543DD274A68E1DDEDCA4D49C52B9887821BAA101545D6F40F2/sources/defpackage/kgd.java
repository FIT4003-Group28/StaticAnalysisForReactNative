package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kgd  reason: default package */
/* loaded from: classes7.dex */
public final class kgd implements btph {
    public static final dcdn<String, cren> a;
    public static final kgc b;
    public final bvjj c;
    public final crem d;
    public final aufc e;
    public final Map<String, kgb> f = new HashMap();
    public final Map<String, Runnable> g = new HashMap();
    public final Set<String> h = new HashSet();

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f("MUTED", cren.MUTED);
        dcdgVar.f("MINIMAL", cren.MINIMAL);
        dcdgVar.f("UNMUTED", cren.UNMUTED);
        a = dcdgVar.b();
        b = new kgc(null, null);
    }

    public kgd(final bvjj bvjjVar, final crem cremVar, final aufc aufcVar) {
        this.c = bvjjVar;
        dbsk.s(cremVar);
        this.d = cremVar;
        dbsk.s(aufcVar);
        this.e = aufcVar;
        final bvjk bvjkVar = bvjk.au;
        d("AUTODRIVE_SPEED", new kgb(this, bvjkVar) { // from class: kfs
            private final kgd a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                bvjk bvjkVar2 = this.b;
                if (str != null) {
                    Double d = null;
                    if (decb.a.matcher(str).matches()) {
                        try {
                            d = Double.valueOf(Double.parseDouble(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (d == null) {
                        return;
                    }
                    kgdVar.c.ac(bvjkVar2, str);
                }
            }
        }, e(bvjk.au, "0"));
        d("RECENT_PLACES", f(bvjk.ar), new Runnable(bvjjVar) { // from class: kfn
            private final bvjj a;

            {
                this.a = bvjjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvjj bvjjVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                bvjjVar2.ah(bvjk.ar, new ArrayList());
            }
        });
        d("FORCE_NIGHTMODE", new kgb(this) { // from class: kft
            private final kgd a;

            {
                this.a = this;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                aufa b2 = kgd.b(str);
                if (b2 == null) {
                    return;
                }
                kgdVar.e.e(b2);
            }
        }, new Runnable(aufcVar) { // from class: kfw
            private final aufc a;

            {
                this.a = aufcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aufc aufcVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                aufcVar2.e(aufa.AUTO);
            }
        });
        final bvjk bvjkVar2 = bvjk.aT;
        d("FORCE_NIGHTMODE_AUXILIARY_MAP", new kgb(this, bvjkVar2) { // from class: kfv
            private final kgd a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar2;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                bvjk bvjkVar3 = this.b;
                aufa b2 = kgd.b(str);
                if (b2 == null) {
                    return;
                }
                kgdVar.c.ai(bvjkVar3, b2);
            }
        }, new Runnable(bvjjVar) { // from class: kfx
            private final bvjj a;

            {
                this.a = bvjjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvjj bvjjVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                bvjjVar2.ai(bvjk.aT, aufa.AUTO);
            }
        });
        d("MUTE_LEVEL", new kgb(this) { // from class: kfy
            private final kgd a;

            {
                this.a = this;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                cren crenVar = kgd.a.get(str);
                if (crenVar == null) {
                    return;
                }
                kgdVar.d.j(crenVar);
            }
        }, new Runnable(cremVar) { // from class: kfz
            private final crem a;

            {
                this.a = cremVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crem cremVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                cremVar2.j(cren.UNMUTED);
            }
        });
        d("IMPLICIT_DESTINATIONS", f(bvjk.as), new Runnable(bvjjVar) { // from class: kga
            private final bvjj a;

            {
                this.a = bvjjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvjj bvjjVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                bvjjVar2.ah(bvjk.as, new ArrayList());
            }
        });
        d("EV_CONNECTOR_TYPES", new kgb(bvjjVar) { // from class: kfo
            private final bvjj a;

            {
                this.a = bvjjVar;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                bvjj bvjjVar2 = this.a;
                dcdn<String, cren> dcdnVar = kgd.a;
                bvjjVar2.ac(bvjk.jZ, str);
                bvjjVar2.Z(bvjk.jW, 0L);
            }
        }, e(bvjk.jZ, ""));
        d("TRAFFIC_LAYER", new kgb(this) { // from class: kfp
            private final kgd a;

            {
                this.a = this;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                if (str == null) {
                    return;
                }
                if (dbqa.e(str, "ON")) {
                    kgdVar.a(true);
                } else if (!dbqa.e(str, "OFF")) {
                } else {
                    kgdVar.a(false);
                }
            }
        }, new Runnable(this) { // from class: kfq
            private final kgd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(false);
            }
        });
    }

    @dzsi
    public static aufa b(@dzsi String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase("NIGHT")) {
            return aufa.FORCE_NIGHT;
        }
        if (str.equalsIgnoreCase("DAY")) {
            return aufa.FORCE_DAY;
        }
        if (!str.equalsIgnoreCase("AUTO")) {
            return null;
        }
        return aufa.AUTO;
    }

    private final void d(String str, kgb kgbVar, Runnable runnable) {
        this.f.containsKey(str);
        this.f.put(str, kgbVar);
        this.g.put(str, runnable);
    }

    private final Runnable e(final bvjk bvjkVar, final String str) {
        return new Runnable(this, bvjkVar, str) { // from class: kfr
            private final kgd a;
            private final bvjk b;
            private final String c;

            {
                this.a = this;
                this.b = bvjkVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kgd kgdVar = this.a;
                kgdVar.c.ac(this.b, this.c);
            }
        };
    }

    private final kgb f(final bvjk bvjkVar) {
        return new kgb(this, bvjkVar) { // from class: kfu
            private final kgd a;
            private final bvjk b;

            {
                this.a = this;
                this.b = bvjkVar;
            }

            @Override // defpackage.kgb
            public final void a(String str) {
                kgd kgdVar = this.a;
                kgdVar.c.ah(this.b, dchl.b(str.split("<next_element>")));
            }
        };
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(boolean z) {
        this.c.S(bvjk.gj, z);
    }
}
