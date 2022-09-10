package defpackage;
/* renamed from: bfmk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfmk implements dbsl {
    static final dbsl a = new bfmk();

    private bfmk() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcep<dwci> dcepVar = bfml.a;
        dwci b = dwci.b(((dwca) obj).c);
        if (b == null) {
            b = dwci.UNKNOWN_RELATION_CATEGORY;
        }
        return dcepVar.contains(b);
    }
}
