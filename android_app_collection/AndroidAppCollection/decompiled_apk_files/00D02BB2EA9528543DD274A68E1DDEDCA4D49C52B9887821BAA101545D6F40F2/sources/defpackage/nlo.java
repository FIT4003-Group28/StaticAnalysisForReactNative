package defpackage;

import android.content.Intent;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nlo  reason: default package */
/* loaded from: classes7.dex */
public final class nlo {
    public boolean c;
    private final dxio<cjqq> d;
    private final dxio<jzv> e;
    public final Object a = new Object();
    private dcdc<nlw> f = dcdc.e();
    public dcdc<nlw> b = dcdc.e();

    public nlo(dxio<cjqq> dxioVar, dxio<jzv> dxioVar2) {
        this.d = dxioVar;
        this.e = dxioVar2;
    }

    public final void a(dcdc<nlw> dcdcVar) {
        boolean z;
        cjtd cjtdVar;
        ddho ddhoVar;
        synchronized (this.a) {
            this.b = dcdcVar;
            if (!this.c) {
                return;
            }
            boolean a = this.e.a().a();
            dcpe<nlw> listIterator = dcdcVar.listIterator();
            while (listIterator.hasNext()) {
                nlw next = listIterator.next();
                Intent f = next.f();
                String stringExtra = f.getStringExtra("ved");
                String stringExtra2 = f.getStringExtra("ei");
                dcpe<nlw> listIterator2 = this.f.listIterator();
                while (true) {
                    if (!listIterator2.hasNext()) {
                        z = true;
                        break;
                    }
                    nlw next2 = listIterator2.next();
                    Intent f2 = next2.f();
                    String stringExtra3 = f2.getStringExtra("ved");
                    String stringExtra4 = f2.getStringExtra("ei");
                    if (TextUtils.equals(stringExtra, stringExtra3) && TextUtils.equals(stringExtra2, stringExtra4) && next.a().equals(next2.a()) && next.p() == next2.p()) {
                        z = false;
                        break;
                    }
                }
                ddjr o = next.o();
                if (o == ddjr.CAR_OVERVIEW_IMPLICIT_DESTINATIONS) {
                    ddhoVar = a ? dtxm.aJ : dtye.c;
                } else if (o == ddjr.CAR_OVERVIEW_OFFLINE) {
                    ddhoVar = a ? dtxm.aK : dtye.d;
                } else {
                    cjtdVar = null;
                    if (z && cjtdVar != null) {
                        next.a();
                        this.d.a().g().d(cjtdVar);
                    }
                }
                cjta b = cjtd.b();
                b.d = ddhoVar;
                b.i(next.p());
                if (!TextUtils.isEmpty(stringExtra)) {
                    b.g(stringExtra);
                }
                if (!TextUtils.isEmpty(stringExtra2)) {
                    b.b = stringExtra2;
                }
                cjtdVar = b.a();
                if (z) {
                    next.a();
                    this.d.a().g().d(cjtdVar);
                }
            }
            this.f = dcdcVar;
        }
    }
}
