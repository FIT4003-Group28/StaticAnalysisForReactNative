package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zqn  reason: default package */
/* loaded from: classes7.dex */
public abstract class zqn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zqn d(Context context, @dzsi dqvj dqvjVar) {
        cqtd a;
        cqtd cqtdVar = null;
        String c = dqvjVar == null ? null : vyb.c(context, dqvjVar);
        if (dqvjVar != null && (a = vyv.a(dqvjVar)) != null) {
            cqtdVar = cqrt.j(a, irg.k());
        }
        return new zgp(dqvjVar, c, cqtdVar);
    }

    @dzsi
    public abstract dqvj a();

    @dzsi
    public abstract String b();

    @dzsi
    public abstract cqtd c();
}
