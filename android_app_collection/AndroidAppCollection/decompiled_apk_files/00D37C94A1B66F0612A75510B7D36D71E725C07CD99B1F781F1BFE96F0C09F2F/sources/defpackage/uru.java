package defpackage;

import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: uru  reason: default package */
/* loaded from: classes4.dex */
public final class uru extends uro {
    public static final ampg a = new uru();

    @Override // defpackage.uro
    public final void a(qwf qwfVar, uqa uqaVar) {
        if (!qwfVar.h() || "null".equals(qwfVar.f())) {
            return;
        }
        uqaVar.c = qwfVar.f();
    }

    @Override // defpackage.uro
    public final void b(qwf qwfVar, uqa uqaVar) {
        if (!qwfVar.i() || "null".equals(qwfVar.g())) {
            return;
        }
        uqaVar.b = qwfVar.g();
    }

    @Override // defpackage.uro
    public final void c(qwf qwfVar, uqa uqaVar) {
        DataHolder dataHolder = qwfVar.a;
        int i = qwfVar.b;
        int i2 = qwfVar.c;
        dataHolder.a("is_dasher", i);
        uqaVar.c(dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher")) == 2);
    }
}
