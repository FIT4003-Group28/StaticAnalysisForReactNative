package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ajut  reason: default package */
/* loaded from: classes.dex */
public final class ajut {
    public final aafo a;
    public final ajuy b;
    public final ajux c;
    public final nx d;
    public final ajvd e;
    public final ajuu f;

    public ajut(final Context context, aafo aafoVar, ajuy ajuyVar, ajuu ajuuVar, aken akenVar) {
        this.a = aafoVar;
        this.b = ajuyVar;
        this.f = ajuuVar;
        ajux ajuxVar = new ajux(context);
        this.c = ajuxVar;
        ajuxVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ajur
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apzg apzgVar;
                ajut ajutVar = ajut.this;
                apnn a = ajutVar.b.a();
                if (z) {
                    apzgVar = a.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = a.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                ajuw.a(apzgVar, ajutVar);
            }
        });
        nw nwVar = new nw(context);
        nwVar.c(true);
        nwVar.p(ajuxVar);
        nwVar.h(R.string.cancel, gzj.l);
        nwVar.k(R.string.ok, new DialogInterface.OnClickListener() { // from class: ajup
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ajut ajutVar = ajut.this;
                ajuu ajuuVar2 = ajutVar.f;
                atui a = ajutVar.e.a();
                boolean isChecked = ajutVar.c.e.isChecked();
                ajuw ajuwVar = ajuuVar2.b;
                Object obj = ajuuVar2.a;
                if (a == null) {
                    return;
                }
                ajutVar.d(false);
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", Boolean.valueOf(isChecked));
                if (obj != null) {
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
                }
                atuk atukVar = a.e;
                if (atukVar == null) {
                    atukVar = atuk.a;
                }
                if ((atukVar.b & 1) == 0 || isChecked) {
                    ajuwVar.b(a, hashMap);
                    return;
                }
                atuk atukVar2 = a.e;
                if (atukVar2 == null) {
                    atukVar2 = atuk.a;
                }
                aqft aqftVar = atukVar2.c;
                if (aqftVar == null) {
                    aqftVar = aqft.a;
                }
                aqft aqftVar2 = aqftVar;
                ajgx.p(ajuwVar.a, aqftVar2, ajuwVar.b, ajuwVar.c, null, new ajuv(ajuwVar, aqftVar2, a, hashMap), obj);
            }
        });
        nx b = nwVar.b();
        this.d = b;
        b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ajuq
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ajut ajutVar = ajut.this;
                Context context2 = context;
                ajutVar.d.b(-2).setTextColor(zhn.d(context2, R.attr.ytCallToAction));
                ajutVar.d.b(-1).setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{zhn.d(context2, R.attr.ytTextDisabled), zhn.d(context2, R.attr.ytCallToAction)}));
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(zhn.d(context, R.attr.ytBrandBackgroundSolid));
        gradientDrawable.setStroke(1, zhn.d(context, R.attr.ytVerifiedBadgeBackground));
        b.getWindow().setBackgroundDrawable(gradientDrawable);
        b.getWindow().getDecorView().setPadding(1, 1, 1, 1);
        ajvd ajvdVar = new ajvd(context, akenVar);
        this.e = ajvdVar;
        ajvdVar.registerDataSetObserver(new ajus(this));
    }

    public final void a() {
        ajux ajuxVar = this.c;
        ajuxVar.d.setVisibility(8);
        ajuxVar.e.setChecked(false);
        ajuxVar.e.setVisibility(8);
        ajuxVar.f.setVisibility(8);
    }

    public final void b() {
        e();
        d(false);
        a();
    }

    public final void c(apoj apojVar) {
        arag aragVar;
        if (apojVar != null) {
            Button b = this.d.b(-1);
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            b.setText(ajgl.b(aragVar));
        }
    }

    public final void d(boolean z) {
        this.d.b(-1).setEnabled(z);
    }

    public final void e() {
        apoj apojVar;
        ajuy ajuyVar = this.b;
        apok apokVar = ajuyVar.a.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar2 = null;
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = ajuyVar.a.f;
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
        apok apokVar3 = ajuyVar.b.e;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        if ((apokVar3.b & 1) != 0) {
            apok apokVar4 = ajuyVar.b.e;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apojVar2 = apokVar4.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        }
        c((apoj) akzj.d(apojVar, apojVar2));
    }
}
