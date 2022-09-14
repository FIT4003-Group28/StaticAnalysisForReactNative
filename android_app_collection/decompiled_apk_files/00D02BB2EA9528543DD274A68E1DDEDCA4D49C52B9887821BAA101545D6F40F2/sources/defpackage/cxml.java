package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: cxml  reason: default package */
/* loaded from: classes5.dex */
public final class cxml {
    private final String a;
    private final boolean b;
    private final boolean c;

    public cxml(String str) {
        this(str, false, false);
    }

    private cxml(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final cxml a() {
        return new cxml(this.a, true, this.c);
    }

    public final cxml b() {
        return new cxml(this.a, this.b, true);
    }

    public final cxmb<Long> c(String str, long j) {
        return new cxmb<>(this.a, str, Long.valueOf(j), new cxkp(this.b, this.c, cxmc.a, new cxmk(Long.class) { // from class: cxmd
            private final Class a;

            {
                this.a = r1;
            }

            @Override // defpackage.cxmk
            public final Object a(Object obj) {
                return this.a.cast(obj);
            }
        }));
    }

    public final cxmb<Boolean> d(String str, boolean z) {
        return new cxmb<>(this.a, str, Boolean.valueOf(z), new cxkp(this.b, this.c, cxme.a, new cxmk(Boolean.class) { // from class: cxmf
            private final Class a;

            {
                this.a = r1;
            }

            @Override // defpackage.cxmk
            public final Object a(Object obj) {
                return this.a.cast(obj);
            }
        }));
    }

    public final cxmb<String> e(String str, String str2) {
        return new cxmb<>(this.a, str, str2, new cxkp(this.b, this.c, cxmg.a, new cxmk(String.class) { // from class: cxmh
            private final Class a;

            {
                this.a = r1;
            }

            @Override // defpackage.cxmk
            public final Object a(Object obj) {
                return this.a.cast(obj);
            }
        }));
    }

    public final <T> cxmb<T> f(String str, T t, final cxmk<byte[], T> cxmkVar) {
        return new cxmb<>(this.a, str, t, new cxkp(this.b, this.c, new cxmk(cxmkVar) { // from class: cxmi
            private final cxmk a;

            {
                this.a = cxmkVar;
            }

            @Override // defpackage.cxmk
            public final Object a(Object obj) {
                return this.a.a(Base64.decode((String) obj, 3));
            }
        }, new cxmk(cxmkVar) { // from class: cxmj
            private final cxmk a;

            {
                this.a = cxmkVar;
            }

            @Override // defpackage.cxmk
            public final Object a(Object obj) {
                return this.a.a((byte[]) obj);
            }
        }));
    }
}
