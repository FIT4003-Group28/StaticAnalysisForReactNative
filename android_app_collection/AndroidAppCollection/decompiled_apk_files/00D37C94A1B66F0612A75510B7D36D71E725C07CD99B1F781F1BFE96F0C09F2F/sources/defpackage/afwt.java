package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afwt  reason: default package */
/* loaded from: classes.dex */
public final class afwt {
    public final String a;
    public Uri b;
    public byte[] c;
    public boolean d;
    public long e;
    public Map f;
    public afvm g;
    public String h;
    public final afws i;
    public afxt j;
    public final int k;

    public afwt(int i, String str) {
        this.c = null;
        this.d = false;
        this.i = afws.a;
        this.j = afxt.b;
        this.k = i;
        this.a = str;
    }

    public final void a(afxt afxtVar) {
        if (afxtVar == null) {
            afxtVar = afxt.b;
        }
        this.j = afxtVar;
    }

    public final void b(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public afwt(byte[] bArr, String str) {
        this.c = null;
        this.d = false;
        this.i = afws.a;
        this.j = afxt.b;
        this.k = 2;
        this.c = bArr;
        this.a = str;
    }
}
