package com.facebook.react.f;

import android.preference.PreferenceManager;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.z;
import com.facebook.react.c;
import com.facebook.react.flat.FlatARTSurfaceViewManager;
import com.facebook.react.flat.RCTImageViewManager;
import com.facebook.react.flat.RCTModalHostManager;
import com.facebook.react.flat.RCTRawTextManager;
import com.facebook.react.flat.RCTTextInlineImageManager;
import com.facebook.react.flat.RCTTextInputManager;
import com.facebook.react.flat.RCTTextManager;
import com.facebook.react.flat.RCTViewManager;
import com.facebook.react.flat.RCTViewPagerManager;
import com.facebook.react.flat.RCTVirtualTextManager;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.toolbar.ReactToolbarManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MainReactPackage.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private a f3319a;

    @Override // com.facebook.react.c
    public List<z> a(final ah ahVar) {
        return Arrays.asList(z.a(AccessibilityInfoModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.1
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new AccessibilityInfoModule(ahVar);
            }
        }), z.a(AppStateModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.12
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new AppStateModule(ahVar);
            }
        }), z.a(BlobModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.19
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new BlobModule(ahVar);
            }
        }), z.a(AsyncStorageModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.20
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new AsyncStorageModule(ahVar);
            }
        }), z.a(CameraRollManager.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.21
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new CameraRollManager(ahVar);
            }
        }), z.a(ClipboardModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.22
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ClipboardModule(ahVar);
            }
        }), z.a(DatePickerDialogModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.23
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new DatePickerDialogModule(ahVar);
            }
        }), z.a(DialogModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.24
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new DialogModule(ahVar);
            }
        }), z.a(FrescoModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.25
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new FrescoModule(ahVar, true, b.this.f3319a != null ? b.this.f3319a.a() : null);
            }
        }), z.a(I18nManagerModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.2
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new I18nManagerModule(ahVar);
            }
        }), z.a(ImageEditingManager.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.3
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ImageEditingManager(ahVar);
            }
        }), z.a(ImageLoaderModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.4
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ImageLoaderModule(ahVar);
            }
        }), z.a(ImageStoreManager.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.5
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ImageStoreManager(ahVar);
            }
        }), z.a(IntentModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.6
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new IntentModule(ahVar);
            }
        }), z.a(LocationModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.7
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new LocationModule(ahVar);
            }
        }), z.a(NativeAnimatedModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.8
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new NativeAnimatedModule(ahVar);
            }
        }), z.a(NetworkingModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.9
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new NetworkingModule(ahVar);
            }
        }), z.a(NetInfoModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.10
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new NetInfoModule(ahVar);
            }
        }), z.a(PermissionsModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.11
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new PermissionsModule(ahVar);
            }
        }), z.a(ShareModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.13
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ShareModule(ahVar);
            }
        }), z.a(StatusBarModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.14
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new StatusBarModule(ahVar);
            }
        }), z.a(TimePickerDialogModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.15
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new TimePickerDialogModule(ahVar);
            }
        }), z.a(ToastModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.16
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new ToastModule(ahVar);
            }
        }), z.a(VibrationModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.17
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new VibrationModule(ahVar);
            }
        }), z.a(WebSocketModule.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.f.b.18
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new WebSocketModule(ahVar);
            }
        }));
    }

    @Override // com.facebook.react.c, com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ReactCheckBoxManager());
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactDropdownPickerManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new ReactToolbarManager());
        arrayList.add(new ReactWebViewManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        if (PreferenceManager.getDefaultSharedPreferences(ahVar).getBoolean("flat_uiimplementation", false)) {
            arrayList.add(new FlatARTSurfaceViewManager());
            arrayList.add(new RCTTextInlineImageManager());
            arrayList.add(new RCTImageViewManager());
            arrayList.add(new RCTModalHostManager());
            arrayList.add(new RCTRawTextManager());
            arrayList.add(new RCTTextInputManager());
            arrayList.add(new RCTTextManager());
            arrayList.add(new RCTViewManager());
            arrayList.add(new RCTViewPagerManager());
            arrayList.add(new RCTVirtualTextManager());
        } else {
            arrayList.add(new ARTSurfaceViewManager());
            arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
            arrayList.add(new ReactImageManager());
            arrayList.add(new ReactModalHostManager());
            arrayList.add(new ReactRawTextManager());
            arrayList.add(new ReactTextInputManager());
            arrayList.add(new ReactTextViewManager());
            arrayList.add(new ReactViewManager());
            arrayList.add(new ReactViewPagerManager());
            arrayList.add(new ReactVirtualTextViewManager());
        }
        return arrayList;
    }

    @Override // com.facebook.react.c
    public com.facebook.react.d.a.b a() {
        return c.a(this);
    }
}
