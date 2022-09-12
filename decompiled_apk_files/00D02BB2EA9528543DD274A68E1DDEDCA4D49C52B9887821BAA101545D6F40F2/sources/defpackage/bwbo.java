package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbo  reason: default package */
/* loaded from: classes4.dex */
public final class bwbo implements bvxc {
    public static final dcqe a = dcqe.c("bwbo");
    public final gga b;
    @dzsi
    public bwce c;

    public bwbo(gga ggaVar) {
        this.b = ggaVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bwbn(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "jsr";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.c = bvxhVar;
    }
}
