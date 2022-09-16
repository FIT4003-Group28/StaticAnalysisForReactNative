package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aici  reason: default package */
/* loaded from: classes2.dex */
public final class aici implements aibx {
    private final Application a;
    private final cqat b;
    private final ahjq c;
    private final aibf d;
    private final bzcb e;
    private final Executor f;
    private final btvo g;
    private final bvjj h;

    public aici(Application application, cqat cqatVar, ahjq ahjqVar, aibf aibfVar, bzcb bzcbVar, Executor executor, btvo btvoVar, bvjj bvjjVar) {
        this.a = application;
        this.b = cqatVar;
        this.c = ahjqVar;
        this.d = aibfVar;
        this.e = bzcbVar;
        this.f = executor;
        this.g = btvoVar;
        this.h = bvjjVar;
    }

    @Override // defpackage.aibx
    public final aica a(aiby aibyVar) {
        return new aicj(this.a, this.b, this.c, aibyVar, this.e, this.f, this.g, this.h);
    }
}
