package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cyvq  reason: default package */
/* loaded from: classes5.dex */
public final class cyvq implements dbrn<cyvi, cyvi> {
    final /* synthetic */ Map a;

    public cyvq(Map map) {
        this.a = map;
    }

    @Override // defpackage.dbrn
    @dzsi
    public final /* bridge */ /* synthetic */ cyvi a(@dzsi cyvi cyviVar) {
        cyvh g;
        dcdc<Email.Certificate> l;
        cyvi cyviVar2 = cyviVar;
        if (cyviVar2 == null) {
            return null;
        }
        cyvi cyviVar3 = (cyvi) this.a.get(cyviVar2.k());
        if (cyviVar3 != null && cyviVar2.b().i < cyviVar3.b().i) {
            cyviVar3.b().k(cyviVar2.b());
            if (!dyat.c() || cyviVar2.f().isEmpty()) {
                return cyviVar3;
            }
            g = cyviVar3.g();
            l = cyvs.l(cyviVar3, cyviVar2);
        } else if (cyviVar3 == null) {
            return cyviVar2;
        } else {
            cyviVar2.b().k(cyviVar3.b());
            if (!dyat.c() || cyviVar3.f().isEmpty()) {
                return cyviVar2;
            }
            g = cyviVar2.g();
            l = cyvs.l(cyviVar2, cyviVar3);
        }
        g.f(l);
        return g.h();
    }
}
