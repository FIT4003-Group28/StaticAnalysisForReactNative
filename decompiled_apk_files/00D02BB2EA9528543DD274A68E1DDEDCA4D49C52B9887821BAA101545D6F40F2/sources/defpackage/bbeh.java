package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: bbeh  reason: default package */
/* loaded from: classes3.dex */
final class bbeh implements awnl {
    public final transient bbek a;

    public bbeh(bbek bbekVar) {
        this.a = bbekVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.LOCATION_HISTORY_DIALOG;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            deha.q(this.a.a(), this.a.g(new bvqg(this) { // from class: bbeg
                private final bbeh a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    bbeh bbehVar = this.a;
                    if (bbek.f((UdcCacheResponse) obj)) {
                        bbehVar.a.d();
                        return;
                    }
                    bbehVar.a.e(R.string.PERSONAL_SCORE_WAA_NEGATIVE_ACTION);
                    bbehVar.a.c();
                }
            }), dege.a);
        } else if (i != 0) {
        } else {
            this.a.e(R.string.PERSONAL_SCORE_WAA_NEGATIVE_ACTION);
            this.a.c();
        }
    }
}
