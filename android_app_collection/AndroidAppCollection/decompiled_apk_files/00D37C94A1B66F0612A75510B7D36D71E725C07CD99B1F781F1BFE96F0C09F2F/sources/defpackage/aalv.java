package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aalv  reason: default package */
/* loaded from: classes.dex */
public final class aalv implements Comparable {
    public final String a;
    public final String b;
    public final boolean c;

    public aalv(String str, String str2, boolean z) {
        zgh.m(str);
        this.a = str;
        zgh.m(str2);
        this.b = str2;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aalv aalvVar = (aalv) obj;
        if (aalvVar == null) {
            return 1;
        }
        return this.b.compareTo(aalvVar.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aalv)) {
            return false;
        }
        aalv aalvVar = (aalv) obj;
        return this.a.equals(aalvVar.a) && this.b.equals(aalvVar.b) && this.c == aalvVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }
}
