package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: xal  reason: default package */
/* loaded from: classes7.dex */
final class xal implements cqjb<xar, cqss> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ cqss a(xar xarVar, Context context) {
        xar xarVar2 = xarVar;
        xaq xaqVar = xaq.STANDARD_ATTRIBUTE;
        int ordinal = xarVar2.c().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            if (xarVar2.g().booleanValue()) {
                return ibm.y();
            }
        } else if (ordinal == 3) {
            return ibm.x();
        } else {
            cqtv cqtvVar = xan.a;
            xarVar2.c();
        }
        return ibm.p();
    }
}
