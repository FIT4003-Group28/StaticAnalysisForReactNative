package c.a.a.v;

import c.a.a.v.k.n;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<n> f2437a;

    /* renamed from: b  reason: collision with root package name */
    private final char f2438b;

    /* renamed from: c  reason: collision with root package name */
    private final double f2439c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2440d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2441e;

    public d(List<n> list, char c2, double d2, double d3, String str, String str2) {
        this.f2437a = list;
        this.f2438b = c2;
        this.f2439c = d3;
        this.f2440d = str;
        this.f2441e = str2;
    }

    public static int a(char c2, String str, String str2) {
        return ((((0 + c2) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<n> a() {
        return this.f2437a;
    }

    public double b() {
        return this.f2439c;
    }

    public int hashCode() {
        return a(this.f2438b, this.f2441e, this.f2440d);
    }
}
