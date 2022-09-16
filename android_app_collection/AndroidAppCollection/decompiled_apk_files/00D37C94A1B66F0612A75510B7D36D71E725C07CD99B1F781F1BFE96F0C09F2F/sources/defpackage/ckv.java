package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckv  reason: default package */
/* loaded from: classes2.dex */
public final class ckv implements cjr, cik {
    private final cjq a;
    private final cjs b;
    private int c;
    private int d = -1;
    private chy e;
    private List f;
    private int g;
    private volatile cnp h;
    private File i;
    private ckw j;

    public ckv(cjs cjsVar, cjq cjqVar) {
        this.b = cjsVar;
        this.a = cjqVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.cjr
    public final void a() {
        cnp cnpVar = this.h;
        if (cnpVar != null) {
            cnpVar.c.b();
        }
    }

    @Override // defpackage.cjr
    public final boolean b() {
        List list;
        List e = this.b.e();
        boolean z = false;
        if (e.isEmpty()) {
            return false;
        }
        cjs cjsVar = this.b;
        cgb cgbVar = cjsVar.c.c;
        Class<?> cls = cjsVar.d.getClass();
        Class cls2 = cjsVar.g;
        Class cls3 = cjsVar.j;
        csy csyVar = cgbVar.d;
        cvb cvbVar = (cvb) csyVar.a.getAndSet(null);
        if (cvbVar == null) {
            cvbVar = new cvb(cls, cls2, cls3);
        } else {
            cvbVar.a(cls, cls2, cls3);
        }
        synchronized (csyVar.b) {
            list = (List) csyVar.b.get(cvbVar);
        }
        csyVar.a.set(cvbVar);
        if (list == null) {
            list = new ArrayList();
            for (Class cls4 : cgbVar.a.a(cls)) {
                for (Class cls5 : cgbVar.b.b(cls4, cls2)) {
                    if (!cgbVar.h.c(cls5, cls3).isEmpty() && !list.contains(cls5)) {
                        list.add(cls5);
                    }
                }
            }
            csy csyVar2 = cgbVar.d;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (csyVar2.b) {
                csyVar2.b.put(new cvb(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            String valueOf = String.valueOf(this.b.d.getClass());
            String valueOf2 = String.valueOf(this.b.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            if (this.f != null && c()) {
                this.h = null;
                while (!z && c()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    File file = this.i;
                    cjs cjsVar2 = this.b;
                    this.h = ((cnq) list2.get(i)).a(file, cjsVar2.e, cjsVar2.f, cjsVar2.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.d(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= e.size()) {
                    return false;
                }
                this.d = 0;
            }
            chy chyVar = (chy) e.get(this.c);
            Class cls6 = (Class) list.get(this.d);
            cig a = this.b.a(cls6);
            clb c = this.b.c();
            cjs cjsVar3 = this.b;
            this.j = new ckw(c, chyVar, cjsVar3.m, cjsVar3.e, cjsVar3.f, a, cls6, cjsVar3.h);
            File a2 = this.b.d().a(this.j);
            this.i = a2;
            if (a2 != null) {
                this.e = chyVar;
                this.f = this.b.g(a2);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.cik
    public final void f(Object obj) {
        this.a.e(this.e, obj, this.h.c, 4, this.j);
    }

    @Override // defpackage.cik
    public final void g(Exception exc) {
        this.a.d(this.j, exc, this.h.c, 4);
    }
}
