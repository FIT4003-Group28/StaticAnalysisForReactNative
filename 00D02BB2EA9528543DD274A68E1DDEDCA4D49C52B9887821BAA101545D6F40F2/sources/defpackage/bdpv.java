package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bdpv  reason: default package */
/* loaded from: classes3.dex */
public final class bdpv implements bdpk {
    private static final dcep<String> m = dcep.C("com.google.android.apps.photos", "com.google.android.gallery3d");
    private static final dcep<awnn> o = dcep.D(awnn.TAKE_PICTURE, awnn.PICK_PICTURE, awnn.EDIT_PICTURE);
    @dzsi
    public Uri a;
    public final bduq b;
    public final bcpe c;
    public final fd d;
    public final bdpj e;
    @dzsi
    public Uri f;
    public final bdqb g;
    public final bvrb h;
    public final ckcw i;
    public final ahjq j;
    public final dxio<afha> k;
    @dzsi
    public Uri l = null;
    private final dxio<apni> n;

    public bdpv(fd fdVar, bdpj bdpjVar, bduq bduqVar, bdqb bdqbVar, bcpe bcpeVar, bvrb bvrbVar, ckcw ckcwVar, ahjq ahjqVar, dxio<apni> dxioVar, dxio<afha> dxioVar2) {
        this.d = fdVar;
        this.e = bdpjVar;
        this.b = bduqVar;
        this.g = bdqbVar;
        this.c = bcpeVar;
        this.h = bvrbVar;
        this.i = ckcwVar;
        this.j = ahjqVar;
        this.n = dxioVar;
        this.k = dxioVar2;
    }

