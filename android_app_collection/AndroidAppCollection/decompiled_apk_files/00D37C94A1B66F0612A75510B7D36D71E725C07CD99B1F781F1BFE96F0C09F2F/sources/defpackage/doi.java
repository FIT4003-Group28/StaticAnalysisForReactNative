package defpackage;
/* compiled from: PG */
/* renamed from: doi  reason: default package */
/* loaded from: classes3.dex */
public final class doi {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public long h;

    public doi(long j, String str, String str2, boolean z, boolean z2, String str3, long j2, int i) {
        this.h = j;
        this.g = str;
        this.f = str2;
        this.b = z;
        this.a = z2;
        this.e = str3;
        this.d = j2;
        this.c = i;
    }

    public doi(String str) {
        this.g = str;
        this.b = true;
        this.a = false;
        this.h = 0L;
        this.d = dop.a();
        this.c = 0;
        this.f = null;
        this.e = null;
    }
}
