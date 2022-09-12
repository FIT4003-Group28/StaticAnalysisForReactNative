package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: arhz  reason: default package */
/* loaded from: classes2.dex */
public class arhz {
    private final Activity a;
    private final cjqy b;
    private final dxio<afha> c;

    public arhz(Activity activity, cjqy cjqyVar, dxio<afha> dxioVar) {
        this.b = cjqyVar;
        this.a = activity;
        this.c = dxioVar;
    }

    public final dcdc<aric> a(List<dvbv> list) {
        dccx F = dcdc.F();
        for (dvbv dvbvVar : list) {
            int i = dvbvVar.a;
            if (i == 1 || i == 2) {
                F.g(new aria(this.a, this.b, dvbvVar, this.c));
            }
        }
        return F.f();
    }
}
