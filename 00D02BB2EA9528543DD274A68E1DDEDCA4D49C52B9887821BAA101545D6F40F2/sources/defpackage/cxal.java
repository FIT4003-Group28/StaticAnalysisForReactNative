package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxal  reason: default package */
/* loaded from: classes5.dex */
public final class cxal implements Factory<cxak> {
    private final dzsj<cxai> a;

    public cxal(dzsj<cxai> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cxak a() {
        return new cxak(this.a);
    }
}
