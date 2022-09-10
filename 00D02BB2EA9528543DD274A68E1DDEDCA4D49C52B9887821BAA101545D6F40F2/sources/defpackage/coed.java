package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coed  reason: default package */
/* loaded from: classes5.dex */
public final class coed extends coeq {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ coeh c;
    final /* synthetic */ codq d;

    public coed(Intent intent, WeakReference weakReference, coeh coehVar, codq codqVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = coehVar;
        this.d = codqVar;
    }

    @Override // defpackage.coeq, defpackage.coem
    public final void b(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.q(coei.a);
            return;
        }
        if (this.d != null) {
            Context applicationContext = activity.getApplicationContext();
            codq codqVar = this.d;
            if (codqVar != null) {
                googleHelp.A = true;
                coep.a(new cody(applicationContext, googleHelp, codqVar, nanoTime), 4);
            }
        }
        googleHelp.z = cnmq.b;
        if (codr.a(googleHelp) != null) {
            TogglingData a = codr.a(googleHelp);
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            a.c = charSequence;
        }
        coeh coehVar = this.c;
        Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) cnwo.c(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            inProductHelp.a = googleHelp;
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", cnwo.a(inProductHelp));
        }
        activity.startActivityForResult(intent, R.styleable.AppCompatTheme_windowFixedWidthMinor);
        coehVar.p(Status.a);
    }
}
