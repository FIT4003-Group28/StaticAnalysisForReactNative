package defpackage;
/* compiled from: PG */
/* renamed from: cxok  reason: default package */
/* loaded from: classes5.dex */
public final class cxok implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Exception b;

    public cxok(String str, Exception exc) {
        this.a = str;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new cxoj(this.a, this.b);
    }
}
