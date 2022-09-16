package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aghd  reason: default package */
/* loaded from: classes.dex */
public final class aghd implements aghe {
    private volatile aghe a = null;

    @Override // defpackage.aghe
    public final agpz a() {
        throw null;
    }

    @Override // defpackage.aghe
    public final agpz b() {
        throw null;
    }

    @Override // defpackage.aghe
    public final agpz c() {
        throw null;
    }

    @Override // defpackage.aghe
    public final File d() {
        throw null;
    }

    @Override // defpackage.aghe
    public final File e(String str) {
        throw null;
    }

    @Override // defpackage.amqo
    /* renamed from: f */
    public final synchronized List get() {
        if (this.a != null) {
            return ((aghc) this.a).get();
        }
        return Collections.emptyList();
    }

    @Override // defpackage.aghe
    public final synchronized List g() {
        if (this.a != null) {
            return this.a.g();
        }
        return Collections.emptyList();
    }

    public final synchronized void h(aghe agheVar) {
        this.a = agheVar;
    }
}
