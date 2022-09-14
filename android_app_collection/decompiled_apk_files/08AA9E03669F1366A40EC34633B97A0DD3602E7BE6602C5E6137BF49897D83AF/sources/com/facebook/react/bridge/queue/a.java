package com.facebook.react.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: MessageQueueThreadHandler.java */
/* loaded from: classes.dex */
public class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final c f3267a;

    public a(Looper looper, c cVar) {
        super(looper);
        this.f3267a = cVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            this.f3267a.a(e);
        }
    }
}
