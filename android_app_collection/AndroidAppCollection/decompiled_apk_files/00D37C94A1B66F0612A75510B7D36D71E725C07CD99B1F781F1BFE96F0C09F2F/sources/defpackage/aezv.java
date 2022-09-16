package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aezv  reason: default package */
/* loaded from: classes.dex */
final class aezv extends aezb {
    private final afci l;

    public aezv(afjm afjmVar, afci afciVar, pnp pnpVar, pnj pnjVar, atk atkVar, pqh pqhVar, axf axfVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aeyq aeyqVar, String str, pjc pjcVar, afbq afbqVar) {
        super(afjmVar, pnpVar, pnjVar, atkVar, pqhVar, axfVar, playerConfigModel, videoStreamingData, aeyqVar, str, pjcVar, afbqVar);
        this.l = afciVar;
    }

    @Override // defpackage.aezb
    protected final pry c(afbk afbkVar, pvf pvfVar) {
        pry pryVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < pvfVar.m(); i++) {
            int j = pvfVar.j(i);
            FormatStreamModel formatStreamModel = afbkVar.b[j];
            if (formatStreamModel.L()) {
                arrayList.add(Integer.valueOf(j));
                arrayList3.add(formatStreamModel);
            } else {
                arrayList2.add(Integer.valueOf(j));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < pvfVar.p().a; i2++) {
            FormatStreamModel formatStreamModel2 = afbkVar.b[i2];
            if (!formatStreamModel2.L()) {
                arrayList4.add(Integer.valueOf(i2));
                arrayList5.add(formatStreamModel2);
            }
        }
        aezr aezrVar = null;
        if (!arrayList2.isEmpty()) {
            afbk afbkVar2 = new afbk(afbkVar.a, (FormatStreamModel[]) arrayList5.toArray(new FormatStreamModel[0]));
            aezx aezxVar = new aezx(pvfVar, almu.y(arrayList4), almu.y(arrayList2));
            ave f = this.b.f(this.c);
            pryVar = this.l.d(f, afbkVar2.b, aggw.p(f, afbkVar2), aezxVar, afbkVar2.a, this.h, this.a);
        } else {
            pryVar = null;
        }
        if (!arrayList.isEmpty()) {
            afbk afbkVar3 = new afbk(afbkVar.a, (FormatStreamModel[]) arrayList3.toArray(new FormatStreamModel[0]));
            int[] y = almu.y(arrayList);
            aezx aezxVar2 = new aezx(pvfVar, y, y);
            PlayerConfigModel playerConfigModel = this.a;
            FormatStreamModel[] formatStreamModelArr = afbkVar3.b;
            afjm afjmVar = this.e;
            atk atkVar = this.h;
            String str = this.c;
            int i3 = afbkVar3.a;
            afci afciVar = this.l;
            aezrVar = new aezr(playerConfigModel, formatStreamModelArr, afjmVar, atkVar, aezxVar2, str, i3, afciVar.b, afciVar.a, afciVar.c);
        }
        if (pryVar == null) {
            if (aezrVar == null) {
                throw new IllegalStateException("no_formats_selected");
            }
            return aezrVar;
        } else if (aezrVar == null) {
            return pryVar;
        } else {
            pry[] pryVarArr = new pry[pvfVar.m()];
            for (int i4 = 0; i4 < pvfVar.m(); i4++) {
                pryVarArr[i4] = true != afbkVar.b[pvfVar.j(i4)].L() ? pryVar : aezrVar;
            }
            return new aezy(pvfVar, pryVarArr);
        }
    }

    @Override // defpackage.aezb
    protected final void q(pry pryVar) {
    }
}
