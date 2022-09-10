package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: bgot  reason: default package */
/* loaded from: classes3.dex */
public class bgot implements bgnq {
    private final Activity a;
    private final dipk b;
    private final String c;
    private final ilo d;
    private final bmdq e;
    private final bgnk f;
    private final dxio<afha> g;
    private CharSequence h;

    private bgot(dipk dipkVar, String str, CharSequence charSequence, Activity activity, ilo iloVar, bmdq bmdqVar, bgnk bgnkVar, dxio<afha> dxioVar) {
        this.b = dipkVar;
        this.c = str;
        this.h = charSequence;
        this.a = activity;
        this.d = iloVar;
        this.e = bmdqVar;
        this.f = bgnkVar;
        this.g = dxioVar;
    }

    @dzsi
    public static bgot g(dipk dipkVar, Activity activity, int i, ilo iloVar, bmdq bmdqVar, bgnk bgnkVar, dxio<afha> dxioVar) {
        Integer num;
        String string;
        String str;
        if ((dipkVar.a & 256) != 0) {
            dior diorVar = dipkVar.l;
            if (diorVar == null) {
                diorVar = dior.g;
            }
            EnumMap<dioq, Integer> enumMap = bgna.a;
            dioo b = dioo.b(diorVar.c);
            if (b == null) {
                b = dioo.UNKNOWN_INTENT;
            }
            if ((!b.equals(dioo.URL_ACTION) || !dbsj.d(diorVar.e)) && ((!b.equals(dioo.CALL_ACTION) || (diorVar.a & 16) != 0) && !b.equals(dioo.UNKNOWN_INTENT))) {
                if ((diorVar.a & 4) != 0) {
                    string = diorVar.d;
                } else {
                    dioq b2 = dioq.b(diorVar.b);
                    if (b2 == null) {
                        b2 = dioq.UNKNOWN_TYPE;
                    }
                    if (bgna.a.containsKey(b2)) {
                        num = bgna.a.get(b2);
                    } else {
                        num = bgna.a.get(dioq.UNKNOWN_TYPE);
                    }
                    string = activity.getString(num.intValue());
                }
                str = string;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new bgot(dipkVar, str, bgna.a(activity, str, i), activity, iloVar, bmdqVar, bgnkVar, dxioVar);
        }
        return null;
    }

    @Override // defpackage.bgnq
    public String a() {
        return this.c;
    }

    @Override // defpackage.bgnq
    public CharSequence b() {
        return this.h;
    }

    @Override // defpackage.bgnq
    public cqkl c() {
        dioq dioqVar = dioq.UNKNOWN_TYPE;
        dioo diooVar = dioo.UNKNOWN_INTENT;
        dior diorVar = this.b.l;
        if (diorVar == null) {
            diorVar = dior.g;
        }
        dioo b = dioo.b(diorVar.c);
        if (b == null) {
            b = dioo.UNKNOWN_INTENT;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            afha a = this.g.a();
            Activity activity = this.a;
            dior diorVar2 = this.b.l;
            if (diorVar2 == null) {
                diorVar2 = dior.g;
            }
            a.H(activity, diorVar2.e, 1);
        } else if (ordinal == 2) {
            dior diorVar3 = this.b.l;
            if (diorVar3 == null) {
                diorVar3 = dior.g;
            }
            if ((diorVar3.a & 16) != 0 && this.e.c()) {
                dior diorVar4 = this.b.l;
                if (diorVar4 == null) {
                    diorVar4 = dior.g;
                }
                diom diomVar = diorVar4.f;
                if (diomVar == null) {
                    diomVar = diom.b;
                }
                dgfy dgfyVar = diomVar.a;
                if (dgfyVar == null) {
                    dgfyVar = dgfy.f;
                }
                bmdq bmdqVar = this.e;
                String n = this.d.n();
                String str = dgfyVar.b;
                dgbo dgboVar = dgfyVar.e;
                if (dgboVar == null) {
                    dgboVar = dgbo.e;
                }
                bmdqVar.b(n, str, Uri.parse(dgboVar.c), dgfyVar.c, this.a, cjtx.c(2, this.d, false));
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bgnq
    public cjtd d() {
        cjta cjtaVar = new cjta();
        bgnk bgnkVar = this.f;
        dior diorVar = this.b.l;
        if (diorVar == null) {
            diorVar = dior.g;
        }
        dioo b = dioo.b(diorVar.c);
        if (b == null) {
            b = dioo.UNKNOWN_INTENT;
        }
        cjtaVar.d = bgna.b.get(b).get(bgnkVar);
        cjtaVar.g(this.b.q);
        bgnf.a(cjtaVar, this.b);
        return cjtaVar.a();
    }

    @Override // defpackage.bgnq
    @dzsi
    public cqtd e(cqss cqssVar) {
        dioq dioqVar = dioq.UNKNOWN_TYPE;
        dioo diooVar = dioo.UNKNOWN_INTENT;
        dior diorVar = this.b.l;
        if (diorVar == null) {
            diorVar = dior.g;
        }
        dioq b = dioq.b(diorVar.b);
        if (b == null) {
            b = dioq.UNKNOWN_TYPE;
        }
        switch (b.ordinal()) {
            case 1:
            case 8:
                return cqrt.g(2131232260, cqssVar);
            case 2:
            case 3:
                return cqrt.g(2131232426, cqssVar);
            case 4:
                return cqrt.g(2131232215, cqssVar);
            case 5:
                return cqrt.g(2131232300, cqssVar);
            case 6:
                return cqrt.g(2131232180, cqssVar);
            case 7:
                return cqrt.g(2131232392, cqssVar);
            case 9:
            case 10:
                return cqrt.g(2131232330, cqssVar);
            case 11:
                return cqrt.g(2131232333, cqssVar);
            default:
                dior diorVar2 = this.b.l;
                if (diorVar2 == null) {
                    diorVar2 = dior.g;
                }
                dioo b2 = dioo.b(diorVar2.c);
                if (b2 == null) {
                    b2 = dioo.UNKNOWN_INTENT;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 1) {
                    return cqrt.g(2131232300, cqssVar);
                }
                if (ordinal == 2) {
                    return cqrt.g(2131232333, cqssVar);
                }
                return null;
        }
    }

    @Override // defpackage.bgnq
    public void f(int i) {
        this.h = bgna.a(this.a, this.c, i);
    }
}
