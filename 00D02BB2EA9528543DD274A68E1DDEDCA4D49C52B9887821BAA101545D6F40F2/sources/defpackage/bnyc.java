package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bnyc  reason: default package */
/* loaded from: classes3.dex */
public final class bnyc {
    private final Activity a;
    private final cqkj b;
    private final gn c;
    private final ddho d;
    private final ddho e;

    public bnyc(Activity activity, cqkj cqkjVar, gn gnVar, ddho ddhoVar, ddho ddhoVar2) {
        this.a = activity;
        this.b = cqkjVar;
        this.c = gnVar;
        this.d = ddhoVar;
        this.e = ddhoVar2;
    }

    public final boolean a(boolean z) {
        if (!z) {
            return false;
        }
        iii iiiVar = new iii();
        iiiVar.b = this.a.getText(R.string.EXIT_UNSAVED_POPUP);
        iiiVar.c(this.a.getText(R.string.EXIT_UNSAVED_POPUP_DISMISS_OPTION), bnya.a, cjtd.a(this.e));
        iiiVar.d(this.a.getText(R.string.EXIT_UNSAVED_POPUP_DISCARD_OPTION), new View.OnClickListener(this) { // from class: bnyb
            private final bnyc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c();
            }
        }, cjtd.a(this.d));
        iiiVar.a(this.a, this.b).k();
        return true;
    }

    public final void b(boolean z) {
        if (!a(z)) {
            c();
        }
    }

    public final void c() {
        jmw.d(this.a, null);
        this.c.f();
    }
}
