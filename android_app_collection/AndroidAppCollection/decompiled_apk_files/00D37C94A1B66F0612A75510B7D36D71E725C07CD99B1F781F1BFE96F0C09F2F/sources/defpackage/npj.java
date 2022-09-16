package defpackage;
/* compiled from: PG */
/* renamed from: npj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class npj implements ayqb {
    public final /* synthetic */ npm a;
    private final /* synthetic */ int b;

    public /* synthetic */ npj(npm npmVar) {
        this.a = npmVar;
    }

    public /* synthetic */ npj(npm npmVar, int i) {
        this.b = i;
        this.a = npmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            npm npmVar = this.a;
            npmVar.t = ((Integer) obj).intValue();
            npmVar.n();
            return;
        }
        npm npmVar2 = this.a;
        audg audgVar = (audg) obj;
        npmVar2.s = audgVar;
        npmVar2.n();
        npmVar2.j.c(abgc.b(audgVar));
        if (!npmVar2.q) {
            return;
        }
        npmVar2.i();
    }
}
