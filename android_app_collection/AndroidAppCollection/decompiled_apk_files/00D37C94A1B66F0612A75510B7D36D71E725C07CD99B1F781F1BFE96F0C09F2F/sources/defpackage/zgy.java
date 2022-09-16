package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: zgy  reason: default package */
/* loaded from: classes4.dex */
public final class zgy extends Handler {
    private final WeakReference a;

    public zgy(Looper looper, Object obj) {
        super(looper);
        this.a = new WeakReference(obj);
        Class<?> cls = getClass();
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && (cls.getModifiers() & 8) == 0) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            zep.l(valueOf.length() != 0 ? "The following WeakReferenceHandler class should be static or leaks might occur: ".concat(valueOf) : new String("The following WeakReferenceHandler class should be static or leaks might occur: "));
        }
    }

    public final void a() {
        removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.a.get();
        if (obj == null) {
            a();
            return;
        }
        akge akgeVar = (akge) obj;
        if (message.what != 1) {
            return;
        }
        akgeVar.d((akgc) message.obj, 2);
    }
}
