package defpackage;

import com.google.android.apps.gmm.locationsharing.interprocess.api.ShareCreationPrerequisitesState;
/* compiled from: PG */
/* renamed from: ahzh  reason: default package */
/* loaded from: classes2.dex */
public class ahzh {
    public final akai a;
    public final ajsj b;
    private final ahzi c;

    public ahzh(akai akaiVar, ajsj ajsjVar, ahzi ahziVar) {
        this.a = akaiVar;
        this.b = ajsjVar;
        this.c = ahziVar;
    }

    public static dcdc<Integer> b(dcep<akaf> dcepVar) {
        return dcbg.b(dcepVar).s(ahze.a).o(ahzf.a).s(ahzg.a).z();
    }

    public final ShareCreationPrerequisitesState a(btlu btluVar) {
        akah a = this.a.a(btluVar);
        String j = btluVar.j();
        dbsk.s(j);
        return new ShareCreationPrerequisitesState(j, this.c.a(btluVar), b(((ajzf) a).b));
    }
}
