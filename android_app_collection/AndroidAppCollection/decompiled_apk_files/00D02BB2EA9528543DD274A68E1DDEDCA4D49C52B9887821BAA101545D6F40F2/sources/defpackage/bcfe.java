package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcfe  reason: default package */
/* loaded from: classes3.dex */
public final class bcfe extends cqiw<bclr> {
    public static final cqjg a = cqjg.a();
    private final Integer b = Integer.valueOf(cqir.a());

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bclr bclrVar, Context context, cqiv cqivVar) {
        List<bclt> d = bclrVar.d();
        int i2 = 0;
        while (i2 < d.size()) {
            int size = d.size() - 1;
            int i3 = 18;
            int i4 = i2 == 0 ? 18 : 4;
            if (i2 != size) {
                i3 = 0;
            }
            cqivVar.a(new bcfb(i4, i3), d.get(i2));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bclr> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), GmmRecyclerView.aw(C(), cqgr.aR(this.b), cqgr.aT(a), cqgr.cd(-1), cqgr.bs(bcew.a), cqqx.r(new bcez(new Object[0])), cqgr.ep(false), cqqx.p(null), cqgr.e(R.id.photo_gallery_recyclerview_id), iue.c(bcex.a), cqgr.dk(bcey.a)));
    }
}
