package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bmag  reason: default package */
/* loaded from: classes3.dex */
public final class bmag implements bvwz {
    public static final dcqe a = dcqe.c("bmag");
    public final gga b;
    public final btrm c;

    public bmag(gga ggaVar, btrm btrmVar) {
        this.b = ggaVar;
        this.c = btrmVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bmaf(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rrc";
    }
}
