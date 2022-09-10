package defpackage;
/* compiled from: PG */
/* renamed from: bpuj  reason: default package */
/* loaded from: classes4.dex */
public final class bpuj extends dsqp<bpuk, bpuj> implements dssk {
    public bpuj() {
        super(bpuk.c);
    }

    public final void a(Iterable<? extends digh> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bpuk bpukVar = (bpuk) this.b;
        bpuk bpukVar2 = bpuk.c;
        bpukVar.b();
        dsod.bv(iterable, bpukVar.a);
    }

    public final void b(digh dighVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bpuk bpukVar = (bpuk) this.b;
        bpuk bpukVar2 = bpuk.c;
        dighVar.getClass();
        bpukVar.b();
        bpukVar.a.add(dighVar);
    }
}
