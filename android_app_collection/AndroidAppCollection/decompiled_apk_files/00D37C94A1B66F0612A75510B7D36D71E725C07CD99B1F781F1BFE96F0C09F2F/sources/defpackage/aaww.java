package defpackage;
/* compiled from: PG */
/* renamed from: aaww  reason: default package */
/* loaded from: classes.dex */
public class aaww extends aaqs {
    public String a;
    public String b;
    public int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaww(aaqf aaqfVar, afvm afvmVar) {
        super("player/heartbeat", aaqfVar, afvmVar);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public void c() {
        zgh.m(this.k);
        zgh.m(this.a);
        zgh.m(this.b);
        aqxo.y(this.c >= 0);
    }

    public void t(String str) {
        this.a = str;
    }

    @Override // defpackage.aaqs
    /* renamed from: u */
    public aopa a() {
        aopa createBuilder = arze.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arze arzeVar = (arze) createBuilder.instance;
        str.getClass();
        arzeVar.b |= 2;
        arzeVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arze arzeVar2 = (arze) createBuilder.instance;
        str2.getClass();
        arzeVar2.b |= 4;
        arzeVar2.e = str2;
        int i = this.c;
        createBuilder.copyOnWrite();
        arze arzeVar3 = (arze) createBuilder.instance;
        arzeVar3.b |= 32;
        arzeVar3.g = i;
        return createBuilder;
    }
}
