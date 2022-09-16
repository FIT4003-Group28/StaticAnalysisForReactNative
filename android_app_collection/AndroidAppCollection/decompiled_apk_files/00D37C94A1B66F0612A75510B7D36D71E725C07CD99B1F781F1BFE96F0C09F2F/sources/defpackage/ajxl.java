package defpackage;

import android.content.res.Configuration;
import android.view.View;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ajxl  reason: default package */
/* loaded from: classes.dex */
public abstract class ajxl extends ajxh implements ajyj, ynl {
    private final yni a;
    private boolean b;
    public final ajsm i;
    public ajyv j;
    public boolean k;
    public ajfz l;

    public ajxl(aari aariVar, yni yniVar, yzj yzjVar, acti actiVar) {
        this(aariVar, yniVar, yzjVar, actiVar, null, new ajsm());
    }

    private final boolean k() {
        if (!this.i.isEmpty()) {
            ajsm ajsmVar = this.i;
            return ajsmVar.get(ajsmVar.size() + (-1)) == this.j;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(Object obj) {
        C(obj, this.i.size() - (k() ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C(Object obj, int i) {
        boolean z = false;
        if (i >= 0 && i <= this.i.size() - (k() ? 1 : 0)) {
            z = true;
        }
        aqxo.y(z);
        this.i.add(i, obj);
        J(this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(Collection collection) {
        E(collection, this.i.size() - (k() ? 1 : 0));
    }

    public final void E(Collection collection, int i) {
        this.i.addAll(i, collection);
        J(this.j);
    }

    public final void F(ajxp ajxpVar) {
        lr(ajxpVar.a());
    }

    public void G(Object obj) {
        if (obj != null) {
            this.i.remove(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(ampt amptVar) {
        if (amptVar != null) {
            this.i.m(amptVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return;
        }
        this.i.o(obj, obj2);
    }

    public final void J(ajyv ajyvVar) {
        if (this.k || !this.b) {
            this.i.remove(this.j);
        } else if (this.i.contains(this.j)) {
            ajyv ajyvVar2 = this.j;
            if (ajyvVar2 != ajyvVar) {
                this.i.o(ajyvVar2, ajyvVar);
            }
        } else {
            this.i.add(ajyvVar);
        }
        this.j = ajyvVar;
    }

    public final void K(boolean z) {
        if (this.b != z) {
            this.b = z;
            J(this.j);
        }
    }

    @Override // defpackage.ajxh, defpackage.zdx
    public void j() {
        super.j();
        this.a.m(this);
    }

    @Override // defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        return aolu.r(this, obj, i);
    }

    @Override // defpackage.ajyj
    public ajqm lA() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lB() {
        this.i.clear();
        A();
    }

    @Override // defpackage.ajyj
    public void lC(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final void lj(cff cffVar, ajfz ajfzVar) {
        super.lj(cffVar, ajfzVar);
        this.l = ajfzVar;
    }

    @Override // defpackage.ajxh, defpackage.ajzh
    public akam pn() {
        return new ajxk(super.pn(), this.i, this.k, this.l, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajxl(aari aariVar, yni yniVar, yzj yzjVar, acti actiVar, akam akamVar, ajsm ajsmVar) {
        super(akam.a(akamVar), aariVar, yniVar, yni.c(), yzjVar, actiVar, new qrj(4));
        yniVar.getClass();
        this.a = yniVar;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ajxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajxl.this.lD(ajfy.NEXT);
            }
        };
        ajyw ajywVar = new ajyw() { // from class: ajxj
            @Override // defpackage.ajyw
            public final void lk() {
                ajxl ajxlVar = ajxl.this;
                ajfz ajfzVar = ajxlVar.l;
                if (ajfzVar != null) {
                    ajxlVar.lr(ajfzVar);
                    ajxlVar.l = null;
                }
            }
        };
        this.i = ajsmVar;
        if (akamVar instanceof ajxk) {
            ajxk ajxkVar = (ajxk) akamVar;
            ajsmVar.p(ajxkVar.a);
            boolean z = ajxkVar.b;
            this.k = ajxkVar.c;
            this.l = ajxkVar.d;
            ajyu ajyuVar = new ajyu(ajxkVar.e);
            ajyuVar.c = onClickListener;
            ajyuVar.d = ajywVar;
            J(ajyuVar.a());
        } else {
            this.k = true;
            ajyu a = ajyv.a();
            a.b = W();
            a.c = onClickListener;
            a.d = ajywVar;
            J(a.a());
        }
        yniVar.j(this, ajxl.class, W());
        this.b = true;
    }
}
