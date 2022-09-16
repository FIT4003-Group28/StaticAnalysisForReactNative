package defpackage;
/* compiled from: PG */
/* renamed from: ahtr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahtr implements Runnable {
    public final /* synthetic */ ahtv a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahtr(ahtv ahtvVar, int i) {
        this.b = i;
        this.a = ahtvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.J();
        } else {
            this.a.C();
        }
    }
}
