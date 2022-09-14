package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvsi  reason: default package */
/* loaded from: classes4.dex */
public class bvsi {
    private final String a;
    private final String b;
    private final StringBuffer c;
    private boolean d;

    public bvsi(Context context) {
        this(context.getResources());
    }

    private final void a(CharSequence charSequence) {
        if (this.c.length() != 0) {
            this.c.append(this.d ? this.a : this.b);
        }
        this.c.append(charSequence);
    }

    public final void c(@dzsi CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        a(charSequence);
        this.d = false;
    }

    public final void d(@dzsi CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        a(charSequence);
        this.d = true;
    }

    public final void e() {
        this.d = true;
    }

    public final String toString() {
        return this.c.toString();
    }

    public bvsi(Resources resources) {
        this.a = resources.getString(R.string.ACCESSIBILITY_LONG_PAUSE);
        this.b = resources.getString(R.string.ACCESSIBILITY_SHORT_PAUSE);
        this.c = new StringBuffer();
    }
}
