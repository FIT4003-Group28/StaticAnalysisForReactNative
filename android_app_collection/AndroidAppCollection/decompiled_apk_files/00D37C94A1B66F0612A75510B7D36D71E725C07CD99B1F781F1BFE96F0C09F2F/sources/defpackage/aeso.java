package defpackage;
/* compiled from: PG */
/* renamed from: aeso  reason: default package */
/* loaded from: classes.dex */
public abstract class aeso {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;

    public aeso(String str, int i, long j, long j2, String str2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public abstract long a();

    public boolean b(aeso aesoVar) {
        return c(aesoVar) && aesoVar.b <= this.b;
    }

    public final boolean c(aeso aesoVar) {
        String str = this.a;
        return str != null && str.equals(aesoVar.a);
    }
}
