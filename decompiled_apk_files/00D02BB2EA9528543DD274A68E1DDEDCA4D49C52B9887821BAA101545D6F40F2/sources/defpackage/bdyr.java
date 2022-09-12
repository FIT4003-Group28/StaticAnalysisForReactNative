package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bdyr  reason: default package */
/* loaded from: classes3.dex */
public final class bdyr implements bzml {
    public final bvjj a;
    public final bzmi b;
    private final gga c;
    private final dxio<bzmm> d;

    public bdyr(gga ggaVar, bvjj bvjjVar, dxio<bzmm> dxioVar, bzmi bzmiVar) {
        this.c = ggaVar;
        this.a = bvjjVar;
        this.d = dxioVar;
        this.b = bzmiVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PULL_UP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return (!j() || !k()) && !this.b.b();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.m(bvjk.dx, false)) {
            return bzmk.NONE;
        }
        if (this.d.a().d(dqkc.PULL_UP) < 2) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        bvrj.UI_THREAD.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.id.expandingscrollview_container));
        View findViewById = this.c.findViewById(R.id.search_omnibox_container);
        dbsk.s(findViewById);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.c.findViewById(R.id.search_omnibox_text_box));
        arrayList2.add(this.c.findViewById(R.id.search_omnibox_text_clear));
        arrayList2.add(this.c.findViewById(R.id.qu_mylocation_container));
        arrayList2.add(this.c.findViewById(R.id.on_map_action_button));
        arrayList2.add(cqkx.d(findViewById, hqv.b));
        this.b.d(h(), i(), arrayList, arrayList2, new bdyq(this, arrayList, arrayList2));
        return true;
    }

    public final void g() {
        this.b.a();
    }

    public final int h() {
        return j() ? R.id.pulluptutorialtablet_stub : k() ? R.id.pulluptutoriallandscape_stub : R.id.pulluptutorial_stub;
    }

    public final int i() {
        return (!j() && k()) ? R.id.pulluptutorial_overlay_landscape : R.id.pulluptutorial_overlay;
    }

    public final boolean j() {
        return btpf.b(this.c);
    }

    public final boolean k() {
        return btpf.c(this.c).f;
    }
}
