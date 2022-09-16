package defpackage;

import android.content.Intent;
import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: jsa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jsa implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jsa u = new jsa(20);
    public static final /* synthetic */ jsa t = new jsa(19);
    public static final /* synthetic */ jsa s = new jsa(18);
    public static final /* synthetic */ jsa r = new jsa(17);
    public static final /* synthetic */ jsa q = new jsa(16);
    public static final /* synthetic */ jsa p = new jsa(15);
    public static final /* synthetic */ jsa o = new jsa(14);
    public static final /* synthetic */ jsa n = new jsa(13);
    public static final /* synthetic */ jsa m = new jsa(12);
    public static final /* synthetic */ jsa l = new jsa(11);
    public static final /* synthetic */ jsa k = new jsa(10);
    public static final /* synthetic */ jsa j = new jsa(9);
    public static final /* synthetic */ jsa i = new jsa(8);
    public static final /* synthetic */ jsa h = new jsa(7);
    public static final /* synthetic */ jsa g = new jsa(6);
    public static final /* synthetic */ jsa f = new jsa(5);
    public static final /* synthetic */ jsa e = new jsa(4);
    public static final /* synthetic */ jsa d = new jsa(3);
    public static final /* synthetic */ jsa c = new jsa(2);
    public static final /* synthetic */ jsa b = new jsa(1);
    public static final /* synthetic */ jsa a = new jsa();

    private /* synthetic */ jsa() {
    }

    private /* synthetic */ jsa(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return obj instanceof aqtb ? ajhh.a((aqtb) obj) : obj;
            case 1:
                return obj instanceof ajhh ? ((ajhh) obj).a : obj;
            case 2:
                return Optional.ofNullable((aoqu) obj);
            case 3:
                return ((Optional) obj).get();
            case 4:
                return Long.valueOf(((ffo) obj).c());
            case 5:
                return Long.valueOf(((ffo) obj).kH());
            case 6:
                return Long.valueOf(((ffo) obj).kO());
            case 7:
                return Long.valueOf(((ffo) obj).kI());
            case 8:
                return Long.valueOf(((ffo) obj).kJ());
            case 9:
                return Boolean.valueOf(((ffo) obj).kM());
            case 10:
                return ((Intent) obj).getExtras();
            case 11:
                return ((Bundle) obj).getByteArray("navigation_endpoint");
            case 12:
                return aafr.c((byte[]) obj);
            case 13:
                aten atenVar = (aten) obj;
                if (atenVar == null) {
                    return null;
                }
                int i2 = atenVar.b;
                if ((i2 & 1) != 0) {
                    ateo ateoVar = atenVar.c;
                    return ateoVar == null ? ateo.a : ateoVar;
                } else if ((i2 & 2) != 0) {
                    ater aterVar = atenVar.d;
                    return aterVar == null ? ater.a : aterVar;
                } else if ((i2 & 4) != 0) {
                    ateq ateqVar = atenVar.e;
                    return ateqVar == null ? ateq.a : ateqVar;
                } else if ((i2 & 8) != 0) {
                    atex atexVar = atenVar.f;
                    return atexVar == null ? atex.a : atexVar;
                } else if ((i2 & 16) != 0) {
                    atej atejVar = atenVar.g;
                    return atejVar == null ? atej.a : atejVar;
                } else if ((i2 & 32) != 0) {
                    atek atekVar = atenVar.h;
                    return atekVar == null ? atek.a : atekVar;
                } else if ((i2 & 64) != 0) {
                    atew atewVar = atenVar.i;
                    return atewVar == null ? atew.a : atewVar;
                } else if ((i2 & 128) != 0) {
                    avrr avrrVar = atenVar.j;
                    return avrrVar == null ? avrr.a : avrrVar;
                } else if ((i2 & 256) != 0) {
                    avrs avrsVar = atenVar.k;
                    return avrsVar == null ? avrs.a : avrsVar;
                } else if ((i2 & 512) != 0) {
                    atet atetVar = atenVar.l;
                    return atetVar == null ? atet.a : atetVar;
                } else if ((i2 & 1024) != 0) {
                    avqs avqsVar = atenVar.m;
                    return avqsVar == null ? avqs.a : avqsVar;
                } else if ((i2 & 2048) != 0) {
                    atef atefVar = atenVar.n;
                    return atefVar == null ? atef.a : atefVar;
                } else if ((i2 & 4096) != 0) {
                    auyw auywVar = atenVar.o;
                    return auywVar == null ? auyw.a : auywVar;
                } else if ((i2 & 8192) == 0) {
                    return null;
                } else {
                    aqtb aqtbVar = atenVar.p;
                    return aqtbVar == null ? aqtb.a : aqtbVar;
                }
            case 14:
                return ((atep) obj).c;
            case 15:
                return (fry) ((Optional) obj).get();
            case 16:
                return ((apvg) obj).k;
            case 17:
                return (apvg) obj;
            case 18:
                final mdx mdxVar = (mdx) obj;
                mdxVar.getClass();
                return banl.n(new aypv() { // from class: mdy
                    @Override // defpackage.aypv
                    public final void a() {
                        mdx.this.j();
                    }
                });
            case 19:
                return ((mdx) obj).b();
            default:
                return ((mdx) obj).c();
        }
    }
}
