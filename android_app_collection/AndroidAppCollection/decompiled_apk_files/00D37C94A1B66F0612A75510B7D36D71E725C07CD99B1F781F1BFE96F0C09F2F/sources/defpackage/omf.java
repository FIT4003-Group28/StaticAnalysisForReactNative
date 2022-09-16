package defpackage;

import android.view.View;
import android.webkit.WebChromeClient;
/* compiled from: PG */
/* renamed from: omf  reason: default package */
/* loaded from: classes3.dex */
public final class omf {
    public final View a;
    public final WebChromeClient.CustomViewCallback b;

    public omf(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view != null) {
            this.a = view;
            if (customViewCallback != null) {
                this.b = customViewCallback;
                return;
            }
            throw new NullPointerException("Null callback");
        }
        throw new NullPointerException("Null customView");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omf) {
            omf omfVar = (omf) obj;
            if (this.a.equals(omfVar.a) && this.b.equals(omfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("CustomViewSession{customView=");
        sb.append(valueOf);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public omf() {
    }
}
