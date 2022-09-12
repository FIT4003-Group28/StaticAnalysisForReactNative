package defpackage;

import android.content.Context;
/* renamed from: akin  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akin implements cqjb {
    static final cqjb a = new akin();

    private akin() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        akld akldVar = (akld) cqkpVar;
        akgn<aklg> akgnVar = akio.a;
        boolean z = true;
        if (akldVar.b().size() != 1 || akldVar.c(0) == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
