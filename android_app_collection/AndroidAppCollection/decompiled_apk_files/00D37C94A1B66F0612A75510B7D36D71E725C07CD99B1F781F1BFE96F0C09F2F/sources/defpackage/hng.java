package defpackage;
/* compiled from: PG */
/* renamed from: hng  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hng implements Runnable {
    public final /* synthetic */ hni a;
    private final /* synthetic */ int b;

    public /* synthetic */ hng(hni hniVar) {
        this.a = hniVar;
    }

    public /* synthetic */ hng(hni hniVar, int i) {
        this.b = i;
        this.a = hniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            hni hniVar = this.a;
            int i = hnh.a;
            hniVar.w.setEnabled(true);
            hniVar.w.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 2131232531, 0, 0);
            return;
        }
        ((hnu) this.a.p).af.aY();
    }
}
