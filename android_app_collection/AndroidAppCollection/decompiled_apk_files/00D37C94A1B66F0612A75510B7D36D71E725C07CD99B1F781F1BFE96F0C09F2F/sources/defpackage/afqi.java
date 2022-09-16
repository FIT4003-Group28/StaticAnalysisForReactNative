package defpackage;
/* compiled from: PG */
/* renamed from: afqi  reason: default package */
/* loaded from: classes.dex */
final class afqi extends aaqs {
    final String a;

    public afqi(afqj afqjVar, String str, byte[] bArr) {
        super("get_user_mention_suggestions", afqjVar.e, afqjVar.c.c());
        k(bArr);
        this.a = str;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asft.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asft asftVar = (asft) createBuilder.instance;
        str.getClass();
        asftVar.b |= 2;
        asftVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
