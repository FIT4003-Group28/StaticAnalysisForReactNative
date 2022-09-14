package defpackage;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bsub  reason: default package */
/* loaded from: classes4.dex */
public final class bsub extends hxf {
    private static final dcqe c = dcqe.c("bsub");
    public efg b;

    private final View aR(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.settings_opensource_page, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.gmm_license_notice_textbox);
        try {
            textView.setText(new String(ddak.b(Rn().openRawResource(bsuc.gmm_license_notices))));
            Linkify.addLinks(textView, 1);
        } catch (IOException e) {
            bvoo.h("Cannot open file containing open source license. %s", e);
            textView.setText(R.string.OPEN_SOURCE_LICENSES_FAIL);
        }
        return inflate;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        return jib.g(J(), Rp(R.string.OPEN_SOURCE_LICENSES));
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        return aR(layoutInflater);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }
}
