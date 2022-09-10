package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddbh  reason: default package */
/* loaded from: classes5.dex */
public final class ddbh implements defg<Object, Void> {
    final /* synthetic */ long a;
    final /* synthetic */ TimeUnit b;
    final /* synthetic */ ddbn c;

    public ddbh(ddbn ddbnVar, long j, TimeUnit timeUnit) {
        this.c = ddbnVar;
        this.a = j;
        this.b = timeUnit;
    }

    @Override // defpackage.defg
    public final dehn<Void> a(Object obj) {
        return this.c.g.e(new ddbg(), this.a, this.b);
    }
}
