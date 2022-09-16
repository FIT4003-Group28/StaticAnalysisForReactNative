package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bsh  reason: default package */
/* loaded from: classes2.dex */
final class bsh implements Runnable {
    private final bsi a;

    public bsh(bsi bsiVar) {
        this.a = bsiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        bsi bsiVar = this.a;
        bqf.a().d(new Throwable[0]);
        bsiVar.b();
        synchronized (bsiVar.g) {
            if (bsiVar.h != null) {
                bqf a = bqf.a();
                String.format("Removing command %s", bsiVar.h);
                a.d(new Throwable[0]);
                if (((Intent) bsiVar.g.remove(0)).equals(bsiVar.h)) {
                    bsiVar.h = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            bvm bvmVar = bsiVar.j.a;
            brz brzVar = bsiVar.f;
            synchronized (brzVar.d) {
                z = !brzVar.c.isEmpty();
            }
            if (!z && bsiVar.g.isEmpty()) {
                synchronized (bvmVar.b) {
                    z2 = !bvmVar.a.isEmpty();
                }
                if (!z2) {
                    bqf.a().d(new Throwable[0]);
                    bsg bsgVar = bsiVar.i;
                    if (bsgVar != null) {
                        bsgVar.a();
                    }
                }
            }
            if (!bsiVar.g.isEmpty()) {
                bsiVar.e();
            }
        }
    }
}
