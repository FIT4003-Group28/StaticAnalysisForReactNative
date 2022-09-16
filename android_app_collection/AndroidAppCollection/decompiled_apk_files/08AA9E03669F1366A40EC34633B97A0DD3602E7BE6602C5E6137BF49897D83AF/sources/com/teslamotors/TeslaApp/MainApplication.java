package com.teslamotors.TeslaApp;

import android.app.Application;
import com.BaiduMaps.e;
import com.facebook.react.i;
import com.facebook.react.m;
import com.facebook.react.n;
import com.horcrux.svg.SvgPackage;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class MainApplication extends Application implements i {

    /* renamed from: a  reason: collision with root package name */
    private final m f4945a = new m(this) { // from class: com.teslamotors.TeslaApp.MainApplication.1
        @Override // com.facebook.react.m
        public boolean j() {
            return false;
        }

        @Override // com.facebook.react.m
        protected List<n> k() {
            return Arrays.asList(new c(), new com.teslamotors.plugins.colorblending.b(), new com.teslamotors.plugins.devicestorage.a(), new com.teslamotors.plugins.nativelocationutils.a(), new com.teslamotors.plugins.shakehandler.b(), new com.airbnb.android.react.maps.i(), new e(), new com.learnium.RNDeviceInfo.a(), new com.i18n.reactnativei18n.a(), new com.idehub.GoogleAnalyticsBridge.b(), new com.teslamotors.plugins.alert.b(), new com.teslamotors.plugins.viewsnapshotter.a(), new com.teslamotors.plugins.client.a(), new com.teslamotors.plugins.crashlytics.a(), new com.teslamotors.plugins.calendar.b(), new com.teslamotors.plugins.contacts.a(), new com.teslamotors.plugins.proximitysensornotifier.a(), com.teslamotors.plugins.notifications.c.a(), new SvgPackage(), new com.BV.LinearGradient.a(), new com.teslamotors.plugins.biometricauthentication.a(), new com.teslamotors.plugins.ble.e());
        }
    };

    @Override // com.facebook.react.i
    public m a() {
        return this.f4945a;
    }
}
