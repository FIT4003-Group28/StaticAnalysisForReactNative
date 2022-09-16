package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: dvj  reason: default package */
/* loaded from: classes3.dex */
public final class dvj {
    public final dvl a;
    public final BlockingQueue c;
    public final String d;
    private final ExecutorService g;
    private final String h;
    public final LinkedHashMap b = new LinkedHashMap();
    public int f = 1;
    private final String i = "3";
    public final int e = 16;

    public dvj(String str, String str2, String str3, dvl dvlVar) {
        this.d = str;
        this.h = str2;
        this.a = dvlVar;
        a("v", "3");
        a("s", str2);
        this.c = new ArrayBlockingQueue(16);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new abru(1));
        this.g = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new dvi(this));
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final void b(dvo dvoVar) {
        this.c.offer(dvoVar);
    }
}
