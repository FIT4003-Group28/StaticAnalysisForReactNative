package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azcu  reason: default package */
/* loaded from: classes3.dex */
public abstract class azcu implements azbe {
    public final gga c;
    public final String d;
    public String e;

    /* JADX INFO: Access modifiers changed from: protected */
    public azcu(gga ggaVar, String str) {
        this.c = ggaVar;
        this.d = dbsj.e(str);
        this.e = dbsj.e(str);
    }

    @Override // defpackage.azbe
    public jib a() {
        jhz a = jhz.a();
        a.a = g();
        a.f(new View.OnClickListener(this) { // from class: azcr
            private final azcu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.onBackPressed();
            }
        });
        a.o = h();
        jhm a2 = jhm.a();
        a2.d(new View.OnClickListener(this) { // from class: azcs
            private final azcu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j();
            }
        });
        a2.h = 1;
        a2.a = this.c.getString(R.string.DONE);
        a2.f = i();
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.azbe
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.azbe
    public cqgl f() {
        return new cqgl(this) { // from class: azct
            private final azcu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                azcu azcuVar = this.a;
                String charSequence2 = charSequence.toString();
                if (!charSequence2.equals(azcuVar.e)) {
                    azcuVar.e = charSequence2;
                }
            }
        };
    }

    protected abstract String g();

    protected abstract cjtd h();

    protected abstract cjtd i();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void j();

    public boolean k() {
        return !this.d.equals(this.e);
    }
}
