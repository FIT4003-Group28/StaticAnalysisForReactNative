package org.chromium.net;

import org.chromium.net.BidirectionalStream;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class Builder extends BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        /* renamed from: addHeader  reason: collision with other method in class */
        public abstract Builder mo24addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        /* renamed from: build  reason: collision with other method in class */
        public abstract ExperimentalBidirectionalStream mo25build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        /* renamed from: delayRequestHeadersUntilFirstFlush  reason: collision with other method in class */
        public abstract Builder mo26delayRequestHeadersUntilFirstFlush(boolean z);

        @Override // org.chromium.net.BidirectionalStream.Builder
        /* renamed from: setHttpMethod  reason: collision with other method in class */
        public abstract Builder mo27setHttpMethod(String str);

        @Override // org.chromium.net.BidirectionalStream.Builder
        /* renamed from: setPriority  reason: collision with other method in class */
        public abstract Builder mo28setPriority(int i);

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
