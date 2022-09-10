package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb implements Runnable {
    final /* synthetic */ gn a;

    public gb(gn gnVar) {
        this.a = gnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.at(true);
    }
}
