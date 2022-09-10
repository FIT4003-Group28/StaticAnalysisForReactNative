package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auic  reason: default package */
/* loaded from: classes.dex */
public final class auic extends auiq {
    private dcdc<auiu> a;

    @Override // defpackage.auiq
    public final void b(List<auiu> list) {
        this.a = dcdc.r(list);
    }

    @Override // defpackage.auiq
    public final void c(auiu... auiuVarArr) {
        this.a = dcdc.t(auiuVarArr);
    }

    @Override // defpackage.auiq
    public final auir a() {
        String str = this.a == null ? " channels" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new auid(this.a);
    }
}
