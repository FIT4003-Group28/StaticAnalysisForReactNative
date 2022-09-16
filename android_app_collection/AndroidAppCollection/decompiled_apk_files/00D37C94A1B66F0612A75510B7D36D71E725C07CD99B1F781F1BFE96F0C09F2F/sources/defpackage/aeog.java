package defpackage;
/* compiled from: PG */
/* renamed from: aeog  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aeog implements Runnable {
    public final /* synthetic */ aeov a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ aeog(aeov aeovVar, float f) {
        this.a = aeovVar;
        this.b = f;
    }

    public /* synthetic */ aeog(aeov aeovVar, float f, int i) {
        this.c = i;
        this.a = aeovVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.E(this.b);
        } else {
            this.a.B(this.b);
        }
    }
}
