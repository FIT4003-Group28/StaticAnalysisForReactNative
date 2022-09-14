package com.idehub.GoogleAnalyticsBridge;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GoogleAnalyticsBridge extends ReactContextBaseJavaModule {
    private final String _trackingId;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GoogleAnalyticsBridge";
    }

    public GoogleAnalyticsBridge(ah ahVar, String str) {
        super(ahVar);
        this._trackingId = str;
    }

    synchronized Tracker getTracker(String str) {
        return a.a(getReactApplicationContext()).a(str);
    }

    synchronized GoogleAnalytics getAnalyticsInstance() {
        return GoogleAnalytics.getInstance(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("nativeTrackerId", this._trackingId);
        return hashMap;
    }

    @al
    public void trackScreenView(String str, String str2) {
        a.a(getReactApplicationContext()).a(str, str2);
    }

    @al
    public void trackEvent(String str, String str2, String str3, an anVar) {
        String str4;
        Integer num;
        Integer num2 = null;
        if (anVar != null) {
            String string = anVar.hasKey("label") ? anVar.getString("label") : null;
            if (anVar.hasKey("value")) {
                num2 = Integer.valueOf(anVar.getInt("value"));
            }
            num = num2;
            str4 = string;
        } else {
            str4 = null;
            num = null;
        }
        a.a(getReactApplicationContext()).a(str, str2, str3, str4, num);
    }

    @al
    public void setCustomDimensionValue(String str, int i, String str2) {
        a.a(getReactApplicationContext()).a(str, i, str2);
    }

    @al
    public void trackTiming(String str, String str2, Double d2, an anVar) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            HitBuilders.TimingBuilder value = new HitBuilders.TimingBuilder().setCategory(str2).setValue(d2.longValue());
            if (anVar.hasKey("name")) {
                value.setVariable(anVar.getString("name"));
            }
            if (anVar.hasKey("label")) {
                value.setLabel(anVar.getString("label"));
            }
            tracker.send(value.build());
        }
    }

    @al
    public void trackPurchaseEvent(String str, an anVar, an anVar2, String str2, String str3) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.send(new HitBuilders.EventBuilder().addProduct(getPurchaseProduct(anVar)).setProductAction(getPurchaseTransaction(anVar2)).setCategory(str2).setAction(str3).build());
        }
    }

    @al
    public void trackMultiProductsPurchaseEvent(String str, am amVar, an anVar, String str2, String str3) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            HitBuilders.EventBuilder action = new HitBuilders.EventBuilder().setProductAction(getPurchaseTransaction(anVar)).setCategory(str2).setAction(str3);
            for (int i = 0; i < amVar.size(); i++) {
                action.addProduct(getPurchaseProduct(amVar.c(i)));
            }
            tracker.send(action.build());
        }
    }

    private ProductAction getPurchaseTransaction(an anVar) {
        return new ProductAction(ProductAction.ACTION_PURCHASE).setTransactionId(anVar.getString("id")).setTransactionTax(anVar.getDouble("tax")).setTransactionRevenue(anVar.getDouble("revenue")).setTransactionShipping(anVar.getDouble("shipping")).setTransactionCouponCode(anVar.getString("couponCode")).setTransactionAffiliation(anVar.getString("affiliation"));
    }

    private Product getPurchaseProduct(an anVar) {
        Product category = new Product().setId(anVar.getString("id")).setName(anVar.getString("name")).setBrand(anVar.getString("brand")).setPrice(anVar.getDouble("price")).setQuantity(anVar.getInt("quantity")).setVariant(anVar.getString("variant")).setCategory(anVar.getString("category"));
        if (anVar.hasKey("couponCode")) {
            category.setCouponCode(anVar.getString("couponCode"));
        }
        return category;
    }

    @al
    public void trackException(String str, String str2, Boolean bool) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.send(new HitBuilders.ExceptionBuilder().setDescription(str2).setFatal(bool.booleanValue()).build());
        }
    }

    @al
    public void setUser(String str, String str2) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.set("&uid", str2);
        }
    }

    @al
    public void allowIDFA(String str, Boolean bool) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.enableAdvertisingIdCollection(bool.booleanValue());
        }
    }

    @al
    public void trackSocialInteraction(String str, String str2, String str3, String str4) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.send(new HitBuilders.SocialBuilder().setNetwork(str2).setAction(str3).setTarget(str4).build());
        }
    }

    @al
    public void trackScreenViewWithCustomDimensionValues(String str, String str2, an anVar) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.setScreenName(str2);
            HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
            ReadableMapKeySetIterator a2 = anVar.a();
            while (a2.hasNextKey()) {
                String nextKey = a2.nextKey();
                screenViewBuilder.setCustomDimension(Integer.parseInt(nextKey), anVar.getString(nextKey));
            }
            tracker.send(screenViewBuilder.build());
        }
    }

    @al
    public void trackEventWithCustomDimensionValues(String str, String str2, String str3, an anVar, an anVar2) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            HitBuilders.EventBuilder action = new HitBuilders.EventBuilder().setCategory(str2).setAction(str3);
            if (anVar.hasKey("label")) {
                action.setLabel(anVar.getString("label"));
            }
            if (anVar.hasKey("value")) {
                action.setValue(anVar.getInt("value"));
            }
            ReadableMapKeySetIterator a2 = anVar2.a();
            while (a2.hasNextKey()) {
                String nextKey = a2.nextKey();
                action.setCustomDimension(Integer.parseInt(nextKey), anVar2.getString(nextKey));
            }
            tracker.send(action.build());
        }
    }

    @al
    public void setDryRun(Boolean bool) {
        GoogleAnalytics analyticsInstance = getAnalyticsInstance();
        if (analyticsInstance != null) {
            analyticsInstance.setDryRun(bool.booleanValue());
        }
    }

    @al
    public void setDispatchInterval(Integer num) {
        GoogleAnalytics analyticsInstance = getAnalyticsInstance();
        if (analyticsInstance != null) {
            analyticsInstance.setLocalDispatchPeriod(num.intValue());
        }
    }

    @al
    public void setTrackUncaughtExceptions(String str, Boolean bool) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.enableExceptionReporting(bool.booleanValue());
        }
    }

    @al
    public void setAnonymizeIp(String str, Boolean bool) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.setAnonymizeIp(bool.booleanValue());
        }
    }

    @al
    public void setOptOut(Boolean bool) {
        GoogleAnalytics analyticsInstance = getAnalyticsInstance();
        if (analyticsInstance != null) {
            analyticsInstance.setAppOptOut(bool.booleanValue());
        }
    }

    @al
    public void setAppName(String str, String str2) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.setAppName(str2);
        }
    }

    @al
    public void setAppVersion(String str, String str2) {
        Tracker tracker = getTracker(str);
        if (tracker != null) {
            tracker.setAppVersion(str2);
        }
    }
}
