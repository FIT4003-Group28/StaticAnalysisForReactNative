package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aukr  reason: default package */
/* loaded from: classes2.dex */
public final class aukr {
    public aulc b;
    private List<dlhl> e;
    private dbsg<String> c = dbpy.a;
    private dbsg<dplx> d = dbpy.a;
    public dbsg<auhw> a = dbpy.a;

    public final void b(dplx dplxVar) {
        this.d = dbsg.i(dplxVar);
    }

    public final void c(List<dlhl> list) {
        if (list != null) {
            this.e = list;
            return;
        }
        throw new NullPointerException("Null intentData");
    }

    public final void d(String str) {
        this.c = dbsg.i(str);
    }

    public final aulg a() {
        String str = this.e == null ? " intentData" : "";
        if (this.b == null) {
            str = str.concat(" loggingInfo");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new auks(this.c, this.d, this.e, this.a, this.b);
    }
}
