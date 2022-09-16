package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
/* compiled from: PG */
/* renamed from: cdnq  reason: default package */
/* loaded from: classes4.dex */
public final class cdnq extends fd {
    public cqkj a;
    public PublicDisclosureLayout$PublicDisclosureViewModelImpl b;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dzvx.c(layoutInflater, "inflater");
        Bundle bundle2 = this.o;
        boolean z = true;
        boolean z2 = bundle2 != null && bundle2.getBoolean("hideUserInfo");
        Bundle bundle3 = this.o;
        if (bundle3 == null || !bundle3.getBoolean("textAlignTop")) {
            z = false;
        }
        cqkj cqkjVar = this.a;
        if (cqkjVar == null) {
            dzvx.a("viewHierarchyFactory");
        }
        cqkf e = cqkjVar.e(new cayj(z2, z));
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.b;
        if (publicDisclosureLayout$PublicDisclosureViewModelImpl == null) {
            dzvx.a("publicDisclosureViewModel");
        }
        e.e(publicDisclosureLayout$PublicDisclosureViewModelImpl);
        dzvx.b(e, "disclosureHierarchy");
        return e.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        dzvx.c(view, "view");
        m x = x();
        dzvx.b(x, "viewLifecycleOwner");
        k Nh = x.Nh();
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.b;
        if (publicDisclosureLayout$PublicDisclosureViewModelImpl == null) {
            dzvx.a("publicDisclosureViewModel");
        }
        Nh.a(publicDisclosureLayout$PublicDisclosureViewModelImpl);
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.b;
        if (publicDisclosureLayout$PublicDisclosureViewModelImpl == null) {
            dzvx.a("publicDisclosureViewModel");
        }
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
    }
}
