package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ackr  reason: default package */
/* loaded from: classes2.dex */
final class ackr implements View.OnClickListener {
    final /* synthetic */ acks a;

    public ackr(acks acksVar) {
        this.a = acksVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList(this.a.c.size());
        dcdc<String> dcdcVar = this.a.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(bbtm.y(dcdcVar.get(i)));
        }
        bbuz m = bbve.m();
        m.e(dwyd.UNKNOWN_ENTRY_POINT);
        m.i(arrayList);
        m.c(false);
        m.d(false);
        bbva c = bbvb.c();
        c.b(false);
        m.f(c.a());
        this.a.b.a().k(m.a(), this.a.a);
    }
}
