package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfr implements zzfq {
    private Handler handler;
    final /* synthetic */ zzfn zzbcn;

    private zzfr(zzfn zzfnVar) {
        Context context;
        this.zzbcn = zzfnVar;
        context = this.zzbcn.zzbcc;
        this.handler = new Handler(context.getMainLooper(), new zzfs(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfr(zzfn zzfnVar, zzfo zzfoVar) {
        this(zzfnVar);
    }

    private final Message obtainMessage() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfn.zzbcb;
        return handler.obtainMessage(1, obj);
    }

    @Override // com.google.android.gms.tagmanager.zzfq
    public final void cancel() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfn.zzbcb;
        handler.removeMessages(1, obj);
    }

    @Override // com.google.android.gms.tagmanager.zzfq
    public final void zzh(long j) {
        Object obj;
        Handler handler = this.handler;
        obj = zzfn.zzbcb;
        handler.removeMessages(1, obj);
        this.handler.sendMessageDelayed(obtainMessage(), j);
    }

    @Override // com.google.android.gms.tagmanager.zzfq
    public final void zzpa() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfn.zzbcb;
        handler.removeMessages(1, obj);
        this.handler.sendMessage(obtainMessage());
    }
}
