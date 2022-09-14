package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f4936a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Uri> f4937b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f4938c;

    /* renamed from: d  reason: collision with root package name */
    private String f4939d;

    public e(ReadableArray readableArray, ArrayList<String> arrayList, ReactApplicationContext reactApplicationContext) {
        this.f4937b = new ArrayList<>();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                this.f4937b.add(Uri.parse(string));
            }
        }
        this.f4938c = arrayList;
        this.f4936a = reactApplicationContext;
    }

    public e(ReadableArray readableArray, ArrayList<String> arrayList, String str, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, reactApplicationContext);
        this.f4939d = str;
    }

    private String a(Uri uri) {
        return b.a(this.f4936a, uri);
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private boolean b(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f4939d;
        if (str != null) {
            if (!str.equalsIgnoreCase(substring) && this.f4939d.split("/")[0].equalsIgnoreCase(substring.split("/")[0])) {
                substring = this.f4939d.split("/")[0].concat("/*");
            } else if (this.f4939d.equalsIgnoreCase(substring)) {
                return true;
            } else {
                substring = "*/*";
            }
        }
        this.f4939d = substring;
        return true;
    }

    private boolean c(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String a2 = a(uri.toString());
        if (a2 == null) {
            a2 = a(a(uri));
        }
        String str = "*/*";
        if (a2 == null) {
            a2 = str;
        }
        String str2 = this.f4939d;
        if (str2 == null) {
            this.f4939d = a2;
            return true;
        }
        if (!str2.equalsIgnoreCase(a2) && this.f4939d.split("/")[0].equalsIgnoreCase(a2.split("/")[0])) {
            str = this.f4939d.split("/")[0].concat("/*");
        } else if (this.f4939d.equalsIgnoreCase(a2)) {
            return true;
        }
        this.f4939d = str;
        return true;
    }

    public String a() {
        String str = this.f4939d;
        return str == null ? "*/*" : str;
    }

    public ArrayList<Uri> b() {
        ReactApplicationContext reactApplicationContext;
        File file;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f4937b.size(); i++) {
            Uri uri = this.f4937b.get(i);
            if (b(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f4938c.size() >= i + 1 ? this.f4938c.get(i) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file2 = new File(Environment.getExternalStorageDirectory(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file2.exists() && !file2.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file2.getAbsolutePath());
                        break;
                    }
                    File file3 = new File(file2, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(b.a(this.f4936a, file3));
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else if (c(uri) && uri.getPath() != null) {
                if (this.f4938c.size() >= i + 1) {
                    reactApplicationContext = this.f4936a;
                    file = new File(uri.getPath(), this.f4938c.get(i));
                } else {
                    reactApplicationContext = this.f4936a;
                    file = new File(uri.getPath());
                }
                arrayList.add(b.a(reactApplicationContext, file));
            }
        }
        return arrayList;
    }

    public boolean c() {
        Iterator<Uri> it = this.f4937b.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Uri next = it.next();
            if (b(next) || c(next)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                break;
            }
        }
        return z;
    }
}
