package defpackage;
/* compiled from: PG */
/* renamed from: bee  reason: default package */
/* loaded from: classes3.dex */
final class bee implements Runnable {
    private final bef a;

    public bee(bef befVar) {
        this.a = befVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        bef befVar = this.a;
        bbz.e().a(new Throwable[0]);
        befVar.e();
        synchronized (befVar.f) {
            if (befVar.g != null) {
                bbz.e().a(new Throwable[0]);
                if (befVar.f.remove(0).equals(befVar.g)) {
                    befVar.g = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            bhi bhiVar = befVar.i.a;
            bdw bdwVar = befVar.e;
            synchronized (bdwVar.c) {
                z = !bdwVar.b.isEmpty();
            }
            if (!z && befVar.f.isEmpty()) {
                synchronized (bhiVar.b) {
                    z2 = !bhiVar.a.isEmpty();
                }
                if (!z2) {
                    bbz.e().a(new Throwable[0]);
                    bed bedVar = befVar.h;
                    if (bedVar != null) {
                        bedVar.a();
                    }
                }
            }
            if (!befVar.f.isEmpty()) {
                befVar.d();
            }
        }
    }
}
