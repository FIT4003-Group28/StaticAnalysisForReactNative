package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: adbi  reason: default package */
/* loaded from: classes.dex */
final class adbi extends Handler {
    private static final adbj a = new adbj(-1, null, null);
    private final adka b;
    private final amuk c;

    public adbi(Looper looper, adka adkaVar, amuk amukVar) {
        super(looper);
        this.b = adkaVar;
        this.c = amukVar;
    }

    private static final void b(adqe adqeVar, adib adibVar, int i) {
        if (adibVar == null) {
            adqeVar.b(-1, 3, i);
        } else {
            adqeVar.a(adibVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(adbj adbjVar) {
        adbj adbjVar2 = a;
        adbj adbjVar3 = adbjVar.a < this.c.size() + (-1) ? new adbj(adbjVar.a + 1, adbjVar.c, adbjVar.b) : adbjVar2;
        if (adbjVar3 == adbjVar2) {
            b(adbjVar.b, null, adbjVar.a);
        } else {
            sendMessageDelayed(Message.obtain(this, 1, adbjVar3), ((Integer) this.c.get(adbjVar3.a)).intValue());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        adbj adbjVar = (adbj) message.obj;
        adit aditVar = adbjVar.c;
        adqe adqeVar = adbjVar.b;
        adib adibVar = (adib) this.b.a(aditVar);
        if (adibVar != null) {
            String str = adbl.a;
            String valueOf = String.valueOf(adibVar.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Found screen with id: ");
            sb.append(valueOf);
            zep.h(str, sb.toString());
            adia f = adibVar.f();
            f.f(adim.DIAL);
            f.c = aditVar;
            b(adqeVar, f.a(), adbjVar.a);
            return;
        }
        a(adbjVar);
    }
}
