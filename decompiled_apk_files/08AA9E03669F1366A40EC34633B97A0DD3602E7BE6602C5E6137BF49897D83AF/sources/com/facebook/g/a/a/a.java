package com.facebook.g.a.a;

import android.annotation.SuppressLint;
import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
/* compiled from: GlyphWarmerImpl.java */
/* loaded from: classes.dex */
public class a implements com.facebook.g.a.a {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerC0057a f2491a;

    @Override // com.facebook.g.a.a
    public void a(Layout layout) {
        HandlerC0057a a2 = a();
        a2.sendMessage(a2.obtainMessage(1, layout));
    }

    @SuppressLint({"BadMethodUse-android.os.HandlerThread._Constructor", "BadMethodUse-java.lang.Thread.start"})
    private HandlerC0057a a() {
        if (f2491a == null) {
            HandlerThread handlerThread = new HandlerThread("GlyphWarmer");
            handlerThread.start();
            f2491a = new HandlerC0057a(handlerThread.getLooper());
        }
        return f2491a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlyphWarmerImpl.java */
    /* renamed from: com.facebook.g.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class HandlerC0057a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Picture f2492a;

        public HandlerC0057a(Looper looper) {
            super(looper);
            this.f2492a = new Picture();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Layout layout = (Layout) message.obj;
            try {
                layout.draw(this.f2492a.beginRecording(com.facebook.g.a.c.a.a(layout), com.facebook.g.a.c.a.b(layout)));
                this.f2492a.endRecording();
            } catch (Exception unused) {
            }
        }
    }
}
