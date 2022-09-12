package defpackage;

import android.app.Activity;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzps  reason: default package */
/* loaded from: classes4.dex */
public final class bzps implements awnl {
    private final transient bzpq a;

    public bzps(bzpq bzpqVar) {
        this.a = bzpqVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.FOOTPRINTS_WAA_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            this.a.b();
        } else if (i == 2) {
            this.a.c();
        } else {
            this.a.d();
        }
    }
}
