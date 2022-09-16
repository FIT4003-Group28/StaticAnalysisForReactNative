package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aayk  reason: default package */
/* loaded from: classes.dex */
public final class aayk extends aaqs {
    public boolean a;
    public boolean b;
    public boolean c;
    private boolean d;
    private boolean s;
    private final ArrayList t;

    public aayk(aaqf aaqfVar, afvm afvmVar) {
        super("live/get_broadcast_status", aaqfVar, afvmVar);
        this.t = new ArrayList();
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arst.a.createBuilder();
        boolean z = this.a;
        createBuilder.copyOnWrite();
        arst arstVar = (arst) createBuilder.instance;
        arstVar.b |= 64;
        arstVar.h = z;
        boolean z2 = this.d;
        createBuilder.copyOnWrite();
        arst arstVar2 = (arst) createBuilder.instance;
        arstVar2.b |= 128;
        arstVar2.i = z2;
        boolean z3 = this.s;
        createBuilder.copyOnWrite();
        arst arstVar3 = (arst) createBuilder.instance;
        arstVar3.b |= 4;
        arstVar3.e = z3;
        boolean z4 = this.c;
        createBuilder.copyOnWrite();
        arst arstVar4 = (arst) createBuilder.instance;
        arstVar4.b |= 16;
        arstVar4.g = z4;
        boolean z5 = this.b;
        createBuilder.copyOnWrite();
        arst arstVar5 = (arst) createBuilder.instance;
        arstVar5.b |= 8;
        arstVar5.f = z5;
        if (!this.t.isEmpty()) {
            ArrayList arrayList = this.t;
            createBuilder.copyOnWrite();
            arst arstVar6 = (arst) createBuilder.instance;
            aopu aopuVar = arstVar6.d;
            if (!aopuVar.c()) {
                arstVar6.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) arrayList, (List) arstVar6.d);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }

    public final void t(String str) {
        zgh.m(str);
        this.t.add(str);
    }

    public final void u() {
        this.d = true;
    }

    public final void v() {
        this.s = true;
    }
}
