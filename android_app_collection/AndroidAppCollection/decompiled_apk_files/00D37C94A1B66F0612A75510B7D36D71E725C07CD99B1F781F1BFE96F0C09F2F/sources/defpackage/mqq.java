package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mqq  reason: default package */
/* loaded from: classes3.dex */
public class mqq extends mfg {
    public mqq(aafo aafoVar, ajxz ajxzVar, Context context, ViewGroup viewGroup) {
        super(aafoVar, ajxzVar, context, viewGroup, R.layout.slim_metadata_button, null);
    }

    @Override // defpackage.mfg
    protected final /* bridge */ /* synthetic */ apos e(Object obj) {
        apok apokVar = ((auxb) obj).g;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apos aposVar = apokVar.d;
        return aposVar == null ? apos.a : aposVar;
    }

    @Override // defpackage.mfg
    public final boolean i() {
        if (!((auxb) this.g).qn(auwt.b) || !((Boolean) ((auxb) this.g).qm(auwt.b)).booleanValue()) {
            m(this.f.e);
        }
        return ((Boolean) ((auxb) this.g).qm(auwt.c)).booleanValue();
    }

    public void k(auxb auxbVar) {
        super.h(auxbVar);
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        aopc aopcVar = (aopc) ((auxb) this.g).mo52toBuilder();
        aopcVar.e(auwt.b, true);
        aopcVar.e(auwt.c, Boolean.valueOf(z));
        this.g = aopcVar.mo39build();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        apzg apzgVar;
        if (i()) {
            apos aposVar = this.f;
            if ((aposVar.b & 16384) != 0) {
                apzgVar = aposVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apzgVar, hashMap);
            }
        } else {
            apos aposVar2 = this.f;
            if ((aposVar2.b & 512) != 0) {
                apzgVar = aposVar2.k;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apzgVar, hashMap2);
            }
        }
        apos aposVar3 = this.f;
        if ((aposVar3.b & 1024) != 0) {
            apzg apzgVar2 = aposVar3.l;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            this.a.c(apzgVar2, hashMap3);
        }
        if (!this.f.u) {
            m(!i());
            g();
        }
    }

    public mqq(aafo aafoVar, ajxz ajxzVar, Context context, ViewGroup viewGroup, int i, mqp mqpVar) {
        super(aafoVar, ajxzVar, context, viewGroup, i, mqpVar);
    }
}
