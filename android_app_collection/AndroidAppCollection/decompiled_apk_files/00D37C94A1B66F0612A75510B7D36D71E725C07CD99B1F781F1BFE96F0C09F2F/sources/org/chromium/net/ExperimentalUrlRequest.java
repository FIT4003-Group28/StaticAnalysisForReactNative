package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public abstract class Builder extends UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: addHeader */
        public abstract Builder mo563addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: allowDirectExecutor */
        public abstract Builder mo564allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: build */
        public abstract ExperimentalUrlRequest mo565build();

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: disableCache */
        public abstract Builder mo566disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: setHttpMethod */
        public abstract Builder mo567setHttpMethod(String str);

        public Builder setIdempotency(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: setPriority */
        public abstract Builder mo568setPriority(int i);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: setUploadDataProvider */
        public abstract Builder mo569setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
