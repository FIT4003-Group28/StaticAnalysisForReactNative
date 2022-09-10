package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: agbo  reason: default package */
/* loaded from: classes2.dex */
public final class agbo implements bbdu {
    public final agbm a;
    public final dxio<cztz> b;
    public final boolean c;

    public agbo(agbm agbmVar, dxio<cztz> dxioVar, boolean z) {
        this.a = agbmVar;
        this.b = dxioVar;
        this.c = z;
    }

    @Override // defpackage.bbdu
    public final void a(final Activity activity, final int i) {
        activity.runOnUiThread(new Runnable(this, i, activity) { // from class: agbn
            private final agbo a;
            private final Activity b;
            private final int c;

            {
                this.a = this;
                this.c = i;
                this.b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                agbo agboVar = this.a;
                int i2 = this.c;
                Activity activity2 = this.b;
                if (i2 - 1 == 0) {
                    agboVar.a.b(true);
                    if (!agboVar.c) {
                        agboVar.b.a().d(activity2.getWindowManager(), true);
                        cztq a = cztt.a(agboVar.b.a());
                        a.e(R.string.LOCALSTREAM_RECOMMENDATION_RATING_FEEDBACK, new Object[0]);
                        a.d(cztr.LONG);
                        cztt b = a.b();
                        View findViewById = b.b.findViewById(R.id.toastbar_message);
                        if (findViewById instanceof TextView) {
                            findViewById.setClickable(false);
                            findViewById.setLongClickable(false);
                        }
                        b.b.setImportantForAccessibility(2);
                        b.b();
                    }
                } else if (!agboVar.c) {
                    cjxu.i(activity2, activity2.getString(R.string.VISITS_ERROR_SAVING_USER_ACTION));
                }
                agboVar.a.c(false);
                agboVar.a.a();
            }
        });
    }
}
