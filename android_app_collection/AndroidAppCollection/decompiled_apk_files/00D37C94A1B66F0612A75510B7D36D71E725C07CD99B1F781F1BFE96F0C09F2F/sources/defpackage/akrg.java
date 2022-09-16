package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akrg  reason: default package */
/* loaded from: classes.dex */
public class akrg implements akri {
    private final dt a;

    /* JADX INFO: Access modifiers changed from: protected */
    public akrg(dt dtVar) {
        this.a = dtVar;
    }

    private final void a() {
        View currentFocus = this.a.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // defpackage.akri
    public void b() {
        a();
        this.a.getSupportFragmentManager().L();
    }

    @Override // defpackage.akri
    public void c(augo augoVar) {
        a();
        this.a.getSupportFragmentManager().L();
    }

    @Override // defpackage.akri
    public void f(awnn awnnVar, tee teeVar) {
        araa.D(this.a.getSupportFragmentManager(), akrf.a(awnnVar, teeVar));
    }

    @Override // defpackage.akri
    public void g(awnn awnnVar, tee teeVar, augo augoVar) {
        eo supportFragmentManager = this.a.getSupportFragmentManager();
        akrf a = akrf.a(awnnVar, teeVar);
        augo augoVar2 = augo.PRESENTATION_STYLE_UNKNOWN;
        if (augoVar.ordinal() == 2) {
            ex l = supportFragmentManager.l();
            l.w(R.anim.slide_in_bottom, R.anim.elements_fade_out, R.anim.elements_fade_in, R.anim.slide_out_bottom);
            l.y(R.id.element_fragment, a);
            l.s();
            l.a();
            return;
        }
        araa.D(supportFragmentManager, a);
    }
}
