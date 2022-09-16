package defpackage;
/* compiled from: PG */
/* renamed from: aasy  reason: default package */
/* loaded from: classes.dex */
public final class aasy extends aaqs {
    public String a;
    public String b;

    public aasy(aaqf aaqfVar, afvm afvmVar, String str, boolean z) {
        super("att/log", aaqfVar, afvmVar, 1, false, str, Boolean.valueOf(z));
        this.a = "";
        this.b = "";
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arwi.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arwi arwiVar = (arwi) createBuilder.instance;
        str.getClass();
        arwiVar.b |= 2;
        arwiVar.f = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arwi arwiVar2 = (arwi) createBuilder.instance;
        str2.getClass();
        arwiVar2.c = 4;
        arwiVar2.d = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!(this.a.isEmpty() || this.b.isEmpty()));
    }
}
