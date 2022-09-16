package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mxk  reason: default package */
/* loaded from: classes3.dex */
public final class mxk implements nch {
    public mxt a;
    public apzg b;
    public List c;

    public final void a(apzg apzgVar, List list) {
        this.b = apzgVar;
        this.c = list;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ ncf b(Object obj) {
        ncf ncfVar = new ncf();
        auia auiaVar = auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal = ((auia) obj).ordinal();
        if (ordinal == 1) {
            ncfVar.c = new mxj(this, 1);
            ncfVar.a = true;
            ncfVar.b = true;
        } else if (ordinal == 2) {
            ncfVar.c = new mxj(this);
            ncfVar.a = true;
        }
        return ncfVar;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Integer c(Object obj) {
        auif auifVar = (auif) obj;
        if (auifVar == null || (auifVar.b & 2) == 0) {
            return null;
        }
        return Integer.valueOf(auifVar.d);
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        auif auifVar = (auif) obj;
        if (auifVar == null || (auifVar.b & 4) == 0) {
            return auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        auia b = auia.b(auifVar.e);
        return b == null ? auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN : b;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object e() {
        return auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object f() {
        return auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object g() {
        return auia.PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ void h(Map map, Object[] objArr) {
        auif[] auifVarArr;
        for (auif auifVar : (auif[]) objArr) {
            auib b = auib.b(auifVar.c);
            if (b == null) {
                b = auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b, auifVar);
        }
    }

    @Override // defpackage.nch
    public final void i() {
        this.a.q(this.b);
    }

    @Override // defpackage.nch
    public final void j(mxt mxtVar) {
        this.a = mxtVar;
    }
}
