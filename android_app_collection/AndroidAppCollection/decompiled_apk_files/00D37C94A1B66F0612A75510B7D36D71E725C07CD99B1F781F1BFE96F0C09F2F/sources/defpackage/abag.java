package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abag  reason: default package */
/* loaded from: classes.dex */
public final class abag extends aaqs {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public int s;
    public long t;
    public long u;
    public int v;
    private List w;

    public abag(aaqf aaqfVar, afvm afvmVar) {
        super("notification/send_device_context", aaqfVar, afvmVar);
        this.v = 1;
        k(aadi.b);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arqr.a.createBuilder();
        aopa createBuilder2 = arqq.a.createBuilder();
        boolean z = this.a;
        createBuilder2.copyOnWrite();
        arqq arqqVar = (arqq) createBuilder2.instance;
        arqqVar.b |= 1;
        arqqVar.c = z;
        boolean z2 = this.b;
        createBuilder2.copyOnWrite();
        arqq arqqVar2 = (arqq) createBuilder2.instance;
        arqqVar2.b |= 4;
        arqqVar2.e = z2;
        int i = this.c;
        createBuilder2.copyOnWrite();
        arqq arqqVar3 = (arqq) createBuilder2.instance;
        arqqVar3.b |= 2;
        arqqVar3.d = i;
        createBuilder2.copyOnWrite();
        arqq arqqVar4 = (arqq) createBuilder2.instance;
        arqqVar4.b |= 16;
        arqqVar4.f = false;
        int i2 = this.d;
        createBuilder2.copyOnWrite();
        arqq arqqVar5 = (arqq) createBuilder2.instance;
        arqqVar5.b |= 32;
        arqqVar5.g = i2;
        int i3 = this.s;
        createBuilder2.copyOnWrite();
        arqq arqqVar6 = (arqq) createBuilder2.instance;
        arqqVar6.b |= 64;
        arqqVar6.h = i3;
        long j = this.u;
        createBuilder2.copyOnWrite();
        arqq arqqVar7 = (arqq) createBuilder2.instance;
        arqqVar7.b |= 1024;
        arqqVar7.i = j;
        long j2 = this.t;
        createBuilder2.copyOnWrite();
        arqq arqqVar8 = (arqq) createBuilder2.instance;
        arqqVar8.b |= 2048;
        arqqVar8.j = j2;
        int i4 = this.v;
        createBuilder2.copyOnWrite();
        arqq arqqVar9 = (arqq) createBuilder2.instance;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        arqqVar9.k = i5;
        arqqVar9.b |= 4096;
        List list = this.w;
        if (list != null) {
            createBuilder2.copyOnWrite();
            arqq arqqVar10 = (arqq) createBuilder2.instance;
            aopu aopuVar = arqqVar10.l;
            if (!aopuVar.c()) {
                arqqVar10.l = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) arqqVar10.l);
        }
        createBuilder.copyOnWrite();
        arqr arqrVar = (arqr) createBuilder.instance;
        arqq arqqVar11 = (arqq) createBuilder2.mo39build();
        arqqVar11.getClass();
        arqrVar.d = arqqVar11;
        arqrVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }

    public final void t(int i, int i2) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        aopa createBuilder = arqp.a.createBuilder();
        createBuilder.copyOnWrite();
        arqp arqpVar = (arqp) createBuilder.instance;
        arqpVar.b |= 1;
        arqpVar.c = i;
        createBuilder.copyOnWrite();
        arqp arqpVar2 = (arqp) createBuilder.instance;
        arqpVar2.b |= 2;
        arqpVar2.d = i2;
        this.w.add((arqp) createBuilder.mo39build());
    }
}
