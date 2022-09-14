package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f4931a;

    /* renamed from: b  reason: collision with root package name */
    private String f4932b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f4933c;

    /* renamed from: d  reason: collision with root package name */
    private String f4934d;

    /* renamed from: e  reason: collision with root package name */
    private String f4935e;

    public d(String str, String str2, ReactApplicationContext reactApplicationContext) {
        this.f4932b = str;
        this.f4933c = Uri.parse(this.f4932b);
        this.f4931a = reactApplicationContext;
        this.f4935e = str2;
    }

    public d(String str, String str2, String str3, ReactApplicationContext reactApplicationContext) {
        this(str, str3, reactApplicationContext);
        this.f4934d = str2;
        this.f4935e = str3;
    }

    private String a(Uri uri) {
        return b.a(this.f4931a, uri);
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private boolean d() {
        if (this.f4933c.getScheme() == null || !this.f4933c.getScheme().equals("data")) {
            return false;
        }
        this.f4934d = this.f4933c.getSchemeSpecificPart().substring(0, this.f4933c.getSchemeSpecificPart().indexOf(";"));
        return true;
    }

    private boolean e() {
        if (this.f4933c.getScheme() == null || (!this.f4933c.getScheme().equals("content") && !this.f4933c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f4934d != null) {
            return true;
        }
        this.f4934d = a(this.f4933c.toString());
        if (this.f4934d == null) {
            String a2 = a(this.f4933c);
            if (a2 == null) {
                return false;
            }
            this.f4934d = a(a2);
        }
        if (this.f4934d == null) {
            this.f4934d = "*/*";
        }
        return true;
    }

    public String a() {
        String str = this.f4934d;
        return str == null ? "*/*" : str;
    }

    public Uri b() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(a());
        if (d()) {
            String substring = this.f4933c.getSchemeSpecificPart().substring(this.f4933c.getSchemeSpecificPart().indexOf(";base64,") + 8);
            String str = this.f4935e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(Environment.getExternalStorageDirectory(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return b.a(this.f4931a, file2);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else if (e()) {
            Uri parse = Uri.parse(this.f4932b);
            if (parse.getPath() != null) {
                return b.a(this.f4931a, new File(parse.getPath()));
            }
            return null;
        }
        return null;
    }

    public boolean c() {
        return d() || e();
    }
}
