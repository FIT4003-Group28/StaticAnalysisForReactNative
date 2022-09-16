package defpackage;
/* compiled from: PG */
/* renamed from: aazy  reason: default package */
/* loaded from: classes.dex */
public final class aazy extends aaqs {
    public String a;

    public aazy(aaqf aaqfVar, afvm afvmVar) {
        super("notification/get_inline_opt_out_menu", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arxt.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arxt arxtVar = (arxt) createBuilder.instance;
        str.getClass();
        arxtVar.b |= 2;
        arxtVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }
}
