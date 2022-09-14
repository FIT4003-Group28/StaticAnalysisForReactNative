package com.b.a.a.c;

import com.b.a.a.c.a;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
/* compiled from: VObjectValidator.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<com.b.a.a.a, Map<Boolean, a>> f1458a = new EnumMap(com.b.a.a.a.class);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<com.b.a.a.a, Map<Boolean, a>> f1459b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<com.b.a.a.a, Map<Boolean, a>> f1460c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<com.b.a.a.a, Map<Boolean, Map<Boolean, a>>> f1461d;

    static {
        com.b.a.a.a aVar = com.b.a.a.a.OLD;
        HashMap hashMap = new HashMap();
        hashMap.put(false, new a.C0031a().a().b("\r\n:.;").d());
        hashMap.put(true, new a.C0031a().b().b("[]=:.,").b(';').d());
        f1458a.put(aVar, hashMap);
        com.b.a.a.a aVar2 = com.b.a.a.a.NEW;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(false, f1458a.get(com.b.a.a.a.OLD).get(false));
        hashMap2.put(true, new a.C0031a().a(65, 90).a(97, EACTags.SECURITY_SUPPORT_TEMPLATE).a(48, 57).a('-').d());
        f1458a.put(aVar2, hashMap2);
        f1459b = f1458a;
        f1460c = new EnumMap(com.b.a.a.a.class);
        com.b.a.a.a aVar3 = com.b.a.a.a.OLD;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(false, new a.C0031a().a().b("\r\n:;=").d());
        hashMap3.put(true, f1458a.get(aVar3).get(true));
        f1460c.put(aVar3, hashMap3);
        com.b.a.a.a aVar4 = com.b.a.a.a.NEW;
        HashMap hashMap4 = new HashMap();
        hashMap4.put(false, f1460c.get(com.b.a.a.a.OLD).get(false));
        hashMap4.put(true, f1458a.get(aVar4).get(true));
        f1460c.put(aVar4, hashMap4);
        f1461d = new EnumMap(com.b.a.a.a.class);
        com.b.a.a.a aVar5 = com.b.a.a.a.OLD;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        hashMap6.put(false, new a.C0031a().a().b("\r\n:").d());
        hashMap6.put(true, new a.C0031a(f1460c.get(aVar5).get(true)).a(';').d());
        hashMap5.put(false, hashMap6);
        hashMap5.put(true, hashMap5.get(false));
        f1461d.put(aVar5, hashMap5);
        com.b.a.a.a aVar6 = com.b.a.a.a.NEW;
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        hashMap8.put(false, new a.C0031a().a().b("\r\n\"").d());
        hashMap8.put(true, new a.C0031a().b().c().a('\t').b('\"').d());
        hashMap7.put(false, hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(false, new a.C0031a().a().d());
        hashMap9.put(true, new a.C0031a().b().c().a("\r\n\t").d());
        hashMap7.put(true, hashMap9);
        f1461d.put(aVar6, hashMap7);
    }

    public static a a(com.b.a.a.a aVar, boolean z) {
        return f1459b.get(aVar).get(Boolean.valueOf(z));
    }

    public static boolean a(String str, com.b.a.a.a aVar, boolean z) {
        return b(aVar, z).a(str);
    }

    public static a b(com.b.a.a.a aVar, boolean z) {
        return f1460c.get(aVar).get(Boolean.valueOf(z));
    }

    public static boolean a(String str, com.b.a.a.a aVar, boolean z, boolean z2) {
        return a(aVar, z, z2).a(str);
    }

    public static a a(com.b.a.a.a aVar, boolean z, boolean z2) {
        return f1461d.get(aVar).get(Boolean.valueOf(z)).get(Boolean.valueOf(z2));
    }
}
