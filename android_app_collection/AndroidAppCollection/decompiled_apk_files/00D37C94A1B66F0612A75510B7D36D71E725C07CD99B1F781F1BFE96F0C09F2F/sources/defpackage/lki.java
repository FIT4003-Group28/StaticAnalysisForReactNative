package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: lki  reason: default package */
/* loaded from: classes3.dex */
public final class lki implements ajru {
    public final Context a;
    public final aafo b;
    public final jxn c;
    public final Switch d;
    public aurg e;
    public acti f;
    public ajgx g;
    private final ajrx h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final CompoundButton.OnCheckedChangeListener l;
    private final ajve m;
    private ahit n;

    public lki(Context context, final aafo aafoVar, gem gemVar, jxn jxnVar, ajve ajveVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = aafoVar;
        this.h = gemVar;
        this.c = jxnVar;
        this.m = ajveVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_default_layout, viewGroup, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        this.d = (Switch) inflate.findViewById(R.id.switch_button);
        this.l = new CompoundButton.OnCheckedChangeListener() { // from class: lkf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                apzg apzgVar;
                lki lkiVar = lki.this;
                aafo aafoVar2 = aafoVar;
                if (lkiVar.e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
                    if (z) {
                        apzgVar = lkiVar.e.h;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = lkiVar.e.i;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    }
                    aafoVar2.c(apzgVar, hashMap);
                }
            }
        };
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.h).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        Spanned c;
        arag aragVar;
        lkv lkvVar = (lkv) obj;
        ajgx ajgxVar = this.g;
        if (ajgxVar != null) {
            ajgxVar.l();
        }
        this.f = ajrsVar.a;
        aurg aurgVar = lkvVar.a;
        this.e = aurgVar;
        int i = aurgVar.b & 16;
        if (i == 0) {
            this.j.setVisibility(8);
        } else {
            TextView textView = this.j;
            if (i != 0) {
                aragVar = aurgVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView, ajgl.b(aragVar));
        }
        aurg aurgVar2 = this.e;
        if (aurgVar2.g && (aurgVar2.b & 4096) != 0) {
            arag aragVar2 = aurgVar2.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            c = ajgl.c(aragVar2, this.m);
        } else if (aurgVar2.f || (aurgVar2.b & 2048) == 0) {
            arag aragVar3 = aurgVar2.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            c = ajgl.c(aragVar3, this.m);
        } else {
            arag aragVar4 = aurgVar2.j;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            c = ajgl.c(aragVar4, this.m);
        }
        zag.m(this.k, c);
        int bf = awwc.bf(this.e.c);
        if (bf == 0 || bf != 101) {
            aurg aurgVar3 = this.e;
            int i2 = aurgVar3.b;
            if ((i2 & 8192) == 0 || (i2 & 16384) == 0) {
                this.d.setChecked(aurgVar3.f);
                this.d.setOnCheckedChangeListener(this.l);
            } else {
                this.d.setChecked(aurgVar3.f);
                this.i.setOnClickListener(new lke(this));
            }
        } else {
            ahit ahitVar = new ahit() { // from class: lkg
                @Override // defpackage.ahit
                public final void r(boolean z) {
                    lki.this.d.setChecked(z);
                }
            };
            this.n = ahitVar;
            this.c.d(ahitVar);
            this.d.setChecked(this.c.g());
            this.i.setOnClickListener(new lke(this, 1));
        }
        this.h.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajgx ajgxVar = this.g;
        if (ajgxVar != null) {
            ajgxVar.l();
        }
        this.d.setOnCheckedChangeListener(null);
        ahit ahitVar = this.n;
        if (ahitVar != null) {
            this.c.f(ahitVar);
        }
        this.n = null;
        this.f = null;
        this.e = null;
    }
}
