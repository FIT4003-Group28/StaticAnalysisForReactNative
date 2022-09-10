package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cwxs  reason: default package */
/* loaded from: classes5.dex */
final class cwxs implements cwqx, cwqv {
    final /* synthetic */ cwxu a;

    public cwxs(cwxu cwxuVar) {
        this.a = cwxuVar;
    }

    @Override // defpackage.cwqv
    public final void a(Activity activity) {
        cwsv cwsvVar;
        cwxu cwxuVar = this.a;
        Class<?> cls = activity.getClass();
        if (!dbsj.d(null)) {
            String valueOf = String.valueOf(cls.getSimpleName());
            cwsvVar = new cwsv(valueOf.length() != 0 ? "null".concat(valueOf) : new String("null"));
        } else {
            cwsvVar = new cwsv(cls.getSimpleName());
        }
        cwxuVar.a = cwsvVar;
    }

    @Override // defpackage.cwqx
    public final void b(Activity activity) {
        this.a.a = null;
    }
}
