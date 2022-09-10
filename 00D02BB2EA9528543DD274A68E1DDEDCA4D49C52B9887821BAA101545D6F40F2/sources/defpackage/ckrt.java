package defpackage;

import android.os.StatFs;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ckrt  reason: default package */
/* loaded from: classes4.dex */
public final class ckrt implements cksr {
    public final crep a;
    @dzsi
    private creq b;
    private final cksn c;
    private final cksk d;
    private final crox e;
    @dzsi
    private cksp f;
    private final Map<String, dbsi<File, Boolean>> g = new HashMap();
    private final Map<String, crfk> h = new HashMap();
    private boolean i;
    @dzsi
    private final crdv j;

    public ckrt(cksk ckskVar, crdv crdvVar, crep crepVar, cksn cksnVar, crox croxVar) {
        this.d = ckskVar;
        this.j = crdvVar;
        this.c = cksnVar;
        this.a = crepVar;
        this.e = croxVar;
    }

    static String j(crfk crfkVar) {
        return String.valueOf(crfkVar.hashCode());
    }

    private final void k(cksp ckspVar) {
        boolean z;
        File a = this.c.a();
        crfk crfkVar = ckspVar.a;
        String str = ((crff) crfkVar).a;
        String j = j(crfkVar);
        synchronized (this) {
            z = false;
            if (this.g.get(j) != null) {
                z = true;
            } else {
                this.g.put(j, dbsi.a(a, false));
                this.h.put(j, crfkVar);
            }
        }
        if (z) {
            i(j);
            return;
        }
        try {
            StatFs statFs = new StatFs(this.d.b.getFilesDir().getAbsolutePath());
            if (statFs.getAvailableBlocks() * statFs.getBlockSize() > 524288) {
                creq creqVar = this.b;
                if (creqVar != null && creqVar.d(str, j, a.getAbsolutePath()) != -1) {
                    return;
                }
                g(j);
                return;
            }
        } catch (IllegalArgumentException unused) {
        }
        g(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        cksp ckspVar;
        if (i == 0) {
            synchronized (this) {
                if (this.b == null) {
                    creq c = this.a.c();
                    this.b = c;
                    if (c == null || c.b(new ckrs(this)) != 0) {
                        return;
                    }
                }
                synchronized (this) {
                    this.i = true;
                    ckspVar = this.f;
                    if (ckspVar != null) {
                        this.f = null;
                    } else {
                        ckspVar = null;
                    }
                }
                if (ckspVar == null) {
                    return;
                }
                k(ckspVar);
            }
        }
    }

    @Override // defpackage.cksr
    public final void b(cksp ckspVar) {
        boolean z;
        cksp ckspVar2;
        synchronized (this) {
            z = this.i;
            ckspVar2 = null;
            if (!z) {
                cksp ckspVar3 = this.f;
                if (ckspVar3 != null) {
                    ckspVar2 = ckspVar3;
                }
                this.f = ckspVar;
            }
        }
        if (ckspVar2 != null) {
            h(ckspVar2.a);
        }
        if (z) {
            k(ckspVar);
        }
    }

    @Override // defpackage.cksr
    @dzsi
    public final synchronized File c(crfk crfkVar) {
        String j = j(crfkVar);
        if (!this.g.containsKey(j) || this.g.get(j) == null || !this.g.get(j).b.booleanValue()) {
            return null;
        }
        return this.g.get(j).a;
    }

    @Override // defpackage.cksr
    public final void d(Locale locale) {
        synchronized (this) {
            this.i = false;
        }
        e();
        this.a.d(locale, new ckrr(this));
    }

    @Override // defpackage.cksr
    public final void e() {
        cksp ckspVar;
        synchronized (this) {
            ckspVar = this.f;
            if (ckspVar == null) {
                ckspVar = null;
            }
            this.f = null;
        }
        if (ckspVar != null) {
            h(ckspVar.a);
        }
        creq creqVar = this.b;
        if (creqVar != null) {
            creqVar.i();
        }
        synchronized (this) {
            this.g.clear();
            this.h.clear();
        }
    }

    @Override // defpackage.cksr
    public final void f() {
        e();
        creq creqVar = this.b;
        if (creqVar != null) {
            creqVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        crfk remove;
        synchronized (this) {
            this.g.remove(str);
            remove = this.h.remove(str);
        }
        crdv crdvVar = this.j;
        if (crdvVar == null || remove == null) {
            return;
        }
        crdvVar.a(remove, false);
    }

    final void h(crfk crfkVar) {
        crdv crdvVar = this.j;
        if (crdvVar != null) {
            crdvVar.a(crfkVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if (java.util.Arrays.equals(r4, defpackage.cksk.a) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckrt.i(java.lang.String):void");
    }
}
