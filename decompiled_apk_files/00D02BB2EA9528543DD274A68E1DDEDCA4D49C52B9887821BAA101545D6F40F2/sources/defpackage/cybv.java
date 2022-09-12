package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: cybv  reason: default package */
/* loaded from: classes5.dex */
public final class cybv extends cydr {
    public int a;
    public int b;
    private cyds c;

    public cybv() {
    }

    public cybv(AutocompletionCallbackMetadata autocompletionCallbackMetadata) {
        this.a = autocompletionCallbackMetadata.c();
        this.b = autocompletionCallbackMetadata.d();
        this.c = autocompletionCallbackMetadata.a();
    }

    @Override // defpackage.cydr
    public final void b(cyds cydsVar) {
        if (cydsVar != null) {
            this.c = cydsVar;
            return;
        }
        throw new NullPointerException("Null callbackDelayStatus");
    }

    @Override // defpackage.cydr
    public final AutocompletionCallbackMetadata a() {
        String str = this.a == 0 ? " currentCacheStatus" : "";
        if (this.b == 0) {
            str = str.concat(" currentNetworkState");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" callbackDelayStatus");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_AutocompletionCallbackMetadata(this.a, this.b, this.c);
    }
}
