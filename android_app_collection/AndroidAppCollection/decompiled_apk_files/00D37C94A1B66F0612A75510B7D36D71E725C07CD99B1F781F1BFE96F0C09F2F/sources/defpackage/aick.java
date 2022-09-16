package defpackage;
/* compiled from: PG */
/* renamed from: aick  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aick implements Runnable {
    public final /* synthetic */ aicm a;
    private final /* synthetic */ int b;

    public /* synthetic */ aick(aicm aicmVar, int i) {
        this.b = i;
        this.a = aicmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(true);
        } else if (i != 1) {
            this.a.b = false;
        } else {
            this.a.setVisibility(8);
        }
    }
}
