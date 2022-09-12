package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oym  reason: default package */
/* loaded from: classes7.dex */
public final class oym implements cjyu<oxm> {
    private final wjo a;

    public oym(wjo wjoVar) {
        this.a = wjoVar;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ oxm a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtnb dtnbVar = dtkuVar.f;
        if (dtnbVar == null) {
            dtnbVar = dtnb.f;
        }
        wjo wjoVar = this.a;
        dtku dtkuVar2 = dtkxVar.b;
        if (dtkuVar2 == null) {
            dtkuVar2 = dtku.p;
        }
        dtnb dtnbVar2 = dtkuVar2.f;
        if (dtnbVar2 == null) {
            dtnbVar2 = dtnb.f;
        }
        dvwl dvwlVar = dtnbVar2.b;
        if (dvwlVar == null) {
            dvwlVar = dvwl.d;
        }
        bvsl a = wjoVar.a.a();
        wjo.a(a, 1);
        wjs a2 = wjoVar.b.a();
        wjo.a(a2, 2);
        wjo.a(dvwlVar, 3);
        return new oyn(cjztVar, dtnbVar, new wjn(a, a2, dvwlVar));
    }
}
