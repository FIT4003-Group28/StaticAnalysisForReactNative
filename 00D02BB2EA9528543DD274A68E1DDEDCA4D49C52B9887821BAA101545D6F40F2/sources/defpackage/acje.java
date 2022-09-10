package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acje  reason: default package */
/* loaded from: classes2.dex */
public final class acje implements acjn {
    public static final dcdn<acjq, Integer> a = dcdn.m(acjq.ENTER, 1, acjq.EXIT, 2, acjq.DWELL, 4);
    public final Application b;
    public final axru c;
    public final acjm d;
    public final ahyb e;
    public final Executor f;
    public final acjo g;

    public acje(Application application, acjo acjoVar, axru axruVar, acjm acjmVar, ahyb ahybVar, Executor executor) {
        this.g = acjoVar;
        this.b = application;
        this.c = axruVar;
        this.d = acjmVar;
        this.e = ahybVar;
        this.f = executor;
    }
}
