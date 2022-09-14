package defpackage;
/* renamed from: axjn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axjn implements dbsl {
    static final dbsl a = new axjn();

    private axjn() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        return afgaVar.a().endsWith("FollowerListActivity") && afgaVar.a.hasExtra("obfuscatedGaiaId");
    }
}
