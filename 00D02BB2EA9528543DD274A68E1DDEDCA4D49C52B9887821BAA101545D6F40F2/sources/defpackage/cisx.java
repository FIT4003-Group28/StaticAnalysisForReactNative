package defpackage;

import android.app.Activity;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cisx  reason: default package */
/* loaded from: classes4.dex */
public class cisx implements cisv {
    private final Activity a;
    private final cklf b;
    private final chva c;
    private final chtq d;
    private final dxio<afha> e;
    private final caxn f;

    public cisx(Activity activity, cklf cklfVar, dxio<afha> dxioVar, caxn caxnVar, chva chvaVar, chtq chtqVar) {
        this.c = chvaVar;
        this.d = chtqVar;
        this.a = activity;
        this.b = cklfVar;
        this.e = dxioVar;
        this.f = caxnVar;
    }

    @Override // defpackage.cisv
    @dzsi
    public cqsn a() {
        chva chvaVar = this.c;
        if ((chvaVar.a & 16) != 0) {
            int i = chvaVar.h;
            if (c().booleanValue()) {
                return new cisw(i);
            }
            return cqrt.l(i);
        }
        return null;
    }

    @Override // defpackage.cisv
    public cqkl b() {
        chva chvaVar = this.c;
        String str = "";
        if (!(chvaVar.b == 5 ? (String) chvaVar.c : str).isEmpty()) {
            cklf cklfVar = this.b;
            chva chvaVar2 = this.c;
            if (chvaVar2.b == 5) {
                str = (String) chvaVar2.c;
            }
            cklfVar.a(str);
        } else {
            chva chvaVar3 = this.c;
            if (!(chvaVar3.b == 7 ? (String) chvaVar3.c : str).isEmpty()) {
                afha a = this.e.a();
                Activity activity = this.a;
                chva chvaVar4 = this.c;
                if (chvaVar4.b == 7) {
                    str = (String) chvaVar4.c;
                }
                a.k(activity, cjxr.w(str), 1);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.cisv
    public Boolean c() {
        chva chvaVar = this.c;
        String str = "";
        boolean z = true;
        if ((chvaVar.b == 5 ? (String) chvaVar.c : str).isEmpty()) {
            chva chvaVar2 = this.c;
            if (chvaVar2.b == 7) {
                str = (String) chvaVar2.c;
            }
            if (str.isEmpty()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cisv
    public Boolean d() {
        return Boolean.valueOf(!this.f.a);
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof cisx) {
            cisx cisxVar = (cisx) obj;
            return this.c.equals(cisxVar.c) && this.d.equals(cisxVar.d);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{cisx.class, this.d, this.c});
    }
}
