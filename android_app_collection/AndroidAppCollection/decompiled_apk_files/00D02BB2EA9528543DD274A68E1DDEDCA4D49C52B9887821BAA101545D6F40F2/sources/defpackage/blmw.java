package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blmw  reason: default package */
/* loaded from: classes3.dex */
final class blmw implements cdix {
    final /* synthetic */ blmx a;

    public blmw(blmx blmxVar) {
        this.a = blmxVar;
    }

    @Override // defpackage.cdix
    public final void a() {
        if (!this.a.g.b()) {
            return;
        }
        blmx blmxVar = this.a;
        bvrb bvrbVar = blmxVar.f;
        Activity activity = blmxVar.c;
        cjxu.g(bvrbVar, activity, activity.getString(R.string.DELETE_REVIEW_FAILED));
        this.a.f();
    }

    @Override // defpackage.cdix
    public final void b() {
        if (!this.a.g.b()) {
            return;
        }
        blmx blmxVar = this.a;
        bvrb bvrbVar = blmxVar.f;
        Activity activity = blmxVar.c;
        cjxu.g(bvrbVar, activity, activity.getString(R.string.DELETE_REVIEW_SUCCESS));
        this.a.f();
    }
}
