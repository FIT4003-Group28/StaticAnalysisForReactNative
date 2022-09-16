package defpackage;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tks  reason: default package */
/* loaded from: classes4.dex */
public final class tks implements Handler.Callback {
    final /* synthetic */ tkt a;

    public tks(tkt tktVar) {
        this.a = tktVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a.b.isEmpty()) {
            return true;
        }
        for (tjy tjyVar : this.a.b) {
            if (tjyVar instanceof tky) {
                this.a.a((tky) tjyVar, null);
            } else if (tjyVar instanceof tkc) {
                this.a.d((tkc) tjyVar);
            }
        }
        this.a.a.sendEmptyMessageDelayed(0, 200L);
        return true;
    }
}
