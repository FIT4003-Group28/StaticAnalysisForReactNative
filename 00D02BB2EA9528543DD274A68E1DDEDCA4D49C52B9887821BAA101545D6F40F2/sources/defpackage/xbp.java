package defpackage;
/* compiled from: PG */
/* renamed from: xbp  reason: default package */
/* loaded from: classes7.dex */
public final class xbp {
    public final akty a;
    public final xbr b;
    public final xbe c;
    @dzsi
    public aktc d;

    public xbp(akox akoxVar, xbr xbrVar, xbe xbeVar) {
        this.a = akoxVar.aj().aC();
        this.b = xbrVar;
        this.c = xbeVar;
    }

    public final void a(amrg amrgVar) {
        aktc aktcVar = this.d;
        if (aktcVar != null) {
            amrgVar.a(aktcVar);
            this.a.e(this.d);
            this.d = null;
        }
    }
}
