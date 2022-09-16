package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oth  reason: default package */
/* loaded from: classes4.dex */
public final class oth implements Runnable {
    final /* synthetic */ oux a;
    final /* synthetic */ otk b;

    public oth(otk otkVar, oux ouxVar) {
        this.b = otkVar;
        this.a = ouxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
