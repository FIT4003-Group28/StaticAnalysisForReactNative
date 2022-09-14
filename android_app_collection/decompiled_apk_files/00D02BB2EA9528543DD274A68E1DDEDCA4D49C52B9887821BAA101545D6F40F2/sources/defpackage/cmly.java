package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cmly  reason: default package */
/* loaded from: classes5.dex */
public class cmly implements Comparable<cmly> {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public cmly(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    public final boolean a() {
        return !this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(cmly cmlyVar) {
        if (!this.a.equals(cmlyVar.a)) {
            return this.a.compareTo(cmlyVar.a);
        }
        long j = this.b - cmlyVar.b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
