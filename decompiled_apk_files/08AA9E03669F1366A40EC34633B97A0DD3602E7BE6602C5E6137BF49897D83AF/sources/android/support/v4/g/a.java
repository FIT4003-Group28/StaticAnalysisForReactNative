package android.support.v4.g;

import android.support.v4.i.k;
import android.util.Base64;
import java.util.List;
/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f387a;

    /* renamed from: b  reason: collision with root package name */
    private final String f388b;

    /* renamed from: c  reason: collision with root package name */
    private final String f389c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f390d;
    private final int e = 0;
    private final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f387a = (String) k.a(str);
        this.f388b = (String) k.a(str2);
        this.f389c = (String) k.a(str3);
        this.f390d = (List) k.a(list);
        this.f = this.f387a + "-" + this.f388b + "-" + this.f389c;
    }

    public String a() {
        return this.f387a;
    }

    public String b() {
        return this.f388b;
    }

    public String c() {
        return this.f389c;
    }

    public List<List<byte[]>> d() {
        return this.f390d;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f387a + ", mProviderPackage: " + this.f388b + ", mQuery: " + this.f389c + ", mCertificates:");
        for (int i = 0; i < this.f390d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f390d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
