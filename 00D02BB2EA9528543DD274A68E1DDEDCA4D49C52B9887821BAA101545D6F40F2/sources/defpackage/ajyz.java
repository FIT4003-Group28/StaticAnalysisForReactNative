package defpackage;

import android.app.Dialog;
import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajyz  reason: default package */
/* loaded from: classes2.dex */
public class ajyz implements ajzc, ajyx {
    final /* synthetic */ ajza a;
    private boolean b = false;
    private final Dialog c;

    public ajyz(ajza ajzaVar, Dialog dialog) {
        this.a = ajzaVar;
        this.c = dialog;
    }

    @Override // defpackage.ajzc
    public ajyx a() {
        return this;
    }

    @Override // defpackage.ajyx
    public CharSequence b() {
        return this.a.b.getString(R.string.SHARE_VIA_LINK_WARNING_TITLE);
    }

    @Override // defpackage.ajyx
    public CharSequence c() {
        return Html.fromHtml(this.a.b.getString(R.string.SHARE_VIA_LINK_WARNING));
    }

    @Override // defpackage.ajyx
    public CharSequence d() {
        return this.a.b.getString(R.string.DONT_SHOW_THIS_AGAIN);
    }

    @Override // defpackage.ajyx
    public Boolean e() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.ajyx
    public cqkl f() {
        this.b = !this.b;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public cqkl g() {
        this.c.dismiss();
        if (this.b) {
            this.a.c.aS();
        } else {
            this.a.c.aR();
        }
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public cqkl h() {
        this.c.dismiss();
        this.a.c.aJ();
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public CharSequence i() {
        return this.a.b.getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.ajyx
    public CharSequence j() {
        return this.a.b.getString(R.string.CANCEL_BUTTON);
    }
}
