package defpackage;
/* compiled from: PG */
/* renamed from: abcz  reason: default package */
/* loaded from: classes.dex */
public final class abcz extends aaqs {
    public String a;
    public String b;

    public abcz(aaqf aaqfVar, afvm afvmVar) {
        super("shorts/get_shorts_source_video", aaqfVar, afvmVar, 3);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arud.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arud arudVar = (arud) createBuilder.instance;
        str.getClass();
        arudVar.b |= 2;
        arudVar.d = str;
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arud arudVar2 = (arud) createBuilder.instance;
            arudVar2.b |= 4;
            arudVar2.e = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
