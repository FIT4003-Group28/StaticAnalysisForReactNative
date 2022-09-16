package defpackage;

import java.util.Queue;
/* compiled from: PG */
/* renamed from: clc  reason: default package */
/* loaded from: classes2.dex */
abstract class clc {
    private final Queue a = cvd.h(20);

    public abstract cln a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cln b() {
        cln clnVar = (cln) this.a.poll();
        return clnVar == null ? a() : clnVar;
    }

    public final void c(cln clnVar) {
        if (this.a.size() < 20) {
            this.a.offer(clnVar);
        }
    }
}
