package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: alfc  reason: default package */
/* loaded from: classes.dex */
public final class alfc {
    public Uri a;
    public String b;
    public avuk c;
    public Boolean d;
    public Uri e;
    public alda f;
    public arxl g;
    public algb h;
    public String i;
    public Bitmap j;
    public String k;
    public awbb l;
    public alcx m;
    public alcp n;
    public amuk o;
    public int p;

    public final Uri a() {
        Uri uri = this.a;
        if (uri != null) {
            return uri;
        }
        throw new IllegalStateException("Property \"sourceUri\" has not been set");
    }

    public final Uri b() {
        Uri uri = this.e;
        if (uri != null) {
            return uri;
        }
        throw new IllegalStateException("Property \"uploadUri\" has not been set");
    }

    public final alda c() {
        alda aldaVar = this.f;
        if (aldaVar != null) {
            return aldaVar;
        }
        throw new IllegalStateException("Property \"uploadMetadataProto\" has not been set");
    }

    public final avuk d() {
        avuk avukVar = this.c;
        if (avukVar != null) {
            return avukVar;
        }
        throw new IllegalStateException("Property \"uploadFlowSource\" has not been set");
    }

    public final String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"frontendUploadId\" has not been set");
    }

    public final void g(Uri uri) {
        if (uri != null) {
            this.e = uri;
            return;
        }
        throw new NullPointerException("Null uploadUri");
    }

    public final int h() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"uploadFlowFlavor\" has not been set");
    }

    public final boolean f() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("Property \"isShortsEligible\" has not been set");
        }
        return bool.booleanValue();
    }
}
