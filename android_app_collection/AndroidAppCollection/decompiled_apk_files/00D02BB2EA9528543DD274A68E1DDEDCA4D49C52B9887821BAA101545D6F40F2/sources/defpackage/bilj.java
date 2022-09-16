package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bilj  reason: default package */
/* loaded from: classes3.dex */
public class bilj implements bilh, bega {
    private final SpannableString a;
    private cjtd b;
    private boolean c;
    private doss d;

    public bilj(Activity activity) {
        SpannableString spannableString = new SpannableString(alp.a().b(activity.getResources().getString(R.string.LOCAL_WEATHER_TITLE)));
        this.a = spannableString;
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
    }

    @Override // defpackage.bilh
    public CharSequence b() {
        alp a = alp.a();
        doss dossVar = this.d;
        if (dossVar != null) {
            return a.b(dossVar.e ? dossVar.c : dossVar.d) + " " + a.b(this.d.b);
        }
        return "";
    }

    @Override // defpackage.bilh
    public CharSequence c() {
        CharSequence b = b();
        return b.toString().isEmpty() ? "" : TextUtils.concat(this.a, " ", b);
    }

    @Override // defpackage.bilh
    public Boolean d() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.bilh
    public cqtd g() {
        return null;
    }

    @Override // defpackage.bilh
    public jic h() {
        doss dossVar = this.d;
        if (dossVar != null) {
            return new jic(dossVar.a, ckqc.FULLY_QUALIFIED, 0);
        }
        return null;
    }

    @Override // defpackage.bilh
    public cjtd i() {
        return this.b;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        boolean z = (c.h().b & ImageMetadata.SHADING_MODE) != 0;
        this.c = z;
        if (z) {
            doss dossVar = c.h().af;
            if (dossVar == null) {
                dossVar = doss.f;
            }
            this.d = dossVar;
            cjta b = cjtd.b();
            b.b = c.a().e;
            b.d = dtxy.mP;
            this.b = b.a();
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.c);
    }
}
