package defpackage;

import android.app.Application;
import android.net.Uri;
import android.webkit.MimeTypeMap;
/* compiled from: PG */
/* renamed from: bcpp  reason: default package */
/* loaded from: classes3.dex */
public final class bcpp implements bcpe {
    private final Application a;

    public bcpp(Application application) {
        this.a = application;
    }

    @dzsi
    private final Uri c(String str) {
        bvrj.UI_THREAD.d();
        return bcpo.a(this.a, str, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str)));
    }

    @Override // defpackage.bcpe
    @dzsi
    public final Uri a(Uri uri) {
        char c;
        bvrj.UI_THREAD.d();
        String e = dbsj.e(uri.getScheme());
        int hashCode = e.hashCode();
        if (hashCode != 3143036) {
            if (hashCode == 951530617 && e.equals("content")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (e.equals("file")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return null;
            }
            try {
                btou btouVar = new btou(this.a, uri, "_data");
                Uri uri2 = (Uri) btouVar.g(btouVar.a("_data")).h(bcpl.a).h(bcpm.a).f();
                btouVar.close();
                return uri2;
            } catch (btnx unused) {
                return null;
            }
        }
        return uri;
    }

    @Override // defpackage.bcpe
    @dzsi
    public final Uri b(Uri uri) {
        char c;
        bvrj.UI_THREAD.d();
        String path = uri.getPath();
        String e = dbsj.e(uri.getScheme());
        int hashCode = e.hashCode();
        if (hashCode != 3143036) {
            if (hashCode == 951530617 && e.equals("content")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (e.equals("file")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            if (path != null) {
                return c(path);
            }
            return null;
        } else if (c != 1) {
            return null;
        } else {
            if (!this.a.getPackageName().equals(uri.getAuthority())) {
                return uri;
            }
            if (path != null) {
                return c(path.replace("/photos", ""));
            }
            return null;
        }
    }
}
