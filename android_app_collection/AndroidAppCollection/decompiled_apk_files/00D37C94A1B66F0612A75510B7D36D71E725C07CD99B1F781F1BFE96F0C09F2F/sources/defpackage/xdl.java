package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: xdl  reason: default package */
/* loaded from: classes4.dex */
public final class xdl implements Comparable, Serializable {
    public final long a;
    public final apzg b;

    private xdl(apzg apzgVar, long j) {
        this.b = apzgVar;
        this.a = j;
    }

    public static xdl a(apbf apbfVar, long j) {
        apbg apbgVar;
        long round;
        if (apbfVar != null) {
            apbgVar = apbfVar.c;
            if (apbgVar == null) {
                apbgVar = apbg.a;
            }
        } else {
            apbgVar = null;
        }
        if (apbgVar == null) {
            return null;
        }
        int c = apdw.c(apbgVar.b);
        if (c == 0) {
            c = 1;
        }
        int i = c - 1;
        if (i == 1) {
            round = Math.round(apbgVar.c * ((float) j));
        } else if (i != 2) {
            return null;
        } else {
            round = apbgVar.d;
        }
        if (round < 0) {
            return null;
        }
        apzg apzgVar = apbfVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return new xdl(apzgVar, round);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((xdl) obj).a));
    }
}
