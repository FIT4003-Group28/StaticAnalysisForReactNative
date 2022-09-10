package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: brah  reason: default package */
/* loaded from: classes4.dex */
public final class brah extends brau {
    public dfpo a;
    private dcdc<brod> b;
    private dcdc<dmni> c;

    @Override // defpackage.brau
    public final void b(List<brod> list) {
        this.b = dcdc.r(list);
    }

    @Override // defpackage.brau
    public final void c(List<dmni> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.brau
    public final brav a() {
        String str = this.b == null ? " clientInjectedResults" : "";
        if (this.c == null) {
            str = str.concat(" serverProvidedResults");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new brai(this.a, this.b, this.c);
    }
}
