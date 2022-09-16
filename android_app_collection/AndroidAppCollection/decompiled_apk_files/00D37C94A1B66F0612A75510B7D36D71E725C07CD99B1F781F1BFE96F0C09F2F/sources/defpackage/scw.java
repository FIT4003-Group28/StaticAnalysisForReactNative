package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: scw  reason: default package */
/* loaded from: classes4.dex */
public final class scw extends scg {
    public Map e;

    public scw(int i) {
        super(i);
        this.e = shp.i(i);
    }

    @Override // defpackage.scg
    public final void e(Object obj, int i) {
        this.e.put(obj, Integer.valueOf(i));
    }

    @Override // defpackage.scg
    public final void f() {
        List list = this.a;
        Map map = this.e;
        if (map == null) {
            this.e = shp.i(list.size());
        } else {
            map.clear();
        }
        for (int i = 0; i < this.d; i++) {
            this.e.put(list.get(i), Integer.valueOf(i));
        }
    }

    public scw(scx scxVar) {
        super(scxVar);
    }
}
