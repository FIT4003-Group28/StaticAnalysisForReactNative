package defpackage;
/* compiled from: PG */
/* renamed from: dfq  reason: default package */
/* loaded from: classes6.dex */
public final class dfq {
    public final gga a;
    public final dehq b;
    public final cjqy c;
    public final dfk d;
    @dzsi
    public dehn<?> e;

    public dfq(gga ggaVar, dehq dehqVar, cjqy cjqyVar, dfk dfkVar) {
        this.a = ggaVar;
        this.b = dehqVar;
        this.c = cjqyVar;
        this.d = dfkVar;
    }

    public final void a() {
        dehn<?> dehnVar = this.e;
        if (dehnVar == null) {
            return;
        }
        dehnVar.cancel(false);
        this.e = null;
    }
}
