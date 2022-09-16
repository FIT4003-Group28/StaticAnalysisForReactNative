package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abhu  reason: default package */
/* loaded from: classes.dex */
public final class abhu implements Runnable {
    public final Object a;
    public final long b;
    public final long c;
    public apzg d;
    final /* synthetic */ abhw e;
    private final String f;

    public abhu(abhw abhwVar, String str, Object obj, long j, long j2) {
        this.e = abhwVar;
        this.f = str;
        this.a = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b.remove(this.a);
        this.e.c.remove(this.f);
    }
}
