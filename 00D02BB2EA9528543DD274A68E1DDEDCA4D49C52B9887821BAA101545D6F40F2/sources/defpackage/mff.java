package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mff  reason: default package */
/* loaded from: classes7.dex */
public final class mff implements mfa {
    private final Context a;
    private final noo b;
    private final dcdc<mfb> c;
    private final Boolean d;

    public mff(Context context, noo nooVar, dcdc<mfb> dcdcVar, boolean z) {
        this.a = context;
        this.b = nooVar;
        dbsk.s(dcdcVar);
        this.c = dcdcVar;
        this.d = Boolean.valueOf(!z);
    }

    @Override // defpackage.mfa
    public dcdc<mfb> a() {
        return this.c;
    }

    @Override // defpackage.mfa
    public String b() {
        return this.a.getResources().getString(R.string.MENU_SEARCH);
    }

    @Override // defpackage.mfa
    public Boolean c() {
        return this.d;
    }

    @Override // defpackage.mfa
    public cqkl d() {
        this.b.b();
        return cqkl.a;
    }

    @Override // defpackage.mfa
    public cqkl e() {
        this.b.a();
        return cqkl.a;
    }
}
