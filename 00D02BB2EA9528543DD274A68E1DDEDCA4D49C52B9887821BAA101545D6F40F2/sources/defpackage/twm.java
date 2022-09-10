package defpackage;

import android.app.Activity;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: twm  reason: default package */
/* loaded from: classes7.dex */
public class twm implements twc {
    private final Boolean a;
    @dzsi
    private final CharSequence b;
    @dzsi
    private final CharSequence c;

    public twm(Activity activity, qib qibVar) {
        this.a = false;
        this.b = vxc.a(activity.getResources(), qibVar.e());
        this.c = vxc.b(activity.getResources(), qibVar.e());
    }

    private static boolean d(dbsg<doxp> dbsgVar) {
        if (dbsgVar.a()) {
            dquj dqujVar = dbsgVar.b().d;
            if (dqujVar == null) {
                dqujVar = dquj.f;
            }
            return !dqujVar.d.isEmpty();
        }
        return false;
    }

    @Override // defpackage.twc
    public Boolean a() {
        return this.a;
    }

    @Override // defpackage.twc
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.twc
    @dzsi
    public CharSequence c() {
        return this.c;
    }

    public twm(Activity activity, wuv wuvVar) {
        this.a = false;
        this.b = wuvVar.y(activity.getResources());
        this.c = wuvVar.z(activity.getResources());
    }

    public twm(Activity activity, btvo btvoVar, amve amveVar) {
        String str;
        dbsg j = dbsg.j(yyw.b(amveVar.a, btvoVar.getDirectionsPageParameters(), dcdc.e()));
        boolean z = false;
        if (j.a()) {
            dqtz b = dqtz.b(((doxp) j.b()).c);
            if ((b == null ? dqtz.UNKNOWN_FARE : b) == dqtz.IC_FARE) {
                z = true;
            }
        }
        this.a = Boolean.valueOf(z);
        String str2 = null;
        if (!j.a()) {
            str = null;
        } else if (d(j)) {
            dquj dqujVar = ((doxp) j.b()).d;
            str = (dqujVar == null ? dquj.f : dqujVar).d;
        } else {
            dquh dquhVar = ((doxp) j.b()).b;
            str = (dquhVar == null ? dquh.c : dquhVar).b;
        }
        this.b = str;
        if (j.a()) {
            if (d(j)) {
                Resources resources = activity.getResources();
                dquj dqujVar2 = ((doxp) j.b()).d;
                str2 = vxc.b(resources, dqujVar2 == null ? dquj.f : dqujVar2).toString();
            } else {
                dquh dquhVar2 = ((doxp) j.b()).b;
                str2 = (dquhVar2 == null ? dquh.c : dquhVar2).b;
            }
        }
        this.c = str2;
    }
}
