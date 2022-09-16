package defpackage;
/* compiled from: PG */
/* renamed from: kyw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kyw implements Runnable {
    public final /* synthetic */ kyx a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ajql c;
    private final /* synthetic */ int d;

    public /* synthetic */ kyw(kyx kyxVar, int i, ajql ajqlVar) {
        this.a = kyxVar;
        this.b = i;
        this.c = ajqlVar;
    }

    public /* synthetic */ kyw(kyx kyxVar, int i, ajql ajqlVar, int i2) {
        this.d = i2;
        this.a = kyxVar;
        this.b = i;
        this.c = ajqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            kyx kyxVar = this.a;
            int i = this.b;
            ajql ajqlVar = this.c;
            yo i2 = kyxVar.a.e.i(Math.max(i - 1, 0));
            if (i2 != null) {
                i2.a.sendAccessibilityEvent(8);
            }
            kyxVar.a.f.r().pl(ajqlVar);
            return;
        }
        kyx kyxVar2 = this.a;
        int i3 = this.b;
        ajql ajqlVar2 = this.c;
        yo i4 = kyxVar2.a.e.i(i3);
        if (i4 != null) {
            i4.a.sendAccessibilityEvent(8);
        }
        kyxVar2.a.f.r().pl(ajqlVar2);
    }
}
