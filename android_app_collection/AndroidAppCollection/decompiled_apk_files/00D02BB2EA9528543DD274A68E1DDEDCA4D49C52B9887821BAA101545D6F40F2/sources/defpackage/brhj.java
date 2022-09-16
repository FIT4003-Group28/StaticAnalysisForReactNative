package defpackage;

import android.content.Intent;
/* renamed from: brhj  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class brhj implements dbsl {
    static final dbsl a = new brhj();

    private brhj() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Intent intent;
        afga afgaVar = (afga) obj;
        if (afgaVar == null || (intent = afgaVar.a) == null) {
            return false;
        }
        dbsk.s(intent);
        return brhk.d(intent).a();
    }
}
