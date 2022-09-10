package defpackage;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dlt  reason: default package */
/* loaded from: classes6.dex */
public final class dlt extends det {
    private static final cjtd an = cjtd.a(dtxw.C);
    private static final cjtd ao = cjtd.a(dtxw.B);
    public dkn am;

    @Override // defpackage.det
    protected final void aO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.night_warning_dialog, viewGroup);
        doj.NIGHT_WARNING_IMAGE.a((WebImageView) inflate.findViewById(R.id.night_warning_image), Rn().getDisplayMetrics());
        Button button = (Button) inflate.findViewById(R.id.night_warning_continue_button);
        this.am.a(button, an);
        this.am.b(button, new View.OnClickListener(this) { // from class: dlr
            private final dlt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dlt dltVar = this.a;
                czp o = dltVar.ag.o();
                o.h(true);
                dltVar.aK(o.d());
                dltVar.f();
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.night_warning_regular_directions_button);
        this.am.a(button2, ao);
        this.am.b(button2, new View.OnClickListener(this) { // from class: dls
            private final dlt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dlt dltVar = this.a;
                Dialog dialog = dltVar.d;
                if (dialog != null) {
                    dialog.cancel();
                } else {
                    dltVar.f();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxj.bV;
    }

    @Override // defpackage.det, defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(dtxj.bV));
    }
}
