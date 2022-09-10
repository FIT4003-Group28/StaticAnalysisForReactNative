package defpackage;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dgz  reason: default package */
/* loaded from: classes6.dex */
public final class dgz extends det {
    private static final cjtd an = cjtd.a(dtxj.bw);
    private static final cjtd ao = cjtd.a(dtxj.bv);
    public dkn am;

    @Override // defpackage.det
    protected final void aO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.indoor_warning_dialog, viewGroup);
        Button button = (Button) inflate.findViewById(R.id.indoor_warning_continue_button);
        this.am.a(button, an);
        this.am.b(button, new View.OnClickListener(this) { // from class: dgx
            private final dgz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dgz dgzVar = this.a;
                czp o = dgzVar.ag.o();
                o.f(true);
                dgzVar.aK(o.d());
                dgzVar.f();
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.indoor_warning_cancel_button);
        this.am.a(button2, ao);
        this.am.b(button2, new View.OnClickListener(this) { // from class: dgy
            private final dgz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dgz dgzVar = this.a;
                Dialog dialog = dgzVar.d;
                if (dialog != null) {
                    dialog.cancel();
                } else {
                    dgzVar.f();
                }
            }
        });
        doj.INDOOR_WARNING_IMAGE.a((WebImageView) inflate.findViewById(R.id.indoor_warning_image), Rn().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxj.bx;
    }

    @Override // defpackage.det, defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(dtxj.bx));
    }
}
