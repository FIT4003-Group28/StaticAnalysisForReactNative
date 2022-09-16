package androidx.window.java.layout;

import androidx.window.layout.WindowInfoRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WindowInfoRepositoryCallbackAdapter implements WindowInfoRepository {
    private final Map consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoRepository repository;

    public WindowInfoRepositoryCallbackAdapter(WindowInfoRepository windowInfoRepository) {
        windowInfoRepository.getClass();
        this.repository = windowInfoRepository;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final void addListener(Executor executor, ji jiVar, azxe azxeVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(jiVar) == null) {
                executor.getClass();
                if (executor instanceof azvc) {
                    azvc azvcVar = (azvc) executor;
                }
                azrd azvkVar = new azvk(executor);
                if (azvkVar.get(azvo.b) == null) {
                    azvkVar = azvkVar.plus(new azvr());
                }
                azxo azxoVar = new azxo(azvkVar);
                Map map = this.consumerToJobMap;
                WindowInfoRepositoryCallbackAdapter$addListener$1$1 windowInfoRepositoryCallbackAdapter$addListener$1$1 = new WindowInfoRepositoryCallbackAdapter$addListener$1$1(azxeVar, jiVar, null);
                azwd azwdVar = new azwd(azup.b(azxoVar, azre.a));
                azxq.a(aydc.a(windowInfoRepositoryCallbackAdapter$addListener$1$1.create(azwdVar, azwdVar)), azqm.a);
                map.put(jiVar, azwdVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(ji jiVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            azvo azvoVar = (azvo) this.consumerToJobMap.get(jiVar);
            if (azvoVar != null) {
                azvoVar.k(null);
            }
            azvo azvoVar2 = (azvo) this.consumerToJobMap.remove(jiVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addCurrentWindowMetricsListener(Executor executor, ji jiVar) {
        executor.getClass();
        jiVar.getClass();
        addListener(executor, jiVar, this.repository.getCurrentWindowMetrics());
    }

    public final void addWindowLayoutInfoListener(Executor executor, ji jiVar) {
        executor.getClass();
        jiVar.getClass();
        addListener(executor, jiVar, this.repository.getWindowLayoutInfo());
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azxe getCurrentWindowMetrics() {
        return this.repository.getCurrentWindowMetrics();
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azxe getWindowLayoutInfo() {
        return this.repository.getWindowLayoutInfo();
    }

    public final void removeCurrentWindowMetricsListener(ji jiVar) {
        jiVar.getClass();
        removeListener(jiVar);
    }

    public final void removeWindowLayoutInfoListener(ji jiVar) {
        jiVar.getClass();
        removeListener(jiVar);
    }
}
