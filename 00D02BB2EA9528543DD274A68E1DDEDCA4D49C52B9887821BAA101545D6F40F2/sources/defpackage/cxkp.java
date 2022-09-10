package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxkp  reason: default package */
/* loaded from: classes5.dex */
public final class cxkp<T> implements cxkv<T> {
    public static volatile int a;
    public static volatile dbsg<cxja> b;
    public final boolean c;
    public final boolean d;
    public final cxmk<String, T> e;
    private final cxmk<Object, T> f;

    public cxkp(boolean z, boolean z2, cxmk<String, T> cxmkVar, cxmk<Object, T> cxmkVar2) {
        this.c = z;
        this.d = z2;
        this.e = cxmkVar;
        this.f = cxmkVar2;
    }

    public final T a(cxji cxjiVar, String str, String str2) {
        T e = cxlb.c.a(cxjiVar, str, cxko.a).e(str2);
        if (e == null) {
            return null;
        }
        try {
            return this.f.a(e);
        } catch (IOException | ClassCastException unused) {
            if (str2.length() == 0) {
                new String("Invalid Phenotype flag value for flag ");
            }
            return null;
        }
    }
}
