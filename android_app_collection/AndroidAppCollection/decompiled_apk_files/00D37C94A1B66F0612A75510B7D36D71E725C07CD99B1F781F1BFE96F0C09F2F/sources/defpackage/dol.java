package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dol  reason: default package */
/* loaded from: classes3.dex */
public final class dol {
    public final Context c;
    public final don f;
    public final Object a = new Object();
    public boolean d = true;
    public boolean e = false;
    public final List b = new LinkedList();

    public dol(Context context) {
        this.c = context;
        this.f = new don(context);
        new Thread(new dok(this)).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long b = (dop.b(context) + 300000) - dop.a();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new doj(this), b > 0 ? b : 0L, 300000L, TimeUnit.MILLISECONDS);
    }
}
