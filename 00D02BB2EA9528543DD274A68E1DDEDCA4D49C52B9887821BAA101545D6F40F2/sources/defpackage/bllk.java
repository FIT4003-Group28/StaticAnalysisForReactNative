package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bllk  reason: default package */
/* loaded from: classes3.dex */
public class bllk implements blky {
    private final Boolean a;
    private final Float b;
    private final String c;
    private final Boolean d;
    private final String e;
    @dzsi
    private final String f;

    @Override // defpackage.blky
    public Boolean a() {
        return this.a;
    }

    @Override // defpackage.blky
    public String b() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Invalid aspect group type");
    }

    @Override // defpackage.blky
    public Float c() {
        return this.b;
    }

    @Override // defpackage.blky
    public String d() {
        return this.c;
    }

    @Override // defpackage.blky
    public Boolean e() {
        return this.d;
    }

    @Override // defpackage.blky
    public String f() {
        return this.e;
    }

    public bllk(dvyr dvyrVar, Activity activity) {
        int a;
        boolean z = true;
        this.a = Boolean.valueOf(((dvyrVar.a & 1) == 0 || (a = dvyt.a(dvyrVar.b)) == 0 || a == 1 || (dvyrVar.a & 2) == 0) ? false : true);
        int a2 = dvyt.a(dvyrVar.b);
        int i = (a2 == 0 ? 1 : a2) - 1;
        if (i == 1) {
            this.f = activity.getString(R.string.ROOMS);
        } else if (i == 2) {
            this.f = activity.getString(R.string.LOCATION);
        } else if (i != 3) {
            this.f = null;
        } else {
            this.f = activity.getString(R.string.SERVICE_AND_FACILITIES);
        }
        Float valueOf = Float.valueOf(dvyrVar.c);
        this.b = valueOf;
        this.c = String.format(Locale.getDefault(), "%.1f", valueOf);
        this.d = Boolean.valueOf(dvyrVar.d.size() <= 0 ? false : z);
        this.e = dbrz.e(" · ").j().g(dvyrVar.d);
    }
}
