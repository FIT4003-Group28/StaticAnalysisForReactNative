package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fx  reason: default package */
/* loaded from: classes3.dex */
public class fx {
    public final dp a;
    public int e;
    public int f;
    private final List g = new ArrayList();
    public final HashSet b = new HashSet();
    public boolean c = false;
    public boolean d = false;

    public fx(int i, int i2, dp dpVar, akl aklVar) {
        this.e = i;
        this.f = i2;
        this.a = dpVar;
        aklVar.b(new fw(this));
    }

    public void a() {
        if (this.d) {
            return;
        }
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: ");
            sb.append(this);
            sb.append(" has called complete.");
        }
        this.d = true;
        for (Runnable runnable : this.g) {
            runnable.run();
        }
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        this.g.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b.isEmpty()) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((akl) arrayList.get(i)).a();
        }
    }

    public final void e(akl aklVar) {
        b();
        this.b.add(aklVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.e != 1) {
                return;
            }
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: For fragment ");
                sb.append(this.a);
                sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                sb.append((Object) ft.a(this.f));
                sb.append(" to ADDING.");
            }
            this.e = 2;
            this.f = 2;
        } else if (i3 == 2) {
            if (eo.X(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SpecialEffectsController: For fragment ");
                sb2.append(this.a);
                sb2.append(" mFinalState = ");
                sb2.append((Object) iy.B(this.e));
                sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                sb2.append((Object) ft.a(this.f));
                sb2.append(" to REMOVING.");
            }
            this.e = 1;
            this.f = 3;
        } else if (this.e == 1) {
        } else {
            if (eo.X(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SpecialEffectsController: For fragment ");
                sb3.append(this.a);
                sb3.append(" mFinalState = ");
                sb3.append((Object) iy.B(this.e));
                sb3.append(" -> ");
                sb3.append((Object) iy.B(i));
                sb3.append(". ");
            }
            this.e = i;
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + ((Object) iy.B(this.e)) + "} {mLifecycleImpact = " + ((Object) ft.a(this.f)) + "} {mFragment = " + this.a + "}";
    }
}
