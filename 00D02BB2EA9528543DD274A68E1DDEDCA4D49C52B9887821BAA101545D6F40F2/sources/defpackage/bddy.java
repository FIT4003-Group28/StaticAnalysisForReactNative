package defpackage;

import android.app.Application;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bddy  reason: default package */
/* loaded from: classes3.dex */
public class bddy extends bdbe implements bdas {
    private final bdby j;

    public bddy(ckcw ckcwVar, cjqq cjqqVar, ckmm ckmmVar, Application application, bwsh bwshVar, dwfl dwflVar, int i, Toast toast, @dzsi cqtd cqtdVar) {
        super(dwflVar, ckqc.FULLY_QUALIFIED, i, toast, null, ckcwVar, cjqqVar, ckmmVar);
        cjta b = cjtd.b();
        b.d = dtye.y;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        this.j = new bdby(application, dwflVar, null, bwshVar, b.a(), true, R.id.photo_lightbox_expand360_button);
    }

    @Override // defpackage.bdas
    public jar a() {
        return this.j;
    }

    @Override // defpackage.bdav
    public View.OnAttachStateChangeListener d() {
        return a;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcxy(), this);
    }
}
