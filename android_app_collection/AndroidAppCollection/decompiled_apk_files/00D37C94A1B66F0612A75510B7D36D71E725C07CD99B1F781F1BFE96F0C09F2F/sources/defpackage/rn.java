package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: rn  reason: default package */
/* loaded from: classes4.dex */
public final class rn {
    lo b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final lp f = new rm(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ln) arrayList.get(i)).a();
        }
        this.c = false;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ln lnVar = (ln) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                lnVar.d(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null) {
                lnVar.e(interpolator);
            }
            if (this.b != null) {
                lnVar.f(this.f);
            }
            lnVar.b();
        }
        this.c = true;
    }

    public final void c(ln lnVar) {
        if (!this.c) {
            this.a.add(lnVar);
        }
    }

    public final void d() {
        if (!this.c) {
            this.d = 250L;
        }
    }

    public final void e(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
    }

    public final void f(lo loVar) {
        if (!this.c) {
            this.b = loVar;
        }
    }
}
