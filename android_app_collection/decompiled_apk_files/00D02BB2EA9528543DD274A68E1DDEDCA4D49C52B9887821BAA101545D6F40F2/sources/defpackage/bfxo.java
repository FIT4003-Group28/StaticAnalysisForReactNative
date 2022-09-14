package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfxo  reason: default package */
/* loaded from: classes3.dex */
public class bfxo implements bnif, bega {
    private final Activity a;
    private final Resources b;
    @dzsi
    private bwrs<ilo> c;

    public bfxo(Activity activity) {
        this.a = activity;
        this.b = activity.getResources();
    }

    @Override // defpackage.bnif
    public Boolean a() {
        return w();
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(2131231715, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        CharSequence m = m();
        if (m != null && m.length() > 0) {
            ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.b.getString(R.string.COPIED_COORDINATES_LABEL), m));
            Toast.makeText(this.a, this.b.getString(R.string.COPIED_COORDINATES_TOAST), 1).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(dtxy.jk);
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        bwrs<ilo> bwrsVar = this.c;
        akqq akqqVar = null;
        ilo c = bwrsVar != null ? bwrsVar.c() : null;
        if (c != null) {
            akqqVar = c.E;
        }
        return akqqVar == null ? "" : this.b.getString(R.string.LAT_LNG, Double.valueOf(akqqVar.a), Double.valueOf(akqqVar.b));
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bwrs<ilo> bwrsVar = this.c;
        boolean z = false;
        if (bwrsVar == null) {
            return false;
        }
        ilo c = bwrsVar.c();
        if (c != null && c.aU()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
