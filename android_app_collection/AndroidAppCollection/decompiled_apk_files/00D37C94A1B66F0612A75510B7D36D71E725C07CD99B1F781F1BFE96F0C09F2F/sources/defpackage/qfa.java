package defpackage;

import android.location.Location;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qfa  reason: default package */
/* loaded from: classes4.dex */
public final class qfa implements qgp {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final NativeAdOptionsParcel g;
    private final boolean i;
    private final List h = new ArrayList();
    private final Map j = new HashMap();

    public qfa(Date date, int i, Set set, Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List list, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = nativeAdOptionsParcel;
        this.i = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.j.put(split[1], false);
                        }
                    }
                } else {
                    this.h.add(str);
                }
            }
        }
    }

    @Override // defpackage.qgh
    @Deprecated
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qgh
    public final int b() {
        return this.f;
    }

    @Override // defpackage.qgh
    public final Location c() {
        return this.e;
    }

    @Override // defpackage.qgh
    @Deprecated
    public final Date d() {
        return this.a;
    }

    @Override // defpackage.qgh
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.qgh
    @Deprecated
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.qgh
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.qgp
    public final pzv h() {
        NativeAdOptionsParcel nativeAdOptionsParcel = this.g;
        pzu pzuVar = new pzu();
        if (nativeAdOptionsParcel != null) {
            int i = nativeAdOptionsParcel.a;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        pzuVar.f = nativeAdOptionsParcel.g;
                        pzuVar.c = nativeAdOptionsParcel.h;
                    }
                    pzuVar.a = nativeAdOptionsParcel.b;
                    pzuVar.b = nativeAdOptionsParcel.c;
                    pzuVar.d = nativeAdOptionsParcel.d;
                }
                VideoOptionsParcel videoOptionsParcel = nativeAdOptionsParcel.f;
                if (videoOptionsParcel != null) {
                    pzuVar.g = new aitu(videoOptionsParcel);
                }
            }
            pzuVar.e = nativeAdOptionsParcel.e;
            pzuVar.a = nativeAdOptionsParcel.b;
            pzuVar.b = nativeAdOptionsParcel.c;
            pzuVar.d = nativeAdOptionsParcel.d;
        }
        return pzuVar.a();
    }

    @Override // defpackage.qgp
    public final qhd i() {
        NativeAdOptionsParcel nativeAdOptionsParcel = this.g;
        qhc qhcVar = new qhc();
        if (nativeAdOptionsParcel != null) {
            int i = nativeAdOptionsParcel.a;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        qhcVar.e = nativeAdOptionsParcel.g;
                        qhcVar.b = nativeAdOptionsParcel.h;
                    }
                    qhcVar.a = nativeAdOptionsParcel.b;
                    qhcVar.c = nativeAdOptionsParcel.d;
                }
                VideoOptionsParcel videoOptionsParcel = nativeAdOptionsParcel.f;
                if (videoOptionsParcel != null) {
                    qhcVar.f = new aitu(videoOptionsParcel);
                }
            }
            qhcVar.d = nativeAdOptionsParcel.e;
            qhcVar.a = nativeAdOptionsParcel.b;
            qhcVar.c = nativeAdOptionsParcel.d;
        }
        return qhcVar.a();
    }

    @Override // defpackage.qgp
    public final Map j() {
        return this.j;
    }

    @Override // defpackage.qgp
    public final boolean k() {
        return this.h.contains("3");
    }

    @Override // defpackage.qgp
    public final boolean l() {
        return this.h.contains("6");
    }
}
