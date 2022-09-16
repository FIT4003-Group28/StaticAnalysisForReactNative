package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vkk  reason: default package */
/* loaded from: classes4.dex */
public final class vkk implements vja {
    public boolean a = false;

    private vkk() {
    }

    public static vkk b() {
        return new vkk();
    }

    @Override // defpackage.vja
    /* renamed from: c */
    public final InputStream a(viz vizVar) {
        InputStream d = vizVar.b.d(vizVar.f);
        if (this.a) {
            d = new BufferedInputStream(d);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        if (!vizVar.d.isEmpty()) {
            List<vkq> list = vizVar.d;
            ArrayList arrayList2 = new ArrayList();
            for (vkq vkqVar : list) {
                vkqVar.f();
            }
            viw viwVar = !arrayList2.isEmpty() ? new viw(d, arrayList2) : null;
            if (viwVar != null) {
                arrayList.add(viwVar);
            }
        }
        for (vkr vkrVar : vizVar.c) {
            InputStream inputStream = (InputStream) arey.s(arrayList);
            arrayList.add(vkrVar.e());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
