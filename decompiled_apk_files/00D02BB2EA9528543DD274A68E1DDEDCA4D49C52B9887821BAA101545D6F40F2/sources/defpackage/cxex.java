package defpackage;

import dagger.internal.Factory;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cxex  reason: default package */
/* loaded from: classes5.dex */
public final class cxex implements Factory<cxew> {
    private final dzsj<Random> a;

    public cxex(dzsj<Random> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cxew a() {
        return new cxew(this.a);
    }
}
