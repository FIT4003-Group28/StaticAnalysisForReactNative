package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wno  reason: default package */
/* loaded from: classes4.dex */
public final class wno implements ajep {
    final /* synthetic */ wlq a;
    final /* synthetic */ wnp b;

    public wno(wnp wnpVar, wlq wlqVar) {
        this.b = wnpVar;
        this.a = wlqVar;
    }

    @Override // defpackage.ajep
    public final void a() {
        this.b.a = null;
        wuu wuuVar = (wuu) this.a;
        wuuVar.d = false;
        wvh wvhVar = wuuVar.e;
        xdu xduVar = wuuVar.a;
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : wvhVar.b.c()) {
            if (TextUtils.equals(xduVar.a, xehVar.c.a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) wvhVar.a.get()).q(arrayList);
        }
    }

    @Override // defpackage.ajep
    public final void b(ajey ajeyVar) {
        this.b.a = ajeyVar;
        final wuu wuuVar = (wuu) this.a;
        if (wuuVar.b == xdb.PRE_ROLL) {
            wuuVar.c();
        } else {
            wuuVar.c.execute(new Runnable() { // from class: wut
                @Override // java.lang.Runnable
                public final void run() {
                    wuu.this.c();
                }
            });
        }
    }
}
