package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Spanned;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zfu  reason: default package */
/* loaded from: classes7.dex */
public abstract class zfu implements zbe {
    public static final dcep<doxb> a = dcep.C(doxb.TYPE_TOLLS_NO, doxb.TYPE_TOLLS_YES);
    protected final Activity b;
    private final Map<Integer, zso> c = new aif();

    public zfu(Activity activity, cqhn cqhnVar) {
        this.b = activity;
    }

    @Override // defpackage.zbe
    public List<zso> a() {
        return dcdc.r(this.c.values());
    }

    public void c(dcdc<aldt> dcdcVar) {
        this.c.clear();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aldt aldtVar = dcdcVar.get(i);
            if (d(aldtVar)) {
                Map<Integer, zso> map = this.c;
                Integer valueOf = Integer.valueOf(aldtVar.a().c);
                amub a2 = aldtVar.a();
                Rect b = aldtVar.b();
                Spanned e = bvtb.e(this.b.getResources(), a2.E(), bvsz.ABBREVIATED);
                map.put(valueOf, new zsu(a2.c, e, e(e, a2.p, dcbg.b(a2.t).r(zfs.a)), b, new dbty() { // from class: zft
                    @Override // defpackage.dbty
                    public final Object a() {
                        return new Point(0, 0);
                    }
                }));
            }
        }
        cqkx.p(this);
    }

    protected abstract boolean d(aldt aldtVar);

    protected abstract String e(CharSequence charSequence, CharSequence charSequence2, dbsg<doxc> dbsgVar);
}
