package defpackage;

import android.app.Activity;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bqui  reason: default package */
/* loaded from: classes4.dex */
public class bqui implements bqsv {
    public static final /* synthetic */ int b = 0;
    private static final dcep<dqwi> c = dcep.D(dqwi.ROOMS, dqwi.SERVICE, dqwi.LOCATION);
    public final dcdc<bqtn> a;

    public bqui(final bqto bqtoVar, ilo iloVar) {
        dqwy dqwyVar;
        dqxu dqxuVar;
        if ((iloVar.bs().a & 67108864) == 0) {
            dqwyVar = iloVar.bq().G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
        } else {
            dqwyVar = iloVar.bs().G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
        }
        final HashMap hashMap = new HashMap();
        for (dqwo dqwoVar : dqwyVar.b) {
            dqwm dqwmVar = dqwoVar.b;
            dqwmVar = dqwmVar == null ? dqwm.d : dqwmVar;
            int a = dqwl.a(dqwmVar.c);
            if (a != 0 && a == 2) {
                dcep<dqwi> dcepVar = c;
                dqwi b2 = dqwi.b(dqwmVar.b);
                if (dcepVar.contains(b2 == null ? dqwi.UNKNOWN_ATTRIBUTE_TYPE : b2)) {
                    dqwg dqwgVar = dqwoVar.c;
                    dqwgVar = dqwgVar == null ? dqwg.c : dqwgVar;
                    if (dqwgVar.a == 1) {
                        dqxuVar = (dqxu) dqwgVar.b;
                    } else {
                        dqxuVar = dqxu.c;
                    }
                    int i = dqxuVar.b;
                    dqwi b3 = dqwi.b(dqwmVar.b);
                    hashMap.put(b3 == null ? dqwi.UNKNOWN_ATTRIBUTE_TYPE : b3, Integer.valueOf(i));
                }
            }
        }
        this.a = dcbg.b(c).s(new dbrn(hashMap, bqtoVar) { // from class: bquh
            private final HashMap a;
            private final bqto b;

            {
                this.a = hashMap;
                this.b = bqtoVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                HashMap hashMap2 = this.a;
                bqto bqtoVar2 = this.b;
                dqwi dqwiVar = (dqwi) obj;
                Integer num = (Integer) hashMap2.get(dqwiVar);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                Activity activity = (Activity) ((dxjd) bqtoVar2.a).a;
                bqto.a(activity, 1);
                bqto.a(bqtoVar2.b.a(), 2);
                bqto.a(dqwiVar, 3);
                return new bqtn(activity, dqwiVar, intValue);
            }
        }).z();
    }

    @Override // defpackage.bqsv
    public dcdc<? extends bqsr> a() {
        return this.a;
    }

    public Boolean b() {
        return Boolean.valueOf(dcbg.b(this.a).p(bquf.a));
    }

    public Boolean c() {
        return Boolean.valueOf(dcbg.b(this.a).p(bqug.a));
    }
}
