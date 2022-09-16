package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjb  reason: default package */
/* loaded from: classes3.dex */
public final class mjb implements ajru {
    msd a;
    mkg b;
    ajru c;
    private final mse d;
    private final mkh e;
    private final ViewGroup f;

    public mjb(Context context, mse mseVar, mkh mkhVar) {
        this.d = mseVar;
        this.e = mkhVar;
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_list, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aupw aupwVar = (aupw) obj;
        aupwVar.getClass();
        ajru ajruVar = this.c;
        if (ajruVar != null) {
            ajruVar.a().setVisibility(8);
        }
        if (ajrsVar.j("is_horizontal_drawer_context", false)) {
            if (this.b == null) {
                ViewGroup viewGroup = (ViewGroup) ((ViewStub) this.f.findViewById(R.id.horizontal_drawer_stub)).inflate();
                mkh mkhVar = this.e;
                ((Context) mkhVar.a.get()).getClass();
                ajyi ajyiVar = (ajyi) mkhVar.b.get();
                ajyiVar.getClass();
                aafo aafoVar = (aafo) mkhVar.c.get();
                aafoVar.getClass();
                ajsg ajsgVar = (ajsg) mkhVar.d.get();
                ajsgVar.getClass();
                viewGroup.getClass();
                this.b = new mkg(ajyiVar, aafoVar, ajsgVar, viewGroup);
            }
            this.c = this.b;
        } else {
            if (this.a == null) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewStub) this.f.findViewById(R.id.vertical_drawer_stub)).inflate();
                mse mseVar = this.d;
                Context context = (Context) ((axov) mseVar.a).a;
                context.getClass();
                ajxz ajxzVar = (ajxz) mseVar.b.get();
                ajxzVar.getClass();
                ajyi ajyiVar2 = (ajyi) mseVar.c.get();
                ajyiVar2.getClass();
                ajsg ajsgVar2 = (ajsg) mseVar.e.get();
                ajsgVar2.getClass();
                viewGroup2.getClass();
                this.a = new msd(context, ajxzVar, ajyiVar2, (fly) mseVar.d.get(), ajsgVar2, viewGroup2);
            }
            this.c = this.a;
        }
        this.c.oK(ajrsVar, aupwVar);
        this.c.a().setVisibility(0);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mkg mkgVar = this.b;
        if (mkgVar != null) {
            mkgVar.qZ(ajsaVar);
        }
        msd msdVar = this.a;
        if (msdVar != null) {
            msdVar.qZ(ajsaVar);
        }
    }
}
