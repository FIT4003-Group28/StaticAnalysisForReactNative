package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akno  reason: default package */
/* loaded from: classes.dex */
public final class akno implements Runnable {
    final /* synthetic */ aknq a;

    public akno(aknq aknqVar) {
        this.a = aknqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aklx aklxVar = this.a.a;
        aklxVar.r = true;
        aklxVar.c();
    }
}
