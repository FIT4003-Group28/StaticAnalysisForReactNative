package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: hre  reason: default package */
/* loaded from: classes3.dex */
public final class hre implements aafl {
    private final eo a;

    public hre(eo eoVar) {
        this.a = eoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.a == null) {
            zep.b("fragmentManager is null");
            return;
        }
        hsy hsyVar = new hsy();
        ex l = this.a.l();
        l.r(hsyVar, "multi_page_sticker_catalog");
        l.a();
    }
}
