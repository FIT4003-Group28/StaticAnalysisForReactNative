package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aywq  reason: default package */
/* loaded from: classes3.dex */
public class aywq extends cqqw implements ayvg {
    protected boolean a = false;
    protected final baad b;
    private final cklf c;
    private final Activity d;

    public aywq(Activity activity, cklf cklfVar, baad baadVar) {
        this.d = activity;
        this.b = baadVar;
        this.c = cklfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Boolean n(@dzsi String str) {
        return Boolean.valueOf(!dbra.b.s(dbsj.e(str)).isEmpty());
    }

    @Override // defpackage.ayvg
    public Boolean b() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.ayvg
    public cqkl c() {
        this.a = !this.a;
        cqkx.p(this);
        return cqkl.a;
    }

    public Boolean d() {
        return Boolean.valueOf(!dbsj.d(this.b.E(this.d.getApplicationContext())));
    }

    public Boolean e() {
        return Boolean.valueOf(!dbsj.d(this.b.G()));
    }

    @Override // defpackage.ayvg
    public Boolean f() {
        return Boolean.valueOf(this.b.k() >= 4);
    }

    @Override // defpackage.ayvg
    public Boolean g() {
        boolean z = false;
        if (this.b.k() > 0 && !dcft.m(this.b.i(), aywm.a).a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvg
    public Boolean h() {
        boolean z = false;
        if (this.b.k() > 0 && !dcft.m(this.b.i(), aywn.a).a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayvg
    public Float i() {
        float f = true != d().booleanValue() ? 0.0f : 0.2f;
        if (e().booleanValue()) {
            f += 0.2f;
        }
        int k = this.b.k();
        if (k > 0) {
            float f2 = f().booleanValue() ? 0.2f : k * 0.05f;
            float f3 = k;
            f = f + f2 + ((dcbg.b(this.b.i()).o(aywo.a).k() * 0.2f) / f3) + ((dcbg.b(this.b.i()).o(aywp.a).k() * 0.2f) / f3);
        }
        return Float.valueOf(Math.round(f * 100.0f) / 100.0f);
    }

    @Override // defpackage.ayvg
    public CharSequence j() {
        SpannableStringBuilder append = new SpannableStringBuilder(this.d.getResources().getText(R.string.LIST_PROGRESS_BAR_EDUCATION_TEXT)).append((CharSequence) " ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.d.getResources().getText(R.string.LIST_PROGRESS_BAR_LEARN_MORE));
        spannableStringBuilder.setSpan(this.c.h("save_places_to_lists_android", ibm.x().b(this.d), cjtd.a(dtxo.J)), 0, spannableStringBuilder.length(), 17);
        return append.append((CharSequence) spannableStringBuilder);
    }

    @Override // defpackage.ayvg
    public CharSequence k() {
        return this.d.getString(R.string.ACCESSIBILITY_LIST_PROGRESS_BAR_PERCENTAGE, new Object[]{Integer.valueOf((int) (i().floatValue() * 100.0f))});
    }
}
