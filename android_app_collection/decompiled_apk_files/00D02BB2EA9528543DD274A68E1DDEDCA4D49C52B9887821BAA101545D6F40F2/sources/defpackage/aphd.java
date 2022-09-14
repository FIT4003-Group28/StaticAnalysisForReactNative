package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aphd  reason: default package */
/* loaded from: classes2.dex */
public class aphd implements jam {
    final /* synthetic */ aowm a;
    final /* synthetic */ gga b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ aphe e;

    public aphd(aowm aowmVar, gga ggaVar, String str, String str2, aphe apheVar) {
        this.a = aowmVar;
        this.b = ggaVar;
        this.c = str;
        this.d = str2;
        this.e = apheVar;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        aowm aowmVar = aowm.NO_CONNECTION;
        int ordinal = this.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.b.getString(R.string.VISIT_STATS_GENERIC_ERROR);
            }
            if (ordinal == 2) {
                return this.b.getString(R.string.MAPS_ACTIVITY_TIMELINE_UNEXPLORED_TERRITORY);
            }
            if (ordinal == 3) {
                return this.b.getString(R.string.MAPS_ACTIVITY_TIMELINE_NO_VISITED_CITIES_IN_COUNTRY);
            }
            throw new RuntimeException("Error state not supported.");
        }
        return this.b.getString(R.string.MAPS_ACTIVITY_TIMELINE_CANT_CONNECT_TO_NETWORK);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.jam
    public cqkl i() {
        aphe apheVar = this.e;
        if (apheVar != null) {
            apheVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence j() {
        return this.d;
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
        return this.c;
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd o() {
        aowm aowmVar = aowm.NO_CONNECTION;
        int ordinal = this.a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return iup.e(R.raw.network_error);
        }
        if (ordinal != 2 && ordinal != 3) {
            return null;
        }
        return iva.e(iup.e(R.raw.error_state_desert), iup.e(R.raw.error_state_desert_dark_mode));
    }
}
