package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoAdTrackingModel implements Parcelable, afto {
    public final apai b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final List x;
    public static final VideoAdTrackingModel a = new VideoAdTrackingModel(apai.a);
    public static final Parcelable.Creator CREATOR = new xcg(7);

    public VideoAdTrackingModel(apai apaiVar) {
        apaiVar = apaiVar == null ? apai.a : apaiVar;
        this.c = a(apaiVar.q);
        this.d = a(apaiVar.o);
        this.e = a(apaiVar.n);
        this.f = a(apaiVar.m);
        this.g = a(apaiVar.k);
        this.h = a(apaiVar.i);
        this.i = a(apaiVar.v);
        this.j = a(apaiVar.p);
        this.k = a(apaiVar.c);
        this.l = a(apaiVar.s);
        this.m = a(apaiVar.l);
        this.n = a(apaiVar.b);
        this.o = a(apaiVar.w);
        a(apaiVar.d);
        this.p = a(apaiVar.f);
        this.q = a(apaiVar.j);
        this.r = a(apaiVar.g);
        this.s = a(apaiVar.t);
        this.t = a(apaiVar.h);
        this.u = a(apaiVar.r);
        this.v = a(apaiVar.u);
        a(apaiVar.k);
        this.w = a(apaiVar.x);
        this.x = a(apaiVar.y);
        this.b = apaiVar;
    }

    private static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apae apaeVar = (apae) it.next();
            if (!TextUtils.isEmpty(apaeVar.c)) {
                try {
                    zgt.i(apaeVar.c);
                    arrayList.add(apaeVar);
                } catch (MalformedURLException unused) {
                    zep.l("Badly formed uri - ignoring");
                }
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoAdTrackingModel)) {
            return false;
        }
        return akzj.f(this.b, ((VideoAdTrackingModel) obj).b);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xel(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            zgd.K(this.b, parcel);
        }
    }
}
