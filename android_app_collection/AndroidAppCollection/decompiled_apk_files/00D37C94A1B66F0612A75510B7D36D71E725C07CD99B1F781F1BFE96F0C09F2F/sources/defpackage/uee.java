package defpackage;

import android.content.BroadcastReceiver;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: uee  reason: default package */
/* loaded from: classes4.dex */
public interface uee {
    Future a(Callable callable);

    void b(Runnable runnable);

    void c(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, ubz ubzVar);

    void d(Runnable runnable);
}
