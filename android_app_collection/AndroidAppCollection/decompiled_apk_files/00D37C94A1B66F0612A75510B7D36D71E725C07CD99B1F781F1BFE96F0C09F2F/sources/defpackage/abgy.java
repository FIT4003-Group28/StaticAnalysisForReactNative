package defpackage;
/* compiled from: PG */
/* renamed from: abgy  reason: default package */
/* loaded from: classes.dex */
public final class abgy implements tct {
    public final aaxo a;
    public final aafo b;
    private final afvn c;

    public abgy(aaxo aaxoVar, afvn afvnVar, aafo aafoVar) {
        aaxoVar.getClass();
        this.a = aaxoVar;
        afvnVar.getClass();
        this.c = afvnVar;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return avtd.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        avtd avtdVar = (avtd) obj;
        apzg apzgVar = avtdVar.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(avtc.b)) {
            apzg apzgVar2 = avtdVar.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            final avtc avtcVar = (avtc) apzgVar2.qm(avtc.b);
            if ((avtcVar.c & 1) == 0) {
                return aynr.s(new IllegalStateException("command must have kidGaiaId."));
            }
            if (avtcVar.d.size() == 0) {
                return aynr.s(new IllegalStateException("command must have blocklist content. "));
            }
            aaxo aaxoVar = this.a;
            final aaxn aaxnVar = new aaxn(aaxoVar.e, this.c.c());
            aaxnVar.a = avtcVar.d;
            aaxnVar.b = avtcVar.e;
            apzg apzgVar3 = avtdVar.c;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aaxnVar.j(apzgVar3.c);
            return aynr.j(new aynt() { // from class: abgw
                @Override // defpackage.aynt
                public final void a(aysm aysmVar) {
                    abgy abgyVar = abgy.this;
                    aaxn aaxnVar2 = aaxnVar;
                    avtc avtcVar2 = avtcVar;
                    aaxo aaxoVar2 = abgyVar.a;
                    aaxoVar2.a.e(aaxnVar2, new abgx(abgyVar, avtcVar2, aysmVar));
                }
            });
        }
        return aynr.s(new IllegalStateException("command must have UpdateKidsBlacklistEndpoint extension."));
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
