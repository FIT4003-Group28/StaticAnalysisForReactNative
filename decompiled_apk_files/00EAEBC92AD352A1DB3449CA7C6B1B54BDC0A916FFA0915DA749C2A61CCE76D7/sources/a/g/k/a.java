package a.g.k;

import android.util.Base64;
import androidx.core.util.g;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f227a;

    /* renamed from: b  reason: collision with root package name */
    private final String f228b;

    /* renamed from: c  reason: collision with root package name */
    private final String f229c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f230d;

    /* renamed from: e  reason: collision with root package name */
    private final int f231e;

    /* renamed from: f  reason: collision with root package name */
    private final String f232f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        g.a(str);
        this.f227a = str;
        g.a(str2);
        this.f228b = str2;
        g.a(str3);
        this.f229c = str3;
        g.a(list);
        this.f230d = list;
        this.f231e = 0;
        this.f232f = this.f227a + "-" + this.f228b + "-" + this.f229c;
    }

    public List<List<byte[]>> a() {
        return this.f230d;
    }

    public int b() {
        return this.f231e;
    }

    public String c() {
        return this.f232f;
    }

    public String d() {
        return this.f227a;
    }

    public String e() {
        return this.f228b;
    }

    public String f() {
        return this.f229c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f227a + ", mProviderPackage: " + this.f228b + ", mQuery: " + this.f229c + ", mCertificates:");
        for (int i = 0; i < this.f230d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f230d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f231e);
        return sb.toString();
    }
}
