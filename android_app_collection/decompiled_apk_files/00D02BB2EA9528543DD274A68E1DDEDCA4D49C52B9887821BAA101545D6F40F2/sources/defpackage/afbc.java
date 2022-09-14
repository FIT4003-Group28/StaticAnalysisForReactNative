package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afbc  reason: default package */
/* loaded from: classes2.dex */
class afbc implements afdu {
    private final int a;
    private final afbb b;

    public afbc(int i, afbb afbbVar) {
        this.a = i;
        this.b = afbbVar;
    }

    @Override // defpackage.afdu
    public Integer a() {
        return Integer.valueOf((int) R.string.EXIT_INCOGNITO_SIDE_MENU_BUTTON);
    }

    @Override // defpackage.afdu
    public Integer b() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.afdu
    public cqkl c() {
        ((afaw) this.b).ae.a().e(false);
        return cqkl.a;
    }
}
