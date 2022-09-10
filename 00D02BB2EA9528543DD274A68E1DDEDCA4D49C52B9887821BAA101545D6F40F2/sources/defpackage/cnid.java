package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnid  reason: default package */
/* loaded from: classes5.dex */
public final class cnid implements Handler.Callback {
    final /* synthetic */ cnif a;

    public cnid(cnif cnifVar) {
        this.a = cnifVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        kfd kfdVar = this.a.c;
        if (kfdVar != null) {
            int i = message.what;
            int i2 = 2;
            if (i == 1) {
                int i3 = message.arg1;
                int i4 = message.arg2;
                int intValue = ((Integer) message.obj).intValue();
                bvrj.UI_THREAD.c();
                if (i3 == 1 && i4 == 0) {
                    if (intValue == 1) {
                        i2 = 3;
                    }
                    kfe.d(kfdVar.a);
                    kfdVar.a.e(i2);
                }
            } else if (i == 2) {
                int i5 = message.arg1;
                bvrj.UI_THREAD.c();
                if (i5 == 1) {
                    kfe kfeVar = kfdVar.a;
                    kfeVar.a = false;
                    kfe.d(kfeVar);
                    kfdVar.a.e(2);
                }
            } else {
                int i6 = cnjc.a;
            }
        }
        return true;
    }
}
