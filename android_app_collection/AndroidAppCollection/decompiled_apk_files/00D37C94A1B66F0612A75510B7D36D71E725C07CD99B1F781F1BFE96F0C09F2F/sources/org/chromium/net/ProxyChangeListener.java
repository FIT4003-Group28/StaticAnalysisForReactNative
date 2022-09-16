package org.chromium.net;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.chromium.net.ProxyChangeListener;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class ProxyReceiver extends BroadcastReceiver {
        public ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        badq extractNewProxy;
                        ProxyChangeListener.ProxyReceiver proxyReceiver = ProxyChangeListener.ProxyReceiver.this;
                        Intent intent2 = intent;
                        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                        extractNewProxy = ProxyChangeListener.extractNewProxy(intent2);
                        proxyChangeListener.proxySettingsChanged(extractNewProxy);
                    }
                });
            }
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    private void assertOnThread() {
    }

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static badq extractNewProxy(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return badq.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    private badq getProxyConfig(Intent intent) {
        ProxyInfo defaultProxy = ((ConnectivityManager) babj.c.getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy == null) {
            return badq.a;
        }
        if (Build.VERSION.SDK_INT < 29 || !defaultProxy.getHost().equals("localhost") || defaultProxy.getPort() != -1) {
            return badq.a(defaultProxy);
        }
        return extractNewProxy(intent);
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(badq badqVar) {
        if (!sEnabled) {
            return;
        }
        Delegate delegate = this.mDelegate;
        if (delegate != null) {
            delegate.proxySettingsChanged();
        }
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        if (badqVar != null) {
            N.MyoFZt$2(j, this, badqVar.b, badqVar.c, badqVar.d, badqVar.e);
        } else {
            N.MCIk73GZ(j, this);
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (Build.VERSION.SDK_INT < 23) {
            babj.c.registerReceiver(this.mProxyReceiver, intentFilter);
            return;
        }
        babj.c.registerReceiver(this.mProxyReceiver, new IntentFilter());
        this.mRealProxyReceiver = new badp(this);
        babj.c.registerReceiver(this.mRealProxyReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    private void unregisterReceiver() {
        babj.c.unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            babj.c.unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$0$ProxyChangeListener(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    public void start(long j) {
        this.mNativePtr = j;
        registerReceiver();
    }

    public void stop() {
        this.mNativePtr = 0L;
        unregisterReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$0$ProxyChangeListener(intent);
            }
        });
    }
}
