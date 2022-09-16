package defpackage;
/* compiled from: PG */
/* renamed from: acjz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acjz implements Runnable {
    public final /* synthetic */ acke a;
    private final /* synthetic */ int b;

    public /* synthetic */ acjz(acke ackeVar, int i) {
        this.b = i;
        this.a = ackeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            acke ackeVar = this.a;
            ackeVar.ar.setVisibility(8);
            ackeVar.aJ = true;
            Runnable runnable = ackeVar.aK;
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        acke ackeVar2 = this.a;
        ackeVar2.at.setMaxLines(ackeVar2.at.getLineCount());
    }
}
