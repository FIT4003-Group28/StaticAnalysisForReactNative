package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yfn  reason: default package */
/* loaded from: classes4.dex */
public final class yfn extends ajsl {
    public avny a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final akbm e;
    private final akbm f;
    private final aafo g;
    private final Context h;

    public yfn(Context context, ViewGroup viewGroup, aafo aafoVar, akbn akbnVar) {
        this.h = context;
        this.g = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.unlimited_user_notification, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.message);
        akbm a = akbnVar.a((TextView) inflate.findViewById(R.id.dismiss_button));
        this.e = a;
        a.d = new yfl(this, 1);
        akbm a2 = akbnVar.a((TextView) inflate.findViewById(R.id.update_button));
        this.f = a2;
        a2.d = new yfl(this);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        apoj apojVar;
        apoj apojVar2;
        avny avnyVar = (avny) obj;
        this.a = avnyVar;
        int i = avnyVar.c;
        if (i == 5) {
            this.b.setBackgroundColor(Color.parseColor((String) avnyVar.d));
        } else if (i == 8) {
            View view = this.b;
            Context context = this.h;
            avgg b = avgg.b(((Integer) avnyVar.d).intValue());
            if (b == null) {
                b = avgg.THEME_ATTRIBUTE_UNKNOWN;
            }
            view.setBackgroundColor(akeq.a(context, b, 0));
        }
        TextView textView = this.c;
        if ((avnyVar.b & 1) != 0) {
            aragVar = avnyVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        zag.m(this.d, ajgl.k(System.getProperty("line.separator"), ajgl.o((arag[]) avnyVar.f.toArray(new arag[0]))));
        if ((avnyVar.b & 32) != 0) {
            Context context2 = this.h;
            avgg b2 = avgg.b(avnyVar.i);
            if (b2 == null) {
                b2 = avgg.THEME_ATTRIBUTE_UNKNOWN;
            }
            int a = akeq.a(context2, b2, 0);
            this.c.setTextColor(a);
            this.d.setTextColor(a);
        }
        if ((avnyVar.b & 1) == 0 && avnyVar.f.size() > 0) {
            zgd.t(this.d, zgd.m(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
        }
        if ((avnyVar.b & 4) != 0) {
            apok apokVar = avnyVar.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        this.e.a(apojVar, null, null);
        if ((avnyVar.b & 2) != 0) {
            apok apokVar2 = avnyVar.g;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        this.f.a(apojVar2, null, null);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avny) obj).j.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a = null;
    }

    public final void f(apoj apojVar) {
        if (apojVar != null) {
            int i = apojVar.b;
            if ((i & 16384) != 0) {
                aafo aafoVar = this.g;
                apzg apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            } else if ((i & 8192) == 0) {
            } else {
                aafo aafoVar2 = this.g;
                apzg apzgVar2 = apojVar.n;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, actk.f(this.a));
            }
        }
    }
}
