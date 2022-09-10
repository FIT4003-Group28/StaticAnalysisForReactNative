package defpackage;
/* compiled from: PG */
/* renamed from: atok  reason: default package */
/* loaded from: classes2.dex */
public final class atok extends atoi implements atoq {
    private static final dcqe a = dcqe.c("atok");
    private static final atxu b = atoj.a;
    private final atts c;

    public atok(atom atomVar, atvp atvpVar, atwl atwlVar, atts attsVar, attz attzVar) {
        super(atomVar, atvpVar, atwlVar, attzVar);
        dbsk.s(attsVar);
        this.c = attsVar;
    }

    @Override // defpackage.atoq
    @dzsi
    public final atxz a(crqw crqwVar) {
        return super.c(crqwVar, b);
    }

    @Override // defpackage.atoi
    @dzsi
    protected final atxz b(crqw crqwVar) {
        if (crqwVar instanceof crqb) {
            return this.c.a((crqb) crqwVar);
        }
        bvoo.h("Unknown PromptState type: %s", crqwVar.getClass());
        return null;
    }
}
