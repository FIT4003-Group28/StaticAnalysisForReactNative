package defpackage;
/* compiled from: PG */
/* renamed from: abcl  reason: default package */
/* loaded from: classes.dex */
public final class abcl extends aaqs {
    private final String a;
    private final yrj b;
    private final ywa c;

    public abcl(aaqf aaqfVar, afvm afvmVar, String str, yrj yrjVar, ywa ywaVar) {
        super("account/get_setting", aaqfVar, afvmVar);
        i();
        this.a = str;
        this.b = yrjVar;
        this.c = ywaVar;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asco.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asco ascoVar = (asco) createBuilder.instance;
            ascoVar.b |= 2;
            ascoVar.d = str;
        }
        aopa createBuilder2 = ascn.a.createBuilder();
        boolean n = this.b.n();
        createBuilder2.copyOnWrite();
        ascn ascnVar = (ascn) createBuilder2.instance;
        ascnVar.b |= 1;
        ascnVar.c = n;
        boolean l = this.c.l();
        createBuilder2.copyOnWrite();
        ascn ascnVar2 = (ascn) createBuilder2.instance;
        ascnVar2.b |= 2;
        ascnVar2.d = l;
        createBuilder.copyOnWrite();
        asco ascoVar2 = (asco) createBuilder.instance;
        ascn ascnVar3 = (ascn) createBuilder2.mo39build();
        ascnVar3.getClass();
        ascoVar2.e = ascnVar3;
        ascoVar2.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
