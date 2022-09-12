package defpackage;
/* compiled from: PG */
/* renamed from: blpd  reason: default package */
/* loaded from: classes3.dex */
final class blpd implements Runnable {
    final /* synthetic */ btzr a;
    final /* synthetic */ btzy b;
    final /* synthetic */ blpe c;

    public blpd(blpe blpeVar, btzr btzrVar, btzy btzyVar) {
        this.c = blpeVar;
        this.a = btzrVar;
        this.b = btzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.QY(this.a, this.b);
        this.c.b.l();
    }
}
