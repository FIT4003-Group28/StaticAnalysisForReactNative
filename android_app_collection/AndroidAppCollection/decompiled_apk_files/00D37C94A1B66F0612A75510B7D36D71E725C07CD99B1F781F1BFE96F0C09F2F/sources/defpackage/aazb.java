package defpackage;
/* compiled from: PG */
/* renamed from: aazb  reason: default package */
/* loaded from: classes.dex */
public final class aazb extends aaqs {
    public aoob a;

    public aazb(aaqf aaqfVar, afvm afvmVar) {
        super("live_chat/manage_user", aaqfVar, afvmVar);
        this.a = aoob.b;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arwm.a.createBuilder();
        aoob aoobVar = this.a;
        createBuilder.copyOnWrite();
        arwm arwmVar = (arwm) createBuilder.instance;
        aoobVar.getClass();
        arwmVar.b |= 2;
        arwmVar.d = aoobVar;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
