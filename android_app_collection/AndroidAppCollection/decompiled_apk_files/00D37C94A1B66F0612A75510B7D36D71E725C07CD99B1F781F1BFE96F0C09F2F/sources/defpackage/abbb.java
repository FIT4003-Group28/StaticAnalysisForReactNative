package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: abbb  reason: default package */
/* loaded from: classes.dex */
public final class abbb extends aaqs {
    public String a;
    public final List b;
    public String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public abbb(aaqf aaqfVar, afvm afvmVar) {
        super("browse/edit_playlist", aaqfVar, afvmVar);
        this.b = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asas.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asas asasVar = (asas) createBuilder.instance;
            asasVar.b |= 2;
            asasVar.d = str;
        }
        List list = this.b;
        createBuilder.copyOnWrite();
        asas asasVar2 = (asas) createBuilder.instance;
        aopu aopuVar = asasVar2.e;
        if (!aopuVar.c()) {
            asasVar2.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) asasVar2.e);
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asas asasVar3 = (asas) createBuilder.instance;
            asasVar3.b |= 4;
            asasVar3.f = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        aqxo.y(this.a != null);
        if (this.b.size() <= 0) {
            z = false;
        }
        aqxo.y(z);
    }

    public final void t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add((auci) it.next());
        }
    }

    public final void u(String str, String str2) {
        aopa createBuilder = auci.a.createBuilder();
        createBuilder.copyOnWrite();
        auci auciVar = (auci) createBuilder.instance;
        auciVar.c = 35;
        auciVar.b |= 1;
        createBuilder.copyOnWrite();
        auci auciVar2 = (auci) createBuilder.instance;
        str.getClass();
        auciVar2.b |= 16;
        auciVar2.e = str;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            auci auciVar3 = (auci) createBuilder.instance;
            auciVar3.b |= 32;
            auciVar3.f = str2;
        }
        this.b.add((auci) createBuilder.mo39build());
    }
}
