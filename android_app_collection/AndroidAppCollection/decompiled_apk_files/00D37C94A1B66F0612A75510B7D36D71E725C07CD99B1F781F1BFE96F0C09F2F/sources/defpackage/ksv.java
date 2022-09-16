package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
/* compiled from: PG */
/* renamed from: ksv  reason: default package */
/* loaded from: classes3.dex */
public final class ksv extends kss implements ynl {
    public String b;
    public Boolean c;
    public jli d;
    private final Activity e;
    private final jol f;
    private final yni g;
    private final fcl h;
    private final jlj i;
    private final fcg j;
    private final OfflineArrowView k;
    private final azqb l;
    private final azqb m;

    public ksv(Activity activity, Context context, aafo aafoVar, jol jolVar, yni yniVar, fcl fclVar, gem gemVar, ktc ktcVar, jlj jljVar, fcg fcgVar) {
        super(context, aafoVar, gemVar, ktcVar, R.layout.bundle_item_layout, new xx(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_height)), new xx(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height));
        this.e = activity;
        this.g = yniVar;
        this.h = fclVar;
        this.f = jolVar;
        this.i = jljVar;
        this.j = fcgVar;
        this.k = (OfflineArrowView) a().findViewById(R.id.offline_button);
        this.l = new azqb() { // from class: kst
            @Override // defpackage.azqb
            public final Object get() {
                Boolean bool = ksv.this.c;
                boolean z = false;
                if (bool != null && !bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        this.m = ecp.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kss, defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apof apofVar = (apof) obj;
        super.d(ajrsVar, apofVar);
        this.g.g(this);
        attp attpVar = null;
        this.b = (apofVar.b & 16) != 0 ? apofVar.i : null;
        aunb aunbVar = apofVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(OfflineabilityRendererOuterClass.offlineabilityRenderer)) {
            aunb aunbVar2 = apofVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            attpVar = (attp) aunbVar2.qm(OfflineabilityRendererOuterClass.offlineabilityRenderer);
        }
        attp attpVar2 = attpVar;
        jlj jljVar = this.i;
        String str = this.b;
        jli a = jljVar.a(str, this.k, (attpVar2 == null || !attpVar2.c) ? 3 : 1, this.j.a(str, attpVar2, null, this.l, this.m, ajrsVar.a));
        this.d = a;
        a.a();
        if (this.h.i(this.b)) {
            jol jolVar = this.f;
            String str2 = this.b;
            jolVar.c(str2, yit.c(this.e, new ksu(this, str2)));
        }
    }

    @Override // defpackage.kss, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.m(this);
        this.d = null;
        this.b = null;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{agnl.class, agnm.class, agnn.class, agnp.class, agnr.class, agns.class};
            case 0:
                if (!((agnl) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 1:
                if (!((agnm) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 2:
                if (!((agnn) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 3:
                agnp agnpVar = (agnp) obj;
                if (!agnpVar.a.d().equals(this.b)) {
                    return null;
                }
                this.d.b(jjk.a(agnpVar.a));
                return null;
            case 4:
                agnr agnrVar = (agnr) obj;
                if (!agnrVar.a.d().equals(this.b)) {
                    return null;
                }
                this.d.b(jjk.a(agnrVar.a));
                return null;
            case 5:
                if (!((agns) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
