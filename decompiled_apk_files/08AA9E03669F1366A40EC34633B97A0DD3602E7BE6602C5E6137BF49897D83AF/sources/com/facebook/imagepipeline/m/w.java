package com.facebook.imagepipeline.m;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: LocalContentUriFetchProducer.java */
/* loaded from: classes.dex */
public class w extends z {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f2911a = {"_id", "_data"};

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f2912b;

    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "LocalContentUriFetchProducer";
    }

    public w(Executor executor, com.facebook.common.g.h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f2912b = contentResolver;
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        com.facebook.imagepipeline.i.d a2;
        InputStream inputStream;
        Uri b2 = bVar.b();
        if (!com.facebook.common.l.f.d(b2)) {
            return (!com.facebook.common.l.f.e(b2) || (a2 = a(b2)) == null) ? b(this.f2912b.openInputStream(b2), -1) : a2;
        }
        if (b2.toString().endsWith("/photo")) {
            inputStream = this.f2912b.openInputStream(b2);
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f2912b, b2);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + b2);
            }
            inputStream = openContactPhotoInputStream;
        }
        return b(inputStream, -1);
    }

    private com.facebook.imagepipeline.i.d a(Uri uri) {
        Cursor query = this.f2912b.query(uri, f2911a, null, null, null);
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

    private static int a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }
}
