package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: avfp  reason: default package */
/* loaded from: classes2.dex */
public final class avfp {
    private final Application a;
    private final bvrb b;
    private boolean c = false;

    public avfp(Application application, bvrb bvrbVar) {
        this.a = application;
        this.b = bvrbVar;
    }

    public final synchronized void a() {
        if (this.c) {
            return;
        }
        bvqm.a(this.a, bvrj.OFFLINE_REGION_MANAGEMENT, this.b);
        this.c = true;
    }
}
