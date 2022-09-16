package defpackage;
/* compiled from: PG */
/* renamed from: aazd  reason: default package */
/* loaded from: classes.dex */
public final class aazd extends aaqs {
    public aoob a;
    public String b;
    public assu c;
    public String d;

    public aazd(aaqf aaqfVar, afvm afvmVar) {
        super("live_chat/send_message", aaqfVar, afvmVar);
        this.a = aoob.b;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ascl.a.createBuilder();
        aoob aoobVar = this.a;
        createBuilder.copyOnWrite();
        ascl asclVar = (ascl) createBuilder.instance;
        aoobVar.getClass();
        asclVar.b |= 2;
        asclVar.f = aoobVar;
        assu assuVar = this.c;
        if (assuVar != null) {
            createBuilder.copyOnWrite();
            ascl asclVar2 = (ascl) createBuilder.instance;
            asclVar2.d = assuVar;
            asclVar2.c = 6;
        } else {
            String str = this.b;
            createBuilder.copyOnWrite();
            ascl asclVar3 = (ascl) createBuilder.instance;
            str.getClass();
            asclVar3.c = 4;
            asclVar3.d = str;
        }
        String str2 = this.d;
        createBuilder.copyOnWrite();
        ascl asclVar4 = (ascl) createBuilder.instance;
        asclVar4.b |= 16;
        asclVar4.g = g(str2);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
