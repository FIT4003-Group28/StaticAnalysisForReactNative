package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: apyx  reason: default package */
/* loaded from: classes2.dex */
public class apyx {
    public final dxio<btwr> a;
    public final dxio<btvo> b;
    private final boolean c;
    private final acyp d;

    public apyx(dxio<btwr> dxioVar, dxio<btvo> dxioVar2, acyp acypVar, Application application) {
        this.c = btsj.b(application);
        this.a = dxioVar;
        this.b = dxioVar2;
        this.d = acypVar;
    }

    public final boolean a() {
        return this.c && this.b.a().getEnableFeatureParameters().aR;
    }

    public final boolean b() {
        return c(null);
    }

    public final boolean c(@dzsi btlu btluVar) {
        return a() && this.d.a() && this.a.a().b(btluVar).getBusinessMessagingParameters().M;
    }

    public final boolean d() {
        return b() && this.b.a().getBusinessMessagingParameters().L;
    }

    public final boolean e() {
        return d() && this.b.a().getBusinessMessagingParameters().N;
    }

    public final boolean f() {
        return this.b.a().getBusinessMessagingParameters().U || d();
    }

    public final void g() {
        a();
    }

    public final void h() {
        a();
    }
}
