package com.facebook.react.bridge.queue;

import android.os.Looper;
import java.util.HashMap;
/* compiled from: ReactQueueConfigurationImpl.java */
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final MessageQueueThreadImpl f3275a;

    /* renamed from: b  reason: collision with root package name */
    private final MessageQueueThreadImpl f3276b;

    /* renamed from: c  reason: collision with root package name */
    private final MessageQueueThreadImpl f3277c;

    private e(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.f3275a = messageQueueThreadImpl;
        this.f3276b = messageQueueThreadImpl2;
        this.f3277c = messageQueueThreadImpl3;
    }

    @Override // com.facebook.react.bridge.queue.d
    public MessageQueueThread a() {
        return this.f3275a;
    }

    @Override // com.facebook.react.bridge.queue.d
    public MessageQueueThread b() {
        return this.f3276b;
    }

    @Override // com.facebook.react.bridge.queue.d
    public MessageQueueThread c() {
        return this.f3277c;
    }

    @Override // com.facebook.react.bridge.queue.d
    public void d() {
        if (this.f3276b.a() != Looper.getMainLooper()) {
            this.f3276b.quitSynchronous();
        }
        if (this.f3277c.a() != Looper.getMainLooper()) {
            this.f3277c.quitSynchronous();
        }
    }

    public static e a(f fVar, c cVar) {
        HashMap a2 = com.facebook.react.b.f.a();
        b a3 = b.a();
        MessageQueueThreadImpl a4 = MessageQueueThreadImpl.a(a3, cVar);
        a2.put(a3, a4);
        MessageQueueThreadImpl messageQueueThreadImpl = (MessageQueueThreadImpl) a2.get(fVar.b());
        if (messageQueueThreadImpl == null) {
            messageQueueThreadImpl = MessageQueueThreadImpl.a(fVar.b(), cVar);
        }
        MessageQueueThreadImpl messageQueueThreadImpl2 = (MessageQueueThreadImpl) a2.get(fVar.a());
        if (messageQueueThreadImpl2 == null) {
            messageQueueThreadImpl2 = MessageQueueThreadImpl.a(fVar.a(), cVar);
        }
        return new e(a4, messageQueueThreadImpl2, messageQueueThreadImpl);
    }
}
