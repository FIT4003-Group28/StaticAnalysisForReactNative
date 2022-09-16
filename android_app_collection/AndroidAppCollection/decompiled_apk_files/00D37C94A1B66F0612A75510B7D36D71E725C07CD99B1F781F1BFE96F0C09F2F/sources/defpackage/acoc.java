package defpackage;
/* compiled from: PG */
/* renamed from: acoc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acoc implements Runnable {
    public final /* synthetic */ acod a;
    private final /* synthetic */ int b;

    public /* synthetic */ acoc(acod acodVar, int i) {
        this.b = i;
        this.a = acodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            return;
        }
        this.a.release();
    }
}
