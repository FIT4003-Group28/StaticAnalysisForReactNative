package defpackage;
/* compiled from: PG */
/* renamed from: ccva  reason: default package */
/* loaded from: classes4.dex */
public class ccva extends ccuy<bbtm> {
    public static ccuw j(dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2) {
        if (!dbsgVar.a() || !dbsgVar2.a()) {
            return ccuw.LANDSCAPE;
        }
        if (dbsgVar.b().intValue() > dbsgVar2.b().intValue()) {
            return ccuw.LANDSCAPE;
        }
        return ccuw.PORTRAIT;
    }

    @Override // defpackage.ccuy
    protected final /* bridge */ /* synthetic */ ccuo<bbtm> i(bbtm bbtmVar, int i) {
        return new ccuz(bbtmVar, i, this);
    }
}
