package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pei  reason: default package */
/* loaded from: classes4.dex */
public final class pei extends Handler {
    final /* synthetic */ pej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pei(pej pejVar, Looper looper) {
        super(looper);
        this.a = pejVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            pej pejVar = this.a;
            Object obj = message.obj;
            if (pejVar.i != 2 && !pejVar.o()) {
                return;
            }
            if (obj instanceof Exception) {
                pejVar.k((Exception) obj, false);
                return;
            }
            try {
                ((pob) pejVar.a).b.provideProvisionResponse((byte[]) obj);
                if (!pejVar.p(false)) {
                    return;
                }
                pejVar.h(true);
            } catch (Exception e) {
                pejVar.k(e, true);
            }
        } else if (i != 1) {
        } else {
            pej pejVar2 = this.a;
            Object obj2 = message.obj;
            if (!pejVar2.o()) {
                return;
            }
            if (obj2 instanceof Exception) {
                pejVar2.j((Exception) obj2, false);
                return;
            }
            pejVar2.d.c();
            pejVar2.d.h();
            try {
                byte[] bArr = (byte[]) obj2;
                if (pejVar2.c == 3) {
                    pejVar2.a.d(pejVar2.k, bArr);
                    pejVar2.g(pee.a);
                } else {
                    byte[] d = pejVar2.a.d(pejVar2.j, bArr);
                    int i2 = pejVar2.c;
                    if ((i2 == 2 || (i2 == 0 && pejVar2.k != null)) && d != null && d.length != 0) {
                        pejVar2.k = d;
                    }
                    pejVar2.i = 4;
                    pejVar2.g(pee.b);
                }
            } catch (Exception e2) {
                pejVar2.j(e2, true);
            }
            pejVar2.d.g();
        }
    }
}
