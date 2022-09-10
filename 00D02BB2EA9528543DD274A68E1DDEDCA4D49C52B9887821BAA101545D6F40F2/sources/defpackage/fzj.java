package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: fzj  reason: default package */
/* loaded from: classes6.dex */
public final class fzj extends GmmRecyclerView {
    public static final cqkv S = new fzk();
    final afu T;
    public final aga U;
    public final cjqy V;
    @dzsi
    public fzh W;

    public fzj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fzi fziVar = new fzi(this);
        this.T = fziVar;
        aga agaVar = new aga(fziVar);
        this.U = agaVar;
        agaVar.e(this);
        this.V = ((cjqz) btsr.a(cjqz.class)).tr();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(fzj.class, cqmpVarArr);
        cqmhVar.f(cqgr.aR(Integer.valueOf((int) R.id.recycler_view)));
        return cqmhVar;
    }

    public static <T extends cqkp> cqnf<T> av(cqlc<T, fzh> cqlcVar) {
        return cqjv.g(iug.ITEM_SHUFFLER_LISTENER, cqlcVar, S);
    }

    public void setListener(@dzsi fzh fzhVar) {
        this.W = fzhVar;
    }
}
