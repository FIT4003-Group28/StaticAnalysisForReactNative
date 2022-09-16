package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abai  reason: default package */
/* loaded from: classes.dex */
public final class abai extends aaqs {
    public final ArrayList a;
    public final aopa b;
    private atpf c;

    public abai(aaqf aaqfVar, afvm afvmVar) {
        super("notification_registration/set_registration", aaqfVar, afvmVar);
        this.c = atpf.a;
        this.a = new ArrayList();
        this.b = atpe.a.createBuilder();
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        ylr.b();
        aopa createBuilder = arxv.a.createBuilder();
        aopa mo52toBuilder = this.c.mo52toBuilder();
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        atpe atpeVar = atpe.a;
        ((atpe) aopaVar.instance).g = atpe.emptyProtobufList();
        ArrayList arrayList = this.a;
        aopaVar.copyOnWrite();
        atpe atpeVar2 = (atpe) aopaVar.instance;
        aopu aopuVar = atpeVar2.g;
        if (!aopuVar.c()) {
            atpeVar2.g = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) arrayList, (List) atpeVar2.g);
        mo52toBuilder.copyOnWrite();
        atpf atpfVar = (atpf) mo52toBuilder.instance;
        atpe atpeVar3 = (atpe) aopaVar.mo39build();
        atpeVar3.getClass();
        atpfVar.c = atpeVar3;
        atpfVar.b = 1;
        atpf atpfVar2 = (atpf) mo52toBuilder.mo39build();
        this.c = atpfVar2;
        createBuilder.copyOnWrite();
        arxv arxvVar = (arxv) createBuilder.instance;
        atpfVar2.getClass();
        arxvVar.d = atpfVar2;
        arxvVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        if (1 != (((atpe) this.b.instance).b & 1)) {
            z = false;
        }
        aqxo.y(z);
    }
}
