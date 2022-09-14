package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bmgt  reason: default package */
/* loaded from: classes3.dex */
public class bmgt implements bmgs {
    private final gga a;
    private final bwqv b;
    private final bmez c;
    private final bwrs<ilo> d;
    @dzsi
    private final Locale e;
    private final bmfa f;
    private final cjtd g;
    private String h;
    private String i;

    public bmgt(bwrs<ilo> bwrsVar, bmfa bmfaVar, cjtd cjtdVar, gga ggaVar, bwqv bwqvVar, bmez bmezVar, bmfg bmfgVar) {
        this.h = "";
        this.i = "";
        this.d = bwrsVar;
        this.f = bmfaVar;
        this.g = cjtdVar;
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = bmezVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.e = bmfgVar.b(c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.h = c.s();
            this.i = c.C();
            if (this.h.isEmpty()) {
                this.h = c.n();
            }
            if (!this.i.isEmpty()) {
                return;
            }
            this.i = c.B();
        }
    }

    @Override // defpackage.bmgs
    public cqkl a() {
        bwqv bwqvVar = this.b;
        bwrs<ilo> bwrsVar = this.d;
        String str = this.h;
        String str2 = this.i;
        Locale locale = this.e;
        bmfa bmfaVar = this.f;
        bmfh bmfhVar = new bmfh();
        Bundle bundle = new Bundle();
        bundle.putString("placeName", str);
        bundle.putString("address", str2);
        bundle.putString("locale", locale == null ? "" : locale.getLanguage());
        bundle.putString("autoplay", bmfaVar.toString());
        bwqvVar.c(bundle, "placemark", bwrsVar);
        bmfhVar.B(bundle);
        this.c.a();
        this.a.C(bmfhVar, gfu.DIALOG_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }

    @Override // defpackage.bmgs
    public String b() {
        Locale locale = this.e;
        return locale == null ? this.a.getString(R.string.DUAL_LANGUAGE_BUTTON_DESCRIPTION_NO_LOCATION) : this.a.getString(R.string.DUAL_LANGUAGE_BUTTON_DESCRIPTION, new Object[]{locale.getDisplayLanguage()});
    }

    @Override // defpackage.bmgs
    public cqtd c() {
        cqss m;
        if (this.f == bmfa.PLACE) {
            m = ibm.x();
        } else {
            m = ibm.m();
        }
        return cqrt.g(2131232460, m);
    }

    @Override // defpackage.bmgs
    public cjtd d() {
        return this.g;
    }
}
