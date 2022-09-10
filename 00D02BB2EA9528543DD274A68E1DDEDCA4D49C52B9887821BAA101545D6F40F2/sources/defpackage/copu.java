package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: copu  reason: default package */
/* loaded from: classes5.dex */
public final class copu extends copx implements cooc {
    private final String d;

    public copu(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.d = j("place_id", "");
        if (f().size() > 0 || ((e() != null && e().length() > 0) || ((i() != null && !i().equals(Uri.EMPTY)) || h() >= 0.0f || g() >= 0))) {
            new PlaceExtendedDetailsEntity(f(), e() != null ? e().toString() : null, i(), h(), g());
        }
    }

    @Override // defpackage.cooc
    public final String a() {
        return this.d;
    }

    @Override // defpackage.cooc
    public final CharSequence b() {
        return j("place_address", "");
    }

    @Override // defpackage.cooc
    public final CharSequence c() {
        return j("place_name", "");
    }

    @Override // defpackage.cooc
    public final LatLng d() {
        Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
        byte[] k = k("place_lat_lng");
        return (LatLng) (k == null ? null : cnwo.b(k, creator));
    }

    public final CharSequence e() {
        return j("place_phone_number", "");
    }

    public final List<Integer> f() {
        czul czulVar;
        List<Integer> emptyList = Collections.emptyList();
        byte[] k = k("place_types");
        if (k != null) {
            try {
                czulVar = (czul) dsqw.cq(czul.c, k);
                if (czulVar.b.size() == 0) {
                    return emptyList;
                }
            } catch (dsrm unused) {
                return emptyList;
            }
        }
        return czulVar.b;
    }

    public final int g() {
        if (!G("place_price_level") || M("place_price_level")) {
            return -1;
        }
        return I("place_price_level");
    }

    public final float h() {
        return l("place_rating");
    }

    public final Uri i() {
        String j = j("place_website_uri", null);
        if (j == null) {
            return null;
        }
        return Uri.parse(j);
    }
}
