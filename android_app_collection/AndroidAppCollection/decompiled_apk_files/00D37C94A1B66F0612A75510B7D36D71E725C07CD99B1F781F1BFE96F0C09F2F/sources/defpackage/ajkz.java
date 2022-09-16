package defpackage;
/* compiled from: PG */
/* renamed from: ajkz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajkz implements Runnable {
    public final /* synthetic */ ajmy a;
    public final /* synthetic */ avhm b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    private final /* synthetic */ int e;

    public /* synthetic */ ajkz(ajmy ajmyVar, avhm avhmVar, int i, int i2) {
        this.a = ajmyVar;
        this.b = avhmVar;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ajkz(ajmy ajmyVar, avhm avhmVar, int i, int i2, int i3) {
        this.e = i3;
        this.a = ajmyVar;
        this.b = avhmVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            ajmy ajmyVar = this.a;
            avhm avhmVar = this.b;
            int i = this.c;
            int i2 = this.d;
            aopc aopcVar = (aopc) avhn.a.createBuilder();
            aopcVar.cp(avhmVar);
            ajmyVar.n((avhn) aopcVar.mo39build(), i, i2);
            return;
        }
        ajmy ajmyVar2 = this.a;
        avhm avhmVar2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        aopc aopcVar2 = (aopc) avhn.a.createBuilder();
        aopcVar2.cp(avhmVar2);
        ajmyVar2.n((avhn) aopcVar2.mo39build(), i3, i4);
    }
}
