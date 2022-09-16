package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jla  reason: default package */
/* loaded from: classes3.dex */
public final class jla extends jkb {
    public jla(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        super(offlineArrowView, onClickListener);
    }

    public final void d(agqv agqvVar) {
        int i;
        if (agqvVar == null || agqvVar.s()) {
            super.a();
            this.b.e();
            this.b.k();
        } else if (agqvVar.i() == agqp.PLAYABLE) {
            super.a();
            this.b.d();
            this.b.k();
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_remove_video));
        } else if (agqvVar.u()) {
            if (agqvVar.y()) {
                int c = agqvVar.c();
                super.a();
                this.b.b(2131231736);
                if (c <= 0) {
                    this.b.k();
                    return;
                } else {
                    this.b.i(c);
                    return;
                }
            }
            c();
        } else if (!agqvVar.z()) {
            agqz agqzVar = agqvVar.o;
            boolean z = true;
            char c2 = 0;
            if (agqzVar == null || ((i = agqzVar.c) != 1 && i != 2 && i != 8)) {
                z = false;
            }
            char c3 = (!agqvVar.D() || z) ? (char) 2 : (char) 0;
            if (agqvVar.B() || z) {
                c2 = 4;
            }
            int i2 = c3 | c2;
            int c4 = agqvVar.c();
            int i3 = i2 & 4;
            super.a();
            if ((i2 & 2) == 0) {
                this.b.e();
            } else if (i3 != 0) {
                this.b.g();
            } else {
                this.b.h();
            }
            this.b.i(c4);
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_cancel));
        } else {
            c();
        }
    }
}
