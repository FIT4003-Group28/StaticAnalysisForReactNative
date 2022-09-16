package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mto  reason: default package */
/* loaded from: classes3.dex */
public final class mto implements muj {
    public final aafo a;
    public final acti b;
    public final arbc c;
    public final aram d;
    public final boolean e;
    public boolean f = false;
    private final Context g;
    private final View h;
    private final View i;
    private final YouTubeTextView j;
    private final TextView k;
    private final TextView l;
    private final CheckBox m;
    private final YouTubeTextView n;
    private final boolean o;

    public mto(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, aram aramVar, aadd aaddVar) {
        this.a = aafoVar;
        this.b = actiVar;
        this.g = context;
        this.c = arbcVar;
        this.d = aramVar;
        this.o = xrz.c(aaddVar);
        this.e = xrz.i(aaddVar);
        View inflate = LayoutInflater.from(context).inflate(true != i() ? R.layout.formfill_checkbox_input : R.layout.formfill_checkbox_input_red_error_text_below, viewGroup, false);
        this.h = inflate;
        this.i = inflate.findViewById(R.id.background);
        this.j = (YouTubeTextView) inflate.findViewById(R.id.helper_text);
        this.k = (TextView) inflate.findViewById(R.id.error_text);
        this.l = (TextView) inflate.findViewById(R.id.header);
        this.m = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.label);
    }

    @Override // defpackage.muj
    public final View a() {
        return this.h;
    }

    @Override // defpackage.muj
    public final asip b(asip asipVar) {
        return asipVar;
    }

    @Override // defpackage.muj
    public final asjg c(asjg asjgVar) {
        return asjgVar;
    }

    @Override // defpackage.muj
    public final View d() {
        if (this.l != null && i()) {
            TextView textView = this.l;
            arag aragVar = this.d.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.m(textView, ajgl.b(aragVar));
        }
        YouTubeTextView youTubeTextView = this.j;
        arag aragVar2 = this.d.f;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(youTubeTextView, aafv.a(aragVar2, this.a, false));
        YouTubeTextView youTubeTextView2 = this.n;
        arag aragVar3 = this.d.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        youTubeTextView2.setText(aafv.a(aragVar3, this.a, false));
        arag aragVar4 = this.d.e;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        aczo.d(aragVar4, this.b);
        this.m.setChecked(this.d.c);
        this.b.u(new acte(this.d.l), null);
        this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mtn
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                mto mtoVar = mto.this;
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asja.a.createBuilder();
                int i = true != z ? 3 : 2;
                createBuilder2.copyOnWrite();
                asja asjaVar = (asja) createBuilder2.instance;
                asjaVar.c = i - 1;
                asjaVar.b |= 1;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asja asjaVar2 = (asja) createBuilder2.mo39build();
                asjaVar2.getClass();
                asjjVar.m = asjaVar2;
                asjjVar.b |= 32768;
                mtoVar.b.H(3, new acte(mtoVar.d.l), (asjj) createBuilder.mo39build());
                if (!mtoVar.f) {
                    aafo aafoVar = mtoVar.a;
                    apzg apzgVar = mtoVar.c.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                    mtoVar.f = true;
                }
                if (mtoVar.i() && !mtoVar.e) {
                    mtoVar.g(false);
                }
                if (mtoVar.e) {
                    mui e = mtoVar.e(mtoVar.c.e);
                    mtoVar.g(!e.a);
                    if (e.a) {
                        return;
                    }
                    mvj.b(mtoVar.b, new acte(mtoVar.d.l), e.c);
                }
            }
        });
        return this.h;
    }

    @Override // defpackage.muj
    public final mui e(boolean z) {
        asir asirVar = null;
        if (!this.d.d || this.m.isChecked()) {
            return mui.a(true, null, null);
        }
        apzg apzgVar = this.d.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aram aramVar = this.d;
        if ((aramVar.b & 256) != 0 && (asirVar = aramVar.k) == null) {
            asirVar = asir.a;
        }
        return mui.a(false, apzgVar, asirVar);
    }

    @Override // defpackage.muj
    public final String f() {
        return true != this.m.isChecked() ? "" : "checked";
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        if (i()) {
            if (z) {
                aram aramVar = this.d;
                if ((aramVar.b & 16) != 0) {
                    TextView textView = this.k;
                    arag aragVar = aramVar.g;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    zag.m(textView, ajgl.b(aragVar));
                }
                zdg.c(this.g, this.h, this.k.getText());
                this.m.setButtonTintList(zhn.f(this.g, R.attr.adsCheckboxError));
                return;
            }
            this.k.setVisibility(4);
            this.m.setButtonTintList(this.o ? zhn.f(this.g, R.attr.ytTextPrimary) : null);
        } else if (z) {
            aram aramVar2 = this.d;
            if ((aramVar2.b & 16) != 0) {
                YouTubeTextView youTubeTextView = this.j;
                arag aragVar2 = aramVar2.g;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                zag.m(youTubeTextView, ajgl.b(aragVar2));
            }
            zdg.c(this.g, this.h, this.j.getText());
            View view = this.i;
            if (view == null) {
                return;
            }
            view.setBackgroundColor(zhn.d(this.g, true != this.o ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
        } else {
            YouTubeTextView youTubeTextView2 = this.j;
            arag aragVar3 = this.d.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            zag.m(youTubeTextView2, ajgl.b(aragVar3));
            View view2 = this.i;
            if (view2 == null) {
                return;
            }
            view2.setBackgroundColor(0);
        }
    }

    @Override // defpackage.muj
    public final boolean h() {
        aram aramVar = this.d;
        return this.m.isChecked() != ((aramVar.b & 1) != 0 && aramVar.c);
    }

    public final boolean i() {
        int g = arey.g(this.d.i);
        return g != 0 && g == 2;
    }
}
