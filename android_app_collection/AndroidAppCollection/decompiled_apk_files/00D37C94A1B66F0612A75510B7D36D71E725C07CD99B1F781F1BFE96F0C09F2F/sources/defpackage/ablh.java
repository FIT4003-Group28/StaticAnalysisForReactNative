package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: ablh  reason: default package */
/* loaded from: classes.dex */
public class ablh extends dp {
    protected Activity a;
    private boolean b;

    @Override // defpackage.dp
    public void T(Activity activity) {
        super.T(activity);
        this.a = activity;
        this.b = zew.y(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        dp dpVar = this.C;
        if (dpVar instanceof dh) {
            ((dh) dpVar).ku();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.b || (this.C instanceof ablp)) {
            return;
        }
        o();
    }
}
