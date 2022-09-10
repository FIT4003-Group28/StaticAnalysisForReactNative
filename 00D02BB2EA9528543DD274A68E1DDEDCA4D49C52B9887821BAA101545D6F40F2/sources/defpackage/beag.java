package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: beag  reason: default package */
/* loaded from: classes3.dex */
public class beag implements bdzt {
    private final dnwv a;
    private final dcdc<bdzu> b;

    public beag(final Context context, bdzs bdzsVar, final dnwv dnwvVar, final dxio<afha> dxioVar) {
        this.a = dnwvVar;
        this.b = dcbg.b(((beap) bdzsVar).a.f()).s(new dbrn(dxioVar, context, dnwvVar) { // from class: beae
            private final dxio a;
            private final Context b;
            private final dnwv c;

            {
                this.a = dxioVar;
                this.b = context;
                this.c = dnwvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ddho ddhoVar;
                dxio dxioVar2 = this.a;
                Context context2 = this.b;
                dnwv dnwvVar2 = this.c;
                beaq beaqVar = (beaq) obj;
                dnwv dnwvVar3 = dnwv.UNKNOWN_ACTION_TYPE;
                int ordinal = dnwvVar2.ordinal();
                if (ordinal == 1) {
                    ddhoVar = beaqVar.a() ? dtxy.lN : dtxy.lO;
                } else if (ordinal == 4) {
                    ddhoVar = beaqVar.a() ? dtxy.kz : dtxy.kA;
                } else if (ordinal != 16) {
                    ddhoVar = dtxy.mB;
                } else {
                    ddhoVar = beaqVar.a() ? dtxy.mt : dtxy.ms;
                }
                return new beaf(beaqVar, dxioVar2, context2, cjtd.a(ddhoVar));
            }
        }).z();
    }

    @Override // defpackage.bdzt
    @dzsi
    public cjtd a() {
        dnwv dnwvVar = this.a;
        dnwv dnwvVar2 = dnwv.UNKNOWN_ACTION_TYPE;
        int ordinal = dnwvVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 4) {
                return cjtd.a(dtxx.ci);
            }
            if (ordinal == 16) {
                return cjtd.a(dtxy.mr);
            }
            return null;
        }
        return cjtd.a(dtyi.cV);
    }

    @Override // defpackage.bdzt
    public List<bdzu> b() {
        return this.b;
    }
}
