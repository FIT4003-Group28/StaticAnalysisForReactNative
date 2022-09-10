package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: brbr  reason: default package */
/* loaded from: classes4.dex */
public final class brbr implements bzml {
    public final gga a;
    public final btrm b;
    public final brbq c = new brbq(this);
    private final dxio<bzmm> d;
    private final bzmi e;

    public brbr(gga ggaVar, btrm btrmVar, dxio<bzmm> dxioVar, bzmi bzmiVar) {
        this.a = ggaVar;
        this.b = btrmVar;
        this.d = dxioVar;
        this.e = bzmiVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PERSONAL_SEARCH;
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
        return !this.e.b();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.d.a().b(dqkc.PERSONAL_SEARCH) != bzmk.VISIBLE ? bzmk.VISIBLE : bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        int i = true != btpf.b(this.a) ? R.id.personalsearchtutorial_stub : R.id.personalsearchtutorialtablet_stub;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.id.search_omnibox_container));
        brbp brbpVar = new brbp(this);
        View findViewById = this.a.findViewById(R.id.search_omnibox_container);
        dbsk.s(findViewById);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.a.findViewById(R.id.search_omnibox_text_clear));
        View a = cqhu.a(findViewById, hqv.b);
        dbsk.s(a);
        arrayList2.add(a);
        this.e.d(i, R.id.personalsearchtutorial_overlay, arrayList, arrayList2, brbpVar);
        return false;
    }

    public final void g() {
        if (this.e.b()) {
            View view = ((bzmd) this.e).a;
            dbsk.s(view);
            if (view.getId() != R.id.personalsearchtutorial_overlay) {
                return;
            }
            this.e.a();
        }
    }
}
