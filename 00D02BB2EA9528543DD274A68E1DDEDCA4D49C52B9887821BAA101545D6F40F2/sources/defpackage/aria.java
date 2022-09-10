package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aria  reason: default package */
/* loaded from: classes2.dex */
public class aria implements aric {
    private final cjqy a;
    private final dvbv b;
    private final Activity c;
    private final dxio<afha> d;

    public aria(Activity activity, cjqy cjqyVar, dvbv dvbvVar, dxio<afha> dxioVar) {
        this.c = activity;
        this.a = cjqyVar;
        this.b = dvbvVar;
        this.d = dxioVar;
    }

    @Override // defpackage.aric
    @dzsi
    public jic a() {
        String str;
        dvbv dvbvVar = this.b;
        int i = dvbvVar.a;
        if (i == 1) {
            dvbx dvbxVar = (dvbx) dvbvVar.b;
            if ((dvbxVar.a & 1) != 0) {
                str = dvbxVar.b;
                return new jic(str, ckqc.FIFE, (cqtd) null, 250);
            }
        }
        if (i == 2) {
            dvbz dvbzVar = (dvbz) dvbvVar.b;
            if ((dvbzVar.a & 1) != 0) {
                str = dvbzVar.b;
                return new jic(str, ckqc.FIFE, (cqtd) null, 250);
            }
        }
        return null;
    }

    @Override // defpackage.aric
    public cjtd b() {
        return cjtd.a(dtxv.ez);
    }

    @Override // defpackage.aric
    public cqkl c() {
        dvbz dvbzVar;
        dvbv dvbvVar = this.b;
        if (dvbvVar.a == 2 && (((dvbz) dvbvVar.b).a & 4) != 0) {
            this.a.i(cjtd.a(dtxv.eL));
            dvbv dvbvVar2 = this.b;
            if (dvbvVar2.a == 2) {
                dvbzVar = (dvbz) dvbvVar2.b;
            } else {
                dvbzVar = dvbz.d;
            }
            this.d.a().f(this.c, new Intent("android.intent.action.VIEW", Uri.parse(dvbzVar.c)), 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.aric
    public Boolean d() {
        dvbv dvbvVar = this.b;
        boolean z = false;
        if (dvbvVar.a == 2 && (((dvbz) dvbvVar.b).a & 4) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aric
    public CharSequence e() {
        return this.c.getString(R.string.MY_MAPS_YOUTUBE_A11Y_MEDIA_ITEM_CLICK);
    }
}
