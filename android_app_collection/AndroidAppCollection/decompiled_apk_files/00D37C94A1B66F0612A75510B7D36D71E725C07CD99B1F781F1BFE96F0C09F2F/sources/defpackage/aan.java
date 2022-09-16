package defpackage;
/* compiled from: PG */
/* renamed from: aan  reason: default package */
/* loaded from: classes.dex */
final class aan implements Runnable {
    final /* synthetic */ aao a;
    private final /* synthetic */ int b;

    public aan(aao aaoVar) {
        this.a = aaoVar;
    }

    public aan(aao aaoVar, int i) {
        this.b = i;
        this.a = aaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a();
        } else {
            this.a.c(false);
        }
    }
}
