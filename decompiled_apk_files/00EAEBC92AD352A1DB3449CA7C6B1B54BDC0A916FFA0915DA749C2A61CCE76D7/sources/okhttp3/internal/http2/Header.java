package okhttp3.internal.http2;

import h.f;
import okhttp3.Headers;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
public final class Header {
    final int hpackSize;
    public final f name;
    public final f value;
    public static final f PSEUDO_PREFIX = f.d(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final f RESPONSE_STATUS = f.d(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final f TARGET_METHOD = f.d(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final f TARGET_PATH = f.d(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final f TARGET_SCHEME = f.d(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final f TARGET_AUTHORITY = f.d(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(f fVar, f fVar2) {
        this.name = fVar;
        this.value = fVar2;
        this.hpackSize = fVar.g() + 32 + fVar2.g();
    }

    public Header(f fVar, String str) {
        this(fVar, f.d(str));
    }

    public Header(String str, String str2) {
        this(f.d(str), f.d(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return this.name.equals(header.name) && this.value.equals(header.value);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format("%s: %s", this.name.m(), this.value.m());
    }
}
