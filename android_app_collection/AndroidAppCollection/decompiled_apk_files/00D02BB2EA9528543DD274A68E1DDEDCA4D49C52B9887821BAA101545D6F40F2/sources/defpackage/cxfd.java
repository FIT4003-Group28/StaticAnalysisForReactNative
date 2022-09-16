package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxfd  reason: default package */
/* loaded from: classes5.dex */
public final class cxfd implements Factory<cxfc> {
    private final dzsj<Executor> a;

    public cxfd(dzsj<Executor> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxfc(this.a);
    }
}
