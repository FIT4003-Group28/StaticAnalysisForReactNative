package defpackage;
/* compiled from: PG */
/* renamed from: agqz  reason: default package */
/* loaded from: classes.dex */
public final class agqz {
    public final String a;
    public final avkl b;
    public final int c;
    public final long d;
    public final long e;
    public final agpw f;
    public final agpw g;
    public final String h;
    public final afvm i;

    public agqz(String str, avkl avklVar, int i, long j, long j2, agpw agpwVar, agpw agpwVar2, String str2, afvm afvmVar) {
        zgh.m(str);
        this.a = str;
        avklVar.getClass();
        this.b = avklVar;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = agpwVar;
        agpwVar2.getClass();
        this.g = agpwVar2;
        this.h = str2;
        this.i = afvmVar;
    }

    public final int a() {
        long j = this.e;
        long j2 = 0;
        if (j != 0) {
            j2 = (this.d * 100) / j;
        }
        return (int) j2;
    }

    public final boolean b() {
        return this.b == avkl.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean c() {
        return b() || this.b == avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agqz)) {
            return false;
        }
        return this.a.equals(((agqz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append("{transferId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
