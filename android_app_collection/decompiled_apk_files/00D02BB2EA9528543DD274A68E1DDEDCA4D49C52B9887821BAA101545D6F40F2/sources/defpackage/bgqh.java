package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgqh  reason: default package */
/* loaded from: classes3.dex */
public class bgqh extends appo {
    final /* synthetic */ bgqj m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgqh(bgqj bgqjVar, Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar) {
        super(activity, cqhnVar, apqeVar, cjqyVar);
        this.m = bgqjVar;
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd A() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        return this.m.q(this.m.i.ordinal() != 1 ? dtxu.aH : dtxy.jF).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd B() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        cjta q = this.m.q(this.m.i.ordinal() != 1 ? dtxu.aI : dtxy.jG);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = j().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a = 1 | deabVar.a;
        q.a = bZ.bK();
        return q.a();
    }

    @Override // defpackage.apob, defpackage.apoa
    public CharSequence g() {
        return this.m.d.getResources().getQuantityString(R.plurals.PLAY_BUTTON_FOR_POST_CONTENT_DESCRIPTION, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
    }

    @Override // defpackage.apob, defpackage.apoa
    public CharSequence h() {
        return this.m.d.getResources().getQuantityString(R.plurals.PAUSE_BUTTON_FOR_POST_CONTENT_DESCRIPTION, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
    }

    @Override // defpackage.apob, defpackage.apoa
    public CharSequence n() {
        return this.m.d.getResources().getQuantityString(R.plurals.VIDEO_FOR_POST, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
    }

    @Override // defpackage.appo, defpackage.appj
    public CharSequence v() {
        return this.m.d.getResources().getQuantityString(R.plurals.MAXIMIZE_BUTTON_FOR_POST_CONTENT_DESCRIPTION, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
    }

    @Override // defpackage.appo, defpackage.appj
    public CharSequence w() {
        if (j().booleanValue()) {
            return this.m.d.getResources().getQuantityString(R.plurals.UNMUTE_BUTTON_FOR_POST_CONTENT_DESCRIPTION, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
        }
        return this.m.d.getResources().getQuantityString(R.plurals.MUTE_BUTTON_FOR_POST_CONTENT_DESCRIPTION, this.m.a.m.size(), Integer.valueOf(this.m.l + 1), Integer.valueOf(this.m.k + 1));
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd x() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        return this.m.q(this.m.i.ordinal() != 1 ? dtxu.aK : dtxy.jI).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd y() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        return this.m.q(this.m.i.ordinal() != 1 ? dtxu.aJ : dtxy.jH).a();
    }

    @Override // defpackage.appo, defpackage.appj
    public cjtd z() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        return this.m.q(this.m.i.ordinal() != 1 ? dtxu.aL : dtxy.jJ).a();
    }
}
