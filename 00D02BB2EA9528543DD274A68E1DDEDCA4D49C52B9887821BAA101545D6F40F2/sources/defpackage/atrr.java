package defpackage;

import android.content.Context;
/* renamed from: atrr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atrr implements cqjb {
    static final cqjb a = new atrr();

    private atrr() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        boolean booleanValue = atsd.a.a((atyf) cqkpVar, context).booleanValue();
        boolean z = true;
        if (!booleanValue && !iva.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
