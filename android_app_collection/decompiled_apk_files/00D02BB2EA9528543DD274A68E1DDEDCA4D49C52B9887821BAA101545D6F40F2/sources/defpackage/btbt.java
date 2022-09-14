package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btbt  reason: default package */
/* loaded from: classes4.dex */
public final class btbt extends gen {
    Locale a;
    public dxio<afha> ad;
    Locale b;
    public gga c;
    public bwqv d;
    public btby e;
    public btcw g;

    public static btbt g(Locale locale, Locale locale2, bwqv bwqvVar) {
        btbt btbtVar = new btbt();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "old_locale_key", locale);
        bwqvVar.c(bundle, "new_locale_key", locale2);
        btbtVar.B(bundle);
        return btbtVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((btbu) btsx.b(btbu.class, this)).dm(this);
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        gga ggaVar = this.c;
        Locale locale = this.b;
        String string = ggaVar.getString(R.string.APP_LANGUAGE_SETTINGS_CONFIRMATION_TITLE, new Object[]{this.a.getDisplayName(), locale.getDisplayName(locale)});
        cjkp B = cjkr.B();
        B.t(string);
        ((cjke) B).e = this.c.getString(R.string.APP_LANGUAGE_SETTINGS_CONFIRMATION_PROMPT);
        B.x(2131232159);
        B.z(this.c.getString(R.string.OK_BUTTON), new View.OnClickListener(this) { // from class: btbr
            private final btbt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btbt btbtVar = this.a;
                Locale locale2 = btbtVar.b;
                if (btbtVar.g.b()) {
                    btbtVar.aT();
                    bwqv bwqvVar = btbtVar.d;
                    btbm btbmVar = new btbm();
                    Bundle bundle2 = new Bundle();
                    bwqvVar.c(bundle2, "new_locale_key", locale2);
                    btbmVar.B(bundle2);
                    btbtVar.c.D(btbmVar);
                    return;
                }
                btbtVar.e.a(locale2);
            }
        }, cjtd.a(dtxj.bb));
        B.y(this.c.getString(R.string.CANCEL_BUTTON), null, cjtd.a(dtxj.ba));
        B.v(this.c.getString(R.string.LEARN_MORE), new View.OnClickListener(this) { // from class: btbs
            private final btbt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btbt btbtVar = this.a;
                int i = cjxr.a;
                btbtVar.ad.a().m(cjxr.r(), 4);
            }
        }, null);
        return B.u(this.c).q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            Locale locale = (Locale) this.d.d(Locale.class, bundle, "old_locale_key");
            dbsk.s(locale);
            this.a = locale;
            Locale locale2 = (Locale) this.d.d(Locale.class, bundle, "new_locale_key");
            dbsk.s(locale2);
            this.b = locale2;
        } catch (IOException | NullPointerException e) {
            throw new IllegalStateException("Error loading locales", e);
        }
    }
}
