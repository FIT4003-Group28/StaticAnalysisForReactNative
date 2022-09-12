package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qfs  reason: default package */
/* loaded from: classes7.dex */
public final class qfs implements qfp {
    public final qfr a;
    private final Activity b;

    public qfs(Activity activity, qfr qfrVar) {
        this.b = activity;
        this.a = qfrVar;
    }

    @Override // defpackage.qfp
    public final void a() {
    }

    @Override // defpackage.qfp
    public final void b() {
        ckos.b(this.b.findViewById(16908290), R.string.BIKESHARING_VEHICLE_NOT_AVAILABLE, 0).c();
    }

    @Override // defpackage.qfp
    public final void c() {
        ckos.b(this.b.findViewById(16908290), R.string.SOMETHING_WENT_WRONG, 0).c();
    }
}
