package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cgdy  reason: default package */
/* loaded from: classes4.dex */
public final class cgdy implements bzml {
    private static final dcqe c = dcqe.c("cgdy");
    public final bzmi a;
    public boolean b = false;
    private final gga d;
    private final dxio<bzmm> e;
    private final jkf f;

    public cgdy(gga ggaVar, dxio<bzmm> dxioVar, bzmi bzmiVar, jkf jkfVar) {
        this.d = ggaVar;
        this.e = dxioVar;
        this.a = bzmiVar;
        this.f = jkfVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.UGC_TASKS_SEARCH_BUTTON;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        View findViewById = this.d.findViewById(R.id.ugc_tasks_search_button);
        return this.f.l().L().b() && findViewById != null && findViewById.isShown() && !this.a.b() && !this.b;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.e.a().b(dqkc.UGC_TASKS_SEARCH_BUTTON) != bzmk.VISIBLE ? bzmk.VISIBLE : bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        cgdx cgdxVar = new cgdx(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.d.findViewById(R.id.expandingscrollview_container));
        this.a.d(R.id.ugctaskssearchbuttontutorial_stub, R.id.ugctaskssearchbuttontutorial_overlay, dcdc.f(Integer.valueOf((int) R.id.ugc_tasks_search_button)), arrayList, cgdxVar);
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.tutorial_container);
        if (viewGroup != null) {
            viewGroup.setFocusable(true);
            viewGroup.setFocusableInTouchMode(true);
            viewGroup.requestFocus();
        } else {
            bvoo.h("Could not find the tutorial container to show the UGC tasks search button tutorial.", new Object[0]);
        }
        return true;
    }
}
