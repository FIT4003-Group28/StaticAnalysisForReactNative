package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dwi  reason: default package */
/* loaded from: classes6.dex */
public final class dwi implements dan {
    private final dtz g;
    private boolean k;
    private final List<dal> h = new ArrayList();
    private final Object i = new Object();
    private int j = 0;
    public final akse a = new akse();
    public final akse b = new akse();
    public dam c = dam.UP;
    public int f = 1;
    public float d = 0.0f;
    public float e = 0.0f;
    private final dbsz<duh> l = new dbsz(this) { // from class: dwh
        private final dwi a;

        {
            this.a = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[ADDED_TO_REGION] */
        @Override // defpackage.dbsz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void NU(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dwh.NU(java.lang.Object):void");
        }
    };

    public dwi(dtz dtzVar) {
        this.g = dtzVar;
    }

    private final void i() {
        this.g.D(this.l);
    }

    @Override // defpackage.dan
    public final void a(dal dalVar) {
        synchronized (this.i) {
            this.h.add(dalVar);
        }
    }

    @Override // defpackage.dan
    public final void b(dal dalVar) {
        synchronized (this.i) {
            this.h.remove(dalVar);
        }
    }

    @Override // defpackage.dan
    public final void c(dam damVar) {
        this.c = damVar;
    }

    @Override // defpackage.dan
    public final void d() {
        this.k = true;
        if (this.j != 0) {
            return;
        }
        this.c = dam.UP;
        h(1);
        this.g.C(this.l);
    }

    @Override // defpackage.dan
    public final void e() {
        this.k = false;
        i();
    }

    @Override // defpackage.dan
    public final void f() {
        int i = this.j + 1;
        this.j = i;
        if (i == 1) {
            i();
        }
    }

    @Override // defpackage.dan
    public final void g() {
        int i = this.j - 1;
        this.j = i;
        dbsk.l(i >= 0);
        if (this.j != 0 || !this.k) {
            return;
        }
        d();
    }

    public final void h(int i) {
        synchronized (this.i) {
            for (dal dalVar : this.h) {
                dalVar.a(i);
            }
        }
    }
}
