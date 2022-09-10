package defpackage;

import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvp  reason: default package */
/* loaded from: classes.dex */
public final class bvp implements bvt, bui {
    private final List<btw> a;
    private final bvu<?> b;
    private final bvs c;
    private int d = -1;
    private btw e;
    private List<cap<File, ?>> f;
    private int g;
    private volatile cao<?> h;
    private File i;

    public bvp(List<btw> list, bvu<?> bvuVar, bvs bvsVar) {
        this.a = list;
        this.b = bvuVar;
        this.c = bvsVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.bvt
    public final boolean a() {
        while (true) {
            boolean z = false;
            if (this.f == null || !c()) {
                int i = this.d + 1;
                this.d = i;
                if (i >= this.a.size()) {
                    return false;
                }
                btw btwVar = this.a.get(this.d);
                File a = this.b.a().a(new bvq(btwVar, this.b.m));
                this.i = a;
                if (a != null) {
                    this.e = btwVar;
                    this.f = this.b.f(a);
                    this.g = 0;
                }
            } else {
                this.h = null;
                while (!z && c()) {
                    List<cap<File, ?>> list = this.f;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    File file = this.i;
                    bvu<?> bvuVar = this.b;
                    this.h = list.get(i2).b(file, bvuVar.e, bvuVar.f, bvuVar.h);
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
        this.c.d(this.e, obj, this.h.c, 3, this.e);
    }

    @Override // defpackage.bui
    public final void g(Exception exc) {
        this.c.e(this.e, exc, this.h.c, 3);
    }
}
