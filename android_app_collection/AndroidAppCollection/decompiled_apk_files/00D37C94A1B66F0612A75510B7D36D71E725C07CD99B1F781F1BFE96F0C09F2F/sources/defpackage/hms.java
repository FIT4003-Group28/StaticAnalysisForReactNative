package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
/* compiled from: PG */
/* renamed from: hms  reason: default package */
/* loaded from: classes3.dex */
public final class hms implements View.OnClickListener, hpy {
    public Context a;
    public View b;
    public AudioTrackView c;
    public AudioCrossFadeView d;
    public TextView e;
    public TextView f;
    public ImageButton g;
    public Button h;
    public Button i;
    public boolean j;
    public float k;
    public hmr l;

    @Override // defpackage.hpy
    public final float a() {
        if (this.j) {
            return this.k;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.j) {
            return 0.0f;
        }
        return this.k;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.b;
    }

    public final void d() {
        if (this.j) {
            hqb.d(this);
            this.j = false;
            zag.o(this.b, false);
        }
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.h) {
            ((hnu) this.l).bx();
        } else if (view != this.g) {
            if (view != this.i) {
                return;
            }
            this.l.e();
        } else {
            hnu hnuVar = (hnu) this.l;
            hnuVar.by(null);
            hnuVar.ak.d();
            hnuVar.al.g(hnuVar.br().F());
        }
    }
}
