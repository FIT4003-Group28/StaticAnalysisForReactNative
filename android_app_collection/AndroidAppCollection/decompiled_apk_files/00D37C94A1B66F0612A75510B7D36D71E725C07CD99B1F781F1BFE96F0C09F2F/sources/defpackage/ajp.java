package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajp  reason: default package */
/* loaded from: classes.dex */
public final class ajp implements Runnable {
    final /* synthetic */ ajs a;
    final /* synthetic */ Object b;

    public ajp(ajs ajsVar, Object obj) {
        this.a = ajsVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
