package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bqys  reason: default package */
/* loaded from: classes4.dex */
final class bqys implements dbty<Void> {
    final /* synthetic */ byte[] a;
    final /* synthetic */ cqat b;
    final /* synthetic */ bqyt c;

    public bqys(bqyt bqytVar, byte[] bArr, cqat cqatVar) {
        this.c = bqytVar;
        this.a = bArr;
        this.b = cqatVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Void a() {
        bqyt bqytVar = this.c;
        awcb awcbVar = bqytVar.e;
        byte[] bArr = this.a;
        int i = bqytVar.b;
        long g = bqytVar.g.g(akry.ROAD_GRAPH, this.b);
        awcbVar.a(bArr, i, g == -1 ? Long.MAX_VALUE : TimeUnit.MILLISECONDS.toSeconds(g));
        this.c.f.c();
        return null;
    }
}
