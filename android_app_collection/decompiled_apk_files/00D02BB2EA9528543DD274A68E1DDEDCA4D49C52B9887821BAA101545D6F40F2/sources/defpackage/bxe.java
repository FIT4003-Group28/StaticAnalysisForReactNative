package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxe  reason: default package */
/* loaded from: classes.dex */
public final class bxe implements bvt, bui {
    private final bvs a;
    private final bvu<?> b;
    private int c;
    private int d = -1;
    private btw e;
    private List<cap<File, ?>> f;
    private int g;
    private volatile cao<?> h;
    private File i;
    private bxf j;

    public bxe(bvu<?> bvuVar, bvs bvsVar) {
        this.b = bvuVar;
        this.a = bvsVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.bvt
    public final boolean a() {
        List<Class<?>> list;
        List<btw> h = this.b.h();
        boolean z = false;
        if (h.isEmpty()) {
            return false;
        }
        bvu<?> bvuVar = this.b;
        bru bruVar = bvuVar.c.c;
        Class<?> cls = bvuVar.d.getClass();
        Class<?> cls2 = bvuVar.g;
        Class<?> cls3 = bvuVar.j;
        chk chkVar = bruVar.g;
        cjm andSet = chkVar.a.getAndSet(null);
        if (andSet == null) {
            andSet = new cjm(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (chkVar.b) {
            list = chkVar.b.get(andSet);
        }
        chkVar.a.set(andSet);
        if (list == null) {
            list = new ArrayList<>();
            for (Class<?> cls4 : bruVar.a.d(cls)) {
                for (Class<?> cls5 : bruVar.c.c(cls4, cls2)) {
                    if (!bruVar.f.c(cls5, cls3).isEmpty() && !list.contains(cls5)) {
                        list.add(cls5);
                    }
                }
            }
            chk chkVar2 = bruVar.g;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(list);
            synchronized (chkVar2.b) {
                chkVar2.b.put(new cjm(cls, cls2, cls3), unmodifiableList);
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
            if (this.f == null || !c()) {
                int i = this.d + 1;
                this.d = i;
                if (i >= list.size()) {
                    int i2 = this.c + 1;
                    this.c = i2;
                    if (i2 >= h.size()) {
                        return false;
                    }
                    this.d = 0;
                }
                btw btwVar = h.get(this.c);
                Class<?> cls6 = list.get(this.d);
                bue<Z> e = this.b.e(cls6);
                bxl b = this.b.b();
                bvu<?> bvuVar2 = this.b;
                this.j = new bxf(b, btwVar, bvuVar2.m, bvuVar2.e, bvuVar2.f, e, cls6, bvuVar2.h);
                File a = this.b.a().a(this.j);
                this.i = a;
                if (a != null) {
                    this.e = btwVar;
                    this.f = this.b.f(a);
                    this.g = 0;
                }
            } else {
                this.h = null;
                while (!z && c()) {
                    List<cap<File, ?>> list2 = this.f;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    File file = this.i;
                    bvu<?> bvuVar3 = this.b;
                    this.h = list2.get(i3).b(file, bvuVar3.e, bvuVar3.f, bvuVar3.h);
                    if (this.h != null && this.b.c(this.h.c.d())) {
                        this.h.c.a(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // defpackage.bvt
    public final void b() {
        cao<?> caoVar = this.h;
        if (caoVar != null) {
            caoVar.c.c();
        }
    }

    @Override // defpackage.bui
    public final void f(Object obj) {
        this.a.d(this.e, obj, this.h.c, 4, this.j);
    }

    @Override // defpackage.bui
    public final void g(Exception exc) {
        this.a.e(this.j, exc, this.h.c, 4);
    }
}
