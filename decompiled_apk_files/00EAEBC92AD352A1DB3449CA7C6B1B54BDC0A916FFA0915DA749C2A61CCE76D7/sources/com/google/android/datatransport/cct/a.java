package com.google.android.datatransport.cct;

import c.e.a.a.b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements c.e.a.a.i.f {

    /* renamed from: c  reason: collision with root package name */
    static final String f6582c = f.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    static final String f6583d = f.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e  reason: collision with root package name */
    private static final String f6584e = f.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f  reason: collision with root package name */
    private static final Set<b> f6585f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.a("proto"), b.a("json"))));

    /* renamed from: g  reason: collision with root package name */
    public static final a f6586g;

    /* renamed from: a  reason: collision with root package name */
    private final String f6587a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6588b;

    static {
        new a(f6582c, null);
        f6586g = new a(f6583d, f6584e);
    }

    public a(String str, String str2) {
        this.f6587a = str;
        this.f6588b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length != 2) {
                throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
            }
            String str2 = split[0];
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            String str3 = split[1];
            if (str3.isEmpty()) {
                str3 = null;
            }
            return new a(str2, str3);
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // c.e.a.a.i.f
    public Set<b> a() {
        return f6585f;
    }

    @Override // c.e.a.a.i.e
    public byte[] b() {
        return c();
    }

    public byte[] c() {
        if (this.f6588b == null && this.f6587a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f6587a;
        objArr[2] = "\\";
        String str = this.f6588b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f6588b;
    }

    public String e() {
        return this.f6587a;
    }

    @Override // c.e.a.a.i.e
    public String getName() {
        return "cct";
    }
}
