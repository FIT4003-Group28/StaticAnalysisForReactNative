package defpackage;

import android.content.Context;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: azyh  reason: default package */
/* loaded from: classes.dex */
public final class azyh extends azwm<azyh> {
    private static final dcqe a = dcqe.c("azyh");
    private final bvrt<domd> b;

    public azyh(azyg azygVar) {
        super(azygVar);
        this.b = bvrt.b(azygVar.a.bK());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(domd domdVar) {
        domf domfVar = domdVar.b;
        if (domfVar == null) {
            domfVar = domf.d;
        }
        return Base64.encodeToString(domfVar.bS(), 0);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        bvoo.h("The tutorial history entry display name is intentionally not implemented and should never be displayed.", new Object[0]);
        return "";
    }

    public final domd g() {
        return this.b.e((dssr) domd.d.cu(7), domd.d);
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azyh> h() {
        return azxm.f;
    }

    public final dqkd j() {
        dqkd dqkdVar = g().c;
        return dqkdVar == null ? dqkd.f : dqkdVar;
    }

    @Override // defpackage.azwm
    /* renamed from: k */
    public final azyg i() {
        return new azyg(this);
    }
}
