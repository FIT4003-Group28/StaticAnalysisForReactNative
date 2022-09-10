package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfvf  reason: default package */
/* loaded from: classes3.dex */
public class bfvf implements bfuw, bega {
    private final huc a;
    private final List<bfuv> b = new ArrayList();
    private final bfuz c;
    private final bvpe d;
    @dzsi
    private View.OnAttachStateChangeListener e;
    @dzsi
    private cjtd f;

    public bfvf(huc hucVar, bfuz bfuzVar, bvpe bvpeVar) {
        this.a = hucVar;
        this.c = bfuzVar;
        this.d = bvpeVar;
    }

    @Override // defpackage.bfuw
    public List<bfuv> a() {
        return this.b;
    }

    @Override // defpackage.bfuw
    public cjtd b() {
        cjtd cjtdVar = this.f;
        return cjtdVar != null ? cjtdVar : cjtd.a(dtxr.cx);
    }

    @Override // defpackage.bfuw
    public View.OnAttachStateChangeListener c() {
        if (this.e == null) {
            this.e = new bvob(this.d.b, this.a.a(new htz(this) { // from class: bfve
                private final bfvf a;

                {
                    this.a = this;
                }

                @Override // defpackage.htz
                public final cjtd a() {
                    return this.a.b();
                }

                @Override // defpackage.htz
                public final cjql b() {
                    return null;
                }
            }));
        }
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null || !c.bW().a()) {
            u();
            return;
        }
        dsrj<dnob> dsrjVar = c.bW().b().a;
        List<bfuv> list = this.b;
        dcbg o = dcbg.b(dsrjVar).o(bfva.a);
        final bfuz bfuzVar = this.c;
        bfuzVar.getClass();
        list.addAll(o.s(new dbrn(bfuzVar) { // from class: bfvb
            private final bfuz a;

            {
                this.a = bfuzVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bfuz bfuzVar2 = this.a;
                dcdn<dnnv, bfux> dcdnVar = bfuz.a;
                dnnv b = dnnv.b(((dnob) obj).i);
                if (b == null) {
                    b = dnnv.UNKNOWN_HOTEL_HIGHLIGHT_TYPE;
                }
                bfux bfuxVar = dcdnVar.get(b);
                if (bfuxVar != null) {
                    return dbsg.i(new bfuy(bfuxVar.a, bfuzVar2.b.getString(bfuxVar.b)));
                }
                return dbpy.a;
            }
        }).o(bfvc.a).s(bfvd.a).z());
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxr.cx;
        this.f = c2.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.b.clear();
        this.f = null;
        this.e = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.b.isEmpty());
    }
}
