package defpackage;
/* compiled from: PG */
/* renamed from: tev  reason: default package */
/* loaded from: classes4.dex */
public final class tev {
    private final Object a = new Object();
    private volatile Object b;

    public final Object a(teu teuVar) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = teuVar.a();
                }
            }
        }
        return this.b;
    }
}
