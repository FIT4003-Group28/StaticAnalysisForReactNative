package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ceaj  reason: default package */
/* loaded from: classes4.dex */
public final class ceaj extends an {
    public final z<List<Uri>> a;
    public final z<List<Uri>> d;
    public final z<dmbc> e;
    public final z<CharSequence> f;
    public final v<Integer> g;
    public final v<Map<Uri, String>> h;
    public final v<Boolean> i;
    private final v<Boolean> j;
    private final v<Boolean> k;

    public ceaj(ad adVar) {
        dzvx.c(adVar, "savedState");
        this.a = adVar.b("externalMedia", dztu.a);
        z<List<Uri>> b = adVar.b("selectedMedia", dztu.a);
        this.d = b;
        z<dmbc> zVar = new z<>();
        this.e = zVar;
        z<CharSequence> b2 = adVar.b("comment", "");
        this.f = b2;
        v<Integer> a = am.a(b, ceah.a);
        this.g = a;
        this.h = am.a(zVar, ceai.a);
        v<Boolean> a2 = am.a(a, ceag.a);
        this.j = a2;
        v<Boolean> a3 = am.a(b2, ceaf.a);
        this.k = a3;
        this.i = cdkt.a(a2, a3);
    }

    public final void c(List<? extends Uri> list) {
        List<? extends Uri> list2;
        dzvx.c(list, "mediaList");
        v vVar = this.a;
        List list3 = (List) vVar.h();
        if (list3 == null || (list2 = dzti.i(list3, list)) == null) {
            list2 = list;
        }
        vVar.g(list2);
        d(list);
    }

    public final void d(List<? extends Uri> list) {
        List<Uri> b;
        List<Uri> h = this.d.h();
        if (h == null) {
            h = dztu.a;
        }
        if (h.size() >= 50) {
            return;
        }
        z<List<Uri>> zVar = this.d;
        List<Object> h2 = dzti.h(dzti.i(h, list));
        dzvx.c(h2, "$this$take");
        if (!(h2 instanceof Collection) || h2.size() > 50) {
            ArrayList arrayList = new ArrayList(50);
            int i = 0;
            for (Object obj : h2) {
                arrayList.add(obj);
                i++;
                if (i == 50) {
                    break;
                }
            }
            b = dzti.b(arrayList);
        } else {
            b = dzti.f(h2);
        }
        zVar.g(b);
    }
}
