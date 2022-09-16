package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
/* compiled from: PG */
/* renamed from: abel  reason: default package */
/* loaded from: classes.dex */
public final class abel extends aaqs {
    public String a;
    private String b;

    public abel(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_offers", aaqfVar, afvmVar);
        this.b = "";
        this.a = "";
        q(3);
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("itemParams", this.b);
        String str = this.a;
        if (str != null) {
            e.c("couponCode", str);
        }
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(((ashq) a().mo39build()).d);
    }

    public final void t(YpcOffersEndpoint$YPCOffersEndpoint ypcOffersEndpoint$YPCOffersEndpoint) {
        ypcOffersEndpoint$YPCOffersEndpoint.getClass();
        this.b = g(ypcOffersEndpoint$YPCOffersEndpoint.b);
    }

    @Override // defpackage.aaqs
    /* renamed from: u */
    public final aopa a() {
        aopa createBuilder = ashq.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        ashq ashqVar = (ashq) createBuilder.instance;
        str.getClass();
        ashqVar.b |= 2;
        ashqVar.d = str;
        String str2 = this.a;
        createBuilder.copyOnWrite();
        ashq ashqVar2 = (ashq) createBuilder.instance;
        str2.getClass();
        ashqVar2.b |= 4;
        ashqVar2.e = str2;
        return createBuilder;
    }
}
