package defpackage;

import com.google.android.libraries.social.populous.core.SessionContext;
/* compiled from: PG */
/* renamed from: cyxt  reason: default package */
/* loaded from: classes5.dex */
public final class cyxt implements dbrn<cyvs, cyvs> {
    final /* synthetic */ cygr a;
    final /* synthetic */ SessionContext b;

    public cyxt(cygr cygrVar, SessionContext sessionContext) {
        this.a = cygrVar;
        this.b = sessionContext;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cyvs a(cyvs cyvsVar) {
        cyvs cyvsVar2 = cyvsVar;
        dcdc<cyvi> c = cyxu.c(this.a, cyvsVar2.a(), this.b);
        synchronized (cyvsVar2.e) {
            cyvsVar2.s = null;
            cyvsVar2.r = null;
            cyvsVar2.o = c;
        }
        cyvsVar2.f(cyxu.c(this.a, cyvsVar2.g(), this.b));
        return cyvsVar2;
    }
}
