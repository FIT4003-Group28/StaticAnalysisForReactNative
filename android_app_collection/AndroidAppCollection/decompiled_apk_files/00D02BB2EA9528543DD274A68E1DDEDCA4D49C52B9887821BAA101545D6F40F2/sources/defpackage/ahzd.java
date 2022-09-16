package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: ahzd  reason: default package */
/* loaded from: classes2.dex */
public class ahzd {
    public final akai a;
    public final ajsj b;
    private final ahzi c;

    public ahzd(akai akaiVar, ajsj ajsjVar, ahzi ahziVar) {
        this.a = akaiVar;
        this.b = ajsjVar;
        this.c = ahziVar;
    }

    public static dcdc<Integer> b(dcep<akaf> dcepVar) {
        return dcbg.b(dcepVar).s(ahzc.a).z();
    }

    public final ReportingState a(btlu btluVar) {
        akah a = this.a.a(btluVar);
        String j = btluVar.j();
        dbsk.s(j);
        return new ReportingState(j, this.c.a(btluVar), b(((ajzf) a).b));
    }
}
