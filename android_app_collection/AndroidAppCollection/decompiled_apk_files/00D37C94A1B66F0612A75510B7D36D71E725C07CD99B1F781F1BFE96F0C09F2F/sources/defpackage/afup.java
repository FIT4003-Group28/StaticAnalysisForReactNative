package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afup  reason: default package */
/* loaded from: classes.dex */
final class afup {
    final String a;
    public final aqlh b;
    long c;

    public afup(long j, String str, aqlh aqlhVar) {
        this.a = str;
        this.c = aqlhVar != null ? j - TimeUnit.SECONDS.toMillis(aqlhVar.c) : 0L;
        this.b = aqlhVar;
    }
}
