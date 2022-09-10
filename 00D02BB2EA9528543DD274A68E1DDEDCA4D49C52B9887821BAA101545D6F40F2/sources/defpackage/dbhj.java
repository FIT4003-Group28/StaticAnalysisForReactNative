package defpackage;

import com.google.android.filament.RenderableManager;
import com.google.ar.sceneform.rendering.EngineInstance;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbhj  reason: default package */
/* loaded from: classes5.dex */
public final class dbhj implements Runnable {
    private final int a;
    private final int b;

    public dbhj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbix.a();
        dbet a = EngineInstance.a();
        if (a == null || !a.a()) {
            return;
        }
        RenderableManager m = a.m();
        int i = this.a;
        if (i != 0) {
            m.destroy(i);
        }
        int i2 = this.b;
        if (i2 == 0) {
            return;
        }
        m.destroy(i2);
    }
}
