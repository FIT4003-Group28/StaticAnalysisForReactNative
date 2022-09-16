package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ixn  reason: default package */
/* loaded from: classes3.dex */
public final class ixn extends ixm implements View.OnClickListener {
    public advc ae;
    public acti af;
    adux ag;
    boolean ah = true;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.af.d(acuo.a(62397), apzg.a, null);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        this.d.getWindow().setLayout(rh().getDimensionPixelSize(R.dimen.mdx_assisted_tv_sign_in_dialog_width), -2);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_assisted_tv_sign_in_dialog, viewGroup, false);
        inflate.findViewById(R.id.sign_in_button).setOnClickListener(this);
        inflate.findViewById(R.id.floaty_close_button).setOnClickListener(this);
        this.af.n(new acte(acuo.b(57568)));
        this.af.n(new acte(acuo.b(57570)));
        this.af.n(new acte(acuo.b(57569)));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.sign_in_button) {
            if (id != R.id.floaty_close_button) {
                return;
            }
            this.af.H(3, new acte(acuo.b(57569)), null);
            this.ah = true;
            ku();
            return;
        }
        this.af.H(3, new acte(acuo.b(57570)), null);
        if (this.ae.g() != null && !this.ae.g().b.isEmpty()) {
            this.ah = false;
            this.ae.k();
        }
        ku();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ah) {
            if (this.ae.g() != null && !this.ae.g().b.isEmpty()) {
                this.ag.a(this.ae.g().b, "canceled");
            }
            this.ae.i();
        }
        this.ah = true;
    }
}
