package defpackage;
/* compiled from: PG */
/* renamed from: aflg  reason: default package */
/* loaded from: classes2.dex */
public final class aflg implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ aflh b;

    public aflg(aflh aflhVar, String str) {
        this.b = aflhVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a().f(this.a);
    }
}
