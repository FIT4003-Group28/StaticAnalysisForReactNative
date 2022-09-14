package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: clcx  reason: default package */
/* loaded from: classes5.dex */
public final class clcx {
    static final String a;
    static final String b;
    private static final String e;
    public final String c;
    public final String d;

    static {
        String a2 = cldb.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        a = a2;
        String a3 = cldb.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        b = a3;
        String a4 = cldb.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = a4;
        Collections.unmodifiableSet(new HashSet(Arrays.asList(clct.a("proto"), clct.a("json"))));
        new clcx(a2, null);
        new clcx(a3, a4);
    }

    public clcx(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public static clcx a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (true == str3.isEmpty()) {
            str3 = null;
        }
        return new clcx(str2, str3);
    }
}
