package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: altw  reason: default package */
/* loaded from: classes.dex */
final class altw extends also {
    final /* synthetic */ Collection a;
    final /* synthetic */ Collection b;
    final /* synthetic */ alvg c;
    final /* synthetic */ alty e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public altw(alty altyVar, alvg alvgVar, Collection collection, Collection collection2, alvg alvgVar2) {
        super(alvgVar);
        this.e = altyVar;
        this.a = collection;
        this.b = collection2;
        this.c = alvgVar2;
    }

    @Override // defpackage.also
    protected final void a() {
        Collection<String> collection = this.a;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        Collection<String> collection2 = this.b;
        ArrayList arrayList2 = new ArrayList(collection2.size());
        for (String str2 : collection2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList2.add(bundle2);
        }
        arrayList.addAll(arrayList2);
        try {
            alty altyVar = this.e;
            alud aludVar = (alud) altyVar.c.l;
            String str3 = altyVar.b;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("playcore_version_code", 11001);
            altx altxVar = new altx(this.e, this.c);
            Parcel pv = aludVar.pv();
            pv.writeString(str3);
            pv.writeTypedList(arrayList);
            dve.g(pv, bundle3);
            dve.i(pv, altxVar);
            aludVar.py(2, pv);
        } catch (RemoteException e) {
            alty.a.b(e, "startInstall(%s,%s)", this.a, this.b);
            this.c.a(new RuntimeException(e));
        }
    }
}
