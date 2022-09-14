package defpackage;
/* compiled from: PG */
/* renamed from: eamy  reason: default package */
/* loaded from: classes6.dex */
public class eamy {
    public int a;
    protected int b;

    public final boolean a() {
        return this.a == 1;
    }

    public final boolean b() {
        return this.a == 2;
    }

    public final String c() {
        int i = this.a;
        return i != 0 ? i != 1 ? "OBJECT" : "ARRAY" : "ROOT";
    }

    public final int d() {
        return this.b + 1;
    }

    public final int e() {
        int i = this.b;
        if (i < 0) {
            return 0;
        }
        return i;
    }
}
