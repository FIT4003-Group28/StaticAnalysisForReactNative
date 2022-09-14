package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: byxx  reason: default package */
/* loaded from: classes4.dex */
public final class byxx implements byxw {
    private final dcdc<byxw> a;

    public byxx(byxp byxpVar, byxo byxoVar, byxe byxeVar, byxd byxdVar, byxt byxtVar, byxq byxqVar) {
        this.a = dcdc.k(byxpVar, byxoVar, byxeVar, byxdVar, byxtVar, byxqVar);
    }

    @Override // defpackage.byxw
    public final void a(Intent intent) {
        dbsk.a(b(intent));
        dcdc<byxw> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            byxw byxwVar = dcdcVar.get(i);
            i++;
            if (byxwVar.b(intent)) {
                intent.getAction();
                byxwVar.getClass();
                byxwVar.a(intent);
                return;
            }
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        dcdc<byxw> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).b(intent)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
