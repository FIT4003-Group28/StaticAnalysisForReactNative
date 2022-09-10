package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbr  reason: default package */
/* loaded from: classes4.dex */
public final class bwbr implements bvxc {
    public static final dcqe a = dcqe.c("bwbr");
    public final gga b;
    @dzsi
    public bwce c;

    public bwbr(gga ggaVar) {
        this.b = ggaVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bwbq(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rts";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.c = bvxhVar;
    }
}
