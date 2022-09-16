package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: aloi  reason: default package */
/* loaded from: classes.dex */
final class aloi implements Handler.Callback {
    final /* synthetic */ alok a;

    public aloi(alok alokVar) {
        this.a = alokVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        alok alokVar = this.a;
        aloj alojVar = (aloj) message.obj;
        synchronized (alokVar.a) {
            if (alokVar.c == alojVar || alokVar.d == alojVar) {
                alokVar.d(alojVar, 2);
            }
        }
        return true;
    }
}
