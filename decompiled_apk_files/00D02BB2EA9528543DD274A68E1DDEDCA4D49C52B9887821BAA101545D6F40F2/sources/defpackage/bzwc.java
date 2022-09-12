package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bzwc  reason: default package */
/* loaded from: classes.dex */
public final class bzwc {
    private final Application a;
    private final bwsa b;

    public bzwc(Application application, bwsa bwsaVar) {
        this.a = application;
        application.getPackageManager();
        this.b = bwsaVar;
    }

    public final <M extends dssj> bzwd<M> a(String str, dssr<M> dssrVar) {
        return new bzwd<>(this.a, this.b, str, dssrVar);
    }
}
