package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ohn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohn {
    public static aafl a(final Activity activity, final oho ohoVar) {
        return new aafl() { // from class: ohk
            @Override // defpackage.aafl
            public final void kD(apzg apzgVar, Map map) {
                oho ohoVar2 = oho.this;
                Activity activity2 = activity;
                Intent a = ohoVar2.a(apzgVar);
                if (a != null) {
                    activity2.startActivity(a);
                }
            }
        };
    }

    public static zhf b(gfs gfsVar, int i, int i2) {
        gfs gfsVar2 = gfs.LIGHT;
        int ordinal = gfsVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return zhf.a(i);
            }
            throw new AssertionError();
        }
        return zhf.a(i2);
    }

    public static CharSequence c(audg audgVar) {
        arag aragVar;
        int i = audgVar.c;
        if ((i & 1024) != 0) {
            aragVar = audgVar.p;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else if ((i & 512) != 0) {
            aragVar = audgVar.o;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public static final ocj d(yye yyeVar) {
        return new ocj(yyeVar);
    }

    public static avgz e(List list) {
        return (avgz) g(list, kue.a);
    }

    public static avha f(List list) {
        return (avha) g(list, kue.d);
    }

    public static Object g(List list, kuf kufVar) {
        Object obj;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (obj2 != null) {
                obj = kufVar.a(obj2);
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public static Object h(Object[] objArr, kuf kufVar) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object a = obj != null ? kufVar.a(obj) : null;
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static ksm i(Object obj) {
        if (obj instanceof apof) {
            return new ksk((apof) obj);
        }
        if (obj instanceof atqb) {
            return new ksl((atqb) obj);
        }
        throw new IllegalArgumentException("BundleItemModel can only wrap BundleItemRenderer or OfflineBundleItemRenderer");
    }

    public static jmg j(Class cls, Class cls2) {
        return new jls(cls, cls2);
    }
}
