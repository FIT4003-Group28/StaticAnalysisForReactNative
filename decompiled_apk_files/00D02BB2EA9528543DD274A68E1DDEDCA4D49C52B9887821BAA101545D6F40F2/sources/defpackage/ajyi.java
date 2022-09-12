package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajyi  reason: default package */
/* loaded from: classes2.dex */
public class ajyi implements ajyg, ajyx {
    private final Resources a;
    private final ajyk b;
    private final Spanned c;
    private boolean d = false;

    public ajyi(Resources resources, ajyk ajykVar, boolean z) {
        this.a = resources;
        this.b = ajykVar;
        this.c = Html.fromHtml(resources.getString(true != z ? R.string.SHARE_VIA_LINK_WARNING : R.string.SHARE_VIA_LINK_WARNING_PERSISTENT));
    }

    @Override // defpackage.ajyg
    public ajyx a() {
        return this;
    }

    @Override // defpackage.ajyx
    public CharSequence b() {
        return this.a.getString(R.string.SHARE_VIA_LINK_WARNING_TITLE);
    }

    @Override // defpackage.ajyx
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.ajyx
    public CharSequence d() {
        return this.a.getString(R.string.DONT_SHOW_THIS_AGAIN);
    }

    @Override // defpackage.ajyx
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.ajyx
    public cqkl f() {
        this.d = !this.d;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public cqkl g() {
        if (this.d) {
            this.b.aS();
        } else {
            this.b.aR();
        }
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public cqkl h() {
        this.b.aJ();
        return cqkl.a;
    }

    @Override // defpackage.ajyx
    public CharSequence i() {
        return this.a.getString(R.string.OK_BUTTON);
    }

    @Override // defpackage.ajyx
    public CharSequence j() {
        return this.a.getString(R.string.CANCEL_BUTTON);
    }
}
