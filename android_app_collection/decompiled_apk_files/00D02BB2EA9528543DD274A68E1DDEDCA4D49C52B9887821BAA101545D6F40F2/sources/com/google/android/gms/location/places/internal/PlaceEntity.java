package com.google.android.gms.location.places.internal;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, cooc {
    public static final Parcelable.Creator<PlaceEntity> CREATOR = new copp();
    public final String a;
    public final LatLng b;
    public final float c;
    public final LatLngBounds d;
    public final String e;
    public final Uri f;
    public final boolean g;
    public final float h;
    public final int i;
    public final List<Integer> j;
    public final String k;
    public final String l;
    public final String m;
    public final List<String> n;
    public final PlaceOpeningHoursEntity o;
    public final PlaceExtendedDetailsEntity p;
    public final String q;
    private Locale r;

    public PlaceEntity(String str, List<Integer> list, String str2, String str3, String str4, List<String> list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, PlaceOpeningHoursEntity placeOpeningHoursEntity, PlaceExtendedDetailsEntity placeExtendedDetailsEntity, String str6) {
        this.a = str;
        this.j = Collections.unmodifiableList(list);
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = list2 != null ? list2 : Collections.emptyList();
        this.b = latLng;
        this.c = f;
        this.d = latLngBounds;
        this.e = str5 != null ? str5 : "UTC";
        this.f = uri;
        this.g = z;
        this.h = f2;
        this.i = i;
        this.r = null;
        this.o = placeOpeningHoursEntity;
        this.p = placeExtendedDetailsEntity;
        this.q = str6;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // defpackage.cooc
    public final String a() {
        throw null;
    }

    @Override // defpackage.cooc
    public final /* bridge */ /* synthetic */ CharSequence b() {
        return this.l;
    }

    @Override // defpackage.cooc
    public final /* bridge */ /* synthetic */ CharSequence c() {
        return this.k;
    }

    @Override // defpackage.cooc
    public final LatLng d() {
        return this.b;
    }

    public final ContentValues e() {
        byte[] bArr;
        String[] strArr = copv.a;
        ContentValues contentValues = new ContentValues(21);
        contentValues.put("place_id", this.a);
        List<Integer> list = this.j;
        byte[] bArr2 = null;
        if (list == null || list.isEmpty()) {
            bArr = null;
        } else {
            czuk bZ = czul.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            czul czulVar = (czul) bZ.b;
            dsrf dsrfVar = czulVar.b;
            if (!dsrfVar.a()) {
                czulVar.b = dsqw.cg(dsrfVar);
            }
            dsod.bv(list, czulVar.b);
            bArr = bZ.bK().bS();
        }
        contentValues.put("place_types", bArr);
        contentValues.put("place_name", this.k);
        contentValues.put("place_address", this.l);
        contentValues.put("place_phone_number", this.m);
        List<String> list2 = this.n;
        if (list2 != null && !list2.isEmpty()) {
            czuk bZ2 = czul.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            czul czulVar2 = (czul) bZ2.b;
            dsrj<String> dsrjVar = czulVar2.a;
            if (!dsrjVar.a()) {
                czulVar2.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(list2, czulVar2.a);
            bArr2 = bZ2.bK().bS();
        }
        contentValues.put("place_attributions", bArr2);
        LatLng latLng = this.b;
        if (latLng != null) {
            contentValues.put("place_lat_lng", cnwo.a(latLng));
        }
        contentValues.put("place_level_number", Float.valueOf(this.c));
        LatLngBounds latLngBounds = this.d;
        if (latLngBounds != null) {
            contentValues.put("place_viewport", cnwo.a(latLngBounds));
        }
        Uri uri = this.f;
        if (uri != null) {
            contentValues.put("place_website_uri", uri.toString());
        }
        contentValues.put("place_is_permanently_closed", Boolean.valueOf(this.g));
        contentValues.put("place_rating", Float.valueOf(this.h));
        contentValues.put("place_price_level", Integer.valueOf(this.i));
        PlaceOpeningHoursEntity placeOpeningHoursEntity = this.o;
        if (placeOpeningHoursEntity != null) {
            contentValues.put("place_opening_hours", cnwo.a(placeOpeningHoursEntity));
        }
        contentValues.put("place_adr_address", this.q);
        return contentValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        if (this.a.equals(placeEntity.a)) {
            Locale locale = placeEntity.r;
            if (cnvv.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("id", this.a);
        b.a("placeTypes", this.j);
        b.a("locale", null);
        b.a("name", this.k);
        b.a("address", this.l);
        b.a("phoneNumber", this.m);
        b.a("latlng", this.b);
        b.a("viewport", this.d);
        b.a("websiteUri", this.f);
        b.a("isPermanentlyClosed", Boolean.valueOf(this.g));
        b.a("priceLevel", Integer.valueOf(this.i));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.u(parcel, 4, this.b, i);
        cnwn.i(parcel, 5, this.c);
        cnwn.u(parcel, 6, this.d, i);
        cnwn.k(parcel, 7, this.e, false);
        cnwn.u(parcel, 8, this.f, i);
        cnwn.e(parcel, 9, this.g);
        cnwn.i(parcel, 10, this.h);
        cnwn.g(parcel, 11, this.i);
        cnwn.k(parcel, 14, this.l, false);
        cnwn.k(parcel, 15, this.m, false);
        cnwn.w(parcel, 17, this.n);
        cnwn.k(parcel, 19, this.k, false);
        cnwn.r(parcel, 20, this.j);
        cnwn.u(parcel, 21, this.o, i);
        cnwn.u(parcel, 22, this.p, i);
        cnwn.k(parcel, 23, this.q, false);
        cnwn.c(parcel, d);
    }
}
