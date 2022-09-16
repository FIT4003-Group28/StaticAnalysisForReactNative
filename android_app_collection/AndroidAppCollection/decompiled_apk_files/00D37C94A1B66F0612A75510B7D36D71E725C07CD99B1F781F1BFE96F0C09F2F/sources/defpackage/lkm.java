package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lkm  reason: default package */
/* loaded from: classes3.dex */
public final class lkm implements ajru, ljv {
    public final aafo a;
    public aurg b;
    public AlertDialog c;
    public int d;
    public final ajfm e;
    private final Context f;
    private final ajrx g;
    private final akjm h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final Switch l;

    public lkm(Context context, gem gemVar, final aafo aafoVar, final akjm akjmVar, final ajfm ajfmVar, ViewGroup viewGroup, byte[] bArr) {
        this.f = context;
        this.g = gemVar;
        this.a = aafoVar;
        this.h = akjmVar;
        this.e = ajfmVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        Switch r12 = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = r12;
        r12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(akjmVar, aafoVar, ajfmVar, null) { // from class: lkl
            public final /* synthetic */ akjm b;
            public final /* synthetic */ aafo c;
            public final /* synthetic */ ajfm d;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apzg apzgVar;
                lkm lkmVar = lkm.this;
                akjm akjmVar2 = this.b;
                aafo aafoVar2 = this.c;
                ajfm ajfmVar2 = this.d;
                aurg aurgVar = lkmVar.b;
                if (aurgVar == null || z == akjmVar2.g(aurgVar)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
                if (z) {
                    apzgVar = lkmVar.b.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = lkmVar.b.i;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                aafoVar2.c(apzgVar, hashMap);
                akjmVar2.d(lkmVar.b, z);
                for (ljv ljvVar : ajfmVar2.a) {
                    ljvVar.d(z);
                }
            }
        });
        gemVar.c(inflate);
        gemVar.d(new View.OnClickListener() { // from class: lkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lkm lkmVar = lkm.this;
                if (lkmVar.c == null && lkmVar.f(lkmVar.b) == null) {
                    return;
                }
                if (lkmVar.c == null) {
                    lkmVar.c = lkmVar.f(lkmVar.b).create();
                }
                lkmVar.c.show();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.g).b;
    }

    @Override // defpackage.ljv
    public final void d(boolean z) {
        this.l.setChecked(z);
    }

    @Override // defpackage.ljv
    public final void e(int i) {
        aurn aurnVar;
        if (this.d != i) {
            aopa mo52toBuilder = this.h.c(this.b).mo52toBuilder();
            int i2 = 0;
            while (i2 < ((aurt) mo52toBuilder.instance).f.size()) {
                aopa mo52toBuilder2 = mo52toBuilder.aM(i2).mo52toBuilder();
                aurp aM = mo52toBuilder.aM(i2);
                if (aM.b == 190692730) {
                    aurnVar = (aurn) aM.c;
                } else {
                    aurnVar = aurn.a;
                }
                aopa mo52toBuilder3 = aurnVar.mo52toBuilder();
                boolean z = i2 == i;
                mo52toBuilder3.copyOnWrite();
                aurn aurnVar2 = (aurn) mo52toBuilder3.instance;
                aurnVar2.b |= 4;
                aurnVar2.d = z;
                mo52toBuilder2.copyOnWrite();
                aurp aurpVar = (aurp) mo52toBuilder2.instance;
                aurn aurnVar3 = (aurn) mo52toBuilder3.mo39build();
                aurnVar3.getClass();
                aurpVar.c = aurnVar3;
                aurpVar.b = 190692730;
                aurp aurpVar2 = (aurp) mo52toBuilder2.mo39build();
                mo52toBuilder.copyOnWrite();
                aurt aurtVar = (aurt) mo52toBuilder.instance;
                aurpVar2.getClass();
                aurtVar.a();
                aurtVar.f.set(i2, aurpVar2);
                i2++;
            }
            akjm akjmVar = this.h;
            aurg aurgVar = this.b;
            aurt aurtVar2 = (aurt) mo52toBuilder.mo39build();
            Map map = akjmVar.a;
            aopa mo52toBuilder4 = akjmVar.a(aurgVar).mo52toBuilder();
            aunb aunbVar = akjmVar.a(aurgVar).n;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aopc aopcVar = (aopc) aunbVar.mo52toBuilder();
            aopcVar.e(SettingRenderer.settingSingleOptionMenuRenderer, aurtVar2);
            mo52toBuilder4.copyOnWrite();
            aurg aurgVar2 = (aurg) mo52toBuilder4.instance;
            aunb aunbVar2 = (aunb) aopcVar.mo39build();
            aunbVar2.getClass();
            aurgVar2.n = aunbVar2;
            aurgVar2.b |= 32768;
            map.put(aurgVar, (aurg) mo52toBuilder4.mo39build());
            this.c = f(this.b).create();
            i(this.b);
        }
    }

    public final AlertDialog.Builder f(aurg aurgVar) {
        if (!this.h.i(aurgVar)) {
            return null;
        }
        aurt c = this.h.c(aurgVar);
        final List e = llm.e(c);
        if (e.isEmpty()) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f);
        builder.setCustomTitle(llm.b(this.f, c));
        this.d = llm.a(e);
        final llf llfVar = new llf(this.f);
        llfVar.c(llm.f(this.f, e));
        llfVar.b(llm.d(this.f, e));
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: lkj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                lkm lkmVar = lkm.this;
                llf llfVar2 = llfVar;
                List list = e;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Integer.valueOf(i));
                int a = llfVar2.a();
                aafo aafoVar = lkmVar.a;
                apzg apzgVar = ((aurn) list.get(a)).e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, hashMap);
                if (lkmVar.d != a) {
                    for (ljv ljvVar : lkmVar.e.a) {
                        ljvVar.e(a);
                    }
                }
                lkmVar.h(true);
                lkmVar.d = a;
                dialogInterface.dismiss();
            }
        });
        builder.setNegativeButton(R.string.cancel, gzj.e);
        builder.setView(llfVar);
        return builder;
    }

    @Override // defpackage.ajru
    /* renamed from: g */
    public final void oK(ajrs ajrsVar, lkw lkwVar) {
        arag aragVar;
        aurg aurgVar = lkwVar.a;
        this.b = aurgVar;
        aunb aunbVar = aurgVar.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (((aurt) aunbVar.qm(SettingRenderer.settingSingleOptionMenuRenderer)).f.size() == 0) {
            return;
        }
        aurg aurgVar2 = this.b;
        int i = aurgVar2.b & 16;
        if (i != 0) {
            TextView textView = this.j;
            if (i != 0) {
                aragVar = aurgVar2.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView, ajgl.b(aragVar));
        }
        i(this.b);
        h(Boolean.valueOf(this.h.g(this.b)));
        this.e.a.add(this);
        this.g.e(ajrsVar);
    }

    public final void h(Boolean bool) {
        Switch r0 = this.l;
        if (r0 != null) {
            r0.setChecked(bool.booleanValue());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b = null;
        this.e.a.remove(this);
    }

    private final void i(aurg aurgVar) {
        CharSequence b;
        if (!aurgVar.g || (aurgVar.b & 4096) == 0) {
            if (this.h.g(aurgVar) || (aurgVar.b & 2048) == 0) {
                if (!this.h.i(aurgVar)) {
                    arag aragVar = aurgVar.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    b = ajgl.b(aragVar);
                } else {
                    List e = llm.e(this.h.c(aurgVar));
                    Context context = this.f;
                    b = context.getString(R.string.pref_notification_digest_summary, llm.d(context, e));
                }
            } else {
                arag aragVar2 = aurgVar.j;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                b = ajgl.b(aragVar2);
            }
        } else {
            arag aragVar3 = aurgVar.k;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            b = ajgl.b(aragVar3);
        }
        zag.m(this.k, b);
    }
}
