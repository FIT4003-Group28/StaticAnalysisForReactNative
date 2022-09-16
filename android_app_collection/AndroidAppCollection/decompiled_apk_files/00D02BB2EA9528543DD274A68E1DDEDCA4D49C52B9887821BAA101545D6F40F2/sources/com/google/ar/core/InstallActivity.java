package com.google.ar.core;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, 16974394);
    private dbaz lastEvent = dbaz.CANCELLED;

    public void animateToSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new dbaw(this, width, i, height));
        ofFloat.addListener(new dbax(this));
        ofFloat.start();
    }

    public void closeInstaller() {
        startActivity(new Intent(this, InstallActivity.class).setFlags(67108864));
    }

    public void finishWithFailure(Exception exc) {
        dbao.a.b = exc;
        dbao.a.b();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        return this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL;
    }

    private void showEducationDialog() {
        setContentView(com.google.android.apps.maps.R.layout.__arcore_education);
        findViewById(com.google.android.apps.maps.R.id.__arcore_cancelButton).setOnClickListener(new dbau(this));
        if (!isOptional()) {
            findViewById(com.google.android.apps.maps.R.id.__arcore_cancelButton).setVisibility(8);
        }
        findViewById(com.google.android.apps.maps.R.id.__arcore_continueButton).setOnClickListener(new dbav(this));
        TextView textView = (TextView) findViewById(com.google.android.apps.maps.R.id.__arcore_messageText);
        dbaz dbazVar = dbaz.ACCEPTED;
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() == 1) {
            textView.setText(com.google.android.apps.maps.R.string.__arcore_install_feature);
        } else {
            textView.setText(com.google.android.apps.maps.R.string.__arcore_install_app);
        }
    }

    public void showSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(com.google.android.apps.maps.R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = dbaz.CANCELLED;
        dbba a = dbao.a.a(this);
        dbay dbayVar = new dbay(this);
        dbbk dbbkVar = (dbbk) a;
        if (dbbkVar.d == null) {
            dbbkVar.c = getPackageManager().getPackageInstaller();
            dbbkVar.d = new dbbe(dbbkVar, dbayVar);
            dbbkVar.c.registerSessionCallback(dbbkVar.d);
        }
        if (dbbkVar.a == null) {
            dbbkVar.a = new dbbf(dbayVar);
            dbbkVar.b = this;
            dbbkVar.b.registerReceiver(dbbkVar.a, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            ((dbbk) a).f(new dbbi((dbbk) a, this, dbayVar));
        } catch (dbbj unused) {
            dbbk.g(this, dbayVar);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder(27);
        sb.append("activityResult: ");
        sb.append(i2);
        sb.toString();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                finishWithFailure(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra(MESSAGE_TYPE_KEY);
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(16974394);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    showSpinner();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                dbao.a.a(this).c(this, new dbat(atomicReference));
                dbaz dbazVar = dbaz.ACCEPTED;
                if (((ArCoreApk.Availability) atomicReference.get()).ordinal() == 3) {
                    finishWithFailure(new UnavailableDeviceNotCompatibleException());
                    return;
                } else {
                    showEducationDialog();
                    return;
                }
            }
            finishWithFailure(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e) {
            finishWithFailure(new FatalException("Exception starting install flow", e));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            dbao.a.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType != ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                return;
            }
            startInstaller();
        } else if (this.finished) {
        } else {
            synchronized (this) {
                if (this.lastEvent == dbaz.CANCELLED) {
                    finish();
                } else if (this.lastEvent == dbaz.ACCEPTED) {
                    this.waitingForCompletion = true;
                } else {
                    finishWithFailure(dbao.a.b);
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }
}
