package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzd  reason: default package */
/* loaded from: classes3.dex */
public final class jzd implements ahqw {
    public final jxt a;
    public final acti b;
    public ahqv c;

    public jzd(Activity activity, acti actiVar) {
        actiVar.getClass();
        this.b = actiVar;
        jxt jxtVar = new jxt(activity.getString(R.string.vr_overflow_menu_item), new jzc(this));
        this.a = jxtVar;
        jxtVar.e = zag.f(activity, 2131233491, R.attr.ytTextPrimary);
        a(false);
    }

    @Override // defpackage.ahqw
    public final void a(boolean z) {
        this.a.g(z);
        this.b.D(new acte(actj.VR_MODE_MENU_ITEM_BUTTON));
    }
}
