package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hmq  reason: default package */
/* loaded from: classes3.dex */
public final class hmq implements View.OnClickListener, hpy {
    public Context a;
    public float b;
    public boolean c;
    public hmp d;
    public TextView e;
    public TextView f;
    public View g;
    public acti h;

    @Override // defpackage.hpy
    public final float a() {
        if (this.c) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.c) {
            return this.b;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.g;
    }

    public final void d() {
        if (this.c) {
            this.c = false;
            hqb.d(this);
        }
    }

    @Override // defpackage.hpy
    public final void e() {
        zag.o(this.g, this.c);
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    public final void g(boolean z) {
        CharSequence text;
        if (!this.c) {
            this.c = true;
            zag.o(this.g, true);
            hqb.d(this);
        }
        if (z) {
            text = this.a.getResources().getText(R.string.reel_edit_unmute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(2131232820, 0, 0, 0);
        } else {
            text = this.a.getResources().getText(R.string.reel_edit_mute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(2131232817, 0, 0, 0);
        }
        this.f.setContentDescription(text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.e) {
            if (view != this.f) {
                return;
            }
            this.d.d();
            d();
            this.h.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_MUTE_TOGGLE), null);
            return;
        }
        hmp hmpVar = this.d;
        if (((zwx) hmpVar).aI.h != null) {
            ((hnu) hmpVar).bf();
        } else {
            hnu hnuVar = (hnu) hmpVar;
            hnuVar.onClick(hnuVar.ah.j);
            hnuVar.be();
        }
        d();
    }
}
