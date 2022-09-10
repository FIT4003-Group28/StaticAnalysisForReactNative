package defpackage;

import android.content.ComponentName;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwfm  reason: default package */
/* loaded from: classes4.dex */
final class bwfm implements bwfl {
    private final Map<ComponentName, bwfk> a = new HashMap();

    @Override // defpackage.bwfl
    public final void a(List<bwfk> list, List<bwfn> list2) {
        Map<ComponentName, bwfk> map = this.a;
        map.clear();
        dcdg p = dcdn.p();
        Float valueOf = Float.valueOf(0.5f);
        p.f("0262147b774dffd31526d0b545835f576f66d000", valueOf);
        p.f("88e64a551fe9dea7c44d451649199a46fac4f7ec", valueOf);
        p.f("bc60b6401dfceebb1d63b10dc959f33f2723821b", valueOf);
        p.f("206e1baf91db93fb060543390a821472b4e7cf59", valueOf);
        p.f("a4c293e776e2343bc317091661ccb675ca52b281", valueOf);
        p.f("b6be0b3652fc789297fdf2b4318ed529ccc33e2b", valueOf);
        p.f("d647abf80a3d36bfa6dbacde6a0acf984f9306d5", valueOf);
        p.f("303e0df4a3d0061b718945d3893e80f51f0755c7", valueOf);
        p.f("406b1f12f3946d40898e8cc52aeb656bc6b9770c", valueOf);
        p.f("0ca87267244da76a0f3fc5d8fec245dc76b33b7d", valueOf);
        Float valueOf2 = Float.valueOf(-0.5f);
        p.f("43b61f506b41e7738d7048eb6d5a457751f40a04", valueOf2);
        p.f("b13839c63e7045b8c017731c83822c85da921726", valueOf2);
        dcdn b = p.b();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bwfk bwfkVar = list.get(i);
            ComponentName componentName = new ComponentName(bwfkVar.a.activityInfo.packageName, bwfkVar.a.activityInfo.name);
            map.put(componentName, bwfkVar);
            Float f = (Float) b.get(dczc.a.a(componentName.toString(), dbrc.c).toString());
            bwfkVar.b = f == null ? 0.0f : f.floatValue();
        }
        float f2 = 1.0f;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            bwfn bwfnVar = list2.get(size2);
            bwfk bwfkVar2 = map.get(bwfnVar.a);
            if (bwfkVar2 != null) {
                bwfkVar2.b += bwfnVar.c * f2;
                f2 *= 0.95f;
            }
        }
        Collections.sort(list);
    }
}
