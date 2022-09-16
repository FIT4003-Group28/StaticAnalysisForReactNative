package defpackage;
/* compiled from: PG */
/* renamed from: hdj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdj implements Runnable {
    public final /* synthetic */ hdl a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdj(hdl hdlVar, int i) {
        this.b = i;
        this.a = hdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.b.setVisibility(8);
        } else if (i == 1) {
            this.a.c.setVisibility(0);
        } else if (i == 2) {
            this.a.b.setVisibility(0);
        } else if (i == 3) {
            this.a.c.setVisibility(8);
        } else if (i == 4) {
            this.a.c.setVisibility(8);
        } else {
            this.a.b.setVisibility(8);
        }
    }
}
