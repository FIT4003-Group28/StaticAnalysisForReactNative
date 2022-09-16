package defpackage;
/* compiled from: PG */
/* renamed from: lzn  reason: default package */
/* loaded from: classes7.dex */
public final class lzn extends atoi implements atoq {
    private static final dcqe a = dcqe.c("lzn");
    private static final atxu c = new lzm();
    private final atts b;

    public lzn(atom atomVar, atvp atvpVar, atwl atwlVar, atts attsVar) {
        super(atomVar, atvpVar, atwlVar, null);
        dbsk.s(attsVar);
        this.b = attsVar;
    }

    @Override // defpackage.atoq
    @dzsi
    public final atxz a(crqw crqwVar) {
        return super.c(crqwVar, c);
    }

    @Override // defpackage.atoi
    @dzsi
    protected final atxz b(crqw crqwVar) {
        if (crqwVar instanceof crqb) {
            return this.b.a((crqb) crqwVar);
        }
        bvoo.h("Unknown PromptState type: %s", crqwVar.getClass());
        return null;
    }
}
