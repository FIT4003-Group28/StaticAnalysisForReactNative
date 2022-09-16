package defpackage;
/* compiled from: PG */
/* renamed from: acaw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acaw implements Runnable {
    public final /* synthetic */ abzm a;
    private final /* synthetic */ int b;

    public /* synthetic */ acaw(abzm abzmVar, int i) {
        this.b = i;
        this.a = abzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.k();
        } else {
            this.a.j();
        }
    }
}
