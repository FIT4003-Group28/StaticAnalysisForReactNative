package defpackage;
/* compiled from: PG */
/* renamed from: aatt  reason: default package */
/* loaded from: classes.dex */
public final class aatt extends aaqs {
    public String a;

    public aatt(aaqf aaqfVar, afvm afvmVar) {
        super("channel/delete_channel_post", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armj.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armj armjVar = (armj) createBuilder.instance;
        str.getClass();
        armjVar.b |= 2;
        armjVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }
}
