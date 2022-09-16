package defpackage;
/* compiled from: PG */
/* renamed from: booh  reason: default package */
/* loaded from: classes3.dex */
final class booh implements Runnable {
    final /* synthetic */ boou a;
    final /* synthetic */ booq b;
    final /* synthetic */ boon c;

    public booh(boon boonVar, boou boouVar, booq booqVar) {
        this.c = boonVar;
        this.a = boouVar;
        this.b = booqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a();
        if (this.a.t().booleanValue()) {
            this.b.h(null);
        } else if (this.a.s().booleanValue()) {
            this.b.h(bonn.e(0, 0, 0, 0));
        } else {
            this.b.h(bonn.e(this.a.G().intValue(), this.a.H().intValue(), this.a.M().intValue(), this.a.N().intValue()));
        }
    }
}
