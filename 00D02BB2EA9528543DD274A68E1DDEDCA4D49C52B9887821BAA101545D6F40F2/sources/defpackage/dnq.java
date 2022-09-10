package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dnq  reason: default package */
/* loaded from: classes6.dex */
public final class dnq extends des {
    public cjqy ai;
    private static final cjtd aj = cjtd.a(dtxw.n);
    public static final cjtd ah = cjtd.a(dtxw.o);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxw.n;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return layoutInflater.inflate(R.layout.driving_warning_dialog, viewGroup);
    }

    @Override // defpackage.dev, defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        d(1, R.style.DrivingWarningDialog);
    }

    @Override // defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(aj);
        final cjql aQ = aQ(ah);
        View view = this.P;
        dbsk.s(view);
        doj.DRIVING_WARNING_IMAGE.a((WebImageView) view.findViewById(R.id.driving_warning_image), Rn().getDisplayMetrics());
        ((Button) view.findViewById(R.id.driving_warning_route_overview_button)).setOnClickListener(new View.OnClickListener(this, aQ) { // from class: dnp
            private final dnq a;
            private final cjql b;

            {
                this.a = this;
                this.b = aQ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dnq dnqVar = this.a;
                cjql cjqlVar = this.b;
                if (cjqlVar != null) {
                    dnqVar.ai.j(cjqlVar, dnq.ah);
                }
                dnqVar.aL();
            }
        });
    }
}
