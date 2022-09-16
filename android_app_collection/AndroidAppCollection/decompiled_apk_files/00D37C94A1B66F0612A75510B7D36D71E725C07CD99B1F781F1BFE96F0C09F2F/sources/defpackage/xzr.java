package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xzr  reason: default package */
/* loaded from: classes4.dex */
public final class xzr extends ajsl {
    public final aafo a;
    public final View b;
    private final xzu c;
    private final TextView d;
    private final TextView e;
    private final yak f;
    private final yak g;
    private final xzh h;

    public xzr(Context context, aafo aafoVar, yal yalVar, xzv xzvVar, ViewGroup viewGroup, xzh xzhVar) {
        xzy xzyVar = new xzy(aafoVar, new xzx(new Runnable() { // from class: xzq
            @Override // java.lang.Runnable
            public final void run() {
                xzr.this.f();
            }
        }, 1));
        this.a = xzyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_membership_post_transaction_layout, viewGroup, false);
        this.b = inflate;
        this.c = xzvVar.a(inflate);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.okay_button);
        this.h = xzhVar;
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: xzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xzr.this.f();
            }
        });
        this.f = yalVar.a(xzyVar, inflate.findViewById(R.id.yt_perks));
        this.g = yalVar.a(xzyVar, inflate.findViewById(R.id.custom_perks));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        final apoj apojVar;
        arag aragVar2;
        atee ateeVar = (atee) obj;
        xzu xzuVar = this.c;
        avhn avhnVar = ateeVar.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        avhn avhnVar2 = ateeVar.g;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        avhn avhnVar3 = ateeVar.f;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        arhs arhsVar = ateeVar.d;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        xzuVar.a(avhnVar, avhnVar2, avhnVar3, arhsVar);
        TextView textView = this.d;
        boolean z = true;
        if ((ateeVar.b & 1) != 0) {
            aragVar = ateeVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        yak yakVar = this.f;
        aunb aunbVar = ateeVar.i;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        xzu.c(yakVar, aunbVar);
        yak yakVar2 = this.g;
        aunb aunbVar2 = ateeVar.j;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        xzu.c(yakVar2, aunbVar2);
        apok apokVar = ateeVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = ateeVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        if (apojVar != null) {
            TextView textView2 = this.e;
            if ((apojVar.b & 256) != 0) {
                aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            this.e.setOnClickListener(new View.OnClickListener() { // from class: xzp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xzr xzrVar = xzr.this;
                    apoj apojVar2 = apojVar;
                    xzrVar.f();
                    Map f = actk.f(apojVar2);
                    int i = apojVar2.b;
                    if ((i & 8192) != 0) {
                        aafo aafoVar = xzrVar.a;
                        apzg apzgVar = apojVar2.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, f);
                    } else if ((i & 16384) != 0) {
                        aafo aafoVar2 = xzrVar.a;
                        apzg apzgVar2 = apojVar2.o;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar2.c(apzgVar2, f);
                    } else if ((i & 32768) == 0) {
                    } else {
                        aafo aafoVar3 = xzrVar.a;
                        apzg apzgVar3 = apojVar2.p;
                        if (apzgVar3 == null) {
                            apzgVar3 = apzg.a;
                        }
                        aafoVar3.c(apzgVar3, f);
                    }
                }
            });
            ajrsVar.a.u(new acte(apojVar.t), null);
        }
        TextView textView3 = this.e;
        if (apojVar == null) {
            z = false;
        }
        zag.o(textView3, z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atee) obj).k.I();
    }

    public final void f() {
        ((gkc) this.h).a.dismiss();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
