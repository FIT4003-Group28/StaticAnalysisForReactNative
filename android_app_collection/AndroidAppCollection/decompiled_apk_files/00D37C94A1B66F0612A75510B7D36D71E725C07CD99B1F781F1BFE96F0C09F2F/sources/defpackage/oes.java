package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: oes  reason: default package */
/* loaded from: classes3.dex */
public final class oes extends ajxh implements ajyw {
    private final yzj a;
    private final ajsm b;
    private ajyv c;

    public oes(aari aariVar, yni yniVar, Object obj, yzj yzjVar, acti actiVar, ajsm ajsmVar) {
        super(aariVar, yniVar, obj, yzjVar, actiVar);
        this.a = yzjVar;
        ajsmVar.getClass();
        this.b = ajsmVar;
    }

    private final void l(ajxf ajxfVar) {
        ajyv b;
        if (!af(ajfy.NEXT)) {
            k((ajyv) null);
            return;
        }
        ajyv ajyvVar = this.c;
        if (ajyvVar == null) {
            ajyu a = ajyv.a();
            a.a = ajxfVar;
            a.b = this.u;
            a.d = this;
            b = a.a();
        } else {
            b = ajyvVar.b(ajxfVar);
        }
        k(b);
    }

    public final void c(List list) {
        super.ls(list);
    }

    @Override // defpackage.ajxh
    public final void lD(ajfy ajfyVar) {
        if (ajfyVar == null || !af(ajfyVar)) {
            return;
        }
        l(ajxe.a());
        super.lD(ajfyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final void lj(cff cffVar, ajfz ajfzVar) {
        super.lj(cffVar, ajfzVar);
        l(new ajxd(this.a.a(cffVar), true, new Intent(), ajfzVar));
    }

    @Override // defpackage.ajyw
    public final void lk() {
        lD(ajfy.NEXT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        audg audgVar = (audg) obj;
        super.lz(audgVar, ajfyVar);
        ajyv ajyvVar = this.c;
        if (ajyvVar != null) {
            this.b.remove(ajyvVar);
            this.c = null;
        }
        A();
        if (audgVar == null) {
            return;
        }
        ajsm ajsmVar = this.b;
        ArrayList arrayList = new ArrayList();
        for (audf audfVar : audgVar.i) {
            if ((audfVar.b & 1) != 0) {
                audk audkVar = audfVar.c;
                if (audkVar == null) {
                    audkVar = audk.a;
                }
                arrayList.add(audkVar);
            }
        }
        ajsmVar.addAll(arrayList);
        ls(abgc.b(audgVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(audg.b)) {
            return null;
        }
        return (audg) aunaVar.qm(audg.b);
    }

    private final void k(ajyv ajyvVar) {
        ajyv ajyvVar2 = this.c;
        if (ajyvVar2 == ajyvVar) {
            return;
        }
        if (ajyvVar2 == null || ajyvVar == null) {
            this.b.remove(ajyvVar2);
            if (ajyvVar != null) {
                this.b.add(ajyvVar);
            }
        } else {
            this.b.o(ajyvVar2, ajyvVar);
        }
        this.c = ajyvVar;
    }
}
