package defpackage;

import android.os.Build;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: cjwx  reason: default package */
/* loaded from: classes.dex */
final class cjwx {
    public static final Runnable a = new cjww();
    public final MessageQueue b;
    public boolean c;
    public Field d;
    public Field e;
    public Field f;

    public cjwx(MessageQueue messageQueue) {
        dbsk.s(messageQueue);
        this.b = messageQueue;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT > 24) {
            return false;
        }
        try {
            this.d = MessageQueue.class.getDeclaredField("mMessages");
            this.e = Message.class.getDeclaredField("next");
            this.f = Message.class.getDeclaredField("callback");
            this.c = true;
        } catch (NoSuchFieldException unused) {
        }
        return this.c;
    }
}
