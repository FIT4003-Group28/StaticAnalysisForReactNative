package defpackage;
/* compiled from: PG */
/* renamed from: aavk  reason: default package */
/* loaded from: classes.dex */
public final class aavk extends aaqs {
    public String a;
    public Long b;
    private String c;

    public aavk(aaqf aaqfVar, afvm afvmVar) {
        super("comment/update_comment", aaqfVar, afvmVar);
        this.a = "";
        this.c = "";
        this.b = null;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arof.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arof arofVar = (arof) createBuilder.instance;
        str.getClass();
        arofVar.b |= 2;
        arofVar.d = str;
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arof arofVar2 = (arof) createBuilder.instance;
            arofVar2.b |= 4;
            arofVar2.e = str2;
        }
        Long l = this.b;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            arof arofVar3 = (arof) createBuilder.instance;
            arofVar3.b |= 8;
            arofVar3.f = longValue;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }

    public final void t(String str, boolean z) {
        if (!z) {
            str = g(str);
        }
        this.c = str;
    }
}
