package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bzf  reason: default package */
/* loaded from: classes2.dex */
public final class bzf extends cdi {
    public Path a;
    private final cdi o;

    public bzf(bwx bwxVar, cdi cdiVar) {
        super(bwxVar, (PointF) cdiVar.b, (PointF) cdiVar.c, cdiVar.d, cdiVar.e, cdiVar.f, cdiVar.g, cdiVar.h);
        this.o = cdiVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        cdi cdiVar = this.o;
        this.a = cdh.f((PointF) obj4, (PointF) obj, cdiVar.m, cdiVar.n);
    }
}
