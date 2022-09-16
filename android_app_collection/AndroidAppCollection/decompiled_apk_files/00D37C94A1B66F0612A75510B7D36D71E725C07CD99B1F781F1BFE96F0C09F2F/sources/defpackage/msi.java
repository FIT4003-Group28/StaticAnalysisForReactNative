package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: msi  reason: default package */
/* loaded from: classes3.dex */
public class msi {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    public final View d;
    public final msj e;
    final /* synthetic */ msk f;
    private View g;

    public msi(msk mskVar, int i) {
        this.f = mskVar;
        View inflate = View.inflate(mskVar.a, i, null);
        this.d = inflate;
        this.e = new msj(mskVar.a, mskVar.b, inflate, mskVar.c, mskVar.j, mskVar.k, mskVar.l, mskVar.f, mskVar.m);
        this.a = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.b = (TextView) inflate.findViewById(R.id.post_author);
        this.c = (TextView) inflate.findViewById(R.id.post_text);
    }

    public void a(ajrs ajrsVar) {
        c(ajrsVar);
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = this.f.o.d();
        b(this.e.y, ajrsVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(View view, ajrs ajrsVar) {
        atep atepVar;
        msk mskVar = this.f;
        ajyc ajycVar = mskVar.d;
        View view2 = this.d;
        itx itxVar = mskVar.o;
        ates atesVar = itxVar.a().u;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = itxVar.a().u;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        ajycVar.e(view2, view, atepVar, this.f.o, ajrsVar.a);
    }

    public final void c(ajrs ajrsVar) {
        apuq apuqVar;
        avhn avhnVar;
        arag aragVar;
        arag aragVar2;
        avss avssVar;
        arag aragVar3;
        Spanned b;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        arag aragVar7;
        avss avssVar2;
        apmk apmkVar;
        apmh apmhVar;
        atfh atfhVar;
        arag aragVar8;
        int i;
        final awar a = this.f.o.a();
        ajmy ajmyVar = this.f.b;
        ImageView imageView = this.a;
        if (a.c == 33) {
            apuqVar = (apuq) a.d;
        } else {
            apuqVar = apuq.a;
        }
        apur apurVar = apuqVar.c;
        if (apurVar == null) {
            apurVar = apur.a;
        }
        if ((apurVar.b & 1) != 0) {
            apur apurVar2 = apuqVar.c;
            if (apurVar2 == null) {
                apurVar2 = apur.a;
            }
            avhnVar = apurVar2.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else if (a.c == 19) {
            avhnVar = (avhn) a.d;
        } else {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: msh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                msi msiVar = msi.this;
                awar awarVar = a;
                if (msk.g(awarVar) != null) {
                    msiVar.f.c.c(msk.g(awarVar), null);
                    return;
                }
                msk mskVar = msiVar.f;
                itx itxVar = mskVar.o;
                if (itxVar == null) {
                    return;
                }
                aqya aqyaVar = itxVar.a;
                if ((aqyaVar.b & 4) == 0) {
                    return;
                }
                aafo aafoVar = mskVar.c;
                apzg apzgVar = aqyaVar.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = this.f.o.d();
        aqya aqyaVar = this.f.o.a;
        aplx aplxVar = null;
        if ((aqyaVar.b & 32) != 0) {
            aragVar = aqyaVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b2 = ajgl.b(aragVar);
        boolean z = !TextUtils.isEmpty(b2);
        zag.o(this.b, z);
        zag.o(this.c, z);
        boolean z2 = false;
        if (z) {
            TextView textView = this.b;
            aqya aqyaVar2 = this.f.o.a;
            if ((aqyaVar2.b & 8) != 0) {
                aragVar8 = aqyaVar2.f;
                if (aragVar8 == null) {
                    aragVar8 = arag.a;
                }
            } else {
                aragVar8 = null;
            }
            textView.setText(ajgl.b(aragVar8));
            msk mskVar = this.f;
            aqya aqyaVar3 = mskVar.o.a;
            if (aqyaVar3.c == 14) {
                ajxz ajxzVar = mskVar.e;
                arhr b3 = arhr.b(((arhs) aqyaVar3.d).c);
                if (b3 == null) {
                    b3 = arhr.UNKNOWN;
                }
                i = ajxzVar.a(b3);
            } else {
                i = 0;
            }
            kz.t(this.b, i, 0);
            this.c.setText(b2);
        }
        if (this.f.o.a().v) {
            if (this.g == null) {
                this.g = ((ViewStub) this.d.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.g.setVisibility(0);
        } else {
            View view = this.g;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        msj msjVar = this.e;
        if ((a.b & 8) != 0) {
            aragVar2 = a.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        msjVar.B(ajgl.b(aragVar2));
        msj msjVar2 = this.e;
        ArrayList o = amxp.o();
        Context context = msjVar2.g;
        snc sncVar = msjVar2.a;
        if ((a.b & 2097152) != 0) {
            avssVar = a.s;
            if (avssVar == null) {
                avssVar = avss.a;
            }
        } else {
            avssVar = null;
        }
        CharSequence g = lxh.g(context, sncVar, avssVar);
        if (!TextUtils.isEmpty(g)) {
            o.add(g);
        } else {
            arag aragVar9 = a.m;
            if (aragVar9 == null) {
                aragVar9 = arag.a;
            }
            if (!TextUtils.isEmpty(ajgl.b(aragVar9))) {
                arag aragVar10 = a.m;
                if (aragVar10 == null) {
                    aragVar10 = arag.a;
                }
                b = ajgl.b(aragVar10);
            } else {
                if ((a.b & 8192) != 0) {
                    aragVar3 = a.k;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                b = ajgl.b(aragVar3);
            }
            o.add(etk.j(b));
            if ((a.b & 2048) != 0) {
                aragVar4 = a.i;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            o.add(etk.j(ajgl.b(aragVar4)));
        }
        if ((a.b & 1024) != 0) {
            aragVar5 = a.h;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        CharSequence j = etk.j(ajgl.b(aragVar5));
        if (msk.f(a) != null) {
            z2 = true;
        }
        msjVar2.l(j, o, z2);
        msj msjVar3 = this.e;
        if ((a.b & 4096) != 0) {
            aragVar6 = a.j;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
        } else {
            aragVar6 = null;
        }
        Spanned b4 = ajgl.b(aragVar6);
        if ((a.b & 4096) != 0) {
            aragVar7 = a.j;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
        } else {
            aragVar7 = null;
        }
        CharSequence i2 = ajgl.i(aragVar7);
        aopu aopuVar = a.w;
        if ((a.b & 2097152) != 0) {
            avssVar2 = a.s;
            if (avssVar2 == null) {
                avssVar2 = avss.a;
            }
        } else {
            avssVar2 = null;
        }
        msjVar3.p(b4, i2, aopuVar, avssVar2);
        msj msjVar4 = this.e;
        avhn avhnVar2 = a.f;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        msjVar4.z(avhnVar2);
        this.e.t(ohn.f(a.w));
        msj msjVar5 = this.e;
        apmg apmgVar = a.q;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 1) != 0) {
            apmg apmgVar2 = a.q;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmkVar = apmgVar2.c;
            if (apmkVar == null) {
                apmkVar = apmk.a;
            }
        } else {
            apmkVar = null;
        }
        msjVar5.w(apmkVar);
        msj msjVar6 = this.e;
        apmg apmgVar3 = a.p;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        if ((apmgVar3.b & 4) != 0) {
            apmg apmgVar4 = a.p;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            apmhVar = apmgVar4.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
        } else {
            apmhVar = null;
        }
        msjVar6.u(apmhVar);
        this.e.s.a(msk.f(a));
        msj msjVar7 = this.e;
        apmg apmgVar5 = a.r;
        if (apmgVar5 == null) {
            apmgVar5 = apmg.a;
        }
        if ((apmgVar5.b & 8) != 0) {
            apmg apmgVar6 = a.r;
            if (apmgVar6 == null) {
                apmgVar6 = apmg.a;
            }
            atfhVar = apmgVar6.f;
            if (atfhVar == null) {
                atfhVar = atfh.a;
            }
        } else {
            atfhVar = null;
        }
        msjVar7.r(atfhVar);
        msk mskVar2 = this.f;
        Iterator it = a.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aplw aplwVar = (aplw) it.next();
            if ((aplwVar.b & 524288) != 0) {
                aplxVar = aplwVar.g;
                if (aplxVar == null) {
                    aplxVar = aplx.a;
                }
            }
        }
        mskVar2.n = aplxVar;
        msk mskVar3 = this.f;
        mskVar3.i.b(this.e.r, mskVar3.n);
        this.e.oK(ajrsVar2, a);
    }
}
