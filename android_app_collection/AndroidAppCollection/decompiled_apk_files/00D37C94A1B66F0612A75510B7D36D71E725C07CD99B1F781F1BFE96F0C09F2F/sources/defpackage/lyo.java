package defpackage;
/* compiled from: PG */
/* renamed from: lyo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyo implements ampg {
    public final /* synthetic */ fsx a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ wgy c;
    public final /* synthetic */ wgz d;
    public final /* synthetic */ afvn e;
    public final /* synthetic */ whe f;
    public final /* synthetic */ lgt g;
    public final /* synthetic */ sdb h;
    private final /* synthetic */ int i;

    public /* synthetic */ lyo(fsx fsxVar, dt dtVar, sdb sdbVar, lgt lgtVar, wgy wgyVar, wgz wgzVar, afvn afvnVar, whe wheVar, int i, byte[] bArr) {
        this.i = i;
        this.a = fsxVar;
        this.b = dtVar;
        this.h = sdbVar;
        this.g = lgtVar;
        this.c = wgyVar;
        this.d = wgzVar;
        this.e = afvnVar;
        this.f = wheVar;
    }

    public /* synthetic */ lyo(fsx fsxVar, dt dtVar, sdb sdbVar, lgt lgtVar, wgy wgyVar, wgz wgzVar, afvn afvnVar, whe wheVar, byte[] bArr) {
        this.a = fsxVar;
        this.b = dtVar;
        this.h = sdbVar;
        this.g = lgtVar;
        this.c = wgyVar;
        this.d = wgzVar;
        this.e = afvnVar;
        this.f = wheVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.i == 0) {
            fsx fsxVar = this.a;
            dt dtVar = this.b;
            sdb sdbVar = this.h;
            lgt lgtVar = this.g;
            wgy wgyVar = this.c;
            wgz wgzVar = this.d;
            afvn afvnVar = this.e;
            whe wheVar = this.f;
            amvl amvlVar = (amvl) obj;
            amvlVar.j(fsxVar.a.c);
            amvlVar.c(new lhs(dtVar, sdbVar, lgtVar, wgyVar, wgzVar, afvnVar, wheVar, null));
            amvlVar.c(new lvf(dtVar));
            return amvlVar;
        }
        frz frzVar = (frz) obj;
        frzVar.e(new lyo(this.a, this.b, this.h, this.g, this.c, this.d, this.e, this.f, null));
        return frzVar;
    }
}
