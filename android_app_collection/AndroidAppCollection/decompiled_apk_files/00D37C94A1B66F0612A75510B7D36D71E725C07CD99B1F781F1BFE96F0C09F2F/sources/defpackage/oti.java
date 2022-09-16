package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oti  reason: default package */
/* loaded from: classes4.dex */
public final class oti implements Runnable {
    final /* synthetic */ ouy a;
    final /* synthetic */ otk b;

    public oti(otk otkVar, ouy ouyVar) {
        this.b = otkVar;
        this.a = ouyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.e(this.a);
    }
}
