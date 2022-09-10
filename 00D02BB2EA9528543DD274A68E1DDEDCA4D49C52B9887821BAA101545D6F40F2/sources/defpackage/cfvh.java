package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfvh  reason: default package */
/* loaded from: classes4.dex */
public final class cfvh {
    public static final EnumSet<dwub> a = EnumSet.of(dwub.SEE_EDITS, dwub.SEE_PHOTOS, dwub.SEE_REVIEWS);

    public static dcdc<cfvs> a(final cfvt cfvtVar, List<dwue> list) {
        dcbg o = dcbg.b(list).o(cfvf.a);
        cfvtVar.getClass();
        return o.s(new dbrn(cfvtVar) { // from class: cfvg
            private final cfvt a;

            {
                this.a = cfvtVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dwue dwueVar = (dwue) obj;
                ceet a2 = this.a.a.a();
                cfvt.a(a2, 1);
                cfvt.a(dwueVar, 2);
                return new cfvs(a2, dwueVar);
            }
        }).z();
    }

    public static void b(Bundle bundle, List<dwue> list) {
        bundle.putSerializable("items", bvrt.c(dcdc.r(list), new dccx()));
    }

    public static dcdc<dwue> c(Bundle bundle) {
        if (bundle == null) {
            return dcdc.e();
        }
        Serializable serializable = bundle.getSerializable("items");
        if (serializable == null) {
            return dcdc.e();
        }
        ArrayList arrayList = new ArrayList();
        bvrt.g((List) serializable, arrayList, (dssr) dwue.c.cu(7), dwue.c);
        return dcdc.r(arrayList);
    }
}
