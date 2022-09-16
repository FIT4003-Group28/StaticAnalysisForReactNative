package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: tvf  reason: default package */
/* loaded from: classes7.dex */
public final class tvf extends cqiw<tvy> {
    public static final cqrp a = cqrp.d(12.0d);
    public static final cqrp b = cqrp.d(100.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<cqix<?>> d(tvy tvyVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cqgr.fT(new tux(), tvyVar));
        arrayList.addAll(dcdc.q(dcft.o(tvyVar.b(), tus.a)));
        arrayList.add(cqgr.fT(new vlc(), tvyVar));
        return dcdc.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<tvy> a() {
        return new cqmh(ueb.class, cqgr.cd(-1), cqgr.bp(-2), itj.e(Integer.valueOf((int) R.id.ellipsis_view)), cqjv.g(udy.ORDER_OF_PRECEDENCE, tut.a, udz.a), cqgr.an(tuu.a));
    }
}
