package defpackage;
/* compiled from: PG */
/* renamed from: adot  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adot implements Runnable {
    public final /* synthetic */ adoz a;
    private final /* synthetic */ int b;

    public /* synthetic */ adot(adoz adozVar) {
        this.a = adozVar;
    }

    public /* synthetic */ adot(adoz adozVar, int i) {
        this.b = i;
        this.a = adozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            adoz.ap(this.a);
        } else {
            adoz.ao(this.a);
        }
    }
}
