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
/* loaded from: classes4.dex */
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableSdch  reason: collision with other method in class */
        public Builder mo559enableSdch(boolean z) {
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: addPublicKeyPins  reason: collision with other method in class */
        public Builder mo552addPublicKeyPins(String str, Set set, boolean z, Date date) {
            super.mo552addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: addQuicHint  reason: collision with other method in class */
        public Builder mo553addQuicHint(String str, int i, int i2) {
            super.mo553addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: build  reason: collision with other method in class */
        public ExperimentalCronetEngine mo554build() {
            return this.mBuilderDelegate.build();
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableHttp2  reason: collision with other method in class */
        public Builder mo555enableHttp2(boolean z) {
            super.mo555enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableHttpCache  reason: collision with other method in class */
        public Builder mo556enableHttpCache(int i, long j) {
            super.mo556enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors  reason: collision with other method in class */
        public Builder mo557enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.mo557enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: enableQuic  reason: collision with other method in class */
        public Builder mo558enableQuic(boolean z) {
            super.mo558enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setLibraryLoader  reason: collision with other method in class */
        public Builder mo560setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.mo560setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setStoragePath  reason: collision with other method in class */
        public Builder mo561setStoragePath(String str) {
            super.mo561setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        /* renamed from: setUserAgent  reason: collision with other method in class */
        public Builder mo562setUserAgent(String str) {
            super.mo562setUserAgent(str);
            return this;
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
    public abstract ExperimentalUrlRequest.Builder mo551newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

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
