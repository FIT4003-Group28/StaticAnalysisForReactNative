package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aafg  reason: default package */
/* loaded from: classes2.dex */
class aafg implements aafd {
    private final Activity b;
    private final String c;
    private boolean d = false;
    public dbsg<eapg> a = dbpy.a;

    public aafg(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    @Override // defpackage.aafd
    public CharSequence a() {
        return !this.a.a() ? "" : DateUtils.formatDateTime(this.b, this.a.b().n().getTime(), 524314);
    }

    @Override // defpackage.aafd
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.aafd
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aafd
    public CharSequence d() {
        String string;
        if (c().booleanValue()) {
            string = this.b.getString(R.string.DATE_PICKER_SELECTED);
        } else {
            string = this.b.getString(R.string.DATE_PICKER_NOT_SELECTED);
        }
        return this.a.a() ? this.b.getString(aaai.DATE_PICKER_FILLED_DATE_BOX_DESCRIPTION, new Object[]{this.c, a(), string}) : this.b.getString(aaai.DATE_PICKER_EMPTY_DATE_BOX_DESCRIPTION, new Object[]{this.c, string});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Boolean bool) {
        this.d = bool.booleanValue();
    }
}
