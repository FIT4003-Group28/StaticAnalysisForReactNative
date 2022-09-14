package defpackage;
/* compiled from: PG */
/* renamed from: wjn  reason: default package */
/* loaded from: classes7.dex */
public class wjn implements wjj {
    private final String a;
    private final wjr b;

    public wjn(bvsl bvslVar, wjs wjsVar, dvwl dvwlVar) {
        dvwc dvwcVar = dvwlVar.b;
        this.a = xkg.a(bvslVar, dvwcVar == null ? dvwc.e : dvwcVar);
        dopk dopkVar = dvwlVar.c;
        dopk dopkVar2 = dopkVar == null ? dopk.x : dopkVar;
        vtn a = wjsVar.a.a();
        wjs.a(a, 1);
        qbt a2 = wjsVar.b.a();
        wjs.a(a2, 2);
        wsm a3 = wjsVar.c.a();
        wjs.a(a3, 3);
        wjv a4 = wjsVar.d.a();
        wjs.a(a4, 4);
        zrt a5 = wjsVar.e.a();
        wjs.a(a5, 5);
        wjs.a(dopkVar2, 6);
        this.b = new wjr(a, a2, a3, a4, a5, dopkVar2);
    }

    @Override // defpackage.wjj
    public String a() {
        return this.a;
    }

    @Override // defpackage.wjj
    public wjk b() {
        return this.b;
    }
}
