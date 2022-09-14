package com.baidu.mapapi.map;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class TextureSupportMapFragment extends android.support.v4.app.i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1694a = "TextureSupportMapFragment";

    /* renamed from: b  reason: collision with root package name */
    private TextureMapView f1695b;

    /* renamed from: c  reason: collision with root package name */
    private BaiduMapOptions f1696c;

    public TextureSupportMapFragment() {
    }

    private TextureSupportMapFragment(BaiduMapOptions baiduMapOptions) {
        this.f1696c = baiduMapOptions;
    }

    public static TextureSupportMapFragment newInstance() {
        return new TextureSupportMapFragment();
    }

    public static TextureSupportMapFragment newInstance(BaiduMapOptions baiduMapOptions) {
        return new TextureSupportMapFragment(baiduMapOptions);
    }

    public BaiduMap getBaiduMap() {
        if (this.f1695b == null) {
            return null;
        }
        return this.f1695b.getMap();
    }

    public TextureMapView getMapView() {
        return this.f1695b;
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
        this.f1695b = new TextureMapView(getActivity(), this.f1696c);
        return this.f1695b;
    }

    @Override // android.support.v4.app.i
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.support.v4.app.i
    public void onDestroyView() {
        super.onDestroyView();
        this.f1695b.onDestroy();
    }

    @Override // android.support.v4.app.i
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.support.v4.app.i
    public void onPause() {
        super.onPause();
        this.f1695b.onPause();
    }

    @Override // android.support.v4.app.i
    public void onResume() {
        super.onResume();
        this.f1695b.onResume();
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
