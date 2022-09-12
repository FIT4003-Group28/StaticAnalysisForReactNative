package defpackage;
/* compiled from: PG */
/* renamed from: zux  reason: default package */
/* loaded from: classes7.dex */
final class zux implements Runnable {
    final /* synthetic */ zuy a;

    public zux(zuy zuyVar) {
        this.a = zuyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invalidateSelf();
    }
}
