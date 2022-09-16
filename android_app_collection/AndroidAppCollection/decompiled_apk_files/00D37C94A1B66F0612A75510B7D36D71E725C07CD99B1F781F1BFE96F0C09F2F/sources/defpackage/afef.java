package defpackage;
/* compiled from: PG */
/* renamed from: afef  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afef implements Runnable {
    public final /* synthetic */ afeg a;
    private final /* synthetic */ int b;

    public /* synthetic */ afef(afeg afegVar, int i) {
        this.b = i;
        this.a = afegVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a.H(false);
        } else if (i == 1) {
            this.a.a.H(true);
        } else {
            this.a.a.H(false);
        }
    }
}
