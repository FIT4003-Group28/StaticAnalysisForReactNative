package defpackage;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jva  reason: default package */
/* loaded from: classes3.dex */
public final class jva implements Comparator {
    private final boolean a;
    private final int b;

    public jva(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    private static Long b(aqdv aqdvVar) {
        aqdy aqdyVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aqdt aqdtVar = aqdvVar.l;
        if (aqdtVar == null) {
            aqdtVar = aqdt.a;
        }
        if (aqdtVar.b == 135744618) {
            aqdyVar = (aqdy) aqdtVar.c;
        } else {
            aqdyVar = aqdy.a;
        }
        return Long.valueOf(timeUnit.toMillis(aqdyVar.c));
    }

    private static String c(aqdv aqdvVar) {
        arag aragVar;
        arag aragVar2 = null;
        if ((aqdvVar.b & 1) != 0) {
            aragVar = aqdvVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        if (ajgl.b(aragVar) == null) {
            return "";
        }
        if ((aqdvVar.b & 1) != 0 && (aragVar2 = aqdvVar.g) == null) {
            aragVar2 = arag.a;
        }
        return akzj.g(ajgl.b(aragVar2).toString());
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public final int compare(aqdv aqdvVar, aqdv aqdvVar2) {
        if (this.b == 3) {
            if (this.a) {
                return b(aqdvVar2).compareTo(b(aqdvVar));
            }
            return b(aqdvVar).compareTo(b(aqdvVar2));
        } else if (this.a) {
            return c(aqdvVar2).compareTo(c(aqdvVar));
        } else {
            return c(aqdvVar).compareTo(c(aqdvVar2));
        }
    }
}
