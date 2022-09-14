package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awqu  reason: default package */
/* loaded from: classes3.dex */
public final class awqu implements Runnable {
    final /* synthetic */ awqz a;

    public awqu(awqz awqzVar) {
        this.a = awqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        awtn f = this.a.h.f();
        if (f == null) {
            return;
        }
        this.a.m(f, false);
    }
}
