package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.presenter.DismissalFollowUpDialogFragmentController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mmi  reason: default package */
/* loaded from: classes3.dex */
public final class mmi extends ajsl {
    mmh a;
    private final Context b;
    private final aafo c;
    private final gem d;
    private final DismissalFollowUpDialogFragmentController e;
    private final FrameLayout f;
    private mmh g;
    private mmh h;
    private final aacz i;

    public mmi(Context context, aafo aafoVar, gem gemVar, DismissalFollowUpDialogFragmentController dismissalFollowUpDialogFragmentController, aacz aaczVar) {
        context.getClass();
        this.b = context;
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = gemVar;
        dismissalFollowUpDialogFragmentController.getClass();
        this.e = dismissalFollowUpDialogFragmentController;
        this.i = aaczVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        gemVar.c(frameLayout);
        frameLayout.setBackground(new frf(zhn.d(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static String f(arag aragVar) {
        if (aragVar != null) {
            arah arahVar = aragVar.f;
            if (arahVar == null) {
                arahVar = arah.a;
            }
            if ((arahVar.b & 1) == 0) {
                return null;
            }
            arah arahVar2 = aragVar.f;
            if (arahVar2 == null) {
                arahVar2 = arah.a;
            }
            aovr aovrVar = arahVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }

    protected static final byte[] g(atpl atplVar) {
        return (byte[]) atplVar.f.I().clone();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        atpl atplVar = (atpl) obj;
        this.f.removeAllViews();
        if (hqs.q(ajrsVar)) {
            if (this.g == null) {
                this.g = new mmh(LayoutInflater.from(this.b).inflate(true != eog.ar(this.i) ? R.layout.video_dismissed_entry_tablet : R.layout.video_dismissed_entry_tablet_v2, (ViewGroup) null), this.c, ajrsVar.a, this.e);
            }
            this.a = this.g;
        } else {
            if (this.h == null) {
                this.h = new mmh(LayoutInflater.from(this.b).inflate(R.layout.video_dismissed_entry, (ViewGroup) null), this.c, ajrsVar.a, this.e);
            }
            mmh mmhVar = this.h;
            this.a = mmhVar;
            mmhVar.a.setBackgroundColor(zhn.d(this.b, R.attr.ytGeneralBackgroundA));
            int a = aqmv.a(atplVar.g);
            if (a != 0 && a == 2) {
                this.a.a.setBackgroundColor(zhn.d(this.b, R.attr.ytBorderedButtonChipBackground));
                ((TextView) this.a.a.findViewById(R.id.undo_text)).setTextColor(zhn.d(this.b, R.attr.ytCallToAction));
                ((TextView) this.a.a.findViewById(R.id.dismissal_reasons_text)).setTextColor(zhn.d(this.b, R.attr.ytCallToAction));
            }
        }
        this.a.oK(ajrsVar, atplVar);
        this.f.addView(this.a.a);
        FrameLayout frameLayout = this.f;
        frameLayout.post(new mmd(frameLayout));
        this.d.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return g((atpl) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.a != null) {
            this.a = null;
        }
        this.f.removeAllViews();
    }
}
