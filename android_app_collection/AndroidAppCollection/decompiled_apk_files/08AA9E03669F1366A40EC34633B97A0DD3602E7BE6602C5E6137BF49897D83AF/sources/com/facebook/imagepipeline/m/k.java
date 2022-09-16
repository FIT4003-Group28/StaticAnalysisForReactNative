package com.facebook.imagepipeline.m;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
/* compiled from: DataFetchProducer.java */
/* loaded from: classes.dex */
public class k extends z {
    @Override // com.facebook.imagepipeline.m.z
    protected String a() {
        return "DataFetchProducer";
    }

    public k(com.facebook.common.g.h hVar) {
        super(com.facebook.common.b.a.a(), hVar);
    }

    @Override // com.facebook.imagepipeline.m.z
    protected com.facebook.imagepipeline.i.d a(com.facebook.imagepipeline.n.b bVar) {
        byte[] a2 = a(bVar.b().toString());
        return a(new ByteArrayInputStream(a2), a2.length);
    }

    static byte[] a(String str) {
        com.facebook.common.d.i.a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (b(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        return Uri.decode(substring).getBytes();
    }

    static boolean b(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }
}
