package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
@Deprecated
/* renamed from: aqni  reason: default package */
/* loaded from: classes2.dex */
class aqni extends aqcg {
    public final dxio<apyz> f;
    public final apzb g;
    @dzsi
    public Runnable h;
    private final dxio<aqov> i;
    private final dxio<aqmk> j;
    private final aqgn k;
    @dzsi
    private cvbp l;
    @dzsi
    private cvav m;
    private boolean n;

    public aqni(gga ggaVar, bvrb bvrbVar, dxio<aqbo> dxioVar, dxio<apyz> dxioVar2, dxio<aqov> dxioVar3, dxio<aqmk> dxioVar4, aqgn aqgnVar, apzb apzbVar, @dzsi cvbp cvbpVar, ges gesVar) {
        super(ggaVar, gesVar, bvrbVar, dxioVar);
        this.n = false;
        this.f = dxioVar2;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.k = aqgnVar;
        this.g = apzbVar;
        this.l = cvbpVar;
    }

    @Override // defpackage.aqcc
    public Boolean b() {
        return false;
    }

    @Override // defpackage.aqcc
    public cjtd c() {
        return cjtd.a(dtxv.dE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void h() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        } else {
            super.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void i(ctyy ctyyVar) {
        if (this.b.aD && this.l != null) {
            if (this.m == null || this.n) {
                aqov a = this.i.a();
                cvbp cvbpVar = this.l;
                dbsk.s(cvbpVar);
                final aqgn aqgnVar = this.k;
                aqgnVar.getClass();
                this.m = a.a(ctyyVar, cvbpVar, new dbsl(aqgnVar) { // from class: aqnf
                    private final aqgn a;

                    {
                        this.a = aqgnVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return this.a.b((cufw) obj);
                    }
                }, new cvau(this) { // from class: aqng
                    private final aqni a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cvau
                    public final void a(ConversationId conversationId) {
                        aqni aqniVar = this.a;
                        apza i = apzc.i();
                        i.b(conversationId);
                        i.d(aqniVar.g);
                        aqniVar.f.a().n(i.e(), false);
                    }
                }, aqnh.a);
                this.n = false;
            }
            this.m.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void j(dcdc<ctyy> dcdcVar) {
    }

    public void m() {
        PG();
        cvav cvavVar = this.m;
        if (cvavVar != null) {
            cvavVar.A();
        }
        this.j.a().a();
    }

    public void n() {
        cvav cvavVar = this.m;
        if (cvavVar != null) {
            cvavVar.B();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(@dzsi cvbp cvbpVar) {
        if (this.l != cvbpVar) {
            this.n = true;
        }
        this.l = cvbpVar;
    }
}
