package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
@Deprecated
/* renamed from: cyag  reason: default package */
/* loaded from: classes5.dex */
public final class cyag extends cybn<cyah> {
    private static final ConcurrentMap<String, dbty<cyah>> a = new ConcurrentHashMap();

    @Override // defpackage.cybn
    protected final ConcurrentMap<String, dbty<cyah>> a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cybn
    public final void b() {
        if (this.g == null) {
            this.g = (cyhd) czhd.b(this.c, cyhd.class);
        }
        if (this.g == null) {
            this.g = new cyhb(this.c);
        }
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cybn
    public final /* bridge */ /* synthetic */ cyah c() {
        return new cyah(this);
    }
}
