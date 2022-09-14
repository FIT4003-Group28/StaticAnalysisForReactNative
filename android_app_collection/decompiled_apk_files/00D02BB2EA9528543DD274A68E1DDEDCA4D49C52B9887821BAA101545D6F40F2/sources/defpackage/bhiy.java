package defpackage;

import android.app.Activity;
import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bhiy  reason: default package */
/* loaded from: classes3.dex */
public class bhiy implements bhiq, bega {
    private static final dcqe a = dcqe.c("bhiy");
    private final boolean b;
    private final Activity c;
    private final bhhf d;
    private final dxio<bheb> e;
    private final bhiu f;
    private cjtd g = cjtd.b;
    @dzsi
    private acpa h;
    @dzsi
    private bwrs<ilo> i;

    public bhiy(boolean z, Activity activity, bhhf bhhfVar, bhiu bhiuVar, dxio<bheb> dxioVar) {
        this.b = z;
        this.c = activity;
        this.d = bhhfVar;
        this.f = bhiuVar;
        this.e = dxioVar;
    }

    @Override // defpackage.bhiq
    public acpa a() {
        if (this.h == null) {
            Spanned fromHtml = Html.fromHtml(this.c.getString(R.string.MANAGE_BUSINESS_BRANDING_TOOLTIP, new Object[]{String.format("https://support.google.com/business?p=business_on_maps&hl=%s", Locale.getDefault().getLanguage())}));
            this.h = new acpc(fromHtml, fromHtml);
        }
        return this.h;
    }

    @Override // defpackage.bhiq
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bhiq
    public CharSequence c() {
        return this.c.getString(R.string.MANAGE_BUSINESS_LABEL);
    }

    @Override // defpackage.bhiq
    @dzsi
    public bhio d() {
        if (this.d.i(this.i)) {
            return this.f;
        }
        return null;
    }

    @Override // defpackage.bhiq
    public void e() {
        bhiu bhiuVar = this.f;
        bhiuVar.b = true;
        cqhn cqhnVar = bhiuVar.a;
        cqkx.p(bhiuVar);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!this.d.i(bwrsVar)) {
            return;
        }
        ilo c = bwrsVar.c();
        if (c == null) {
            bvoo.h("Placemark cannot be null.", new Object[0]);
            return;
        }
        this.i = bwrsVar;
        this.f.t(bwrsVar);
        this.e.a().a(c, this.f);
        if (this.b) {
            this.g = this.d.e(c, dtxv.cO);
        } else {
            this.g = this.d.e(c, dtxv.cN);
        }
        this.f.c = this.g;
    }

    @Override // defpackage.bega
    public void u() {
        this.i = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.d.i(this.i));
    }
}
