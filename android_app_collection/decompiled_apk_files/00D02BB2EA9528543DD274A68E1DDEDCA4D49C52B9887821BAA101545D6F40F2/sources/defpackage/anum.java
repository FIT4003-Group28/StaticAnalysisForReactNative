package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anum  reason: default package */
/* loaded from: classes2.dex */
public final class anum {
    public final Activity a;
    public final cqat b;
    public final aoah c;
    public final bvsl d;
    public final anrz e;
    public final apkr f;
    public final antx g;
    public final anhg h;
    public final bbut i;
    public final aoiw j;
    public final aogw k;
    private final cqss l;

    public anum(Activity activity, cqat cqatVar, aoah aoahVar, bvsl bvslVar, apkr apkrVar, anrz anrzVar, antx antxVar, anhg anhgVar, bbut bbutVar, aoiw aoiwVar, aogw aogwVar) {
        cqss c = cqrt.c(R.color.maps_activity_timeline_stop_segment_line_color);
        this.a = activity;
        this.b = cqatVar;
        this.l = c;
        this.c = aoahVar;
        this.d = bvslVar;
        this.e = anrzVar;
        this.f = apkrVar;
        this.g = antxVar;
        this.h = anhgVar;
        this.i = bbutVar;
        this.j = aoiwVar;
        this.k = aogwVar;
    }

    public static cqss b(aohc aohcVar, aofn aofnVar) {
        Boolean bool;
        dqjl dqjlVar;
        dvak dvakVar;
        dcdc<dvay> dcdcVar = aohcVar.a;
        int size = dcdcVar.size();
        int i = 0;
        while (true) {
            if (i < size) {
                dvay dvayVar = dcdcVar.get(i);
                if (dvayVar.b == 9) {
                    dvakVar = (dvak) dvayVar.c;
                } else {
                    dvakVar = dvak.e;
                }
                int a = dqkj.a(dvakVar.d);
                if (a == 0) {
                    a = 1;
                }
                i++;
                if (a == 4) {
                    bool = true;
                    break;
                }
            } else {
                bool = false;
                break;
            }
        }
        if (bool.booleanValue()) {
            dqjlVar = dqjl.UNKNOWN_ACTIVITY_TYPE;
        } else {
            dqjlVar = aohcVar.e;
        }
        return aofnVar.b(dqjlVar);
    }

    public final cqss a(aogx aogxVar, aofn aofnVar) {
        return aogxVar instanceof aohc ? b((aohc) aogxVar, aofnVar) : this.l;
    }
}
