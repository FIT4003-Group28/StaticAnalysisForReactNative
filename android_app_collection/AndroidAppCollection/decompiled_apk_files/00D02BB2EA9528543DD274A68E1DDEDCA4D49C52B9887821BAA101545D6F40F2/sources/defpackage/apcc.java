package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: apcc  reason: default package */
/* loaded from: classes2.dex */
public class apcc implements apbu {
    private final Activity a;
    private final apaw b;
    private final apcz c;
    private final aoxt d;
    private final int e;

    public apcc(apdb apdbVar, Activity activity, apaw apawVar, aoxt aoxtVar, aoxr aoxrVar, int i) {
        this.a = activity;
        this.d = aoxtVar;
        this.b = apawVar;
        this.c = apdbVar.a(aoxtVar, aoxrVar);
        this.e = i;
    }

    @Override // defpackage.apbu
    public Boolean a() {
        apaw apawVar = this.b;
        return Boolean.valueOf(((apav) apawVar).am.get(this.e));
    }

    @Override // defpackage.apbu
    public String b() {
        return this.a.getString(true != a().booleanValue() ? R.string.MAPS_ACTIVITY_DESELECTED_PLACE_ENTRY_CHECKBOX_CONTENT_DESCRIPTION : R.string.MAPS_ACTIVITY_SELECTED_PLACE_ENTRY_CHECKBOX_CONTENT_DESCRIPTION, new Object[]{this.d.a().n()});
    }

    @Override // defpackage.apbu
    public Boolean c() {
        apaw apawVar = this.b;
        akqi ai = this.d.a().ai();
        HashSet<akqi> c = ((apav) apawVar).al.c();
        dbsk.s(c);
        return Boolean.valueOf(!c.contains(ai));
    }

    @Override // defpackage.apbu
    public Boolean d() {
        boolean z = true;
        if (this.b.i() >= 200 && !a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.apcy
    public apcz e() {
        return this.c;
    }

    @Override // defpackage.apcy
    public cqkl f() {
        if (a().booleanValue()) {
            apaw apawVar = this.b;
            apav apavVar = (apav) apawVar;
            apavVar.am.clear(this.e);
            apavVar.w();
        } else {
            apaw apawVar2 = this.b;
            apav apavVar2 = (apav) apawVar2;
            apavVar2.am.set(this.e);
            if (apavVar2.i() == 200) {
                apavVar2.aS();
            }
            apavVar2.w();
        }
        return cqkl.a;
    }

    @Override // defpackage.apcy
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtyi.aa;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = a().booleanValue() ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }
}
