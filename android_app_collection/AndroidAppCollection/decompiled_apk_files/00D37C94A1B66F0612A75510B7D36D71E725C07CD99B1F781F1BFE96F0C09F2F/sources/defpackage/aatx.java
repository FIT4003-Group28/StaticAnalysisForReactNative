package defpackage;
/* compiled from: PG */
/* renamed from: aatx  reason: default package */
/* loaded from: classes.dex */
public final class aatx extends aaqs {
    public String a;
    public String b;
    private final afvn c;

    public aatx(aaqf aaqfVar, afvn afvnVar) {
        super("channel/edit_name", aaqfVar, afvnVar.c());
        this.c = afvnVar;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arml.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arml armlVar = (arml) createBuilder.instance;
        str.getClass();
        armlVar.b |= 2;
        armlVar.d = str;
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arml armlVar2 = (arml) createBuilder.instance;
            armlVar2.b |= 4;
            armlVar2.e = str2;
        }
        return createBuilder;
    }

    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.c.t());
    }
}
