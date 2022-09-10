package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: abcy  reason: default package */
/* loaded from: classes2.dex */
public final class abcy {
    public final abdf a;
    public final abcv b;

    public abcy(abdf abdfVar, String str, String str2, String str3, Map<String, dqpy> map, String str4, String str5, String str6) {
        this.a = abdfVar;
        abcv bZ = abcx.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        abcx abcxVar = (abcx) bZ.b;
        str.getClass();
        int i = abcxVar.a | 2;
        abcxVar.a = i;
        abcxVar.c = str;
        str2.getClass();
        int i2 = i | 32;
        abcxVar.a = i2;
        abcxVar.g = str2;
        str3.getClass();
        int i3 = i2 | 64;
        abcxVar.a = i3;
        abcxVar.h = str3;
        str4.getClass();
        int i4 = i3 | 4;
        abcxVar.a = i4;
        abcxVar.d = str4;
        str5.getClass();
        int i5 = i4 | 1;
        abcxVar.a = i5;
        abcxVar.b = str5;
        str6.getClass();
        abcxVar.a = i5 | 16;
        abcxVar.f = str6;
        abcx abcxVar2 = (abcx) bZ.b;
        dssd<String, dqpy> dssdVar = abcxVar2.i;
        if (!dssdVar.a) {
            abcxVar2.i = dssdVar.a();
        }
        abcxVar2.i.putAll(map);
        this.b = bZ;
    }
}
