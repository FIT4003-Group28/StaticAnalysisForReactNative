package com.baidu.mapapi.map;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class SupportMapFragment extends android.support.v4.app.i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1671a = "SupportMapFragment";

    /* renamed from: b  reason: collision with root package name */
    private MapView f1672b;

    /* renamed from: c  reason: collision with root package name */
    private BaiduMapOptions f1673c;

    public SupportMapFragment() {
    }

    private SupportMapFragment(BaiduMapOptions baiduMapOptions) {
        this.f1673c = baiduMapOptions;
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(BaiduMapOptions baiduMapOptions) {
        return new SupportMapFragment(baiduMapOptions);
    }

    public BaiduMap getBaiduMap() {
        if (this.f1672b == null) {
            return null;
        }
        return this.f1672b.getMap();
    }

    public MapView getMapView() {
        return this.f1672b;
    }

    @Override // android.support.v4.app.i
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.support.v4.app.i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.support.v4.app.i, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.support.v4.app.i
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.i
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1672b = new MapView(getActivity(), this.f1673c);
        return this.f1672b;
    }

    @Override // android.support.v4.app.i
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.support.v4.app.i
    public void onDestroyView() {
        super.onDestroyView();
        this.f1672b.onDestroy();
    }

    @Override // android.support.v4.app.i
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.support.v4.app.i
    public void onPause() {
        super.onPause();
        this.f1672b.onPause();
    }

    @Override // android.support.v4.app.i
    public void onResume() {
        super.onResume();
        this.f1672b.onResume();
    }

    @Override // android.support.v4.app.i
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.i
    public void onStart() {
        super.onStart();
    }

    @Override // android.support.v4.app.i
    public void onStop() {
        super.onStop();
    }

    @Override // android.support.v4.app.i
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // android.support.v4.app.i
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle == null) {
        }
    }
}
