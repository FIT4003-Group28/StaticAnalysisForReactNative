package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: spa  reason: default package */
/* loaded from: classes4.dex */
final class spa implements Serializable, spo {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.spo
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return spo.class;
    }

    @Override // defpackage.spo
    public final int b() {
        return 1000;
    }

    @Override // defpackage.spo
    public final int c() {
        return 1;
    }

    @Override // defpackage.spo
    public final int d() {
        return 1;
    }

    @Override // defpackage.spo
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spo) {
            spo spoVar = (spo) obj;
            spoVar.d();
            spoVar.e();
            spoVar.a();
            spoVar.b();
            spoVar.c();
            spoVar.f();
            if (a.equals(spoVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.spo
    public final long f() {
        return 1L;
    }

    @Override // defpackage.spo
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
