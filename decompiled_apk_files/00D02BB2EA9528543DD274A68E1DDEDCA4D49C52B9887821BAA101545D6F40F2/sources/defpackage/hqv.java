package defpackage;

import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: hqv  reason: default package */
/* loaded from: classes.dex */
public final class hqv extends cqiw<izs> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();

    public static dbsg<EditText> d(View view) {
        final dccx F = dcdc.F();
        cqjg cqjgVar = a;
        F.getClass();
        cqkx.h(view, cqjgVar, EditText.class, new dbrn(F) { // from class: hqt
            private final dccx a;

            {
                this.a = F;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dccx dccxVar = this.a;
                dccxVar.g((EditText) obj);
                return dccxVar;
            }
        });
        return dcbg.b(F.f()).r(hqu.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izs> a() {
        return new hps().a();
    }
}
