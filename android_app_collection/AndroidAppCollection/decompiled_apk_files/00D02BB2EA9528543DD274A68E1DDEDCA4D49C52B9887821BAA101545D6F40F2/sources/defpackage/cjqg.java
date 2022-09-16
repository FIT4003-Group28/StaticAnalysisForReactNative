package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjqg  reason: default package */
/* loaded from: classes.dex */
public final class cjqg {
    private cjqg() {
    }

    public static cjtd a(boolean z, cjtd cjtdVar) {
        deab d = cjtdVar.d();
        if (d != null && (d.a & 1) != 0) {
            deaa b = deaa.b(d.b);
            if (b == null) {
                b = deaa.TOGGLE_UNDEFINED;
            }
            dbsk.m(z == (b == deaa.TOGGLE_OFF), "logToggleInteraction: params.UIState should be null or the state before the interaction");
        }
        cjta c = cjtd.c(cjtdVar);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        return c.a();
    }

    @dzsi
    @Deprecated
    public static String b(cjqy cjqyVar) {
        return c(cjqyVar).a().f();
    }

    @Deprecated
    public static cjqm c(cjqy cjqyVar) {
        if (cjqyVar == null) {
            return cjqm.a;
        }
        cjqm d = cjqyVar.d(cjqi.a);
        return d == null ? cjqm.a : d;
    }

    public static void d(View view, @dzsi cjql cjqlVar) {
        view.setTag(R.id.logged_impression, cjqlVar);
    }

    @dzsi
    public static cjql e(View view) {
        return (cjql) view.getTag(R.id.logged_impression);
    }

    public static void f(cjqi cjqiVar, View view, @dzsi cjqm cjqmVar) {
        dbsk.s(cjqiVar);
        view.setTag(R.id.logged_interaction, cjqmVar);
    }

    @dzsi
    public static cjqm g(cjqi cjqiVar, View view) {
        dbsk.s(cjqiVar);
        return (cjqm) view.getTag(R.id.logged_interaction);
    }

    public static void h(View view, @dzsi cjtd cjtdVar) {
        if (dbsd.a(cjtdVar, cjtd.c)) {
            return;
        }
        view.setTag(R.id.ue3_params, cjtdVar);
    }

    public static void i(Intent intent, int i, @dzsi String str, @dzsi String str2, @dzsi String str3) {
        intent.putExtra("KEY_LOGGING_TYPE_ID", i);
        if (str != null) {
            intent.putExtra("KEY_LOGGING_SERVER_VED", str);
        }
        if (str2 != null) {
            intent.putExtra("KEY_LOGGING_SERVER_EI", str2);
        }
        if (str3 != null) {
            intent.putExtra("KEY_LOGGING_EXTERNAL_CONTEXT_REFERENCE", str3);
        }
    }

    public static void j(Intent intent, Intent intent2) {
        cjtd l = l(intent);
        if (l == null) {
            return;
        }
        ddho ddhoVar = l.g;
        dbsk.s(ddhoVar);
        i(intent2, ddhoVar.b(), m(intent), n(intent), v(intent));
    }

    @dzsi
    public static cjtd k(View view) {
        acli acliVar = (acli) view.getTag(R.id.logging_params);
        if (acliVar == null || acliVar.a == null) {
            return u((cjtd) view.getTag(R.id.ue3_params), view);
        }
        return u(aclj.a(acliVar), view);
    }

    @dzsi
    public static cjtd l(@dzsi final Intent intent) {
        int intExtra;
        if (intent == null || !intent.hasExtra("KEY_LOGGING_TYPE_ID") || (intExtra = intent.getIntExtra("KEY_LOGGING_TYPE_ID", 0)) == 0) {
            return null;
        }
        ddho d = cjth.d(intExtra);
        cjta b = cjtd.b();
        b.d = d;
        b.g(m(intent));
        b.b = n(intent);
        b.i = (cjsa) cjrc.a(v(intent)).h(new dbrn(intent) { // from class: cjqd
            private final Intent a;

            {
                this.a = intent;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Intent intent2 = this.a;
                return new cjsd((cjrc) obj, cjqg.n(intent2), cjqg.m(intent2));
            }
        }).f();
        return b.a();
    }

    @dzsi
    public static String m(Intent intent) {
        return intent.getStringExtra("KEY_LOGGING_SERVER_VED");
    }

    @dzsi
    public static String n(Intent intent) {
        return intent.getStringExtra("KEY_LOGGING_SERVER_EI");
    }

    public static cjtd o(cjtd cjtdVar, ddho ddhoVar) {
        dbsk.s(ddhoVar);
        if (cjtdVar == null) {
            return null;
        }
        cjta c = cjtd.c(cjtdVar);
        c.d = ddhoVar;
        return c.a();
    }

