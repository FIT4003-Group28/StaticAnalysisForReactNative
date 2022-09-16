package defpackage;

import com.google.protos.youtube.api.innertube.ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
import com.google.protos.youtube.api.innertube.ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aati  reason: default package */
/* loaded from: classes.dex */
public final class aati implements aafl {
    private final axnm a;
    private final /* synthetic */ int b;

    public aati(axnm axnmVar) {
        this.a = axnmVar;
    }

    public aati(axnm axnmVar, int i) {
        this.b = i;
        this.a = axnmVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction = (ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction) apzgVar.qm(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.clearPersistentCacheAction);
            if (clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.b != 2 || !((Boolean) clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.c).booleanValue()) {
                ((aacg) this.a.get()).a(clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.b == 1 ? (String) clearPersistentCacheActionOuterClass$ClearPersistentCacheAction.c : "");
                return;
            }
            final aacg aacgVar = (aacg) this.a.get();
            aacgVar.b.execute(new Runnable() { // from class: aacd
                @Override // java.lang.Runnable
                public final void run() {
                    aacg aacgVar2 = aacg.this;
                    synchronized (aacgVar2) {
                        aacgVar2.c = false;
                        aacgVar2.a.b();
                        aacgVar2.b();
                    }
                }
            });
            return;
        }
        aidi aidiVar = (aidi) this.a.get();
        apzg apzgVar2 = ((ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand) apzgVar.qm(ReelPrefetchWatchCommandOuterClass$ReelPrefetchWatchCommand.reelPrefetchWatchCommand)).b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aidiVar.a(apzgVar2);
    }
}
