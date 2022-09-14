package defpackage;
/* compiled from: PG */
/* renamed from: alwy  reason: default package */
/* loaded from: classes.dex */
public final class alwy {
    public static final alwy d = new alwy(-1, -1, 0);
    public static final alwy e = new alwy(-1, 0, 0);
    public final long a;
    public final int b;
    public final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public alwy(long j, int i, int i2) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public static alwx f() {
        return new alwx();
    }

    public final boolean a() {
        return (this.a == -1 && this.c == 0) ? false : true;
    }

    public final alxo b(@dzsi alxa alxaVar, int i) {
        int i2 = this.c;
        if (i2 != 0) {
            return alxaVar.h(i2).d(i);
        }
        long j = this.a;
        if (j != -1) {
            return alxaVar.f(j).c(i);
        }
        int i3 = this.b;
        if (i3 != -1) {
            return alxaVar.g(i3).c(i);
        }
        return alxo.c;
    }

    public final alxo c(@dzsi alxs alxsVar, int i) {
        if (alxsVar == null) {
            return alxo.c;
        }
        int i2 = this.c;
        if (i2 != 0) {
            return alxsVar.b(i2).d(i);
        }
        long j = this.a;
        if (j != -1) {
            return alxsVar.a(j).c(i);
        }
        int i3 = this.b;
        if (i3 != -1) {
            return alxsVar.a(i3).c(i);
        }
        return alxo.c;
    }

    public final alxp d(@dzsi alxs alxsVar) {
        if (alxsVar == null) {
            return alxp.e;
        }
        int i = this.c;
        if (i != 0) {
            return alxsVar.b(i);
        }
        long j = this.a;
        if (j != -1) {
            return alxsVar.a(j);
        }
        int i2 = this.b;
        if (i2 != -1) {
            return alxsVar.a(i2);
        }
        return alxp.e;
    }

    public final boolean e() {
        return this.a == -1 && this.b == -1 && this.c == 0;
    }

    public final boolean equals(@dzsi Object obj) {
        alwy alwyVar;
        return (obj instanceof alwy) && (alwyVar = (alwy) obj) != null && this.a == alwyVar.a && this.b == alwyVar.b;
    }

    public final int hashCode() {
        return ((((int) this.a) + 31) * 31) + this.b;
    }
}
