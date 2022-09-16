package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_AutocompletionCallbackMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_AutocompletionCallbackMetadata extends AutocompletionCallbackMetadata {
    public final cyds a;
    public final int b;
    public final int c;

    public C$AutoValue_AutocompletionCallbackMetadata(int i, int i2, cyds cydsVar) {
        if (i != 0) {
            this.b = i;
            if (i2 != 0) {
                this.c = i2;
                if (cydsVar != null) {
                    this.a = cydsVar;
                    return;
                }
                throw new NullPointerException("Null callbackDelayStatus");
            }
            throw new NullPointerException("Null currentNetworkState");
        }
        throw new NullPointerException("Null currentCacheStatus");
    }

    @Override // com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata
    public final cyds a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata
    public final cydr b() {
        return new cybv(this);
    }

    @Override // com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata
    public final int c() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata
    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletionCallbackMetadata) {
            AutocompletionCallbackMetadata autocompletionCallbackMetadata = (AutocompletionCallbackMetadata) obj;
            if (this.b == autocompletionCallbackMetadata.c() && this.c == autocompletionCallbackMetadata.d() && this.a.equals(autocompletionCallbackMetadata.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NOT_RELEVANT" : "ON_DISK" : "EMPTY" : "PARTIAL" : "FULL";
        int i2 = this.c;
        String str2 = i2 != 1 ? i2 != 2 ? "NOT_ATTEMPTED" : "NOT_CONNECTED" : "CONNECTED";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 95 + str2.length() + String.valueOf(valueOf).length());
        sb.append("AutocompletionCallbackMetadata{currentCacheStatus=");
        sb.append(str);
        sb.append(", currentNetworkState=");
        sb.append(str2);
        sb.append(", callbackDelayStatus=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
