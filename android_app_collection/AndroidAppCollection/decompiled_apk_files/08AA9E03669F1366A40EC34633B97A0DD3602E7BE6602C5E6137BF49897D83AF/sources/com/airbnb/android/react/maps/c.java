package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
/* compiled from: AirMapFeature.java */
/* loaded from: classes.dex */
public abstract class c extends com.facebook.react.views.view.f {
    public abstract void b(GoogleMap googleMap);

    public abstract Object getFeature();

    public c(Context context) {
        super(context);
    }
}
