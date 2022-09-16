package defpackage;
/* compiled from: PG */
/* renamed from: aatv  reason: default package */
/* loaded from: classes.dex */
public final class aatv extends aaqs {
    public String a;
    private final afvn b;

    public aatv(aaqf aaqfVar, afvn afvnVar) {
        super("channel/edit_description", aaqfVar, afvnVar.c());
        this.b = afvnVar;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armf.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armf armfVar = (armf) createBuilder.instance;
        str.getClass();
        armfVar.b |= 2;
        armfVar.d = str;
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.b.t());
        this.a.getClass();
    }
}
