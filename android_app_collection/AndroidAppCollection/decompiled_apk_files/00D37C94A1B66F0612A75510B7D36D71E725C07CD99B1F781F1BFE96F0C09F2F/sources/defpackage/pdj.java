package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: pdj  reason: default package */
/* loaded from: classes4.dex */
public class pdj implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public pdj(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(pdj pdjVar) {
        if (!this.a.equals(pdjVar.a)) {
            return this.a.compareTo(pdjVar.a);
        }
        long j = this.b - pdjVar.b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    public final boolean b() {
        return !this.d;
    }

    public final boolean c() {
        return this.c == -1;
    }
}
