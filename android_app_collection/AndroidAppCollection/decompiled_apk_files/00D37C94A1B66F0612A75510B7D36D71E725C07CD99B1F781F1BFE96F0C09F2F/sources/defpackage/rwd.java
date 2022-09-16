package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.accountlinking.LinkResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: rwd  reason: default package */
/* loaded from: classes4.dex */
public class rwd {
    @Deprecated
    public static rve a(Executor executor, Callable callable) {
        qnm.n(executor, "Executor must not be null");
        qnm.n(callable, "Callback must not be null");
        rvj rvjVar = new rvj();
        executor.execute(new rvk(rvjVar, callable));
        return rvjVar;
    }

    public static rve b(Exception exc) {
        rvj rvjVar = new rvj();
        rvjVar.s(exc);
        return rvjVar;
    }

    public static rve c(Object obj) {
        rvj rvjVar = new rvj();
        rvjVar.t(obj);
        return rvjVar;
    }

    public static Object d(rve rveVar) {
        qnm.h();
        if (rveVar.j()) {
            return i(rveVar);
        }
        rvl rvlVar = new rvl();
        j(rveVar, rvlVar);
        rvlVar.a.await();
        return i(rveVar);
    }

    public static Object e(rve rveVar, long j, TimeUnit timeUnit) {
        qnm.h();
        qnm.n(timeUnit, "TimeUnit must not be null");
        if (rveVar.j()) {
            return i(rveVar);
        }
        rvl rvlVar = new rvl();
        j(rveVar, rvlVar);
        if (!rvlVar.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return i(rveVar);
    }

    public static rzs f(Context context, String str, int i) {
        return new rzr(context, str, i);
    }

    public static ryi g(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("error_type", Integer.valueOf(i));
        bundle.putString("message", str);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return new ryi(-2, intent);
    }

    public static ryi h(String str) {
        Intent intent = new Intent();
        intent.putExtra("link_response", new LinkResponse(true, str));
        return new ryi(-1, intent);
    }

    private static Object i(rve rveVar) {
        if (rveVar.k()) {
            return rveVar.g();
        }
        if (rveVar.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(rveVar.f());
    }

    private static void j(rve rveVar, rvl rvlVar) {
        rveVar.p(rvi.b, rvlVar);
        rveVar.o(rvi.b, rvlVar);
        rveVar.l(rvi.b, rvlVar);
    }

    public void onDone() {
    }

    public void onMissing(rvx rvxVar) {
    }

    public void onNewItem(int i, Object obj) {
    }

    public void onUpdate(rvx rvxVar, Object obj) {
    }
}
