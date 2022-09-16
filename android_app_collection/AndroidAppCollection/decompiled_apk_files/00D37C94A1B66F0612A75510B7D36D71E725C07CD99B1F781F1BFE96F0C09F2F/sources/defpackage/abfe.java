package defpackage;
/* compiled from: PG */
/* renamed from: abfe  reason: default package */
/* loaded from: classes.dex */
public final class abfe extends aaqs {
    public String a;
    public String b;
    public String c;
    public int d;

    public abfe(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/update_cross_device_offline_state", aaqfVar, afvmVar);
        this.a = "";
        this.d = 1;
        this.b = "";
        this.c = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aseq aseqVar = (aseq) a().mo39build();
        zgh.m(aseqVar.d);
        zgh.m(aseqVar.f);
        int M = awwc.M(aseqVar.e);
        boolean z = false;
        if (M != 0 && M != 1) {
            z = true;
        }
        aqxo.y(z);
        zgh.m(aseqVar.g);
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = aseq.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aseq aseqVar = (aseq) createBuilder.instance;
        str.getClass();
        aseqVar.b |= 2;
        aseqVar.d = str;
        int i = this.d;
        createBuilder.copyOnWrite();
        aseq aseqVar2 = (aseq) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            aseqVar2.e = i2;
            aseqVar2.b |= 4;
            String str2 = this.b;
            createBuilder.copyOnWrite();
            aseq aseqVar3 = (aseq) createBuilder.instance;
            str2.getClass();
            aseqVar3.b |= 8;
            aseqVar3.f = str2;
            String str3 = this.c;
            createBuilder.copyOnWrite();
            aseq aseqVar4 = (aseq) createBuilder.instance;
            str3.getClass();
            aseqVar4.b |= 16;
            aseqVar4.g = str3;
            return createBuilder;
        }
        throw null;
    }
}
