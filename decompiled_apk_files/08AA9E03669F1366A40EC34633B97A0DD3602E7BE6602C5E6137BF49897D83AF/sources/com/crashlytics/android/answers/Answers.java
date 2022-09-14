package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.o;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;
import java.io.File;
/* loaded from: classes.dex */
public class Answers extends i<Boolean> {
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String TAG = "Answers";
    SessionAnalyticsManager analyticsManager;
    boolean firebaseEnabled = false;

    @Override // b.a.a.a.i
    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    @Override // b.a.a.a.i
    public String getVersion() {
        return "1.4.2.25";
    }

    public static Answers getInstance() {
        return (Answers) c.a(Answers.class);
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onCustom(customEvent);
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(purchaseEvent);
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(loginEvent);
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(shareEvent);
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(inviteEvent);
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(signUpEvent);
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(levelStartEvent);
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(levelEndEvent);
        }
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(addToCartEvent);
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(startCheckoutEvent);
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(ratingEvent);
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(contentViewEvent);
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        }
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else if (this.analyticsManager == null) {
        } else {
            this.analyticsManager.onPredefined(searchEvent);
        }
    }

    public void onException(j.b bVar) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onError(bVar.a());
        }
    }

    public void onException(j.a aVar) {
        if (this.analyticsManager != null) {
            this.analyticsManager.onCrash(aVar.a(), aVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    @SuppressLint({"NewApi"})
    public boolean onPreExecute() {
        long lastModified;
        try {
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (Build.VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.analyticsManager = SessionAnalyticsManager.build(this, context, getIdManager(), num, str, lastModified);
            this.analyticsManager.enable();
            this.firebaseEnabled = new o().b(context);
            return true;
        } catch (Exception e) {
            c.h().e(TAG, "Error retrieving app properties", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // b.a.a.a.i
    /* renamed from: doInBackground */
    public Boolean mo24doInBackground() {
        try {
            t b2 = q.a().b();
            if (b2 == null) {
                c.h().e(TAG, "Failed to retrieve settings");
                return false;
            } else if (b2.f1244d.f1219d) {
                c.h().a(TAG, "Analytics collection enabled");
                this.analyticsManager.setAnalyticsSettingsData(b2.e, getOverridenSpiEndpoint());
                return true;
            } else {
                c.h().a(TAG, "Analytics collection disabled");
                this.analyticsManager.disable();
                return false;
            }
        } catch (Exception e) {
            c.h().e(TAG, "Error dealing with settings", e);
            return false;
        }
    }

    String getOverridenSpiEndpoint() {
        return b.a.a.a.a.b.i.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        l h = c.h();
        h.d(TAG, "Method " + str + " is not supported when using Crashlytics through Firebase.");
    }
}
