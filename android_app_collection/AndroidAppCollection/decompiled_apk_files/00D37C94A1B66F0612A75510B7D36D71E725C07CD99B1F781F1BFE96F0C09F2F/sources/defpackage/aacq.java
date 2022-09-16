package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aacq  reason: default package */
/* loaded from: classes.dex */
public final class aacq implements aafl {
    public final aavp a;
    private final Executor b;

    public aacq(Executor executor, aavp aavpVar) {
        this.b = executor;
        this.a = aavpVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.b.execute(new Runnable() { // from class: aacp
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    aacq.this.a.a();
                } catch (aart e) {
                    zep.f("RefreshConfigCommandResolver", "Could not refresh the config: ", e);
                }
            }
        });
    }
}
