package com.spotify.protocol.types;

import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface Types {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class RequestId {
        public static final RequestId NONE = new RequestId(-1);
        private final int mValue;

        private RequestId(int i) {
            this.mValue = i;
        }

        public static RequestId from(int i) {
            return new RequestId(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.mValue == ((RequestId) obj).mValue;
        }

        public int getRaw() {
            return this.mValue;
        }

        public int hashCode() {
            return this.mValue;
        }

        public String toString() {
            return String.format(Locale.US, "RequestId{%d}", Integer.valueOf(this.mValue));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SubscriptionId {
        public static final SubscriptionId NONE = new SubscriptionId(-1);
        private final int mValue;

        private SubscriptionId(int i) {
            this.mValue = i;
        }

        public static SubscriptionId from(int i) {
            return new SubscriptionId(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.mValue == ((SubscriptionId) obj).mValue;
        }

        public int getRaw() {
            return this.mValue;
        }

        public int hashCode() {
            return this.mValue;
        }

        public String toString() {
            return String.format(Locale.US, "SubscriptionId{%d}", Integer.valueOf(this.mValue));
        }
    }
}
