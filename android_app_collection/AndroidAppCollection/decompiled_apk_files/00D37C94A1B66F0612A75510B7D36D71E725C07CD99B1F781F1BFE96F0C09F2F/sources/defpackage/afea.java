package defpackage;
/* compiled from: PG */
/* renamed from: afea  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afea implements Runnable {
    public final /* synthetic */ afeh a;
    private final /* synthetic */ int b;

    public /* synthetic */ afea(afeh afehVar, int i) {
        this.b = i;
        this.a = afehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.A();
        } else if (i == 1) {
            this.a.H(false);
        } else {
            this.a.A();
        }
    }
}
