package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgh  reason: default package */
/* loaded from: classes2.dex */
public final class bgh extends Handler {
    final /* synthetic */ bgk a;

    public bgh(bgk bgkVar) {
        this.a = bgkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            bgk bgkVar = this.a;
            bgkVar.j = false;
            bgkVar.d(bgkVar.i);
            return;
        }
        bgk bgkVar2 = this.a;
        bgkVar2.l = false;
        bgc bgcVar = bgkVar2.h;
        if (bgcVar == null) {
            return;
        }
        bgm bgmVar = bgkVar2.k;
        bgw bgwVar = bgcVar.a;
        bhb b = bgwVar.b(bgkVar2);
        if (b == null) {
            return;
        }
        bgwVar.n(b, bgmVar);
    }
}
