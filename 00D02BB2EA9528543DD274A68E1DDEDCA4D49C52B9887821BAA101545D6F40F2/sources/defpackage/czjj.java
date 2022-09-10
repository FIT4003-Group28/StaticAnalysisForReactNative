package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: czjj  reason: default package */
/* loaded from: classes5.dex */
public final class czjj implements czie<InputStream> {
    private czjj() {
    }

    public static czjj b() {
        return new czjj();
    }

    public static final InputStream c(czid czidVar) {
        InputStream c = czidVar.a.c(czidVar.e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        if (!czidVar.c.isEmpty()) {
            List<czjp> list = czidVar.c;
            ArrayList arrayList2 = new ArrayList();
            for (czjp czjpVar : list) {
                czjn a = czjpVar.a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            czia cziaVar = !arrayList2.isEmpty() ? new czia(c, arrayList2) : null;
            if (cziaVar != null) {
                arrayList.add(cziaVar);
            }
        }
        for (czjq czjqVar : czidVar.b) {
            InputStream inputStream = (InputStream) dcft.s(arrayList);
            arrayList.add(czjqVar.c());
        }
        Collections.reverse(arrayList);
        for (czio czioVar : czidVar.f) {
        }
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.czie
    public final /* bridge */ /* synthetic */ InputStream a(czid czidVar) {
        return c(czidVar);
    }
}
