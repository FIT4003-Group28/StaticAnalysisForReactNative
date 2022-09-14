package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: twu  reason: default package */
/* loaded from: classes7.dex */
public class twu implements tvx {
    private final cqtd a;
    @dzsi
    private final CharSequence b;

    public twu(vtn vtnVar, doxk doxkVar, dozz dozzVar) {
        this.b = doxkVar.a.size() > 0 ? doxkVar.a.get(0) : null;
        this.a = yzx.a(dozzVar, vtnVar, vyt.g);
    }

    @Override // defpackage.tvx
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.tvx
    public Boolean b() {
        return true;
    }

    @Override // defpackage.tvx
    public Boolean c() {
        return false;
    }

    @Override // defpackage.tvx
    @dzsi
    public CharSequence d() {
        return this.b;
    }

    @Override // defpackage.tvx
    public Integer e() {
        return Integer.valueOf((int) R.id.trip_card_parking_notice);
    }
}
