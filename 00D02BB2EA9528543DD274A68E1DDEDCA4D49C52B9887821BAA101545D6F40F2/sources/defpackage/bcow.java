package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcow  reason: default package */
/* loaded from: classes.dex */
public final class bcow extends afhx {
    private final bbut a;

    public bcow(Intent intent, @dzsi String str, bbut bbutVar) {
        super(intent, str, afid.PHOTO_SHARE);
        this.a = bbutVar;
    }

    public static List<Uri> d(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            dccx F = dcdc.F();
            ArrayList parcelableArrayList = extras.getParcelableArrayList("android.intent.extra.STREAM");
            if (parcelableArrayList != null) {
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Uri uri = (Uri) parcelableArrayList.get(i);
                    if (e(uri)) {
                        F.g(uri);
                    }
                }
                return F.f();
            }
            Uri uri2 = (Uri) extras.getParcelable("android.intent.extra.STREAM");
            if (uri2 == null || !e(uri2)) {
                extras.get("android.intent.extra.STREAM");
            } else {
                F.g(uri2);
                return F.f();
            }
        }
        return dcdc.e();
    }

    private static boolean e(Uri uri) {
        try {
            return !new File(uri.getPath()).getCanonicalPath().startsWith(Environment.getDataDirectory().toString());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.afhx
    public final void a() {
        List<Uri> d = d(this.f);
        if (d.isEmpty()) {
            return;
        }
        Bundle extras = this.f.getExtras();
        akqq akqqVar = null;
        if (extras.containsKey("latitude") && extras.containsKey("longitude")) {
            double d2 = extras.getDouble("latitude", Double.NaN);
            double d3 = extras.getDouble("longitude", Double.NaN);
            if (!Double.isNaN(d2) && !Double.isNaN(d3)) {
                akqqVar = new akqq(d2, d3);
            }
        }
        this.a.e(d, akqqVar, this.g);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PHOTO_SHARE;
    }
}
