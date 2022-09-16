package defpackage;
/* compiled from: PG */
/* renamed from: jvf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jvf implements Runnable {
    public final /* synthetic */ jvk a;
    private final /* synthetic */ int b;

    public /* synthetic */ jvf(jvk jvkVar, int i) {
        this.b = i;
        this.a = jvkVar;
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
