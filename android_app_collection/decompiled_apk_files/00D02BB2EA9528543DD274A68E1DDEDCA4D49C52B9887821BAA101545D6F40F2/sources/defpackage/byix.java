package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byix  reason: default package */
/* loaded from: classes4.dex */
public class byix implements byid {
    private final Context a;
    private final dxio<afef> b;

    public byix(Activity activity, dxio<afef> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.byid
    public String a() {
        return this.a.getString(R.string.COMMUTE_HUB_ZERO_STATE_INCOGNITO_INFORMATION_TEXT);
    }

    @Override // defpackage.byid
    public String b() {
        return this.a.getString(R.string.COMMUTE_HUB_ZERO_STATE_EXIT_INCOGNITO_BUTTON_TEXT);
    }

    @Override // defpackage.byid
    public cqkl c() {
        this.b.a().e(false);
        return cqkl.a;
    }
}
