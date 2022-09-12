package defpackage;

import com.google.geo.ar.arlo.api.jni.LocalizationStateDisplayJniImpl;
/* compiled from: PG */
/* renamed from: dfjd  reason: default package */
/* loaded from: classes6.dex */
public final class dfjd implements dfen {
    public final Object a;
    public final dfew b;
    private final dfff c;

    public dfjd(long j) {
        LocalizationStateDisplayJniImpl localizationStateDisplayJniImpl = new LocalizationStateDisplayJniImpl();
        this.a = new Object();
        this.b = new dfew(dfjd.class, j);
        this.c = localizationStateDisplayJniImpl;
    }

    @Override // defpackage.dfen
    public final void a() {
        synchronized (this.a) {
            if (!this.b.c()) {
                LocalizationStateDisplayJniImpl.nativeDestroy(this.b.b());
                this.b.a();
            }
        }
    }
}
