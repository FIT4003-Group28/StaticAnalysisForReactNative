package c.d.d.f;

import android.webkit.MimeTypeMap;
import c.d.d.d.f;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MimeTypeMap f2821a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f2822b;

    static {
        f.a("image/heif", "heif", "image/heic", "heic");
        f2822b = f.a("heif", "image/heif", "heic", "image/heic");
    }

    public static String a(String str) {
        String str2 = f2822b.get(str);
        return str2 != null ? str2 : f2821a.getMimeTypeFromExtension(str);
    }
}
