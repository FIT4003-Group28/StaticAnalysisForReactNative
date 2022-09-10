package org.chromium.net;

import android.content.Context;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: addPublicKeyPins */
        public /* bridge */ /* synthetic */ CronetEngine.Builder mo30addPublicKeyPins(String str, Set set, boolean z, Date date) {
            return mo30addPublicKeyPins(str, (Set<byte[]>) set, z, date);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: addPublicKeyPins  reason: collision with other method in class */
        public Builder mo30addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.mo30addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: addQuicHint  reason: collision with other method in class */
        public Builder mo31addQuicHint(String str, int i, int i2) {
            super.mo31addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: build  reason: collision with other method in class */
        public ExperimentalCronetEngine mo32build() {
            return this.mBuilderDelegate.build();
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableHttp2  reason: collision with other method in class */
        public Builder mo33enableHttp2(boolean z) {
            super.mo33enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableHttpCache  reason: collision with other method in class */
        public Builder mo34enableHttpCache(int i, long j) {
            super.mo34enableHttpCache(i, j);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors  reason: collision with other method in class */
        public Builder mo35enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.mo35enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableQuic  reason: collision with other method in class */
        public Builder mo36enableQuic(boolean z) {
            super.mo36enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableSdch  reason: collision with other method in class */
        public Builder mo37enableSdch(boolean z) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setLibraryLoader  reason: collision with other method in class */
        public Builder mo38setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.mo38setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setStoragePath  reason: collision with other method in class */
        public Builder mo39setStoragePath(String str) {
            super.mo39setStoragePath(str);
            return this;
        }

        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setUserAgent  reason: collision with other method in class */
        public Builder mo40setUserAgent(String str) {
            super.mo40setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // org.chromium.net.CronetEngine
    /* renamed from: newUrlRequestBuilder */
    public abstract ExperimentalUrlRequest.Builder mo29newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }
}
