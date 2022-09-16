package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ygp  reason: default package */
/* loaded from: classes4.dex */
public final class ygp extends ygk {
    public ygt ae;
    public acth af;
    public aaqp ag;
    private Context ah;
    private ashn ai;

    @Override // defpackage.ygk, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.ah = context;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (this.m.containsKey("transaction_response")) {
            this.ai = (ashn) this.ag.a(this.m.getByteArray("transaction_response"), ashn.a);
        }
        mN(0, 2132083459);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sponsorships_celebration_dialog_layout, viewGroup, false);
        if (inflate.getLayoutParams() == null) {
            inflate.setLayoutParams(new xx(-1, -1));
        }
        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new View.OnClickListener() { // from class: ygn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ygp.this.dismiss();
            }
        });
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.celebration_view);
        auye a = yce.a(this.ai);
        if (a != null) {
            ygt ygtVar = this.ae;
            Context context = this.ah;
            ygo ygoVar = new ygo(this);
            akbn akbnVar = (akbn) ygtVar.a.get();
            akbnVar.getClass();
            aafo aafoVar = (aafo) ygtVar.b.get();
            aafoVar.getClass();
            ajmy ajmyVar = (ajmy) ygtVar.c.get();
            ajmyVar.getClass();
            context.getClass();
            frameLayout.getClass();
            ygs ygsVar = new ygs(akbnVar, aafoVar, ajmyVar, context, ygoVar, frameLayout);
            frameLayout.addView(ygsVar.a);
            ajrs ajrsVar = new ajrs();
            ajrsVar.a(this.af.oi());
            ygsVar.oK(ajrsVar, a);
        }
        return inflate;
    }
}
