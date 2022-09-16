package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: inh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inh implements ayqe {
    public final /* synthetic */ iou a;
    private final /* synthetic */ int b;

    public /* synthetic */ inh(iou iouVar) {
        this.a = iouVar;
    }

    public /* synthetic */ inh(iou iouVar, int i) {
        this.b = i;
        this.a = iouVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            iou iouVar = this.a;
            fsw a = ((fsx) obj).a();
            a.d = iouVar.bQ.b;
            return a.a();
        } else if (i == 1) {
            iou iouVar2 = this.a;
            fsx fsxVar = (fsx) obj;
            mbt q = iouVar2.q();
            fhg p = iouVar2.p();
            lwm lwmVar = iouVar2.bP;
            if (!iouVar2.bu(q, p) || p == null || lwmVar == null || !lwmVar.n() || q == null) {
                return fsxVar;
            }
            fsw a2 = fsxVar.a();
            fsg a3 = fsh.a();
            a3.b = lwmVar.d();
            a3.c(lwmVar.m());
            a3.c = lwmVar;
            a3.d = p;
            a3.d(((ajzq) q).f60J);
            a3.b(zdg.e(iouVar2.rg()));
            a3.a = aaji.c(iouVar2.s());
            a2.a = a3.a();
            return a2.a();
        } else if (i != 2) {
            if (i == 3) {
                final iou iouVar3 = this.a;
                final ampr amprVar = (ampr) obj;
                eyy a4 = iouVar3.aF.a((aatf) amprVar.a);
                return ayoi.U(a4.b.h(hqc.d).h(new inx(a4.a)).w(new hqf(amprVar, 2)).h(hqc.c).O(), a4.a.w(new ayqb() { // from class: ing
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        final iou iouVar4 = iou.this;
                        final BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj2;
                        if (!ind.j((apzg) amprVar.b) || !eog.aI(iouVar4.av)) {
                            return;
                        }
                        iouVar4.bD.execute(new Runnable() { // from class: inp
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((aacg) iou.this.aG.get()).d(browseResponseModel.a);
                            }
                        });
                    }
                }).E(new hqf(amprVar, 3)).m(iod.a).k()).aB(inl.c);
            }
            Boolean bool = (Boolean) obj;
            return Optional.ofNullable(this.a.O);
        } else {
            final iou iouVar4 = this.a;
            fsx fsxVar2 = (fsx) obj;
            if (!iouVar4.bR.i()) {
                return fsxVar2;
            }
            fsw a5 = fsxVar2.a();
            fsj fsjVar = new fsj();
            fsjVar.a = Boolean.valueOf(iouVar4.bR.h());
            lyr lyrVar = iouVar4.bR;
            if (lyrVar != null) {
                fsjVar.b = lyrVar;
                fsjVar.c = Boolean.valueOf(zdg.e(iouVar4.rg()));
                Boolean bool2 = fsjVar.a;
                if (bool2 == null || fsjVar.b == null || fsjVar.c == null) {
                    StringBuilder sb = new StringBuilder();
                    if (fsjVar.a == null) {
                        sb.append(" isFilterApplied");
                    }
                    if (fsjVar.b == null) {
                        sb.append(" shownCallback");
                    }
                    if (fsjVar.c == null) {
                        sb.append(" isAccessibilityEnabled");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                a5.b = new fsk(bool2.booleanValue(), fsjVar.b, fsjVar.c.booleanValue());
                if (iouVar4.bR.h()) {
                    a5.a = null;
                    a5.m(new ampg() { // from class: ino
                        @Override // defpackage.ampg
                        public final Object apply(Object obj2) {
                            iou iouVar5 = iou.this;
                            frz frzVar = (frz) obj2;
                            frzVar.c(1);
                            frzVar.b = null;
                            frzVar.a = iouVar5.bR.d();
                            return frzVar;
                        }
                    });
                }
                return a5.a();
            }
            throw new NullPointerException("Null shownCallback");
        }
    }
}
