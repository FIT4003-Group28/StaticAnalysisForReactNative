package defpackage;
/* compiled from: PG */
/* renamed from: aayg  reason: default package */
/* loaded from: classes.dex */
public final class aayg extends aaqs {
    public asvk a;
    public String b;
    public int c;

    public aayg(aaqf aaqfVar, afvm afvmVar) {
        super("live/get_broadcast_setup", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arso.a.createBuilder();
        asvk asvkVar = this.a;
        if (asvkVar != null) {
            createBuilder.copyOnWrite();
            arso arsoVar = (arso) createBuilder.instance;
            arsoVar.d = asvkVar;
            arsoVar.b |= 2;
        }
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arso arsoVar2 = (arso) createBuilder.instance;
            arsoVar2.b |= 4;
            arsoVar2.e = str;
        }
        int i = this.c;
        if (i != 0) {
            createBuilder.copyOnWrite();
            arso arsoVar3 = (arso) createBuilder.instance;
            arsoVar3.f = i - 1;
            arsoVar3.b |= 16;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
