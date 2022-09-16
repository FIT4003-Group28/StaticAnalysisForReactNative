package defpackage;
/* compiled from: PG */
/* renamed from: abax  reason: default package */
/* loaded from: classes.dex */
public final class abax extends aaqs {
    public String a;

    public abax(aaqf aaqfVar, afvm afvmVar) {
        super("playlist/get_suggested_playlist_videos", aaqfVar, afvmVar);
        this.a = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arug.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arug arugVar = (arug) createBuilder.instance;
        str.getClass();
        arugVar.b |= 2;
        arugVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
