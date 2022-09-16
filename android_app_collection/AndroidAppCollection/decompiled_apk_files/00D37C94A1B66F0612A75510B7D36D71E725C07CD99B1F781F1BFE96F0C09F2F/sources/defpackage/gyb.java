package defpackage;
/* compiled from: PG */
/* renamed from: gyb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gyb implements Runnable {
    public final /* synthetic */ gyg a;
    private final /* synthetic */ int b;

    public /* synthetic */ gyb(gyg gygVar) {
        this.a = gygVar;
    }

    public /* synthetic */ gyb(gyg gygVar, int i) {
        this.b = i;
        this.a = gygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.m();
        } else {
            this.a.o.i(0);
        }
    }
}
