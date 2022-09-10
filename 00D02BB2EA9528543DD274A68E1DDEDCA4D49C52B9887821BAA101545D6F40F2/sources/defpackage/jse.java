package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jse  reason: default package */
/* loaded from: classes7.dex */
public class jse implements jrg {
    private final Activity a;
    private final dzsj<ahjq> b;
    private final bvsl c;
    private final dxio<afha> d;
    private final dhmz e;
    private final dhnd f;
    private final List<jrf> g = new ArrayList();
    private final jic h;
    private final cjtd i;
    private final cjtd j;

    public jse(Activity activity, dzsj<ahjq> dzsjVar, bvsl bvslVar, dxio<afha> dxioVar, dhmz dhmzVar, dhnd dhndVar, jic jicVar) {
        this.a = activity;
        this.b = dzsjVar;
        this.c = bvslVar;
        this.d = dxioVar;
        this.e = dhmzVar;
        this.f = dhndVar;
        this.h = jicVar;
        for (djia djiaVar : dhndVar.h) {
            this.g.add(new jsd(djiaVar, Locale.getDefault(), activity));
        }
        this.i = jsi.a(dtxv.h, dhmzVar);
        this.j = jsi.a(dtxv.i, dhmzVar);
    }

    @Override // defpackage.jrg
    public String a() {
        return this.e.d;
    }

    @Override // defpackage.jrg
    public String b() {
        return this.f.d;
    }

    @Override // defpackage.jrg
    public String c() {
        return this.f.e;
    }

    @Override // defpackage.jrg
    @dzsi
    public Float d() {
        dhnd dhndVar = this.f;
        return Float.valueOf((dhndVar.a & 16) != 0 ? dhndVar.f : this.e.g);
    }

    @Override // defpackage.jrg
    public List<jrf> e(int i) {
        return this.g.size() > 2 ? this.g.subList(0, 2) : this.g;
    }

    @Override // defpackage.jrg
    public jic f() {
        dhmz dhmzVar = this.e;
        return (dhmzVar.a & 16) != 0 ? new jic(dhmzVar.f, ckqc.FIFE, R.drawable.generic_image_placeholder) : this.h;
    }

    @Override // defpackage.jrg
    @dzsi
    public String g() {
        GmmLocation a = this.b.a().a();
        dhjz dhjzVar = this.e.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        return isl.b(a, dhjzVar, this.c);
    }

    @Override // defpackage.jrg
    public cqkl h() {
        Activity activity = this.a;
        dxio<afha> dxioVar = this.d;
        String str = this.e.b;
        String str2 = this.f.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("m=");
        sb.append(str);
        sb.append("&s=");
        sb.append(str2);
        jru.a(activity, dxioVar, sb.toString());
        return cqkl.a;
    }

    @Override // defpackage.jrg
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.jrg
    public cjtd j() {
        return this.j;
    }
}
