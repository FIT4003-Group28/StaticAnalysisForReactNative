package defpackage;
/* compiled from: PG */
/* renamed from: abcv  reason: default package */
/* loaded from: classes.dex */
public final class abcv extends aaqs {
    public String a;
    public String b;
    public String c;
    public ascj d;

    public abcv(aaqf aaqfVar, afvm afvmVar) {
        super("sfv/search", aaqfVar, afvmVar, 3);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asby.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asby asbyVar = (asby) createBuilder.instance;
            asbyVar.b |= 2;
            asbyVar.d = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar2 = (asby) createBuilder.instance;
            asbyVar2.b |= 8;
            asbyVar2.f = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar3 = (asby) createBuilder.instance;
            asbyVar3.b |= 4;
            asbyVar3.e = str3;
        }
        ascj ascjVar = this.d;
        if (ascjVar != null) {
            createBuilder.copyOnWrite();
            asby asbyVar4 = (asby) createBuilder.instance;
            asbyVar4.j = ascjVar;
            asbyVar4.b |= 1024;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("query", this.a);
        e.c("continuation", this.b);
        return "NO_CACHE_KEY_VALUE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        r(this.a, this.b);
    }
}
