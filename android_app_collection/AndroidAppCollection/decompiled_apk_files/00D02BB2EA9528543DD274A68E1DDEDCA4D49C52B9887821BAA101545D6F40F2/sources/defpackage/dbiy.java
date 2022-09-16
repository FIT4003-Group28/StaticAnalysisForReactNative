package defpackage;
/* compiled from: PG */
/* renamed from: dbiy  reason: default package */
/* loaded from: classes5.dex */
public final class dbiy {
    public int a = 0;

    public final boolean a() {
        return this.a == 0;
    }

    public final boolean b(int i) {
        return this.a != i && !a();
    }

    public final void c() {
        int i = this.a + 1;
        this.a = i;
        if (i == 0) {
            this.a = 1;
        }
    }
}
