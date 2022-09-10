package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nln  reason: default package */
/* loaded from: classes7.dex */
public final class nln {
    public final Context a;

    public nln(Context context) {
        dbsk.s(context);
        this.a = context;
    }

    public final nlw a(amvh amvhVar, int i, dpej dpejVar, int i2, dowa dowaVar, dcdc<akqq> dcdcVar, String str, @dzsi ddjr ddjrVar, int i3, String str2, String str3) {
        dqvj dqvjVar = dqvj.DRIVE;
        Integer valueOf = Integer.valueOf(i3);
        Uri b = afhd.b(amvhVar, dqvjVar, ddjrVar, valueOf, amvhVar.b);
        Intent intent = new Intent("android.intent.action.VIEW", b);
        intent.setPackage(this.a.getPackageName());
        intent.putExtra("GoogleMapsSource", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("ved", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("ei", str3);
        }
        nlt nltVar = new nlt();
        nltVar.g(false);
        nltVar.d(dpjs.ENTITY_TYPE_DEFAULT);
        nltVar.i(dcdc.e());
        String str4 = "";
        nltVar.f(str4);
        nltVar.e(0);
        nltVar.b(-1);
        nltVar.c(dowa.REGIONAL);
        String s = amvhVar.s(this.a.getResources());
        if (s != null) {
            nltVar.a = s;
            nltVar.b = amvhVar.e;
            String uri = b.toString();
            if (uri != null) {
                nltVar.d = uri;
                nltVar.c = amvhVar;
                nltVar.e = intent;
                nltVar.g(!dcdcVar.isEmpty());
                nltVar.e(i);
                if (i != -1) {
                    str4 = bvtb.e(this.a.getResources(), i, bvsz.ABBREVIATED).toString();
                }
                nltVar.f(str4);
                nltVar.b(i2);
                nltVar.c(dowaVar);
                nltVar.f = dpejVar;
                nltVar.i(dcdcVar);
                nltVar.g = str;
                nltVar.h = ddjrVar;
                nltVar.i = valueOf;
                nltVar.d(amvhVar.b);
                return nltVar.a();
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null title");
    }
}
