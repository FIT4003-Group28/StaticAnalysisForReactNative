package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: dxh  reason: default package */
/* loaded from: classes3.dex */
public final class dxh implements ijr {
    public final alcu a;
    public final String b;
    public final dyo c;
    private final dxh B = this;
    public final azqb d = axot.b(new dxg(this, 2));
    public final azqb e = axot.b(new dxg(this, 4));
    public final azqb f = axot.b(new dxg(this, 5));
    public final azqb g = axot.b(new dxg(this, 3));
    public final azqb h = axot.b(new dxg(this, 7));
    public final azqb i = axot.b(new dxg(this, 6));
    public final azqb j = axot.b(new dxg(this, 9));
    public final azqb k = axot.b(new dxg(this, 8));
    public final azqb l = axot.b(new dxg(this, 10));
    public final azqb m = axot.b(new dxg(this, 11));
    public final azqb n = axot.b(new dxg(this, 12));
    public final azqb o = axot.b(new dxg(this, 13));
    public final azqb p = axot.b(new dxg(this, 14));
    public final azqb q = axot.b(new dxg(this, 15));
    public final azqb r = axot.b(new dxg(this, 16));
    public final azqb s = axot.b(new dxg(this, 17));
    public final azqb t = axot.b(new dxg(this, 1));
    public final azqb u = axot.b(new dxg(this, 19));
    public final azqb v = new dxg(this, 18);
    public final azqb w = axot.b(new dxg(this, 21));
    public final azqb x = axot.b(new dxg(this, 22));
    public final azqb y = axot.b(new dxg(this, 23));
    public final azqb z = new dxg(this, 20);
    public final azqb A = axot.b(new dxg(this, 24));
    private final azqb C = axot.b(new dxg(this, 0));

    public dxh(dyo dyoVar, String str, alcu alcuVar) {
        this.c = dyoVar;
        this.a = alcuVar;
        this.b = str;
    }

    @Override // defpackage.algb
    public final algj a() {
        return (algj) this.C.get();
    }

    public final alhs b() {
        dyo dyoVar = this.c;
        return new alhs((ExecutorService) this.c.h.get(), (yrr) this.c.cR.get(), dyoVar.b.a, dyoVar.gz());
    }
}
