package defpackage;
/* compiled from: PG */
/* renamed from: abuh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abuh implements Runnable {
    public final /* synthetic */ abus a;
    private final /* synthetic */ int b;

    public /* synthetic */ abuh(abus abusVar, int i) {
        this.b = i;
        this.a = abusVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.r(false);
        } else if (i == 1) {
            this.a.r(true);
        } else {
            this.a.t();
        }
    }
}
