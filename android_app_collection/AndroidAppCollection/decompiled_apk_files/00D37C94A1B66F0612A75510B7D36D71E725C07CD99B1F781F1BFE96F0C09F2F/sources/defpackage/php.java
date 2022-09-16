package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: php  reason: default package */
/* loaded from: classes4.dex */
public class php implements pkg {
    private final Context a;
    private final awd b = awd.b;

    public php(Context context) {
        this.a = context;
    }

    @Override // defpackage.pkg
    public pkd[] ru(Handler handler, pyk pykVar, pli pliVar, psp pspVar, pom pomVar) {
        ArrayList arrayList = new ArrayList();
        pxq pxqVar = new pxq(this.a, avw.a, this.b, handler, pykVar, 50);
        ((awb) pxqVar).h = false;
        pxqVar.i = false;
        pxqVar.j = false;
        arrayList.add(pxqVar);
        pmf pmfVar = new pmf(pkv.a(this.a), new ply(new pky[0]), 0);
        pmi pmiVar = new pmi(this.a, avw.a, this.b, handler, pliVar, pmfVar);
        ((awb) pmiVar).h = false;
        pmiVar.i = false;
        pmiVar.j = false;
        arrayList.add(pmiVar);
        arrayList.add(new psq(pspVar, handler.getLooper()));
        arrayList.add(new pon(pomVar, handler.getLooper()));
        arrayList.add(new pyl());
        return (pkd[]) arrayList.toArray(new pkd[0]);
    }
}
