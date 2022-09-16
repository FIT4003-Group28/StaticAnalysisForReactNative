package defpackage;
/* compiled from: PG */
/* renamed from: aatq  reason: default package */
/* loaded from: classes.dex */
public final class aatq extends aaqs {
    public aoob a;
    public String b;
    public String c;
    public int d;
    public int s;
    public int t;
    public String u;
    public awle v;

    public aatq(aaqf aaqfVar, afvm afvmVar) {
        super("channel/create_channel", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armq.a.createBuilder();
        aoob aoobVar = this.a;
        createBuilder.copyOnWrite();
        armq armqVar = (armq) createBuilder.instance;
        aoobVar.getClass();
        armqVar.b |= 2;
        armqVar.d = aoobVar;
        String str = this.b;
        createBuilder.copyOnWrite();
        armq armqVar2 = (armq) createBuilder.instance;
        armqVar2.b |= 8;
        armqVar2.e = g(str);
        String str2 = this.c;
        createBuilder.copyOnWrite();
        armq armqVar3 = (armq) createBuilder.instance;
        armqVar3.b |= 16;
        armqVar3.f = g(str2);
        String str3 = this.u;
        createBuilder.copyOnWrite();
        armq armqVar4 = (armq) createBuilder.instance;
        armqVar4.b |= 256;
        armqVar4.j = g(str3);
        int i = this.d;
        createBuilder.copyOnWrite();
        armq armqVar5 = (armq) createBuilder.instance;
        armqVar5.b |= 32;
        armqVar5.g = i;
        int i2 = this.s;
        createBuilder.copyOnWrite();
        armq armqVar6 = (armq) createBuilder.instance;
        armqVar6.b |= 64;
        armqVar6.h = i2;
        int i3 = this.t;
        createBuilder.copyOnWrite();
        armq armqVar7 = (armq) createBuilder.instance;
        armqVar7.b |= 128;
        armqVar7.i = i3;
        awle awleVar = this.v;
        if (awleVar != null) {
            createBuilder.copyOnWrite();
            armq armqVar8 = (armq) createBuilder.instance;
            armqVar8.k = awleVar;
            armqVar8.b |= 512;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
