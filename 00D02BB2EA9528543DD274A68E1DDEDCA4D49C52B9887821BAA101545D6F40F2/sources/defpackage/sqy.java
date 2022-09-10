package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sqy  reason: default package */
/* loaded from: classes7.dex */
public class sqy implements sni {
    private final String a;
    private final String b;
    private final String c;
    @dzsi
    private final View.OnClickListener d;
    private final boolean e;

    public sqy(final gga ggaVar, dxio<qbt> dxioVar, boolean z, boolean z2) {
        String string;
        String string2;
        this.a = ggaVar.getString(R.string.SUGGESTED_DESTINATIONS_TITLE);
        this.b = ggaVar.getString(R.string.SUGGESTED_DESTINATIONS_TITLE_CONTENT_DESCRIPTION);
        this.e = z2;
        if (!z) {
            if (dxioVar.a().e().a() == dqvj.TRANSIT) {
                string2 = ggaVar.getString(R.string.SUGGESTED_SEARCH_HISTORY_SUBTITLE_TRANSIT);
            } else {
                string2 = ggaVar.getString(R.string.SUGGESTED_SEARCH_HISTORY_SUBTITLE_DRIVING);
            }
            this.c = string2;
            this.d = null;
            return;
        }
        if (dxioVar.a().e().a() == dqvj.TRANSIT) {
            string = ggaVar.getString(R.string.SUGGESTED_LOCATION_HISTORY_SUBTITLE_TRANSIT);
        } else {
            string = ggaVar.getString(R.string.SUGGESTED_LOCATION_HISTORY_SUBTITLE_DRIVING);
        }
        this.c = string;
        this.d = new View.OnClickListener(ggaVar) { // from class: sqx
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gei.a(this.a, new spe());
            }
        };
    }

    @Override // defpackage.sni
    public String a() {
        return this.a;
    }

    @Override // defpackage.sni
    public String b() {
        return this.b;
    }

    @Override // defpackage.sni
    public String c() {
        return this.c;
    }

    @Override // defpackage.sni
    @dzsi
    public View.OnClickListener d() {
        return this.d;
    }

    @Override // defpackage.sni
    public cjtd e() {
        return cjtd.a(dtyc.fO);
    }

    @Override // defpackage.sni
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
