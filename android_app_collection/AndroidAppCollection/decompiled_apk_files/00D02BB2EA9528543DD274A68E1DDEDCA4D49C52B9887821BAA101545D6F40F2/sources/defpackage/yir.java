package defpackage;
/* compiled from: PG */
/* renamed from: yir  reason: default package */
/* loaded from: classes7.dex */
public final class yir extends dsqp<yis, yir> implements dssk {
    public yir() {
        super(yis.b);
    }

    public final void a(Iterable<? extends yiq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        yis yisVar = (yis) this.b;
        yis yisVar2 = yis.b;
        yisVar.b();
        dsod.bv(iterable, yisVar.a);
    }

    public final void b(yiq yiqVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        yis yisVar = (yis) this.b;
        yis yisVar2 = yis.b;
        yiqVar.getClass();
        yisVar.b();
        yisVar.a.add(yiqVar);
    }
}
