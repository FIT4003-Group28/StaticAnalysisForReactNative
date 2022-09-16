package defpackage;
/* compiled from: PG */
/* renamed from: abdd  reason: default package */
/* loaded from: classes.dex */
final class abdd extends aaqs {
    final String a;

    public abdd(abde abdeVar, String str, byte[] bArr) {
        super("get_user_mention_suggestions", abdeVar.e, abdeVar.c.c());
        k(bArr);
        this.a = str;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asft.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asft asftVar = (asft) createBuilder.instance;
        asftVar.b |= 2;
        asftVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
