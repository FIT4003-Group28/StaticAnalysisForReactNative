package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzu  reason: default package */
/* loaded from: classes3.dex */
public final class kzu implements ajru {
    private final Context a;
    private final ajsa b;
    private final LinearLayout c;
    private ajru d;
    private ajru e;
    private ajru f;

    public kzu(Context context, ajsa ajsaVar) {
        this.a = context;
        this.b = ajsaVar;
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.watch_card_header_hero_layout, (ViewGroup) null, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        kyy kyyVar = (kyy) obj;
        this.c.removeAllViews();
        awdj awdjVar = kyyVar.a;
        awdt awdtVar = (awdjVar == null || awdjVar.b != 117928329) ? null : (awdt) awdjVar.c;
        if (awdtVar != null) {
            ajru h = akel.h(this.b, awdtVar, null);
            this.d = h;
            if (h != null) {
                h.a().setId(R.id.card_header);
                this.c.addView(this.d.a());
                this.d.oK(ajrsVar, awdtVar);
                akel.n(this.d.a(), this.d, this.b.c(awdtVar));
            }
        }
        awdg awdgVar = kyyVar.b;
        awdk awdkVar = (awdgVar == null || awdgVar.b != 122710540) ? null : (awdk) awdgVar.c;
        auyx auyxVar = (awdgVar == null || awdgVar.b != 132989167) ? null : (auyx) awdgVar.c;
        if (awdkVar != null) {
            ajru h2 = akel.h(this.b, awdkVar, null);
            this.e = h2;
            if (h2 != null) {
                h2.a().setId(R.id.watch_card_hero);
                this.c.addView(this.e.a(), new ViewGroup.LayoutParams(-2, -1));
                this.e.oK(ajrsVar, awdkVar);
                akel.n(this.e.a(), this.e, this.b.c(awdkVar));
            }
        } else if (auyxVar != null) {
            ajru h3 = akel.h(this.b, auyxVar, null);
            this.f = h3;
            if (h3 != null) {
                h3.a().setId(R.id.watch_card_hero);
                this.c.addView(this.f.a());
                this.f.oK(ajrsVar, auyxVar);
                akel.n(this.f.a(), this.f, this.b.c(auyxVar));
            }
        }
        View findViewById = this.c.findViewById(R.id.card_header);
        View findViewById2 = this.c.findViewById(R.id.watch_card_hero);
        if (zew.y(this.a)) {
            this.c.setOrientation(0);
            float f = 0.5f;
            if (findViewById != null) {
                zgd.t(findViewById, zgd.b(zgd.s(0, -1), zgd.q(true != zew.w(this.a) ? 0.4f : 0.5f)), LinearLayout.LayoutParams.class);
            }
            if (findViewById2 == null) {
                return;
            }
            if (true != zew.w(this.a)) {
                f = 0.6f;
            }
            zgd.t(findViewById2, zgd.b(zgd.r(0), zgd.q(f)), LinearLayout.LayoutParams.class);
            return;
        }
        this.c.setOrientation(1);
        if (findViewById != null) {
            zgd.t(findViewById, zgd.b(zgd.s(-1, -2), zgd.q(0.0f)), LinearLayout.LayoutParams.class);
        }
        if (findViewById2 == null) {
            return;
        }
        zgd.t(findViewById2, zgd.b(zgd.r(-1), zgd.q(0.0f)), LinearLayout.LayoutParams.class);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.removeAllViews();
        ajru ajruVar = this.d;
        if (ajruVar != null) {
            ajruVar.qZ(ajsaVar);
            ajsaVar.b(this.d.a());
            this.d = null;
        }
        ajru ajruVar2 = this.e;
        if (ajruVar2 != null) {
            ajruVar2.qZ(ajsaVar);
            ajsaVar.b(this.e.a());
            this.e = null;
        }
        ajru ajruVar3 = this.f;
        if (ajruVar3 != null) {
            ajruVar3.qZ(ajsaVar);
            ajsaVar.b(this.f.a());
            this.f = null;
        }
    }
}
