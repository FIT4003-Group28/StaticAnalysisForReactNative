package defpackage;

import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: akwe  reason: default package */
/* loaded from: classes.dex */
public final class akwe {
    public final long a;
    public final long b;
    public final long c;
    public final akvu d;
    public final Handler e;
    public final AtomicReference f;
    final AtomicReference g;
    public final akwh h;
    public ScheduledExecutorService i;

    public akwe(akwh akwhVar, akvu akvuVar, ywk ywkVar, azqb azqbVar, azqb azqbVar2) {
        this.h = akwhVar;
        yxk yxkVar = akwhVar.e;
        this.a = yxkVar.b();
        this.b = yxkVar.a(yxk.f, 50, 50);
        this.c = Math.max(yxkVar.a(yxk.g, 50, 50), 50L);
        this.d = akvuVar;
        this.i = akwhVar.a;
        int c = (int) ywkVar.c(ywk.Q);
        if (c == 1) {
            this.i = (ScheduledExecutorService) azqbVar2.get();
        } else if (c == 2) {
            this.i = (ScheduledExecutorService) azqbVar.get();
        } else if (c == 3) {
            this.i = Executors.newScheduledThreadPool(1, new yli(-1, "anrV2"));
        } else if (c == 5) {
            this.i = Executors.newScheduledThreadPool(1, new yli(0, "anrV2Critical"));
        } else if (c == 6) {
            this.i = Executors.newScheduledThreadPool(1, new yli(1, "anrV2Background"));
        }
        this.e = new Handler(akwhVar.b.getMainLooper());
        this.f = new AtomicReference();
        this.g = new AtomicReference(new akvy(akwhVar.d.g(), false));
    }
}
