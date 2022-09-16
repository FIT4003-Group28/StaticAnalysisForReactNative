package defpackage;
/* compiled from: PG */
/* renamed from: fje  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fje implements aypv {
    public final /* synthetic */ fjf a;
    public final /* synthetic */ asvo b;
    public final /* synthetic */ tcs c;
    private final /* synthetic */ int d;

    public /* synthetic */ fje(fjf fjfVar, asvo asvoVar, tcs tcsVar) {
        this.a = fjfVar;
        this.b = asvoVar;
        this.c = tcsVar;
    }

    public /* synthetic */ fje(fjf fjfVar, asvo asvoVar, tcs tcsVar, int i) {
        this.d = i;
        this.a = fjfVar;
        this.b = asvoVar;
        this.c = tcsVar;
    }

    @Override // defpackage.aypv
    public final void a() {
        if (this.d == 0) {
            fjf fjfVar = this.a;
            asvo asvoVar = this.b;
            tcs tcsVar = this.c;
            srw srwVar = fjfVar.a;
            int d = aqvb.d(asvoVar.d);
            srwVar.a(d == 0 ? 1 : d, asvoVar.e, asvoVar.f, asvoVar.h, asvoVar.i, tcsVar);
            return;
        }
        fjf fjfVar2 = this.a;
        asvo asvoVar2 = this.b;
        tcs tcsVar2 = this.c;
        srw srwVar2 = fjfVar2.a;
        int d2 = aqvb.d(asvoVar2.d);
        srwVar2.a(d2 == 0 ? 1 : d2, asvoVar2.e, asvoVar2.f, asvoVar2.h, asvoVar2.i, tcsVar2);
    }
}
