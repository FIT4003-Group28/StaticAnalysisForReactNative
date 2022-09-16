package defpackage;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: swh  reason: default package */
/* loaded from: classes4.dex */
public final class swh extends EnvironmentDataSource {
    private final ayoi e;
    private final AtomicLong b = new AtomicLong(1);
    private final Object c = new Object();
    private final LongSparseArray d = new LongSparseArray();
    public volatile byte[] a = tea.a;

    public swh(ayoi ayoiVar) {
        this.e = ayoiVar.F(new ayqb() { // from class: swf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                swh.this.a = (byte[]) obj;
            }
        }).aE().aI();
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final byte[] getEnvironmentData() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final long subscribeToEnvironmentData(final EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0L;
        }
        long andIncrement = this.b.getAndIncrement();
        synchronized (this.c) {
            this.d.put(andIncrement, this.e.as(new ayqb() { // from class: swg
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    EnvironmentDataObserver.this.environmentDataDidChange();
                }
            }));
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.c) {
            aypg aypgVar = (aypg) this.d.get(j);
            if (aypgVar != null) {
                aypgVar.qr();
            }
            this.d.remove(j);
        }
    }
}
