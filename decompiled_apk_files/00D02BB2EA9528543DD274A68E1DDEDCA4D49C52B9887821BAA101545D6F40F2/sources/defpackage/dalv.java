package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dalv  reason: default package */
/* loaded from: classes5.dex */
final class dalv extends daij {
    final /* synthetic */ Collection b;
    final /* synthetic */ Collection c;
    final /* synthetic */ dane d;
    final /* synthetic */ damc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dalv(damc damcVar, dane daneVar, Collection collection, Collection collection2, dane daneVar2) {
        super(daneVar);
        this.e = damcVar;
        this.b = collection;
        this.c = collection2;
        this.d = daneVar2;
    }

    @Override // defpackage.daij
    protected final void a() {
        Collection<String> collection = this.b;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        arrayList.addAll(damc.a(this.c));
        try {
            damc damcVar = this.e;
            damcVar.c.j.e(damcVar.b, arrayList, damc.b(), new dama(this.e, this.d));
        } catch (RemoteException e) {
            damc.a.e("startInstall(%s,%s)", this.b, this.c);
            this.d.a(new RuntimeException(e));
        }
    }
}
