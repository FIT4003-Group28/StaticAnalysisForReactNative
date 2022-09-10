package defpackage;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcqw  reason: default package */
/* loaded from: classes3.dex */
public abstract class bcqw extends gen {
    private static final dcqe a = dcqe.c("bcqw");
    public cqkj b;
    Dialog c;
    private cqkf<cqkp> d;
    private ObjectAnimator e;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        this.d.e(null);
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.d.e(cqkp.T);
        return this.d.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        view.setAlpha(0.0f);
        view.addOnAttachStateChangeListener(new bcqu(this));
        gn R = R();
        fd H = R.H("PHOTO_LIGHTBOX_DIALOG_FRAGMENT_BASE_LIGHTBOX_FRAGMENT_TAG");
        if (H == null) {
            H = g();
            H.B(this.o);
        }
        gz b = R.b();
        b.C(R.id.base_lightbox_container_id, H, "PHOTO_LIGHTBOX_DIALOG_FRAGMENT_BASE_LIGHTBOX_FRAGMENT_TAG");
        b.g();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        w();
        return true;
    }

    protected abstract fd g();

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        Dialog dialog = new Dialog(H(), 16973840);
        this.c = dialog;
        View decorView = dialog.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024);
        return this.c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.d = this.b.e(new bcye());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fk;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        Dialog dialog = this.c;
        if (dialog == null) {
            bvoo.h("dialog not initialized yet", new Object[0]);
        } else {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: bcqt
                private final bcqw a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    bcqw bcqwVar = this.a;
                    if (i == 4 && keyEvent.getAction() == 1) {
                        bcqwVar.w();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public final void w() {
        if (this.e == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.P, "alpha", 1.0f, 0.0f).setDuration(250L);
            this.e = duration;
            duration.addListener(new bcqv(this));
        }
        if (!this.e.isStarted()) {
            this.e.start();
        }
    }
}
