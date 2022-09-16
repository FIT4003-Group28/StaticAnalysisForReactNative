package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cmma  reason: default package */
/* loaded from: classes5.dex */
final class cmma {
    public final int a;
    public final String b;
    public final TreeSet<cmmm> c = new TreeSet<>();
    public final ArrayList<cmlz> d = new ArrayList<>();
    public cmmh e;

    public cmma(int i, String str, cmmh cmmhVar) {
        this.a = i;
        this.b = str;
        this.e = cmmhVar;
    }

    public final boolean a(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            cmlz cmlzVar = this.d.get(i);
            long j3 = cmlzVar.b;
            if (j3 == -1) {
                if (j >= cmlzVar.a) {
                    return true;
                }
            } else if (j2 != -1) {
                long j4 = cmlzVar.a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmma cmmaVar = (cmma) obj;
            if (this.a == cmmaVar.a && this.b.equals(cmmaVar.b) && this.c.equals(cmmaVar.c) && this.e.equals(cmmaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }
}
