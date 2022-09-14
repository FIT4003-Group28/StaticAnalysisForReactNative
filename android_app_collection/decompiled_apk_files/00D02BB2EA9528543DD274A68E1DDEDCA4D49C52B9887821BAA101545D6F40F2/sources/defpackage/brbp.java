package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brbp  reason: default package */
/* loaded from: classes4.dex */
final class brbp implements bzmn {
    final /* synthetic */ brbr a;

    public brbp(brbr brbrVar) {
        this.a = brbrVar;
    }

    @Override // defpackage.bzmn
    public final void PJ() {
        this.a.g();
    }

    @Override // defpackage.bzmn
    public final void PK() {
        brbr brbrVar = this.a;
        brbrVar.g();
        View findViewById = brbrVar.a.findViewById(R.id.search_omnibox_container);
        View findViewById2 = findViewById != null ? findViewById.findViewById(R.id.search_omnibox_text_clear) : null;
        if (findViewById2 != null) {
            findViewById2.performClick();
        }
    }

    @Override // defpackage.bzmn
    public final void PL() {
    }

    @Override // defpackage.bzmn
    public final void PM() {
    }

    @Override // defpackage.bzmn
    public final void PN(int i) {
    }

    @Override // defpackage.bzmn
    public final void PO() {
    }
}
