package defpackage;
/* compiled from: PG */
/* renamed from: abzw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abzw implements Runnable {
    public final /* synthetic */ ackn a;
    private final /* synthetic */ int b;

    public /* synthetic */ abzw(ackn acknVar, int i) {
        this.b = i;
        this.a = acknVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(1, null);
        } else if (i == 1) {
            this.a.a(4, null);
        } else {
            this.a.c.r();
        }
    }
}
