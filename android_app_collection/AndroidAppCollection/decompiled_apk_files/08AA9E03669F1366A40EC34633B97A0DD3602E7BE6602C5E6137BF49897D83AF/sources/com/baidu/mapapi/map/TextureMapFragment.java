package com.baidu.mapapi.map;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class TextureMapFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1687a = "TextureMapFragment";

    /* renamed from: b  reason: collision with root package name */
    private TextureMapView f1688b;

    /* renamed from: c  reason: collision with root package name */
    private BaiduMapOptions f1689c;

    public TextureMapFragment() {
    }

    private TextureMapFragment(BaiduMapOptions baiduMapOptions) {
        this.f1689c = baiduMapOptions;
    }

    public static TextureMapFragment newInstance() {
        return new TextureMapFragment();
    }

    public static TextureMapFragment newInstance(BaiduMapOptions baiduMapOptions) {
        return new TextureMapFragment(baiduMapOptions);
    }

    public BaiduMap getBaiduMap() {
        if (this.f1688b == null) {
            return null;
        }
        return this.f1688b.getMap();
    }

    public TextureMapView getMapView() {
        return this.f1688b;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1688b = new TextureMapView(getActivity(), this.f1689c);
        return this.f1688b;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f1688b.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f1688b.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f1688b.onResume();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
