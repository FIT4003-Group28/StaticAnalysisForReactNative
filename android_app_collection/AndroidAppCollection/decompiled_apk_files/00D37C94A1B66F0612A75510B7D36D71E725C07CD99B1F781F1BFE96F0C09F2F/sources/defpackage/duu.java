package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: duu  reason: default package */
/* loaded from: classes3.dex */
public final class duu extends dux {
    private final View h;

    public duu(dtq dtqVar, aopa aopaVar, int i, View view) {
        super(dtqVar, "Kmz5tBXAEaLXDuVtC28R2Eyl8yM/POYxi3NSzFUgrRu50JDfLf5aLi0MhLFpp+iH", "d0cJP5eIgMgE2VJN6x1Ml7ZD0Bx7puAZ4vqh2E5GAvg=", aopaVar, i, 57);
        this.h = view;
    }

    @Override // defpackage.dux
    protected final void a() {
        if (this.h != null) {
            Boolean bool = (Boolean) qdb.x.e();
            dtt dttVar = new dtt((String) this.d.invoke(null, this.h, this.a.a.getResources().getDisplayMetrics(), bool));
            aopa createBuilder = dnv.a.createBuilder();
            long longValue = dttVar.a.longValue();
            createBuilder.copyOnWrite();
            dnv dnvVar = (dnv) createBuilder.instance;
            dnvVar.b |= 4;
            dnvVar.c = longValue;
            long longValue2 = dttVar.b.longValue();
            createBuilder.copyOnWrite();
            dnv dnvVar2 = (dnv) createBuilder.instance;
            dnvVar2.b |= 8;
            dnvVar2.d = longValue2;
            long longValue3 = dttVar.c.longValue();
            createBuilder.copyOnWrite();
            dnv dnvVar3 = (dnv) createBuilder.instance;
            dnvVar3.b |= 16;
            dnvVar3.e = longValue3;
            if (bool.booleanValue()) {
                long longValue4 = dttVar.d.longValue();
                createBuilder.copyOnWrite();
                dnv dnvVar4 = (dnv) createBuilder.instance;
                dnvVar4.b |= 32;
                dnvVar4.f = longValue4;
            }
            aopa aopaVar = this.g;
            dnv dnvVar5 = (dnv) createBuilder.mo39build();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnvVar5.getClass();
            dnwVar.R = dnvVar5;
            dnwVar.c |= 524288;
        }
    }
}