    public static void p(@dzsi View view, Object obj, @dzsi ddho ddhoVar) {
        if (view != null) {
            cjtd k = k(view);
            if (k == null) {
                dbsk.s(ddhoVar);
                h(view, cjtd.a(ddhoVar));
                return;
            }
            ddho ddhoVar2 = k.g;
            String cls = obj.getClass().toString();
            String str = "null";
            String valueOf = ddhoVar == null ? str : String.valueOf(ddhoVar.b());
            ddho ddhoVar3 = k.g;
            if (ddhoVar3 != null) {
                str = String.valueOf(ddhoVar3.b());
            }
            if (ddhoVar2 != ddhoVar) {
                throw new IllegalStateException(dbtx.b("Fragment %s has a root view with a VE type different than its page activation VE type: page VE type is %s but the root view VE type is %s.", cls, valueOf, str));
            }
        }
    }

    public static ddlp q(@dzsi cjsa cjsaVar, @dzsi cjrc cjrcVar) {
        ddxz c;
        ddxx c2;
        ddxz e;
        ddxz c3;
        ddlo bZ = ddlp.d.bZ();
        if (cjsaVar != null) {
            ddmd bZ2 = ddme.e.bZ();
            cjrc cjrcVar2 = cjsaVar.a;
            if (cjrcVar2 != null && (c3 = cjrcVar2.c()) != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddme ddmeVar = (ddme) bZ2.b;
                c3.getClass();
                ddmeVar.b = c3;
                ddmeVar.a |= 1;
            }
            String str = cjsaVar.b;
            if (str != null && (e = cjra.e(str)) != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddme ddmeVar2 = (ddme) bZ2.b;
                e.getClass();
                ddmeVar2.c = e;
                ddmeVar2.a |= 2;
            }
            String str2 = cjsaVar.c;
            if (str2 != null && (c2 = cjrx.c(str2)) != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddme ddmeVar3 = (ddme) bZ2.b;
                c2.getClass();
                ddmeVar3.d = c2;
                ddmeVar3.a |= 4;
            }
            ddme bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlp ddlpVar = (ddlp) bZ.b;
            bK.getClass();
            ddlpVar.b = bK;
            ddlpVar.a |= 1;
        }
        if (cjrcVar != null && (c = cjrcVar.c()) != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlp ddlpVar2 = (ddlp) bZ.b;
            c.getClass();
            ddlpVar2.c = c;
            ddlpVar2.a |= 2;
        }
        return bZ.bK();
    }

    @Deprecated
    public static cjqm r(cjqy cjqyVar, View view) {
        dbsg t;
        cjtd k = k(view);
        if (dbsd.a(k, cjtd.c)) {
            return cjqm.a;
        }
        if (k == null) {
            return cjqm.a;
        }
        if ((view instanceof huy) || (view instanceof hux)) {
            t = t(view, 2);
        } else {
            t = dbpy.a;
        }
        if (t.a()) {
            boolean booleanValue = ((Boolean) t.b()).booleanValue();
            cjta c = cjtd.c(k);
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = booleanValue ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            c.a = bZ.bK();
            k = c.a();
        }
        cjql e = e(view);
        if (e == null) {
            e = cjql.a;
        }
        return cjqyVar.j(e, k);
    }

    public static int s(jjn jjnVar) {
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal == 2) {
                return 3;
            }
            if (ordinal != 3) {
                throw new IllegalArgumentException(String.format("Unknown ExpandingState: %s", jjnVar));
            }
            return 4;
        }
        return 1;
    }

    private static dbsg<Boolean> t(View view, int i) {
        if (view instanceof CompoundButton) {
            return dbsg.i(Boolean.valueOf(((CompoundButton) view).isChecked()));
        }
        int i2 = i - 1;
        if (i2 >= 0 && (view instanceof ViewGroup)) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                dbsg<Boolean> t = t(viewGroup.getChildAt(i3), i2);
                if (t.a()) {
                    return t;
                }
                i3++;
            }
        }
        return dbpy.a;
    }

    @dzsi
    private static cjtd u(@dzsi cjtd cjtdVar, View view) {
        ddzf ca;
        if (cjtdVar == null) {
            return null;
        }
        Integer num = (Integer) view.getTag(R.id.goldfinger_card_index);
        for (ViewParent parent = view.getParent(); parent != null && num == null; parent = parent.getParent()) {
            if (parent instanceof View) {
                num = (Integer) ((View) parent).getTag(R.id.goldfinger_card_index);
            }
        }
        if (num == null) {
            return cjtdVar;
        }
        if (cjtdVar.i() == null) {
            ca = ddzg.t.bZ();
        } else {
            ca = ddzg.t.ca(cjtdVar.i());
        }
        cjta c = cjtd.c(cjtdVar);
        ddyc bZ = ddyd.c.bZ();
        int intValue = num.intValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyd ddydVar = (ddyd) bZ.b;
        ddydVar.a |= 1;
        ddydVar.b = intValue;
        ddyd bK = bZ.bK();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ddzg ddzgVar = (ddzg) ca.b;
        bK.getClass();
        ddzgVar.i = bK;
        ddzgVar.a |= 536870912;
        c.r(ca.bK());
        return c.a();
    }

    @dzsi
    private static String v(Intent intent) {
        return intent.getStringExtra("KEY_LOGGING_EXTERNAL_CONTEXT_REFERENCE");
    }
}
