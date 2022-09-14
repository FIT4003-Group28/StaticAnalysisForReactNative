package com.baidu.mapapi.search.sug;

import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class SuggestionSearchOption {

    /* renamed from: a  reason: collision with root package name */
    String f1942a = null;

    /* renamed from: b  reason: collision with root package name */
    String f1943b = null;

    /* renamed from: c  reason: collision with root package name */
    LatLng f1944c = null;

    public SuggestionSearchOption city(String str) {
        this.f1942a = str;
        return this;
    }

    public SuggestionSearchOption keyword(String str) {
        this.f1943b = str;
        return this;
    }

    public SuggestionSearchOption location(LatLng latLng) {
        this.f1944c = latLng;
        return this;
    }
}
