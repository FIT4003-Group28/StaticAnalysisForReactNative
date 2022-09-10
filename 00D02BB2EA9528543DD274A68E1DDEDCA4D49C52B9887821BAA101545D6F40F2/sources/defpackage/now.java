package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
/* compiled from: PG */
/* renamed from: now  reason: default package */
/* loaded from: classes7.dex */
public final class now {
    private final ksi a;
    private final View b;
    private final ConstraintLayout c;
    private final int d;
    private final int e;
    private final dbty<npi> f;
    private final dbty<noi> g;

    public now(ksi ksiVar, View view, ConstraintLayout constraintLayout, int i, int i2, dbty<npi> dbtyVar, dbty<noi> dbtyVar2) {
        dbsk.s(ksiVar);
        this.a = ksiVar;
        dbsk.s(view);
        this.b = view;
        dbsk.s(constraintLayout);
        this.c = constraintLayout;
        this.d = i;
        this.e = i2;
        this.f = dbtyVar;
        this.g = dbtyVar2;
    }

    private final int b() {
        return this.a.b(nqo.Q);
    }

    private final int c() {
        return this.a.b(nqo.Q);
    }

    public final void a() {
        ds dsVar = new ds();
        npi npiVar = npi.STANDARD_NEW;
        int ordinal = this.f.a().ordinal();
        if (ordinal == 0) {
            this.b.setPadding(0, 0, 0, 0);
            if (this.g.a() != noi.MEDIUM) {
                this.b.setPadding(b(), c(), b(), 0);
                dsVar.m(this.d, -2);
                dsVar.l(this.d, -2);
                dsVar.g(this.d, 6, 0, 6);
                dsVar.g(this.d, 3, 0, 3);
                dsVar.m(this.e, -2);
                dsVar.l(this.e, -2);
                dsVar.g(this.e, 3, this.d, 4);
                dsVar.g(this.e, 7, this.d, 7);
            } else {
                this.b.setPadding(b(), c(), b(), 0);
                dsVar.m(this.d, -2);
                dsVar.l(this.d, -2);
                int i = this.d;
                dsVar.f(i, 1, 0, 1, 0);
                dsVar.f(i, 2, 0, 2, 0);
                dsVar.a.get(Integer.valueOf(i)).u = 0.5f;
                dsVar.m(this.e, 0);
                dsVar.l(this.e, -2);
                dsVar.g(this.e, 6, 0, 6);
                dsVar.g(this.e, 7, 0, 7);
                dsVar.g(this.e, 4, 0, 4);
                dsVar.h(this.e, 4, 0);
            }
        } else if (ordinal == 1) {
            this.b.setPadding(b(), b(), b(), b());
            dsVar.m(this.d, 0);
            dsVar.l(this.d, -2);
            dsVar.g(this.d, 3, 0, 3);
            dsVar.m(nrk.a, this.a.a(nqo.am));
            dsVar.l(nrk.a, -2);
            dsVar.g(nrk.a, 3, 0, 3);
            dsVar.g(nrk.a, 4, 0, 4);
            dsVar.j(nrk.a, 0.0f);
            int[] iArr = {nrk.a, this.d};
            float[] fArr = {0.0f, 1.0f};
            dsVar.n(iArr[0]).N = fArr[0];
            dsVar.n(iArr[0]).P = 1;
            dsVar.f(iArr[0], 6, 0, 6, -1);
            dsVar.f(iArr[1], 6, iArr[0], 7, -1);
            dsVar.f(iArr[0], 7, iArr[1], 6, -1);
            dsVar.n(iArr[1]).O = fArr[1];
            dsVar.f(iArr[1], 7, 0, 7, -1);
            dsVar.h(nrk.a, 7, b());
        }
        dsVar.d(this.c);
        this.c.setConstraintSet(dsVar);
    }
}
