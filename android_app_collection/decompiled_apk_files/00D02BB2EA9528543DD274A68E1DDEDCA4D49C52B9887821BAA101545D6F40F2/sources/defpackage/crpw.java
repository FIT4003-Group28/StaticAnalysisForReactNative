package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import defpackage.crpw;
/* compiled from: PG */
/* renamed from: crpw  reason: default package */
/* loaded from: classes5.dex */
public class crpw<T extends crpw<T>> {
    @dzsi
    public GmmLocation a;
    @dzsi
    public String b;
    public boolean c;
    public boolean d;
    public long e;

    public crpw() {
        this.a = null;
        this.c = true;
        this.d = false;
    }

    public crpw(crpx crpxVar) {
        this.a = null;
        this.c = true;
        this.d = false;
        this.a = crpxVar.a;
        this.c = crpxVar.c;
        this.d = crpxVar.d;
    }

    public final void a(@dzsi GmmLocation gmmLocation) {
        amvx t;
        this.b = null;
        if (gmmLocation == null || !gmmLocation.e() || (t = gmmLocation.t()) == null || TextUtils.isEmpty(t.a)) {
            return;
        }
        this.b = t.a;
    }
}
