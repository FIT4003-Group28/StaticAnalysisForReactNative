package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: adl  reason: default package */
/* loaded from: classes.dex */
public final class adl implements Runnable {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public adl(adm admVar, int i) {
        this.b = i;
        this.a = new WeakReference(admVar);
    }

    public adl(ady adyVar) {
        this.a = new WeakReference(adyVar);
    }

    public adl(ady adyVar, int i) {
        this.b = i;
        this.a = new WeakReference(adyVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            if (this.a.get() == null) {
                return;
            }
            ((ady) this.a.get()).l = false;
        } else if (i == 1) {
            if (this.a.get() == null) {
                return;
            }
            ((adm) this.a.get()).q();
        } else if (this.a.get() == null) {
        } else {
            ((ady) this.a.get()).m = false;
        }
    }
}
