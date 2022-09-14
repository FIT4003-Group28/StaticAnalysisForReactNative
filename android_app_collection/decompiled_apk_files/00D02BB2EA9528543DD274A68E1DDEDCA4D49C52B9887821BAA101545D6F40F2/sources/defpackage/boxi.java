package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: boxi  reason: default package */
/* loaded from: classes3.dex */
public final class boxi implements Serializable {
    public final dcdc<bvrt<dodb>> a;
    public final int b;

    public boxi(List<dodb> list, dbsg<dodb> dbsgVar) {
        ArrayList arrayList = new ArrayList();
        bvrt.h(list, arrayList);
        this.a = dcdc.r(arrayList);
        this.b = dbsgVar.a() ? list.indexOf(dbsgVar.b()) : -1;
    }
}
