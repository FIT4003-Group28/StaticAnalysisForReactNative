package com.google.android.apps.gmm.ugc.post.photo;

import android.net.Uri;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MediaData implements Parcelable {
    public static MediaData i(bbtm bbtmVar, int i) {
        cdue cdueVar = new cdue();
        Uri z = bbtmVar.z();
        if (z != null) {
            cdueVar.a = z;
            dbsg<String> l = bbtmVar.l();
            if (l != null) {
                cdueVar.b = l;
                cdueVar.c = dbsg.j(dbsj.f(bbtmVar.e()));
                dbsg<Integer> g = bbtmVar.g();
                if (g != null) {
                    cdueVar.d = g;
                    dbsg<Integer> h = bbtmVar.h();
                    if (h != null) {
                        cdueVar.e = h;
                        dbsg<Integer> i2 = bbtmVar.i();
                        if (i2 != null) {
                            cdueVar.f = i2;
                            cdueVar.g = i;
                            return cdueVar.a();
                        }
                        throw new NullPointerException("Null orientation");
                    }
                    throw new NullPointerException("Null rawHeightInPxs");
                }
                throw new NullPointerException("Null rawWidthInPxs");
            }
            throw new NullPointerException("Null mediaKey");
        }
        throw new NullPointerException("Null uri");
    }

    public abstract Uri a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract dbsg<Integer> d();

    public abstract dbsg<Integer> e();

    public abstract dbsg<Integer> f();

    public abstract cdyf g();

    public abstract int h();
}
