package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahar  reason: default package */
/* loaded from: classes2.dex */
public class ahar extends ahhf implements agyq {
    private final Activity a;
    private final CharSequence b;
    @dzsi
    private final CharSequence c;
    @dzsi
    private final jic d;
    @dzsi
    private final ahaq e;
    private final cjtd f;
    private final CharSequence g;
    @dzsi
    private final CharSequence h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahar(Activity activity, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi jic jicVar, @dzsi ahaq ahaqVar, cjtd cjtdVar, CharSequence charSequence3, @dzsi CharSequence charSequence4, ahhv ahhvVar, boolean z) {
        super(activity, null, ahhvVar, 1);
        boolean z2 = true;
        this.a = activity;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = jicVar;
        this.e = ahaqVar;
        this.f = cjtdVar;
        this.g = charSequence3;
        this.h = charSequence4;
        if (ahaqVar != null && (cjtd.b.equals(cjtdVar) || cjtdVar.g == null)) {
            z2 = false;
        }
        dbsk.a(z2);
    }

    @Override // defpackage.agyq
    @dzsi
    public jic A() {
        return this.d;
    }

    @Override // defpackage.agyq
    @dzsi
    public cqss B() {
        jic jicVar = this.d;
        if (jicVar == null || jicVar.a == null) {
            return null;
        }
        return ibl.b();
    }

    @Override // defpackage.agxd
    public CharSequence a() {
        return y();
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public Boolean b() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public cqkl c() {
        ahaq ahaqVar = this.e;
        if (ahaqVar != null) {
            ahaqVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public cjtd d() {
        return this.f;
    }

    @Override // defpackage.agxd
    public List<agwt> e() {
        return dcdc.e();
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String n() {
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SHARE_CARD, new Object[]{this.g});
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public Boolean o() {
        return true;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String q() {
        CharSequence charSequence = this.h;
        if (charSequence == null || charSequence.length() <= 0) {
            return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_IN_CARD, new Object[]{this.g});
        }
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_WITH_TITLE_AND_AREA_NAME, new Object[]{this.g, this.h});
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String t() {
        CharSequence charSequence = this.h;
        if (charSequence == null || charSequence.length() <= 0) {
            return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_IN_CARD, new Object[]{this.g});
        }
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_WITH_TITLE_AND_AREA_NAME, new Object[]{this.g, this.h});
    }

    @Override // defpackage.agyq
    public CharSequence y() {
        return this.b;
    }

    @Override // defpackage.agyq
    @dzsi
    public CharSequence z() {
        return this.c;
    }
}
