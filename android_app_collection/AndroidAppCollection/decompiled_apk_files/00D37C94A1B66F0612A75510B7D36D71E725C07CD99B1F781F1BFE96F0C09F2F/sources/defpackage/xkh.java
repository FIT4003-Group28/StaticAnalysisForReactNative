package defpackage;

import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xkh  reason: default package */
/* loaded from: classes4.dex */
public final class xkh implements xns {
    public String a;
    public Long b;
    private final WeakReference c;
    private final dh d;
    private final xmd e;
    private final akfg f;
    private final aafo g;

    public xkh(xki xkiVar, dh dhVar, xmd xmdVar, akfg akfgVar, aafo aafoVar) {
        this.c = new WeakReference(xkiVar);
        dhVar.getClass();
        this.d = dhVar;
        this.e = xmdVar;
        akfgVar.getClass();
        this.f = akfgVar;
        aafoVar.getClass();
        this.g = aafoVar;
    }

    @Override // defpackage.xns
    public final Long a() {
        return this.b;
    }

    @Override // defpackage.xns
    public final String b() {
        return this.a;
    }

    @Override // defpackage.xns
    public final void c(cff cffVar) {
        xki xkiVar = (xki) this.c.get();
        if (xkiVar == null) {
            return;
        }
        zag.q(xkiVar.a, R.string.error_post_failed, 1);
    }

    @Override // defpackage.xns
    public final void d(arog arogVar) {
        xmd xmdVar;
        aqav aqavVar;
        if (((xki) this.c.get()) == null) {
            return;
        }
        this.d.ku();
        arnh arnhVar = arogVar.f;
        if (arnhVar == null) {
            arnhVar = arnh.a;
        }
        if ((arnhVar.b & 4) != 0) {
            akfh l = this.f.l();
            arnh arnhVar2 = arogVar.f;
            if (arnhVar2 == null) {
                arnhVar2 = arnh.a;
            }
            arag aragVar = arnhVar2.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            l.k(ajgl.b(aragVar));
            this.f.n(l.b());
        }
        aroh arohVar = arogVar.d;
        if (arohVar == null) {
            arohVar = aroh.a;
        }
        if (arohVar.b == 62285947 && (xmdVar = this.e) != null) {
            aroh arohVar2 = arogVar.d;
            if (arohVar2 == null) {
                arohVar2 = aroh.a;
            }
            if (arohVar2.b == 62285947) {
                aqavVar = (aqav) arohVar2.c;
            } else {
                aqavVar = aqav.a;
            }
            xmdVar.e(aqavVar);
        }
        this.g.b(arogVar.e);
    }
}
