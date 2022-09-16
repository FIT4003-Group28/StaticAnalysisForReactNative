package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: clge  reason: default package */
/* loaded from: classes5.dex */
public abstract class clge {
    public abstract clig a();

    public abstract Map<clcv, clgc> b();

    public final long c(clcv clcvVar, long j, int i) {
        long a = a().a();
        clgc clgcVar = b().get(clcvVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, i - 1)) * clgcVar.a(), j - a), clgcVar.b());
    }
}
