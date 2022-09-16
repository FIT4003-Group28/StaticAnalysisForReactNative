package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fun  reason: default package */
/* loaded from: classes3.dex */
public final class fun extends ftj implements akfd {
    public akbn b;
    private final ajmy c;
    private fuu d;

    public fun(fud fudVar, Handler handler, ajmy ajmyVar) {
        super(fudVar, handler, ecp.i, fve.b);
        this.c = ajmyVar;
    }

    @Override // defpackage.ftj
    protected final /* bridge */ /* synthetic */ fuf c(BottomUiContainer bottomUiContainer) {
        if (this.d == null) {
            Context context = bottomUiContainer.getContext();
            Mealbar mealbar = bottomUiContainer.c;
            if (mealbar != null && mealbar.getContext() != context) {
                ViewParent parent = bottomUiContainer.c.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(bottomUiContainer.c);
                }
                bottomUiContainer.c = null;
            }
            if (bottomUiContainer.c == null) {
                bottomUiContainer.c = (Mealbar) bottomUiContainer.e(context, R.layout.mealbar);
            }
            this.d = new fuu(bottomUiContainer.c, this.c, this.b);
        }
        return this.d;
    }

    @Override // defpackage.ftj
    protected final /* bridge */ /* synthetic */ boolean j(akex akexVar) {
        akff akffVar = (akff) akexVar;
        if (!TextUtils.isEmpty(akffVar.c) || !TextUtils.isEmpty(akffVar.f)) {
            return !TextUtils.isEmpty(akffVar.a) || !TextUtils.isEmpty(akffVar.b);
        }
        return false;
    }

    @Override // defpackage.akfd
    public final /* bridge */ /* synthetic */ akfe l() {
        return (akfe) super.d();
    }

    @Override // defpackage.akfd
    public final /* bridge */ /* synthetic */ void m(akff akffVar) {
        super.f(akffVar);
    }

    @Override // defpackage.akfd
    public final /* bridge */ /* synthetic */ void n(akff akffVar) {
        super.i(akffVar);
    }
}
