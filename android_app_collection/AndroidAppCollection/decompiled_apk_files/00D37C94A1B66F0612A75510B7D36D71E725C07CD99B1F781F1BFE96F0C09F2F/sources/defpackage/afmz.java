package defpackage;
/* compiled from: PG */
/* renamed from: afmz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afmz implements Runnable {
    public final /* synthetic */ afna a;
    private final /* synthetic */ int b;

    public /* synthetic */ afmz(afna afnaVar, int i) {
        this.b = i;
        this.a = afnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            afna afnaVar = this.a;
            afnaVar.J(afnaVar.getLeft(), afnaVar.getTop(), afnaVar.getRight(), afnaVar.getBottom());
        } else if (i == 1) {
            this.a.H();
        } else {
            this.a.I();
        }
    }
}
