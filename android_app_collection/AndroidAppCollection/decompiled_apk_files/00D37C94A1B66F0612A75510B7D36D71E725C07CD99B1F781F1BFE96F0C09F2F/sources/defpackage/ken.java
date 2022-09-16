package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: ken  reason: default package */
/* loaded from: classes3.dex */
public final class ken {
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public yye f;
    private final ajmy g;
    public boolean e = false;
    private boolean h = true;

    public ken(ajmy ajmyVar) {
        this.g = ajmyVar;
    }

    public final void a(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        zag.o(this.a, z);
        zag.o(this.c, this.h);
        zag.o(this.d, this.h);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, avhn avhnVar) {
        ylr.c();
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
        if (avhnVar == null) {
            this.g.e(this.b);
        } else {
            this.g.k(this.b, avhnVar, ajmu.b);
        }
    }
}
