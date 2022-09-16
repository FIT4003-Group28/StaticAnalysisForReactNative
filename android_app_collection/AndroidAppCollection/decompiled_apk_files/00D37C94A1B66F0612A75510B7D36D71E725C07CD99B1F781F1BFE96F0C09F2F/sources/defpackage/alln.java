package defpackage;
/* compiled from: PG */
/* renamed from: alln  reason: default package */
/* loaded from: classes.dex */
final class alln implements Runnable {
    final /* synthetic */ allq a;
    private final /* synthetic */ int b;

    public alln(allq allqVar) {
        this.a = allqVar;
    }

    public alln(allq allqVar, int i) {
        this.b = i;
        this.a = allqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            allq allqVar = this.a;
            ((almc) allqVar.getCurrentDrawable()).h(false, false, true);
            if ((allqVar.getProgressDrawable() == null || !allqVar.getProgressDrawable().isVisible()) && (allqVar.getIndeterminateDrawable() == null || !allqVar.getIndeterminateDrawable().isVisible())) {
                allqVar.setVisibility(4);
            }
            this.a.e = -1L;
            return;
        }
        this.a.e();
    }
}
