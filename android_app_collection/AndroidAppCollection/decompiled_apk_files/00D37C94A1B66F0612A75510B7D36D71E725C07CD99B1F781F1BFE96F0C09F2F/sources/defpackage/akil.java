package defpackage;
/* compiled from: PG */
/* renamed from: akil  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akil implements Runnable {
    public final /* synthetic */ akin a;
    public final /* synthetic */ amnl b;
    private final /* synthetic */ int c;

    public /* synthetic */ akil(akin akinVar, amnl amnlVar) {
        this.a = akinVar;
        this.b = amnlVar;
    }

    public /* synthetic */ akil(akin akinVar, amnl amnlVar, int i) {
        this.c = i;
        this.a = akinVar;
        this.b = amnlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            akin akinVar = this.a;
            amnl amnlVar = this.b;
            akio akioVar = akinVar.a.e;
            amnv amnvVar = amnlVar.e;
            if (amnvVar == null) {
                amnvVar = amnv.a;
            }
            akioVar.c(amnvVar.b);
        } else if (i == 1) {
            this.a.a.d.d(this.b.d);
        } else {
            akin akinVar2 = this.a;
            amnl amnlVar2 = this.b;
            akio akioVar2 = akinVar2.a.e;
            if (amnlVar2.c == null) {
                amnn amnnVar = amnn.a;
            }
            akioVar2.d();
        }
    }
}
