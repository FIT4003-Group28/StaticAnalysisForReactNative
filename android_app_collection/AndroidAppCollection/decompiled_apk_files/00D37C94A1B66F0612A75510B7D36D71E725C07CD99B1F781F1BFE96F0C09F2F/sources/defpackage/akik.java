package defpackage;
/* compiled from: PG */
/* renamed from: akik  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akik implements Runnable {
    public final /* synthetic */ akin a;
    private final /* synthetic */ int b;

    public /* synthetic */ akik(akin akinVar) {
        this.a = akinVar;
    }

    public /* synthetic */ akik(akin akinVar, int i) {
        this.b = i;
        this.a = akinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.d.b();
        } else {
            this.a.a.e.a();
        }
    }
}
