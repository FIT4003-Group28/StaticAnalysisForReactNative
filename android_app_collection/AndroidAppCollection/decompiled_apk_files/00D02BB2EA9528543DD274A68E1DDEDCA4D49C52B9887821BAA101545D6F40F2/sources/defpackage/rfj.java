package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rfj  reason: default package */
/* loaded from: classes7.dex */
public class rfj implements jam {
    final /* synthetic */ rfn a;

    public rfj(rfn rfnVar) {
        this.a = rfnVar;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        rcq rcqVar = rcq.LOADING;
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        if (this.a.s.ordinal() == 3) {
            return this.a.l.getString(R.string.MAPS_OFFLINE_TITLE);
        }
        return this.a.l.getString(R.string.COMMUTE_IMMERSIVE_GENERIC_ERROR_TITLE);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return true;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.a.n.aU();
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jam
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return null;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}
