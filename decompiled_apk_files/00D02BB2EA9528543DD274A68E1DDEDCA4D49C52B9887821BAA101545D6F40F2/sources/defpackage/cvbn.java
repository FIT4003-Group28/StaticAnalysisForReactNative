package defpackage;
/* renamed from: cvbn  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cvbn implements dbsl {
    static final dbsl a = new cvbn();

    private cvbn() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        cufw cufwVar = (cufw) obj;
        if (cufwVar != null) {
            return cufwVar.d() == null || cufwVar.c() == null || cufwVar.c().longValue() > cufwVar.d().longValue();
        }
        cstl.a("ConvListUiUtils");
        return false;
    }
}