    public static String g(double d) {
        double abs = Math.abs(d);
        int i = (int) abs;
        double d2 = i;
        Double.isNaN(d2);
        double d3 = (abs - d2) * 60.0d;
        int i2 = (int) d3;
        Locale locale = Locale.US;
        double d4 = i2;
        Double.isNaN(d4);
        return String.format(locale, "%d/1,%d/1,%d/1", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) ((d3 - d4) * 60.0d)));
    }

    private final void k(final List<Uri> list) {
        list.size();
        this.h.b(new Runnable(this, list) { // from class: bdpp
            private final bdpv a;
            private final List b;

            {
                this.a = this;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdpv bdpvVar = this.a;
                bdpvVar.e.b(this.b);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.bdpk
    public final void a(@dzsi Bundle bundle) {
        if (bundle != null) {
            this.a = (Uri) bundle.getParcelable("PhotoPickTakeHelper_PhotoTakeUri");
            this.f = (Uri) bundle.getParcelable("PhotoPickTakeHelper_PhotoEditUri");
            this.l = (Uri) bundle.getParcelable("PhotoPickTakeHelper_OriginalUri");
        }
    }

    @Override // defpackage.bdpk
    public final void b(Bundle bundle) {
        bundle.putParcelable("PhotoPickTakeHelper_PhotoTakeUri", this.a);
        bundle.putParcelable("PhotoPickTakeHelper_PhotoEditUri", this.f);
        bundle.putParcelable("PhotoPickTakeHelper_OriginalUri", this.l);
    }

    @Override // defpackage.bdpk
    public final void c(final Uri uri) {
        bvrj.UI_THREAD.c();
        this.l = uri;
        this.h.b(new Runnable(this, uri) { // from class: bdpm
            private final bdpv a;
            private final Uri b;

            {
                this.a = this;
                this.b = uri;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bdpv bdpvVar = this.a;
                Uri uri2 = this.b;
                ff J = bdpvVar.d.J();
                if (J == null) {
                    return;
                }
                final Intent b = bdpvVar.g.b(J, uri2, bdpvVar.b);
                bdpvVar.h.b(new Runnable(bdpvVar, b) { // from class: bdpt
                    private final bdpv a;
                    private final Intent b;

                    {
                        this.a = bdpvVar;
                        this.b = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bdpv bdpvVar2 = this.a;
                        Intent intent = this.b;
                        bvrj.UI_THREAD.c();
                        if (intent == null || bdpvVar2.d.I) {
                            bdpvVar2.f = null;
                            return;
                        }
                        bdpvVar2.f = (Uri) intent.getParcelableExtra("output");
                        bdpvVar2.k.a().p(bdpvVar2.d, intent, awnn.EDIT_PICTURE.ordinal(), 4);
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.bdpk
    public final boolean d(int i, int i2, Intent intent) {
        bvrj.UI_THREAD.c();
        awnn a = awnn.a(i);
        if (!o.contains(a)) {
            return false;
        }
        if (i2 != -1) {
            int ordinal = a.ordinal();
            if (ordinal == 6) {
                this.a = null;
            } else if (ordinal == 14) {
                this.f = null;
            }
            h();
            return true;
        }
        int ordinal2 = a.ordinal();
        if (ordinal2 == 6) {
            final Uri uri = this.a;
            if (uri == null) {
                h();
            } else {
                this.h.b(new Runnable(this, uri) { // from class: bdpn
                    private final bdpv a;
                    private final Uri b;

                    {
                        this.a = this;
                        this.b = uri;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GmmLocation a2;
                        final bdpv bdpvVar = this.a;
                        Uri uri2 = this.b;
                        bvrj.UI_THREAD.d();
                        String a3 = bdux.a(bdpvVar.d.H(), uri2);
                        if (a3 != null) {
                            try {
                                ExifInterface exifInterface = new ExifInterface(a3);
                                if (!exifInterface.getLatLong(new float[2]) && bdpvVar.j.d() && (a2 = bdpvVar.j.a()) != null) {
                                    exifInterface.setAttribute("GPSLatitude", bdpv.g(a2.getLatitude()));
                                    exifInterface.setAttribute("GPSLatitudeRef", a2.getLatitude() > dcyn.a ? "N" : "S");
                                    exifInterface.setAttribute("GPSLongitude", bdpv.g(a2.getLongitude()));
                                    exifInterface.setAttribute("GPSLongitudeRef", a2.getLongitude() > dcyn.a ? "E" : "W");
                                    exifInterface.saveAttributes();
                                }
                            } catch (IOException unused) {
                            }
                        }
                        if (bdpvVar.j(uri2) == null) {
                            bdpvVar.h();
                            return;
                        }
                        final dcdc f = dcdc.f(uri2);
                        f.size();
                        bdpvVar.h.b(new Runnable(bdpvVar, f) { // from class: bdpq
                            private final bdpv a;
                            private final List b;

                            {
                                this.a = bdpvVar;
                                this.b = f;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                bdpv bdpvVar2 = this.a;
                                bdpvVar2.e.a(this.b);
                            }
                        }, bvrj.UI_THREAD);
                        bdpvVar.a = null;
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
            }
            return true;
        } else if (ordinal2 != 7) {
            if (ordinal2 != 14) {
                return false;
            }
            final Uri data = intent.getData();
            if (data != null) {
                this.h.b(new Runnable(this, data) { // from class: bdpr
                    private final bdpv a;
                    private final Uri b;

                    {
                        this.a = this;
                        this.b = data;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ff J;
                        final bdpv bdpvVar = this.a;
                        final Uri uri2 = this.b;
                        Uri a2 = bdpvVar.c.a(uri2);
                        if (a2 != null && bdpvVar.j(a2) != null && (J = bdpvVar.d.J()) != null) {
                            try {
                                uri2 = ja.a(J, J.getPackageName(), new File(a2.getPath()));
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        bdpvVar.h.b(new Runnable(bdpvVar, uri2) { // from class: bdps
                            private final bdpv a;
                            private final Uri b;

                            {
                                this.a = bdpvVar;
                                this.b = uri2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                bdpv bdpvVar2 = this.a;
                                Uri uri3 = this.b;
                                Uri uri4 = bdpvVar2.l;
                                if (uri4 == null) {
                                    ((ckcn) bdpvVar2.i.a(ckdz.a)).a();
                                    return;
                                }
                                bdpj bdpjVar = bdpvVar2.e;
                                dbsk.s(uri3);
                                bdpjVar.d(uri4, uri3);
                                bdpvVar2.l = null;
                                bdpvVar2.f = null;
                            }
                        }, bvrj.UI_THREAD);
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
            }
            return true;
        } else {
            if (intent == null) {
                h();
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    ClipData.Item itemAt = clipData.getItemAt(i3);
                    if (itemAt != null) {
                        arrayList.add(itemAt.getUri());
                    }
                }
                k(arrayList);
            } else if (intent.getData() != null) {
                k(dcdc.f(intent.getData()));
            } else {
                h();
            }
            return true;
        }
    }

    @Override // defpackage.bdpk
    public final void e(boolean z, int i) {
        bvrj.UI_THREAD.c();
        if (this.d.I) {
            return;
        }
        Intent intent = null;
        boolean z2 = false;
        if (!z || !this.n.a().b()) {
            intent = i("android.intent.action.PICK", "image/*");
        } else if (this.d.J() != null) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.GET_CONTENT");
            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            intent2.setType("*/*");
            PackageManager packageManager = this.d.J().getPackageManager();
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent2, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
                arrayList.add(resolveInfo.activityInfo.applicationInfo.packageName);
            }
            if (!arrayList.isEmpty()) {
                dcpd<String> it = m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (arrayList.contains(next)) {
                        intent2.setPackage(next);
                        break;
                    }
                }
                intent = intent2;
            }
        }
        if (intent == null) {
            f(R.string.NO_PHOTO_PICKING_APP_AVAILABLE);
            return;
        }
        if (i == 1) {
            z2 = true;
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z2);
        this.k.a().p(this.d, intent, awnn.PICK_PICTURE.ordinal(), 4);
    }

    public final void f(int i) {
        if (this.d.S()) {
            fd fdVar = this.d;
            if (!fdVar.I) {
                String Rp = fdVar.Rp(i);
                Toast.makeText(this.d.J(), Rp, 0).show();
                bvoo.j(new ActivityNotFoundException(Rp));
            }
        }
        this.a = null;
        h();
    }

    public final void h() {
        bvrb bvrbVar = this.h;
        final bdpj bdpjVar = this.e;
        bdpjVar.getClass();
        bvrbVar.b(new Runnable(bdpjVar) { // from class: bdpo
            private final bdpj a;

            {
                this.a = bdpjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        }, bvrj.UI_THREAD);
    }

    @dzsi
    public final Intent i(String str, @dzsi String str2) {
        if (this.d.J() == null) {
            return null;
        }
        PackageManager packageManager = this.d.J().getPackageManager();
        Intent intent = new Intent(str);
        if (str2 != null) {
            intent.setType(str2);
        }
        if (packageManager.queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).isEmpty()) {
            return null;
        }
        return intent;
    }

    @dzsi
    public final Uri j(Uri uri) {
        return this.c.b(uri);
    }
}
