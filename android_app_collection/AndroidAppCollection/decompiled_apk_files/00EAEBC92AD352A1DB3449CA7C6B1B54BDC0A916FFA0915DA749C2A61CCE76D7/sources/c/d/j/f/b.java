package c.d.j.f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3278b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3279c;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3277a = Executors.newFixedThreadPool(2, new l(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3280d = Executors.newFixedThreadPool(1, new l(10, "FrescoLightWeightBackgroundExecutor", true));

    public b(int i) {
        this.f3278b = Executors.newFixedThreadPool(i, new l(10, "FrescoDecodeExecutor", true));
        this.f3279c = Executors.newFixedThreadPool(i, new l(10, "FrescoBackgroundExecutor", true));
    }

    @Override // c.d.j.f.f
    public Executor a() {
        return this.f3278b;
    }

    @Override // c.d.j.f.f
    public Executor b() {
        return this.f3280d;
    }

    @Override // c.d.j.f.f
    public Executor c() {
        return this.f3277a;
    }

    @Override // c.d.j.f.f
    public Executor d() {
        return this.f3279c;
    }

    @Override // c.d.j.f.f
    public Executor e() {
        return this.f3277a;
    }
}
