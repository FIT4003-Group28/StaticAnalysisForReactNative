package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwfa  reason: default package */
/* loaded from: classes4.dex */
public final class bwfa extends bweo {
    @dzsi
    private final String c;
    private final List<String> d;
    private final int e;

    public bwfa(dqhj dqhjVar) {
        super(dqhjVar.e);
        dqhb dqhbVar = dqhjVar.d;
        this.d = new ArrayList((dqhbVar == null ? dqhb.c : dqhbVar).b);
        dqhb dqhbVar2 = dqhjVar.d;
        this.c = (dqhbVar2 == null ? dqhb.c : dqhbVar2).a;
        int a = dqhi.a(dqhjVar.b);
        this.e = a == 0 ? 1 : a;
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        return j(this.c, dbrz.e("\n").g(this.d));
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        return this.c;
    }

    @Override // defpackage.bweo
    public final int d() {
        return this.e;
    }
}
