package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjl  reason: default package */
/* loaded from: classes3.dex */
public final class mjl extends kqs {
    private final ajrx o;
    private final ajrp p;
    private final TextView q;

    public mjl(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, R.layout.grid_narrow_playlist_item, ajxzVar);
        this.o = gemVar;
        gemVar.c(this.d);
        this.p = new ajrp(aafoVar, gemVar);
        this.q = (TextView) this.d.findViewById(R.id.title);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.o).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        aren arenVar = (aren) obj;
        arenVar.getClass();
        ajrp ajrpVar = this.p;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = arenVar.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ates atesVar = null;
        ajrsVar.a.u(new acte(arenVar.l), null);
        if ((arenVar.b & 4) != 0) {
            aragVar = arenVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        k(ajgl.b(aragVar));
        if ((arenVar.b & 16) != 0) {
            aragVar2 = arenVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        d(ajgl.b(aragVar2));
        if (m(arenVar.d)) {
            i(arenVar.d);
        } else {
            if ((arenVar.b & 64) != 0) {
                aragVar3 = arenVar.i;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            CharSequence b = ajgl.b(aragVar3);
            if ((arenVar.b & 32) != 0) {
                aragVar4 = arenVar.h;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            j(b, ajgl.b(aragVar4));
        }
        int i = 1;
        if ((arenVar.b & 2) != 0) {
            aueo aueoVar = arenVar.c;
            if (aueoVar == null) {
                aueoVar = aueo.a;
            }
            if ((aueoVar.b & 2) != 0) {
                aueo aueoVar2 = arenVar.c;
                if (aueoVar2 == null) {
                    aueoVar2 = aueo.a;
                }
                auen auenVar = aueoVar2.d;
                if (auenVar == null) {
                    auenVar = auen.a;
                }
                avhn avhnVar = auenVar.b;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                g(avhnVar);
            } else {
                aueo aueoVar3 = arenVar.c;
                if (aueoVar3 == null) {
                    aueoVar3 = aueo.a;
                }
                if ((aueoVar3.b & 1) != 0) {
                    aueo aueoVar4 = arenVar.c;
                    if (aueoVar4 == null) {
                        aueoVar4 = aueo.a;
                    }
                    auep auepVar = aueoVar4.c;
                    if (auepVar == null) {
                        auepVar = auep.a;
                    }
                    avhn avhnVar2 = auepVar.c;
                    if (avhnVar2 == null) {
                        avhnVar2 = avhn.a;
                    }
                    g(avhnVar2);
                }
            }
        }
        View view = ((gem) this.o).b;
        if ((arenVar.b & 256) != 0 && (atesVar = arenVar.k) == null) {
            atesVar = ates.a;
        }
        f(view, atesVar, arenVar, ajrsVar.a);
        this.o.e(ajrsVar);
        TextView textView = this.q;
        int i2 = arenVar.f;
        if (i2 != 0) {
            i = i2;
        }
        textView.setMaxLines(i);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.p.c();
    }
}
