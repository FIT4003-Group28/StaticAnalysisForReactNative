package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: un  reason: default package */
/* loaded from: classes7.dex */
public final class un {
    oj b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final ok f = new um(this);
    public final ArrayList<oi> a = new ArrayList<>();

    public final void a() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList<oi> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oi oiVar = arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                oiVar.e(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = oiVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                oiVar.f(this.f);
            }
            View view2 = oiVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void b() {
        if (!this.c) {
            return;
        }
        ArrayList<oi> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        this.c = false;
    }

    public final void c(oi oiVar) {
        if (!this.c) {
            this.a.add(oiVar);
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

    public final void f(oj ojVar) {
        if (!this.c) {
            this.b = ojVar;
        }
    }
}
