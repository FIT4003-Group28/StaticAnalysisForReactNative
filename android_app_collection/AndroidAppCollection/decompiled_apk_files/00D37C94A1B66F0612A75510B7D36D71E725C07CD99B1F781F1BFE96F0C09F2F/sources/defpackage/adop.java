package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: adop  reason: default package */
/* loaded from: classes.dex */
final class adop extends kt {
    final /* synthetic */ ados a;

    public adop(ados adosVar) {
        this.a = adosVar;
    }

    @Override // defpackage.kt
    public final void s(bhc bhcVar) {
        ados adosVar = this.a;
        if (adosVar.h != 1) {
            return;
        }
        Handler handler = adosVar.e;
        handler.sendMessage(handler.obtainMessage(2, bhcVar));
    }
}
