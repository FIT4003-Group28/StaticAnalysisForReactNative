package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
/* compiled from: PG */
/* renamed from: wbn  reason: default package */
/* loaded from: classes4.dex */
public final class wbn extends ajsl implements wda {
    public final Resources a;
    public final ImageView b;
    public final TextView c;
    public final wbc d;
    public int e;
    private final View f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final CheckBox k;
    private final wdc l;
    private final aafo m;
    private final Spanned n;
    private final Spanned o;

    public wbn(Context context, wdc wdcVar, aafo aafoVar, wbc wbcVar, ViewGroup viewGroup) {
        this.a = context.getResources();
        this.d = wbcVar;
        this.l = wdcVar;
        this.m = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_fingerprint_auth_layout, viewGroup, false);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.reauth_opt_out);
        this.k = checkBox;
        checkBox.setOnCheckedChangeListener(new wcs(wbcVar, 1));
        inflate.findViewById(R.id.close_button).setOnClickListener(new wbk(wbcVar, 1));
        this.h = (TextView) inflate.findViewById(R.id.description);
        this.i = (TextView) inflate.findViewById(R.id.other_methods_field);
        this.b = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.c = (TextView) inflate.findViewById(R.id.error_message_field);
        TextView textView = (TextView) inflate.findViewById(R.id.use_password_field);
        this.j = textView;
        textView.setOnClickListener(new wbk(wbcVar));
        this.n = h(R.string.other_methods_suffix);
        this.o = h(R.string.use_password_suffix);
    }

    private final Spanned h(int i) {
        String string = this.a.getString(i);
        String string2 = this.a.getString(R.string.fingerprint_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new wbm(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) obj;
        TextView textView = this.g;
        arag aragVar = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.h;
        arag aragVar2 = null;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.d.size() != 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (arag aragVar3 : fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.d) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) aafv.a(aragVar3, this.m, true));
                z = false;
            }
        } else {
            spannableStringBuilder = null;
        }
        zag.m(textView2, spannableStringBuilder);
        CheckBox checkBox = this.k;
        if ((fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.b & 32) != 0 && (aragVar2 = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.h) == null) {
            aragVar2 = arag.a;
        }
        zag.m(checkBox, aafv.a(aragVar2, this.m, false));
        this.e = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.e;
        if (fingerprintAuthRendererOuterClass$FingerprintAuthRenderer.f) {
            this.i.setText(this.n);
        } else {
            this.i.setText(this.o);
        }
        g();
        this.l.b(this);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) obj).g.I();
    }

    public final void f() {
        this.l.c();
        this.c.setText(this.a.getString(R.string.fingerprint_failed));
        zag.o(this.c, true);
        zag.o(this.j, true);
    }

    public final void g() {
        zag.o(this.c, false);
        zag.o(this.j, false);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        g();
        this.e = 0;
        this.b.setImageResource(2131232507);
        this.l.c();
    }
}
