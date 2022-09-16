package defpackage;
/* compiled from: PG */
/* renamed from: afni  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afni implements Runnable {
    public final /* synthetic */ afnj a;
    private final /* synthetic */ int b;

    public /* synthetic */ afni(afnj afnjVar, int i) {
        this.b = i;
        this.a = afnjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.setKeepScreenOn(false);
        } else {
            this.a.setKeepScreenOn(true);
        }
    }
}
