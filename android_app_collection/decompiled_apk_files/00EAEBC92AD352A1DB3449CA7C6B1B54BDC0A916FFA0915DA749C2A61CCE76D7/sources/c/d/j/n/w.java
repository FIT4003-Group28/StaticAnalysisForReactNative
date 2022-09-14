package c.d.j.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class w extends z {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f3604d = {"_id", "_data"};

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f3605c;

    public w(Executor executor, c.d.d.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3605c = contentResolver;
    }

    private static int a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private c.d.j.k.d a(Uri uri) {
        Cursor query = this.f3605c.query(uri, f3604d, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string == null) {
                return null;
            }
            return b(new FileInputStream(string), a(string));
        } finally {
            query.close();
        }
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        c.d.j.k.d a2;
        InputStream createInputStream;
        Uri p = cVar.p();
        if (!c.d.d.k.f.e(p)) {
            return (!c.d.d.k.f.d(p) || (a2 = a(p)) == null) ? b(this.f3605c.openInputStream(p), -1) : a2;
        }
        if (p.toString().endsWith("/photo")) {
            createInputStream = this.f3605c.openInputStream(p);
        } else if (p.toString().endsWith("/display_photo")) {
            try {
                createInputStream = this.f3605c.openAssetFileDescriptor(p, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + p);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f3605c, p);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + p);
            }
            createInputStream = openContactPhotoInputStream;
        }
        return b(createInputStream, -1);
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "LocalContentUriFetchProducer";
    }
}
