package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aywu  reason: default package */
/* loaded from: classes3.dex */
public class aywu implements ayvh {
    public final gga a;
    public final cjqy b;
    public final aywb c;
    public final baal d;
    public String e;

    public aywu(gga ggaVar, cjqy cjqyVar, jmx jmxVar, aywb aywbVar, baal baalVar) {
        this.a = ggaVar;
        this.b = cjqyVar;
        this.c = aywbVar;
        this.d = baalVar;
        this.e = baalVar.c();
    }

    @Override // defpackage.ayvh
    public String a() {
        return this.e;
    }

    @Override // defpackage.ayvh
    public cqgl b() {
        return new cqgl(this) { // from class: ayws
            private final aywu a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                aywu aywuVar = this.a;
                String charSequence2 = charSequence.toString();
                if (!charSequence2.equals(aywuVar.e)) {
                    aywuVar.e = charSequence2;
                    aywuVar.d.d(aywuVar.e);
                    aywb aywbVar = aywuVar.c;
                    baal baalVar = aywuVar.d;
                    aywbVar.p = baalVar.k() | aywbVar.p;
                    cqkx.p(aywbVar);
                    aywuVar.b.m(new cjte(deaf.INPUT_TEXT), aywuVar.e());
                }
            }
        };
    }

    @Override // defpackage.ayvh
    public View.OnFocusChangeListener c() {
        return new View.OnFocusChangeListener(this) { // from class: aywt
            private final aywu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                gga ggaVar = this.a.a;
                if (!ggaVar.aZ) {
                    return;
                }
                if (z) {
                    ((InputMethodManager) ggaVar.getSystemService("input_method")).showSoftInput(view, 1);
                } else {
                    jmw.d(ggaVar, null);
                }
            }
        };
    }

    @Override // defpackage.ayvh
    public Integer d() {
        return 4000;
    }

    @Override // defpackage.ayvh
    public cjtd e() {
        return cjtd.a(axzh.a(this.d) ? dtxo.U : dtxo.Q);
    }

    @Override // defpackage.ayvh
    public String f() {
        if (this.d.x() == baaj.PLACE) {
            gga ggaVar = this.a;
            return ggaVar.getString(R.string.ADD_NOTE_ABOUT_PLACE, new Object[]{this.d.y(ggaVar)});
        } else if (this.d.x() != baaj.EXPERIENCE) {
            return "";
        } else {
            baai A = this.d.A();
            dbsk.s(A);
            return A.b() == dpuk.MAJOR_EVENT ? this.a.getString(R.string.EDIT_NOTE_HINT_TEXT_EVENT) : "";
        }
    }
}
