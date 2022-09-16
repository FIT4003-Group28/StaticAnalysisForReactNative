package defpackage;

import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xsp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xsp implements View.OnClickListener {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ apoj b;
    public final /* synthetic */ acti c;
    public final /* synthetic */ Map d;
    private final /* synthetic */ int e;

    public /* synthetic */ xsp(xtc xtcVar, apoj apojVar, acti actiVar, Map map) {
        this.a = xtcVar;
        this.b = apojVar;
        this.c = actiVar;
        this.d = map;
    }

    public /* synthetic */ xsp(xtc xtcVar, apoj apojVar, acti actiVar, Map map, int i) {
        this.e = i;
        this.a = xtcVar;
        this.b = apojVar;
        this.c = actiVar;
        this.d = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e != 0) {
            this.a.h(this.b, this.c, this.d);
            return;
        }
        xtc xtcVar = this.a;
        apoj apojVar = this.b;
        acti actiVar = this.c;
        Map map = this.d;
        int i = apojVar.b;
        if ((i & 16384) == 0) {
            return;
        }
        if ((i & 1048576) != 0) {
            actiVar.H(3, new acte(apojVar.t), null);
        }
        aafo aafoVar = xtcVar.d;
        apzg apzgVar = apojVar.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, map);
    }
}
