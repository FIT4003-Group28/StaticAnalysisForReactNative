package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: crbz  reason: default package */
/* loaded from: classes5.dex */
public final class crbz {
    public final String a;
    public final long b;
    public long c;
    public long d;
    private final String e;
    private final String f;

    public crbz(String str, String str2, long j, long j2, long j3, String str3) {
        this.a = str;
        this.e = str2;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.f = str3;
    }

    public final File a() {
        String str = this.f;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(Long.toHexString(this.b));
        return new File(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public final crca b() {
        return new crca(this.a, this.e);
    }

    public final String toString() {
        return this.a + ":" + this.e + ":" + Long.toHexString(this.b) + ":" + Long.toHexString(this.c) + ":" + Long.toHexString(this.d);
    }
}
