package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwwm  reason: default package */
/* loaded from: classes5.dex */
public final class cwwm implements Factory<cwwl> {
    private final dzsj<Set<cxfn>> a;

    public cwwm(dzsj<Set<cxfn>> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwwl(this.a);
    }
}
