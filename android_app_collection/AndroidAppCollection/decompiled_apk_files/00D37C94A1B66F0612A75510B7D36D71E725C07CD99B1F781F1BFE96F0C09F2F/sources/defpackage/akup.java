package defpackage;
/* compiled from: PG */
/* renamed from: akup  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akup implements Runnable {
    public final /* synthetic */ akus a;
    private final /* synthetic */ int b;

    public /* synthetic */ akup(akus akusVar, int i) {
        this.b = i;
        this.a = akusVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.d();
        } else {
            this.a.e();
        }
    }
}
