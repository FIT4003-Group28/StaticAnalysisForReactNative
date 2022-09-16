package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dqd  reason: default package */
/* loaded from: classes3.dex */
public final class dqd extends dqs {
    public final rln a;

    public dqd(rln rlnVar) {
        super("internal.logger");
        this.a = rlnVar;
        this.e.put("log", new dqc(this, false, true));
        this.e.put("silent", new dqa());
        ((dqs) this.e.get("silent")).r("log", new dqc(this, true, true));
        this.e.put("unmonitored", new dqb());
        ((dqs) this.e.get("unmonitored")).r("log", new dqc(this, false, false));
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        return dqz.f;
    }
}
