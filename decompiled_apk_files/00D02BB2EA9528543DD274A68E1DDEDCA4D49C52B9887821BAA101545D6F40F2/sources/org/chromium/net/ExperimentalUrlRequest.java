package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class Builder extends UrlRequest.Builder {
        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: addHeader */
        public abstract Builder mo41addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: allowDirectExecutor */
        public abstract Builder mo42allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: build */
        public abstract ExperimentalUrlRequest mo43build();

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: disableCache */
        public abstract Builder mo44disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: setHttpMethod */
        public abstract Builder mo45setHttpMethod(String str);

        @Override // org.chromium.net.UrlRequest.Builder
        /* renamed from: setPriority */
        public abstract Builder mo46setPriority(int i);

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
        public abstract Builder mo47setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
