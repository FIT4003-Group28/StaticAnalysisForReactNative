package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lvw  reason: default package */
/* loaded from: classes3.dex */
public final class lvw extends lud {
    boolean c;
    private final axnm d;
    private final ajhl e;
    private final FrameLayout f;

    public lvw(Activity activity, axnm axnmVar, axnm axnmVar2, ajhl ajhlVar) {
        super(activity, axnmVar);
        this.d = axnmVar2;
        this.e = ajhlVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f = frameLayout;
        frameLayout.setBackground(new frf(zhn.j(activity, R.attr.ytSeparator).orElse(0), activity.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    @Override // defpackage.lud
    protected final ViewGroup c() {
        return this.f;
    }

    @Override // defpackage.lud
    public final void h(fsx fsxVar) {
        fsr fsrVar = fsxVar.e;
        this.c = false;
        if (fsrVar != null) {
            this.f.removeAllViews();
            ajin ajinVar = (ajin) this.d.get();
            this.e.oK(new ajrs(), ajhh.a(fsrVar.a));
            this.f.addView(this.e.a());
            this.c = true;
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final boolean j() {
        return this.c;
    }
}
