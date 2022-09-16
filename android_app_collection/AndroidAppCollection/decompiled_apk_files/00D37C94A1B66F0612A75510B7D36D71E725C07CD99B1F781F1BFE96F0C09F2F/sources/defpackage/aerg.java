package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aerg  reason: default package */
/* loaded from: classes.dex */
public final class aerg {
    public final byte[] a;
    public final List b;
    public final String c;
    public final int d;

    public aerg(int i, String str, List list, byte[] bArr) {
        List unmodifiableList;
        this.d = i;
        this.c = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.b = unmodifiableList;
        this.a = bArr;
    }

    public aerg(String str, byte[] bArr, List list, String str2, int i) {
        zgh.m(str);
        this.a = (byte[]) afms.a(bArr);
        this.b = list;
        zgh.m(str2);
        this.c = str2;
        this.d = i;
    }
}
