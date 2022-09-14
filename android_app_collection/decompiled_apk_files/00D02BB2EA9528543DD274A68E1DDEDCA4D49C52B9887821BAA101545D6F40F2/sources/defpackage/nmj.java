package defpackage;

import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: nmj  reason: default package */
/* loaded from: classes7.dex */
public enum nmj {
    TERMS_OF_SERVICE(R.string.TERMS_OF_SERVICE, dpyv.TERMS_OF_SERVICE.dm, nme.a, dtxm.eB),
    TERMS_OF_SERVICE_DE(R.string.TERMS_OF_SERVICE, dpyv.TERMS_OF_SERVICE.dm, nmf.a, dtxm.eB),
    PRIVACY_POLICY(R.string.PRIVACY_POLICY, dpyv.PRIVACY_POLICY.dm, nmg.a, dtxm.eA),
    PRIVACY_POLICY_IN_FULL_LEGAL_TEXT(R.string.PRIVACY_POLICY_IN_FULL_LEGAL_TEXT, dpyv.PRIVACY_POLICY.dm, nmh.a, dtxm.eA),
    KOREAN_LOCATION_TERMS_OF_SERVICE(R.string.KOREAN_LOCATION_TERMS_OF_SERVICE, dpyv.KOREAN_LOCATION_TERMS_OF_SERVICE.dm, nmi.a, null);
    
    public final int f;
    public final int g;
    @dzsi
    public final ddho h;
    private final dbrn<Locale, String> i;

    nmj(int i, int i2, dbrn dbrnVar, @dzsi ddho ddhoVar) {
        this.f = i;
        this.g = i2;
        this.i = dbrnVar;
        this.h = ddhoVar;
    }

    public final String a() {
        return this.i.a(Locale.getDefault());
    }
}
