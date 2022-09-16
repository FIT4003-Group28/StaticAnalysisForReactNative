package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
/* compiled from: PG */
/* renamed from: akbf  reason: default package */
/* loaded from: classes.dex */
public class akbf extends akas implements AdapterView.OnItemClickListener {
    private atep ae;
    public akbe af;
    private ajsm ag;
    private ajxz ah;
    private acti ai;
    private Integer aj;

    private final void aE(arhs arhsVar, zdt zdtVar) {
        ajxz ajxzVar;
        if (arhsVar != null && (arhsVar.b & 1) != 0 && (ajxzVar = this.ah) != null) {
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b);
            if (a != 0) {
                if (this.aj != null) {
                    zdtVar.a(zag.f(rb(), a, this.aj.intValue()));
                    return;
                } else {
                    zdtVar.a(akf.a(rb(), a));
                    return;
                }
            }
        }
        zdtVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void aL(akbf akbfVar, atep atepVar, ajxz ajxzVar, acth acthVar, Integer num) {
        if (atepVar != null) {
            Bundle bundle = new Bundle();
            aphq.m(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atepVar);
            akbfVar.ae(bundle);
        }
        ajxzVar.getClass();
        akbfVar.ah = ajxzVar;
        akbfVar.aj = num;
        akbfVar.aC();
        if (acthVar != null) {
            akbfVar.ai = acthVar.oi();
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        if (Build.VERSION.SDK_INT <= 23 || !mJ().isInPictureInPictureMode()) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ampq aK(aten atenVar) {
        arhs f = abgc.f(atenVar);
        CharSequence h = abgc.h(atenVar);
        if (h == null) {
            if (f == null || (f.b & 1) == 0) {
                afus.b(2, 25, "Text missing for BottomSheetMenuItem.");
            } else {
                arhr b = arhr.b(f.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                int i = b.pS;
                StringBuilder sb = new StringBuilder(63);
                sb.append("Text missing for BottomSheetMenuItem with iconType: ");
                sb.append(i);
                afus.b(2, 25, sb.toString());
            }
            return amon.a;
        }
        aoob c = abgc.c(atenVar);
        if (this.ai != null && !c.H()) {
            this.ai.u(new acte(c), null);
        }
        akbb akbbVar = new akbb(h.toString(), atenVar);
        boolean z = abgc.i(atenVar) != 2;
        if (akbbVar.b != z) {
            akbbVar.b = z;
            akbbVar.c();
        }
        aE(f, new akbd(akbbVar, 1));
        aE(abgc.g(atenVar), new akbd(akbbVar));
        return ampq.j(akbbVar);
    }

    @Override // defpackage.vew, defpackage.dh, defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            return;
        }
        try {
            this.ae = (atep) aphq.i(bundle2, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atep.a, aoos.b());
        } catch (aopx e) {
            zep.d("Error decoding menu", e);
            this.ae = atep.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vew
    /* renamed from: mu */
    public akaz aG() {
        this.ag = new ajsm();
        atep atepVar = this.ae;
        if (atepVar != null) {
            for (aten atenVar : atepVar.c) {
                ampq aK = aK(atenVar);
                if (aK.h()) {
                    this.ag.add(aK.c());
                }
            }
        }
        if (this.ag.isEmpty()) {
            afus.b(2, 25, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new akaz(mJ(), this.ag);
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        vez vezVar = (vez) ((akaz) this.aC).getItem(i);
        if (vezVar instanceof akbb) {
            aten atenVar = ((akbb) vezVar).j;
            akbe akbeVar = this.af;
            if (akbeVar != null) {
                akbeVar.a(atenVar);
            }
        }
        dismiss();
    }
}
