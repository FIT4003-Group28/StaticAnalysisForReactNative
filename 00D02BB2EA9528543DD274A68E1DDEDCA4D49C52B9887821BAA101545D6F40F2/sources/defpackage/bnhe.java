package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gmm.place.updates.R;
/* compiled from: PG */
/* renamed from: bnhe  reason: default package */
/* loaded from: classes3.dex */
public class bnhe implements bnew {
    public final Activity a;
    public final bhje b;
    public final ilo c;

    public bnhe(Activity activity, bhje bhjeVar, ilo iloVar) {
        this.a = activity;
        this.b = bhjeVar;
        this.c = iloVar;
    }

    @Override // defpackage.bnew
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: bnhd
            private final bnhe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bnhe bnheVar = this.a;
                String n = bnheVar.c.n();
                bnheVar.b.c(Intent.createChooser(new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", String.format("%s %s", bnheVar.a.getString(R.string.VISITOR_SUBTAB_MERCHANT_EMPTY_STATE_SHARE_PROFILE_PROMPT, new Object[]{n}), bnheVar.c.aw())).setType("text/plain"), n));
            }
        };
    }

    @Override // defpackage.bnew
    public cjtd b() {
        return cjtd.a(dtxy.mE);
    }

    @Override // defpackage.bnew
    public cjtd c() {
        return cjtd.a(dtxy.mF);
    }
}
