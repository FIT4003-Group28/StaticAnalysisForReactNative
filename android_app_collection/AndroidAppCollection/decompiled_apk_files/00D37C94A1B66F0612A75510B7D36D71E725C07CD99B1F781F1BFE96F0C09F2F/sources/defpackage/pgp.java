package defpackage;
/* compiled from: PG */
/* renamed from: pgp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pgp implements Runnable {
    public final /* synthetic */ pha a;
    private final /* synthetic */ int b;

    public /* synthetic */ pgp(pha phaVar, int i) {
        this.b = i;
        this.a = phaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.c();
        } else {
            this.a.a();
        }
    }
}
