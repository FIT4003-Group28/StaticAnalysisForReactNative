package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tee  reason: default package */
/* loaded from: classes7.dex */
public class tee extends tdz implements tdk {
    private final tak a;
    private final twa b;
    @dzsi
    private final taj c;
    @dzsi
    private final CharSequence d;
    private final zfg e;

    public tee(Activity activity, cqhn cqhnVar, bvsl bvslVar, tam tamVar, tao taoVar, tlv tlvVar, amve amveVar) {
        this.b = new tap(activity, amveVar);
        this.a = taoVar.a(amveVar);
        tal talVar = null;
        this.d = amveVar.b().c.isEmpty() ? null : activity.getString(R.string.VIA_ROADS_CLAUSE, new Object[]{amveVar.b().c});
        tal a = tamVar.a(tlvVar, amveVar);
        this.c = true != dbsj.d(a.a()) ? a : talVar;
        this.e = zqc.q(activity.getResources(), bvslVar, amveVar.s(), amveVar.t(), amtg.c(amveVar));
    }

    @Override // defpackage.tdk
    @dzsi
    public CharSequence a() {
        return this.d;
    }

    @Override // defpackage.tdk
    public zfg b() {
        return this.e;
    }

    @Override // defpackage.tdk
    @dzsi
    public taj c() {
        return this.c;
    }

    @Override // defpackage.tdk
    public tak d() {
        return this.a;
    }

    @Override // defpackage.tdk
    public twa e() {
        return this.b;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean i() {
        return Boolean.valueOf(c() != null);
    }
}
