package defpackage;
/* compiled from: PG */
/* renamed from: alj  reason: default package */
/* loaded from: classes2.dex */
final class alj implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ alk b;

    public alj(alk alkVar, Object obj) {
        this.b = alkVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.a(this.a);
    }
}
