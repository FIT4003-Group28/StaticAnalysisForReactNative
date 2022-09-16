package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cjs  reason: default package */
/* loaded from: classes2.dex */
public final class cjs {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public cfs c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public cic h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public chy m;
    public cfv n;
    public ckb o;
    public boolean p;
    public boolean q;
    public ckg r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cig a(Class cls) {
        cig cigVar = (cig) this.i.get(cls);
        if (cigVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    cigVar = (cig) entry.getValue();
                    break;
                }
            }
        }
        if (cigVar == null) {
            if (!this.i.isEmpty() || !this.p) {
                return cou.b;
            }
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 115);
            sb.append("Missing transformation for ");
            sb.append(valueOf);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return cigVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cks b(Class cls) {
        cks cksVar;
        cgb cgbVar = this.c.c;
        Class cls2 = this.g;
        Class cls3 = this.j;
        csx csxVar = cgbVar.e;
        cvb cvbVar = (cvb) csxVar.c.getAndSet(null);
        if (cvbVar == null) {
            cvbVar = new cvb();
        }
        cvbVar.a(cls, cls2, cls3);
        synchronized (csxVar.b) {
            cksVar = (cks) csxVar.b.get(cvbVar);
        }
        csxVar.c.set(cvbVar);
        csx csxVar2 = cgbVar.e;
        if (csx.a.equals(cksVar)) {
            return null;
        }
        if (cksVar != null) {
            return cksVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : cgbVar.b.b(cls, cls2)) {
            for (Class cls5 : cgbVar.h.c(cls4, cls3)) {
                arrayList.add(new cjx(cls, cls4, cls5, cgbVar.b.a(cls, cls4), cgbVar.h.b(cls4, cls5), cgbVar.f));
            }
        }
        cks cksVar2 = arrayList.isEmpty() ? null : new cks(cls, cls2, cls3, arrayList, cgbVar.f);
        csx csxVar3 = cgbVar.e;
        synchronized (csxVar3.b) {
            csxVar3.b.put(new cvb(cls, cls2, cls3), cksVar2 != null ? cksVar2 : csx.a);
        }
        return cksVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final clb c() {
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final clt d() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List f = f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                cnp cnpVar = (cnp) f.get(i);
                if (!this.b.contains(cnpVar.a)) {
                    this.b.add(cnpVar.a);
                }
                for (int i2 = 0; i2 < cnpVar.b.size(); i2++) {
                    if (!this.b.contains(cnpVar.b.get(i2))) {
                        this.b.add((chy) cnpVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List c = this.c.c.c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                cnp a = ((cnq) c.get(i)).a(this.d, this.e, this.f, this.h);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List g(File file) {
        return this.c.c.c(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(Class cls) {
        return b(cls) != null;
    }
}
