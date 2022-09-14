package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afwf  reason: default package */
/* loaded from: classes2.dex */
public abstract class afwf implements afuz {
    @dzsi
    private final cqtd a;
    private final CharSequence b;
    final /* synthetic */ afwg c;
    private final CharSequence d;
    private final cjtd e;
    @dzsi
    private final cqtd f;
    private final cjtd g;
    private final boolean h;

    public afwf(@dzsi afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar, boolean z) {
        this(afwgVar, cqtdVar, charSequence, cjtdVar, z, null, cjtd.b);
    }

    public afwf(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar, boolean z, cqtd cqtdVar2, cjtd cjtdVar2, byte[] bArr) {
        this.c = afwgVar;
        this.a = cqtdVar;
        this.b = charSequence;
        this.d = "";
        this.e = cjtdVar;
        this.f = cqtdVar2;
        this.g = cjtdVar2;
        this.h = z;
    }

    @Override // defpackage.izt
    @dzsi
    public cqtd a() {
        return (this.f == null || p().booleanValue()) ? this.f : cqrt.j(this.f, ibm.j());
    }

    @Override // defpackage.izt
    @dzsi
    public CharSequence b() {
        return null;
    }

    @Override // defpackage.izt
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        cqtd cqtdVar;
        return (p().booleanValue() || (cqtdVar = this.a) == null) ? this.a : cqrt.j(cqtdVar, ibm.j());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        afwg afwgVar = this.c;
        if (!((efh) afwgVar.b).b || !afwgVar.c.a()) {
            return cqkl.a;
        }
        if (k().booleanValue()) {
            this.c.i.a().q();
            final afwg afwgVar2 = this.c;
            final String string = afwgVar2.a.getString(R.string.USE_MORE_FEATURES_WARNING, new Object[]{afwgVar2.a.getString(R.string.WIFI_ONLY_TITLE)});
            afwgVar2.B.execute(new Runnable(afwgVar2, string) { // from class: afvd
                private final afwg a;
                private final String b;

                {
                    this.a = afwgVar2;
                    this.b = string;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afwg afwgVar3 = this.a;
                    String str = this.b;
                    cztq a = cztt.a(afwgVar3.C);
                    a.c = str;
                    a.a(R.string.SETTINGS, new afvv(afwgVar3)).c();
                }
            });
            return cqkl.a;
        }
        return n(cjqmVar);
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return this.e;
    }

    @Override // defpackage.izt
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.izt
    public cjtd j() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Boolean k() {
        boolean z = false;
        if (this.c.p() && !this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return this.d;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.b;
    }

    @Override // defpackage.afuz
    public Boolean o() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean p() {
        return Boolean.valueOf(!k().booleanValue());
    }

    @Override // defpackage.afuz
    public View.AccessibilityDelegate q() {
        return new View.AccessibilityDelegate();
    }

    @Override // defpackage.afuz
    public Boolean r() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean s() {
        return false;
    }

    @Override // defpackage.afuz
    public CompoundButton.OnCheckedChangeListener t() {
        return afwe.a;
    }

    @Override // defpackage.afuz
    public Boolean u() {
        return false;
    }

    @Override // defpackage.afuz
    public Boolean v() {
        return false;
    }

    public afwf(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar, boolean z, cqtd cqtdVar2, cjtd cjtdVar2) {
        this(afwgVar, cqtdVar, charSequence, cjtdVar, z, cqtdVar2, cjtdVar2, null);
    }
}
