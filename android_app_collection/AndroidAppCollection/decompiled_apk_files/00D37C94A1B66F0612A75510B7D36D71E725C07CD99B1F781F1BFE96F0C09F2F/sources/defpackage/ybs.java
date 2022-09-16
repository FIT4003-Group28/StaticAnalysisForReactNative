package defpackage;
/* compiled from: PG */
/* renamed from: ybs  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ybs implements Runnable {
    public final /* synthetic */ ybu a;
    private final /* synthetic */ int b;

    public /* synthetic */ ybs(ybu ybuVar, int i) {
        this.b = i;
        this.a = ybuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ybu ybuVar = this.a;
            if (!ybuVar.af) {
                return;
            }
            ybuVar.dismiss();
            return;
        }
        ybu ybuVar2 = this.a;
        ybuVar2.dismiss();
        ybm ybmVar = ybuVar2.ae;
        if (ybmVar == null) {
            return;
        }
        ybmVar.b();
    }
}
