package defpackage;
/* compiled from: PG */
/* renamed from: aask  reason: default package */
/* loaded from: classes.dex */
public final class aask extends aaqs {
    public asbk a;
    public String b;
    public String c;

    public aask(aaqf aaqfVar, afvm afvmVar) {
        super("account/request_verification_code", aaqfVar, afvmVar);
        this.i = true;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asbm.a.createBuilder();
        asbk asbkVar = this.a;
        createBuilder.copyOnWrite();
        asbm asbmVar = (asbm) createBuilder.instance;
        asbmVar.d = asbkVar.d;
        asbmVar.b |= 2;
        String str = this.b;
        createBuilder.copyOnWrite();
        asbm asbmVar2 = (asbm) createBuilder.instance;
        str.getClass();
        asbmVar2.b |= 4;
        asbmVar2.e = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        asbm asbmVar3 = (asbm) createBuilder.instance;
        str2.getClass();
        asbmVar3.b |= 8;
        asbmVar3.f = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        zgh.m(this.b);
        zgh.m(this.c);
    }
}
