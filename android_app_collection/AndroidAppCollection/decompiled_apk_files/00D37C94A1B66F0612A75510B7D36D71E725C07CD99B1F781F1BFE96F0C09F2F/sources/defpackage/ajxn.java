package defpackage;

import java.util.Queue;
/* compiled from: PG */
/* renamed from: ajxn  reason: default package */
/* loaded from: classes.dex */
public abstract class ajxn extends ajxh {
    public final Object F;
    public final ajxb G;
    public ajxh H;

    public ajxn(akam akamVar, aari aariVar, yni yniVar, Object obj, yzj yzjVar, acti actiVar, Queue queue) {
        super(akamVar, aariVar, yniVar, obj, yzjVar, actiVar, new qrj(4), queue);
        this.F = obj;
        this.G = new ajxb() { // from class: ajxm
            @Override // defpackage.ajxb
            public final void a(cff cffVar, ajfz ajfzVar) {
                ajxb ajxbVar = ajxn.this.D;
                if (ajxbVar != null) {
                    ajxbVar.a(cffVar, ajfzVar);
                }
            }
        };
    }

    @Override // defpackage.ajxh
    public final ajfz U(ajfy ajfyVar) {
        if (this.H == null || ajfyVar != ajfy.NEXT) {
            return super.U(ajfyVar);
        }
        return this.H.U(ajfyVar);
    }

    @Override // defpackage.ajxh
    public final Object W() {
        return this.F;
    }

    @Override // defpackage.ajxh
    public final boolean af(ajfy ajfyVar) {
        if (this.H == null || ajfyVar != ajfy.NEXT) {
            return super.af(ajfyVar);
        }
        return this.H.af(ajfyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ah(ajxh ajxhVar) {
        ajxh ajxhVar2 = this.H;
        if (ajxhVar2 != null) {
            return !ajxhVar2.af(ajfy.NEXT);
        } else if (!super.af(ajfy.NEXT)) {
            return true;
        } else {
            return !ajxhVar.af(ajfy.NEXT) ? false : false;
        }
    }

    @Override // defpackage.ajxh
    public final void lD(ajfy ajfyVar) {
        ajxh ajxhVar;
        if (ajfyVar != ajfy.NEXT || (ajxhVar = this.H) == null || ajxhVar.U(ajfy.NEXT) == null) {
            super.lD(ajfyVar);
        } else {
            this.H.lD(ajfyVar);
        }
    }
}
