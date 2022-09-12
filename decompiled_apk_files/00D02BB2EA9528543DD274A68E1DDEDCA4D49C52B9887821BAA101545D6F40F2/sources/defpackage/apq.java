package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: apq  reason: default package */
/* loaded from: classes2.dex */
final class apq extends Handler {
    final /* synthetic */ apt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apq(apt aptVar, Looper looper) {
        super(looper);
        this.a = aptVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        apr[] aprVarArr;
        if (message.what == 1) {
            apt aptVar = this.a;
            while (true) {
                synchronized (aptVar.b) {
                    size = aptVar.c.size();
                    if (size <= 0) {
                        return;
                    }
                    aprVarArr = new apr[size];
                    aptVar.c.toArray(aprVarArr);
                    aptVar.c.clear();
                }
                for (int i = 0; i < size; i++) {
                    apr aprVar = aprVarArr[i];
                    int size2 = aprVar.b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        aps apsVar = aprVar.b.get(i2);
                        if (!apsVar.d) {
                            apsVar.b.onReceive(aptVar.a, aprVar.a);
                        }
                    }
                }
            }
        } else {
            super.handleMessage(message);
        }
    }
}
