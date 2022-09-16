package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.video.trim.VideoTrimView;
/* compiled from: PG */
/* renamed from: hom  reason: default package */
/* loaded from: classes3.dex */
public final class hom implements View.OnClickListener, hpy {
    public View a;
    public VideoTrimView b;
    public Button c;
    public boolean d;
    public float e;
    public hol f;
    public acti g;

    @Override // defpackage.hpy
    public final float a() {
        if (this.d) {
            return this.e;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.d) {
            return 0.0f;
        }
        return this.e;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.a;
    }

    public final void d() {
        if (this.d) {
            zag.o(this.b, false);
            hqb.d(this);
            this.d = false;
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
        if (view == this.c) {
            this.f.aX();
            this.g.H(3, new acte(actj.REEL_CONFIRM_EDIT_BUTTON), null);
        }
    }
}
