package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckg  reason: default package */
/* loaded from: classes2.dex */
public final class ckg {
    private final cls a;
    private volatile clt b;

    public ckg(cls clsVar) {
        this.a = clsVar;
    }

    public final clt a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new clv();
                }
            }
        }
        return this.b;
    }
}
