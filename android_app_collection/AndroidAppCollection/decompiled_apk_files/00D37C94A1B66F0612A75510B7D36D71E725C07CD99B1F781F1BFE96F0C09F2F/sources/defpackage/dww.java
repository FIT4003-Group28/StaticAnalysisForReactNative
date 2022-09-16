package defpackage;
/* compiled from: PG */
/* renamed from: dww  reason: default package */
/* loaded from: classes3.dex */
public final class dww {
    private final dyo a;
    private final dwq b;
    private Boolean c;

    public dww(dyo dyoVar, dwq dwqVar) {
        this.a = dyoVar;
        this.b = dwqVar;
    }

    public final nmi a() {
        axzl.n(this.c, Boolean.class);
        return new dwy(this.a, this.b, this.c);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
