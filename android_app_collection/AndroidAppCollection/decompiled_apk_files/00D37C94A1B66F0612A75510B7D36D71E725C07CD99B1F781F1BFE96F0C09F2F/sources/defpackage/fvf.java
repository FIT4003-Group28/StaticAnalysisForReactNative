package defpackage;

import android.os.Handler;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fvf  reason: default package */
/* loaded from: classes3.dex */
public final class fvf extends ftj implements akfg {
    private fvn b;

    public fvf(fud fudVar, Handler handler) {
        super(fudVar, handler, ecp.j, fve.a);
    }

    @Override // defpackage.ftj
    protected final /* bridge */ /* synthetic */ fuf c(BottomUiContainer bottomUiContainer) {
        if (this.b == null) {
            if (bottomUiContainer.b == null) {
                bottomUiContainer.b = (Snackbar) bottomUiContainer.d(R.layout.app_snackbar);
                TextView textView = (TextView) bottomUiContainer.b.findViewById(R.id.message);
                if (textView != null) {
                    textView.setMaxLines(3);
                }
            }
            this.b = new fvn(bottomUiContainer.b);
        }
        return this.b;
    }

    @Override // defpackage.ftj
    protected final /* bridge */ /* synthetic */ boolean k(akex akexVar) {
        akfi akfiVar = (akfi) akexVar;
        return true;
    }

    @Override // defpackage.akfg
    public final /* bridge */ /* synthetic */ akfh l() {
        return (akfh) super.d();
    }

    @Override // defpackage.akfg
    public final /* bridge */ /* synthetic */ void m(akfi akfiVar) {
        super.f(akfiVar);
    }

    @Override // defpackage.akfg
    public final /* bridge */ /* synthetic */ void n(akfi akfiVar) {
        super.i(akfiVar);
    }
}
