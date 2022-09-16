package defpackage;
/* compiled from: PG */
/* renamed from: afuh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afuh implements Runnable {
    public final /* synthetic */ afui a;
    private final /* synthetic */ int b;

    public /* synthetic */ afuh(afui afuiVar, int i) {
        this.b = i;
        this.a = afuiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.e();
        } else {
            this.a.b.b();
        }
    }
}
