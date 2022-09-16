package defpackage;
/* compiled from: PG */
/* renamed from: abes  reason: default package */
/* loaded from: classes.dex */
public final class abes extends aaqs {
    public byte[] a;
    public String b;
    public boolean c;

    public abes(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/log_payment_server_analytics", aaqfVar, afvmVar);
        this.a = abff.a;
        this.b = "";
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arwk.a.createBuilder();
        aoob x = aoob.x(this.a);
        createBuilder.copyOnWrite();
        arwk arwkVar = (arwk) createBuilder.instance;
        arwkVar.b |= 2;
        arwkVar.d = x;
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arwk arwkVar2 = (arwk) createBuilder.instance;
            arwkVar2.b |= 4;
            arwkVar2.e = str;
        }
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arwk arwkVar3 = (arwk) createBuilder.instance;
        arwkVar3.b |= 8;
        arwkVar3.f = z;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
