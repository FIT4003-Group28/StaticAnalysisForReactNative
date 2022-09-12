package defpackage;

import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cnsa  reason: default package */
/* loaded from: classes.dex */
final class cnsa extends cojb {
    final /* synthetic */ cnsd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnsa(cnsd cnsdVar, Looper looper) {
        super(looper);
        this.a = cnsdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        cnwc.g(z);
        cnsc cnscVar = (cnsc) message.obj;
        L l = this.a.a;
        if (l == 0) {
            cnscVar.b();
            return;
        }
        try {
            cnscVar.a(l);
        } catch (RuntimeException e) {
            cnscVar.b();
            throw e;
        }
    }
}
