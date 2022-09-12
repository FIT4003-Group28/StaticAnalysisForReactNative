package defpackage;
/* compiled from: PG */
/* renamed from: dbiw  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbiw {
    private int a = 0;

    protected abstract void a();

    public final void b() {
        this.a++;
    }

    public final void c() {
        int i = this.a - 1;
        this.a = i;
        if (i > 0) {
            return;
        }
        a();
    }
}
