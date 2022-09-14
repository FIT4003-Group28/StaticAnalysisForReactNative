package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dcpw  reason: default package */
/* loaded from: classes.dex */
public final class dcpw {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final dcpn b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('\b', "\\b");
        hashMap.put('\f', "\\f");
        hashMap.put('\n', "\\n");
        hashMap.put('\r', "\\r");
        hashMap.put('\t', "\\t");
        hashMap.put('\"', "\\\"");
        hashMap.put('\\', "\\\\");
        new dcpv(hashMap);
        hashMap.put('\'', "\\'");
        new dcpu(hashMap);
        new dcpv(hashMap);
        new dcpq();
        HashMap hashMap2 = new HashMap();
        hashMap2.put('\'', "\\x27");
        hashMap2.put('\"', "\\x22");
        hashMap2.put('<', "\\x3c");
        hashMap2.put('=', "\\x3d");
        hashMap2.put('>', "\\x3e");
        hashMap2.put('&', "\\x26");
        hashMap2.put('\b', "\\b");
        hashMap2.put('\t', "\\t");
        hashMap2.put('\n', "\\n");
        hashMap2.put('\f', "\\f");
        hashMap2.put('\r', "\\r");
        hashMap2.put('\\', "\\\\");
        b = new dcpr(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put('\n', "\\n");
        hashMap3.put('\r', "\\r");
        hashMap3.put('\t', "\\t");
        hashMap3.put('\\', "\\\\");
        hashMap3.put('\'', "\\'");
        hashMap3.put('\"', "\\\"");
        new dcps(hashMap3);
        dcpl dcplVar = new dcpl();
        dcplVar.a('\n', "\\n");
        dcplVar.a('\r', "\\r");
        dcplVar.a('\t', "\\t");
        dcplVar.a('\\', "\\\\");
        dcplVar.a('\"', "\\\"");
        dcplVar.a('\'', "\\'");
        dcplVar.b();
        HashMap hashMap4 = new HashMap();
        hashMap4.put('\n', "\\n");
        hashMap4.put('\r', "\\r");
        hashMap4.put('\f', "\\f");
        hashMap4.put('\b', "\\b");
        hashMap4.put('\t', "\\t");
        hashMap4.put((char) 11, "\\v");
        hashMap4.put('\"', "\\\"");
        hashMap4.put('\'', "\\'");
        hashMap4.put('\\', "\\\\");
        hashMap4.put('$', "\\$");
        new dcpt(hashMap4);
        dcpl dcplVar2 = new dcpl();
        dcplVar2.a('\'', "\\'");
        dcplVar2.a('\"', "\\\"");
        dcplVar2.a('?', "\\?");
        dcplVar2.a('\\', "\\\\");
        dcplVar2.a('\f', "\\f");
        dcplVar2.a('\n', "\\n");
        dcplVar2.a('\r', "\\r");
        dcplVar2.a('\t', "\\t");
        dcplVar2.a((char) 7, "\\a");
        dcplVar2.a('\b', "\\b");
        dcplVar2.a((char) 11, "\\v");
        dcplVar2.b();
    }

    public static char[] a(char c) {
        char[] cArr = a;
        char[] cArr2 = {'\\', 'u', cArr[r5 >>> 4], cArr[r5 & 15], cArr[r5 & 15], cArr[c & 15]};
        int i = c >>> 4;
        int i2 = i >>> 4;
        return cArr2;
    }

    public static char[] b(char c) {
        char[] cArr = a;
        return new char[]{'\\', 'x', cArr[c >>> 4], cArr[c & 15]};
    }
}
