package defpackage;
/* compiled from: PG */
/* renamed from: oxi  reason: default package */
/* loaded from: classes4.dex */
final class oxi implements Runnable {
    final /* synthetic */ ouy a;
    final /* synthetic */ oxk b;

    public oxi(oxk oxkVar, ouy ouyVar) {
        this.b = oxkVar;
        this.a = ouyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
