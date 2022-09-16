package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: znx  reason: default package */
/* loaded from: classes4.dex */
public final class znx implements znj {
    public final List a;
    public final vne b;

    public znx(final List list, final vne vneVar) {
        list.getClass();
        this.a = list;
        this.b = vneVar;
        anii.h(d(), new ampg() { // from class: znv
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                List<FilterMapTable$FilterDescriptor> list2 = list;
                vne vneVar2 = vneVar;
                Map map = (Map) obj;
                if (map == null || !map.containsKey(znx.e("NORMAL"))) {
                    HashMap hashMap = new HashMap();
                    for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : list2) {
                        hashMap.put(znx.e(filterMapTable$FilterDescriptor.a), 2);
                        filterMapTable$FilterDescriptor.d = new znl(2);
                    }
                    vneVar2.b(new znw(hashMap), anjk.a);
                } else {
                    for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 : list2) {
                        filterMapTable$FilterDescriptor2.d = new znl(((Integer) zew.J(map, znx.e(filterMapTable$FilterDescriptor2.a), 0)).intValue());
                    }
                }
                return true;
            }
        }, anjk.a);
    }

    public static final String e(String str) {
        String valueOf = String.valueOf(akzj.h(str));
        return valueOf.length() != 0 ? "VISITED_EFFECT_ID_".concat(valueOf) : new String("VISITED_EFFECT_ID_");
    }

    @Override // defpackage.znj
    public final void a(String str) {
        anii.h(anii.h(c(e(str)), ydy.i, anjk.a), new znu(this, str), anjk.a);
        FilterMapTable$FilterDescriptor b = b(str);
        if (b != null) {
            b.d = new znl(2);
        }
    }

    public final FilterMapTable$FilterDescriptor b(String str) {
        return FilterMapTable$FilterDescriptor.a(this.a, str);
    }

    public final ankt c(String str) {
        return anii.h(this.b.a(), new wdx(str, 11), anjk.a);
    }

    public final ankt d() {
        return anii.h(this.b.a(), ydy.g, anjk.a);
    }
}
