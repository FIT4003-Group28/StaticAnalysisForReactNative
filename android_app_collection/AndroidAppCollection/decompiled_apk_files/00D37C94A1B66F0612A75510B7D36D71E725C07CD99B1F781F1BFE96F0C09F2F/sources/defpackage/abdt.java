package defpackage;
/* compiled from: PG */
/* renamed from: abdt  reason: default package */
/* loaded from: classes.dex */
public final class abdt extends aaqs {
    public String a;

    public abdt(aaqf aaqfVar, afvm afvmVar) {
        super("video/delete", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asga.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asga asgaVar = (asga) createBuilder.instance;
        str.getClass();
        asgaVar.b |= 2;
        asgaVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final boolean n() {
        return false;
    }
}
