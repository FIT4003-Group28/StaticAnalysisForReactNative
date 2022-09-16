package defpackage;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
/* compiled from: PG */
/* renamed from: rvx  reason: default package */
/* loaded from: classes4.dex */
public final class rvx {
    public final SparseArray a;

    public rvx() {
        this.a = new SparseArray();
    }

    public rvx(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    private final j f(int i) {
        j jVar = (j) this.a.get(i);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j();
        this.a.put(i, jVar2);
        return jVar2;
    }

    public final void a(int i, Runnable runnable) {
        f(i).a.add(runnable);
    }

    public final void b(int i, k kVar) {
        j f = f(i);
        f.b.add(kVar);
        kVar.a(f.c);
    }

    public final void c(int i) {
        j jVar = (j) this.a.get(i);
        if (jVar == null) {
            return;
        }
        for (Runnable runnable : jVar.a) {
            runnable.run();
        }
    }

    public final void d(int i, boolean z) {
        j f = f(i);
        f.c = z;
        for (k kVar : f.b) {
            kVar.a(z);
        }
    }

    public final boolean e(int i) {
        j jVar = (j) this.a.get(i);
        return jVar != null && jVar.c;
    }
}
