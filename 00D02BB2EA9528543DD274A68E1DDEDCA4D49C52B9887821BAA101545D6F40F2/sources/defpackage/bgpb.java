package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgpb  reason: default package */
/* loaded from: classes3.dex */
public class bgpb implements bgnu {
    private final Activity a;
    private final dipk b;
    private final diov c;
    private final int d;
    private int e;

    public bgpb(Activity activity, dipk dipkVar, diov diovVar, int i) {
        this.a = activity;
        this.b = dipkVar;
        this.c = diovVar;
        this.e = i;
        new jic(diovVar.b, ckqc.FIFE_SMART_CROP, (int) R.color.qu_daynight_grey_200, 250);
        this.d = dipkVar.m.indexOf(diovVar);
    }

    @Override // defpackage.bgfa
    public void a(int i) {
        this.e = i;
    }

    @Override // defpackage.bgnu
    @dzsi
    public String b() {
        return this.c.b;
    }

    @Override // defpackage.bgnu
    public CharSequence c() {
        return this.a.getResources().getQuantityString(R.plurals.PHOTO_FOR_POST, this.b.m.size(), Integer.valueOf(this.e + 1), Integer.valueOf(this.d + 1));
    }
}
