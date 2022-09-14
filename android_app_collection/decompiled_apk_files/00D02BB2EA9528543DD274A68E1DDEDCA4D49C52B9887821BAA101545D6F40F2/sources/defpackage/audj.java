package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: audj  reason: default package */
/* loaded from: classes2.dex */
public class audj implements audo {
    private final aryv a;
    private final boolean b;

    public audj(aryv aryvVar, boolean z) {
        this.a = aryvVar;
        this.b = z;
    }

    @Override // defpackage.audo
    public String a() {
        return (String) this.a.b.h(audh.a).c("--");
    }

    @Override // defpackage.audo
    public dbsg<Integer> b() {
        return this.a.b;
    }

    @Override // defpackage.audo
    public Boolean c() {
        return (Boolean) this.a.b.h(audi.a).c(false);
    }

    @Override // defpackage.audo
    public Boolean d() {
        return Boolean.valueOf(this.a.c);
    }

    @Override // defpackage.audo
    public Integer e() {
        return Integer.valueOf(this.a.d == dowa.MILES ? R.string.SPEED_LIMIT_LABEL_MPH : R.string.SPEED_LIMIT_LABEL_KPH);
    }

    @Override // defpackage.audo
    public Integer f() {
        return Integer.valueOf(this.a.d == dowa.MILES ? R.plurals.DA_SPEED_FORMAT_MILES_PER_HOUR_EXTENDED : R.plurals.DA_SPEED_FORMAT_KILOMETERS_PER_HOUR_EXTENDED);
    }

    @Override // defpackage.audo
    public Boolean g() {
        return Boolean.valueOf(this.b);
    }
}
