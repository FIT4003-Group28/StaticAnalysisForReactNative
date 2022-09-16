package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xet  reason: default package */
/* loaded from: classes4.dex */
public final class xet implements ainv {
    private final azqb b;

    public xet(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.ainv
    public final int a() {
        return !TextUtils.isEmpty(((xes) this.b.get()).a.l) ? R.layout.ad_notification : R.layout.ad_notification_no_title;
    }

    @Override // defpackage.ainv
    public final int b() {
        return R.id.byline;
    }

    @Override // defpackage.ainv
    public final int c() {
        return R.id.title;
    }

    @Override // defpackage.ainv
    public final boolean d() {
        return Build.VERSION.SDK_INT > 23;
    }
}
