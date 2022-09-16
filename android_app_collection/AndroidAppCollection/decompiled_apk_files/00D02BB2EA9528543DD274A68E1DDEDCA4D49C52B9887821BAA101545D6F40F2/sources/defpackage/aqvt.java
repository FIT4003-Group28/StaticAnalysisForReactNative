package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aqvt  reason: default package */
/* loaded from: classes2.dex */
final class aqvt implements degu<apzn> {
    private final WeakReference<Activity> a;
    private final String b;
    private final String c;

    public aqvt(Activity activity, String str, String str2) {
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
    public final /* bridge */ /* synthetic */ void b(@dzsi apzn apznVar) {
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        ckos.a(activity.findViewById(16908290), this.b, 0).c();
    }
}
