package defpackage;

import android.app.Activity;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amhw  reason: default package */
/* loaded from: classes.dex */
public final class amhw {
    private final dt a;
    private final Set b;
    private boolean c = false;

    public amhw(Activity activity, Set set) {
        this.a = (dt) activity;
        this.b = set;
    }

    public final void a() {
        if (!this.c) {
            amzs it = ((amyg) this.b).iterator();
            while (it.hasNext()) {
                this.a.getLifecycle().c((apx) it.next());
            }
            this.c = true;
        }
    }
}
