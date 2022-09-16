package defpackage;

import android.content.Context;
/* renamed from: vkb  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vkb implements cqjb {
    static final cqjb a = new vkb();

    private vkb() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int min;
        zfq zfqVar = (zfq) cqkpVar;
        return (!zfqVar.b().booleanValue() && (min = Math.min(zfqVar.d().intValue(), 25) + (-1)) >= 0) ? Character.toString((char) (min + 65)) : "";
    }
}
