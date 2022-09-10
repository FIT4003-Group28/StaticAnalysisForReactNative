package defpackage;

import com.google.geo.ar.arlo.api.jni.ExplorationManagerJniImpl;
import com.google.geo.ar.arlo.api.jni.NativeObserver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfev  reason: default package */
/* loaded from: classes6.dex */
public final class dfev {
    public final Object a;
    public final dfew b;
    public final dffd c;
    public final dfez<dfgc> d;
    @dzsi
    public dfew e;

    public dfev(long j, Executor executor) {
        ExplorationManagerJniImpl explorationManagerJniImpl = new ExplorationManagerJniImpl();
        Object obj = new Object();
        this.a = obj;
        dfew dfewVar = new dfew(dfev.class, j);
        this.b = dfewVar;
        this.c = explorationManagerJniImpl;
        this.d = new dfez<>(executor, true);
        dfewVar.d();
        synchronized (obj) {
            if (dfewVar.c()) {
                return;
            }
            this.e = new dfew("ExplorationStateObserver", ExplorationManagerJniImpl.nativeAddExplorationStateObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfeu
                private final dfev a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    try {
                        this.a.d.c((dfgc) dsqw.cq(dfgc.a, bArr));
                    } catch (dsrm unused) {
                    }
                }
            }));
        }
    }
}
