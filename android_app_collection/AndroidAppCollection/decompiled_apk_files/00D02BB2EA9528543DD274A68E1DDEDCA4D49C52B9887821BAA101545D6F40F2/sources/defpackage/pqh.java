package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: pqh  reason: default package */
/* loaded from: classes7.dex */
public final class pqh implements pra {
    public final ff a;
    public final bwqv b;

    public pqh(ff ffVar, bwqv bwqvVar) {
        this.a = ffVar;
        this.b = bwqvVar;
    }

    @Override // defpackage.pra
    public final void a(List<bqzb> list, bwrs<brln> bwrsVar) {
        bwqv bwqvVar = this.b;
        pqx pqxVar = new pqx();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "dym_items", dcdc.r(list));
        bwqvVar.c(bundle, "dym_search_request_ref", bwrsVar);
        pqxVar.B(bundle);
        pqxVar.aJ(this.a);
    }
}
