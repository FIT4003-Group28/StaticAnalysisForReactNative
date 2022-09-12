package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aqvm  reason: default package */
/* loaded from: classes2.dex */
final class aqvm implements degu<apzp> {
    private final WeakReference<Activity> a;
    private final String b;
    private final String c;

    public aqvm(Activity activity, String str, String str2) {
        this.a = new WeakReference<>(activity);
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        ckos.a(activity.findViewById(16908290), this.c, 0).c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi apzp apzpVar) {
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        ckos.a(activity.findViewById(16908290), this.b, 0).c();
    }
}
