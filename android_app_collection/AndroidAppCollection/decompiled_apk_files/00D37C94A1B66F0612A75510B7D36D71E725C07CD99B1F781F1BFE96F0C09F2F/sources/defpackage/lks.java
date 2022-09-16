package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: lks  reason: default package */
/* loaded from: classes3.dex */
public final class lks implements ajru, ljw {
    public final Context a;
    public final aafo b;
    public final ljx c;
    public aurg d;
    public int e;
    public int f;
    private final ajrx g;
    private final akjm h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final Switch l;

    public lks(Context context, gem gemVar, final aafo aafoVar, final ljx ljxVar, final akjm akjmVar, ViewGroup viewGroup) {
        this.a = context;
        this.g = gemVar;
        this.b = aafoVar;
        this.c = ljxVar;
        this.h = akjmVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        Switch r8 = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = r8;
        r8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lkq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                boolean g;
                apzg apzgVar;
                lks lksVar = lks.this;
                akjm akjmVar2 = akjmVar;
                aafo aafoVar2 = aafoVar;
                ljx ljxVar2 = ljxVar;
                aurg aurgVar = lksVar.d;
                if (aurgVar == null || z == (g = akjmVar2.g(aurgVar))) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(g));
                if (z) {
                    apzgVar = lksVar.d.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = lksVar.d.i;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                aafoVar2.c(apzgVar, hashMap);
                akjmVar2.d(lksVar.d, z);
                for (ljw ljwVar : ljxVar2.a) {
                    ljwVar.d(z);
                }
            }
        });
        gemVar.c(inflate);
        gemVar.d(new View.OnClickListener() { // from class: lkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lks lksVar = lks.this;
                akjm akjmVar2 = akjmVar;
                aurg aurgVar = lksVar.d;
                if (aurgVar == null || !akjmVar2.j(aurgVar)) {
                    return;
                }
                aurm b = akjmVar2.b(lksVar.d);
                final llh llhVar = new llh(lksVar.a);
                final lkr lkrVar = new lkr(lksVar, b);
                AlertDialog alertDialog = null;
                View inflate2 = LayoutInflater.from(llhVar.a).inflate(R.layout.setting_boolean_time_range_dialog, (ViewGroup) null, false);
                llhVar.b = (TextView) inflate2.findViewById(R.id.dialog_title);
                llhVar.c = new TimeRangeView(llhVar.a);
                ((LinearLayout) inflate2.findViewById(R.id.time_range)).addView(llhVar.c, new LinearLayout.LayoutParams(-1, -2));
                TextView textView = llhVar.b;
                arag aragVar = b.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
                if (llhVar.c.c(b, -1)) {
                    AlertDialog.Builder view2 = new AlertDialog.Builder(llhVar.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate2);
                    view2.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: llg
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            aurn aurnVar;
                            aurn aurnVar2;
                            llh llhVar2 = llh.this;
                            lkr lkrVar2 = lkrVar;
                            int a = llhVar2.c.a();
                            int b2 = llhVar2.c.b();
                            lks lksVar2 = lkrVar2.a;
                            aurm aurmVar = lkrVar2.b;
                            if (a != lksVar2.e) {
                                aurmVar = llm.i(aurmVar, 0, a);
                                HashMap hashMap = new HashMap();
                                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(a));
                                List h = llm.h(aurmVar, 0);
                                aafo aafoVar2 = lksVar2.b;
                                aurp aurpVar = (aurp) h.get(a);
                                if (aurpVar.b == 190692730) {
                                    aurnVar2 = (aurn) aurpVar.c;
                                } else {
                                    aurnVar2 = aurn.a;
                                }
                                apzg apzgVar = aurnVar2.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                aafoVar2.c(apzgVar, hashMap);
                                for (ljw ljwVar : lksVar2.c.a) {
                                    ljwVar.f(a);
                                }
                                lksVar2.e = a;
                            }
                            if (b2 != lksVar2.f) {
                                aurm i2 = llm.i(aurmVar, 1, b2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(b2));
                                List h2 = llm.h(i2, 1);
                                aafo aafoVar3 = lksVar2.b;
                                aurp aurpVar2 = (aurp) h2.get(b2);
                                if (aurpVar2.b == 190692730) {
                                    aurnVar = (aurn) aurpVar2.c;
                                } else {
                                    aurnVar = aurn.a;
                                }
                                apzg apzgVar2 = aurnVar.e;
                                if (apzgVar2 == null) {
                                    apzgVar2 = apzg.a;
                                }
                                aafoVar3.c(apzgVar2, hashMap2);
                                for (ljw ljwVar2 : lksVar2.c.a) {
                                    ljwVar2.e(b2);
                                }
                                lksVar2.f = b2;
                            }
                            lksVar2.h(true);
                        }
                    });
                    alertDialog = view2.create();
                }
                if (alertDialog == null) {
                    return;
                }
                alertDialog.show();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.g).b;
    }

    @Override // defpackage.ljw
    public final void d(boolean z) {
        this.l.setChecked(z);
    }

    @Override // defpackage.ljw
    public final void e(int i) {
        this.h.f(this.d, llm.i(this.h.b(this.d), 1, i));
    }

    @Override // defpackage.ljw
    public final void f(int i) {
        this.h.f(this.d, llm.i(this.h.b(this.d), 0, i));
    }

    @Override // defpackage.ajru
    /* renamed from: g */
    public final void oK(ajrs ajrsVar, lkx lkxVar) {
        Spanned b;
        aurg aurgVar = lkxVar.a;
        this.d = aurgVar;
        if (this.h.j(aurgVar)) {
            TextView textView = this.j;
            arag aragVar = this.d.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
            aurg aurgVar2 = this.d;
            if (!aurgVar2.g || (aurgVar2.b & 4096) == 0) {
                if (!this.h.g(aurgVar2)) {
                    aurg aurgVar3 = this.d;
                    if ((aurgVar3.b & 2048) != 0) {
                        arag aragVar2 = aurgVar3.j;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        b = ajgl.b(aragVar2);
                    }
                }
                arag aragVar3 = this.d.e;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                b = ajgl.b(aragVar3);
            } else {
                arag aragVar4 = aurgVar2.k;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                b = ajgl.b(aragVar4);
            }
            zag.m(this.k, b);
            h(Boolean.valueOf(this.h.g(this.d)));
            this.c.a.add(this);
            this.g.e(ajrsVar);
        }
    }

    public final void h(Boolean bool) {
        Switch r0 = this.l;
        if (r0 != null) {
            r0.setChecked(bool.booleanValue());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.a.remove(this);
        this.d = null;
    }
}
