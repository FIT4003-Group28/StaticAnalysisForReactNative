package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: sll  reason: default package */
/* loaded from: classes4.dex */
public final class sll {
    public static final amzy a = amzy.l("com/google/android/libraries/assistant/appintegration/AssistantConnector");
    public dwg b = dwg.APP_INTEGRATION_MIC_TAP;
    public final SettableFuture c = SettableFuture.f();
    public volatile ankt d;

    public sll(Context context, amqo amqoVar, amqo amqoVar2) {
        anlz.A(anii.h(slh.a(context), ryj.k, anjk.a), new slj(this, amqoVar2, amqoVar), anjk.a);
    }

    public static void b(String str, ankt anktVar) {
        anlz.A(anktVar, new slk(str), anjk.a);
    }

    public final int a() {
        if (!this.c.isDone()) {
            return this.d != null ? 2 : 0;
        }
        try {
            return ((dwh) this.c.get()).a();
        } catch (InterruptedException | ExecutionException e) {
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "getConnectionState", 'H', "AssistantConnector.java")).q("Failed to get connector while future is done");
            return 0;
        }
    }

    public final boolean c() {
        if (this.c.isDone()) {
            try {
                return ((dwh) this.c.get()).d();
            } catch (InterruptedException | ExecutionException unused) {
                return false;
            }
        }
        return false;
    }
}
