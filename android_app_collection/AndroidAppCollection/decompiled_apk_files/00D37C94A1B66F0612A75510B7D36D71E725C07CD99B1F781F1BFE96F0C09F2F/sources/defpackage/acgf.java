package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: acgf  reason: default package */
/* loaded from: classes.dex */
public final class acgf {
    public final vne a;

    public acgf(azqb azqbVar, abzc abzcVar) {
        vne vneVar = (vne) azqbVar.get();
        this.a = vneVar;
        if (abzcVar.i()) {
            vneVar.a();
        }
    }

    public acgf(vne vneVar) {
        this.a = vneVar;
    }

    public final aotz a() {
        ankt a = this.a.a();
        if (a.isDone()) {
            try {
                return (aotz) anlz.y(a);
            } catch (ExecutionException e) {
                zep.d("Error getting LiveCreationSchema from PDS", e);
                return null;
            }
        }
        return null;
    }

    public final String b() {
        aotz a = a();
        if (a == null) {
            return null;
        }
        return a.c;
    }

    public final ankt c() {
        return anii.h(this.a.a(), fcq.q, anjk.a);
    }

    public final ankt d() {
        return anii.h(this.a.a(), fcq.r, anjk.a);
    }

    public final ankt e() {
        return this.a.b(new fcq(17), anjk.a);
    }
}
