package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arej  reason: default package */
/* loaded from: classes2.dex */
final class arej {
    public final arfm a;
    cjkr b;
    private final Activity c;
    private final atbs d;

    public arej(Activity activity, arfm arfmVar, atbs atbsVar) {
        this.c = activity;
        this.a = arfmVar;
        this.d = atbsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, @dzsi Integer num, boolean z) {
        cjkr cjkrVar = this.b;
        if (cjkrVar != null) {
            cjkrVar.v();
            this.b = null;
        }
        if (this.d.i()) {
            return;
        }
        cjkp B = cjkr.B();
        B.t(this.c.getString(i));
        if (num != null) {
            ((cjke) B).e = this.c.getString(num.intValue());
        }
        if (z) {
            B.z(this.c.getString(R.string.TRY_AGAIN), new View.OnClickListener(this) { // from class: areh
                private final arej a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    arej arejVar = this.a;
                    String str = arejVar.a.C().c().d;
                    if (str != null) {
                        arejVar.a.f(str);
                    }
                }
            }, null);
        }
        B.y(this.c.getString(R.string.DISMISS), new View.OnClickListener(this) { // from class: arei
            private final arej a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.k();
            }
        }, null);
        cjkr u = B.u(this.c);
        this.b = u;
        u.q().show();
    }
}
