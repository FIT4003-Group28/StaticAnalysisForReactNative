package c.e.a.b.d.g;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f4164a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(Map<String, Map<String, String>> map) {
        this.f4164a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.f4164a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return map.get(str3);
    }
}
