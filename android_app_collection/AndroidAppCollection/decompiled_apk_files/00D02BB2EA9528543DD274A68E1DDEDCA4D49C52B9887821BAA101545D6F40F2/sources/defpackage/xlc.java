package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xlc  reason: default package */
/* loaded from: classes7.dex */
public final class xlc extends xba {
    public final btvo q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlc(Application application, btvo btvoVar, dxio<akto> dxioVar) {
        super(dxioVar, application);
        dcdc<dmlo> dcdcVar = xbb.a;
        this.q = btvoVar;
    }

    @Override // defpackage.xba
    protected final akui j() {
        akui j = super.j();
        if (j.c) {
            j.bF();
            j.c = false;
        }
        akuj akujVar = (akuj) j.b;
        akuj akujVar2 = akuj.e;
        akujVar.a |= 1;
        akujVar.b = 39.0f;
        return j;
    }
}
