package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aiyo  reason: default package */
/* loaded from: classes2.dex */
public class aiyo implements aixu {
    private final Resources a;
    private final int b;
    private final aiyn c;

    public aiyo(Resources resources, int i, aiyn aiynVar) {
        this.a = resources;
        this.b = i;
        this.c = aiynVar;
    }

    @Override // defpackage.aixu
    public CharSequence d() {
        Resources resources = this.a;
        int i = this.b;
        return resources.getQuantityString(R.plurals.PLUS_N_OTHER_SHARES, i, Integer.valueOf(i));
    }

    @Override // defpackage.aixu
    @dzsi
    public cqtd e() {
        return null;
    }

    @Override // defpackage.aixu
    public CharSequence f() {
        return this.a.getString(R.string.OPEN_OTHER_SHARES_BUTTON_ACCESSIBILITY_TEXT);
    }

    @Override // defpackage.aixu
    @dzsi
    public CharSequence g() {
        return this.a.getString(R.string.MOD_UPDATE_GOOGLE_MAPS);
    }

    @Override // defpackage.aixu
    @dzsi
    public CharSequence h() {
        return null;
    }

    @Override // defpackage.aixu
    @dzsi
    public CharSequence i() {
        return null;
    }

    @Override // defpackage.aixu
    public Boolean j() {
        return false;
    }

    @Override // defpackage.aixu
    public cqtd k() {
        return cqrt.g(2131232286, ibm.c());
    }

    @Override // defpackage.aixu
    public cqkl l() {
        ((aiws) this.c).d();
        return cqkl.a;
    }

    @Override // defpackage.aixu
    public cjtd m() {
        return cjtd.a(dtxu.eq);
    }
}
