package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xbr  reason: default package */
/* loaded from: classes7.dex */
public final class xbr extends xba {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbr(dxio<akto> dxioVar, Application application) {
        super(dxioVar, application);
        dcdc<dmlo> dcdcVar = xbb.a;
    }

    @Override // defpackage.xba
    protected final int i() {
        return 12;
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
        akujVar.b = 16.0f;
        return j;
    }
}
