package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cac  reason: default package */
/* loaded from: classes2.dex */
public final class cac implements cak {
    public final List a;

    public cac() {
        this.a = Collections.singletonList(new cdi(new PointF(0.0f, 0.0f)));
    }

    public cac(List list) {
        this.a = list;
    }

    @Override // defpackage.cak
    public final byy a() {
        if (((cdi) this.a.get(0)).e()) {
            return new bzh(this.a);
        }
        return new bzg(this.a);
    }

    @Override // defpackage.cak
    public final List b() {
        return this.a;
    }

    @Override // defpackage.cak
    public final boolean c() {
        return this.a.size() == 1 && ((cdi) this.a.get(0)).e();
    }
}
