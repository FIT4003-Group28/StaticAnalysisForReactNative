package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: cqew  reason: default package */
/* loaded from: classes5.dex */
public final class cqew {
    public final dgyd a;
    private final cqey b;
    private final Integer c;
    private final cnjz d;

    public cqew(cnjz cnjzVar, cqey cqeyVar, Integer num, dgyd dgydVar) {
        this.d = cnjzVar;
        this.b = cqeyVar;
        this.c = num;
        this.a = dgydVar;
    }

    public final void a(dhip dhipVar) {
        String str;
        dgyd dgydVar = this.a;
        dhij dhijVar = dhipVar.c;
        if (dhijVar == null) {
            dhijVar = dhij.c;
        }
        dgyd b = dgyd.b(dhijVar.b);
        if (b == null) {
            b = dgyd.FLOW_ID_UNSPECIFIED;
        }
        boolean equals = dgydVar.equals(b);
        dgyd dgydVar2 = this.a;
        dhij dhijVar2 = dhipVar.c;
        if (dhijVar2 == null) {
            dhijVar2 = dhij.c;
        }
        dgyd b2 = dgyd.b(dhijVar2.b);
        if (b2 == null) {
            b2 = dgyd.FLOW_ID_UNSPECIFIED;
        }
        dbsk.j(equals, "This ClearcutHelper has been instantiated with the %s UI flow ID but the given event has %s instead.", dgydVar2, b2);
        cnjz cnjzVar = this.d;
        dhid bZ = dhie.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhie dhieVar = (dhie) bZ.b;
        dhipVar.getClass();
        dhieVar.b = dhipVar;
        dhieVar.a |= 1;
        cnjv d = cnjzVar.d(bZ.bK().bS());
        d.e(this.c.intValue());
        d.a();
        cqey cqeyVar = this.b;
        int i = this.a.v;
        int a = dhih.a(dhipVar.b);
        if (a != 0) {
            switch (a) {
                case 1:
                    break;
                case 2:
                    str = "PREPARE_FLOW_CALLED";
                    break;
                case 3:
                    str = "PREPARE_FLOW_PROMOTABILITY_LOADED";
                    break;
                case 4:
                    str = "CONSENT_STARTED";
                    break;
                case 5:
                    str = "SCREEN_LOADING_FAILED";
                    break;
                case 6:
                    str = "RETRY_BUTTON_CLICKED";
                    break;
                case 7:
                    str = "SCREEN_DISPLAY_NOT_POSSIBLE";
                    break;
                case 8:
                    str = "SCREEN_LOADED";
                    break;
                case 9:
                    str = "CONSENT_ACCEPTED";
                    break;
                case 10:
                    str = "CONSENT_REJECTED";
                    break;
                case 11:
                    str = "CONSENT_ABANDONED_WITH_CLICK_OUTSIDE";
                    break;
                case 12:
                    str = "CONSENT_ABANDONED_WITH_BACK_BUTTON";
                    break;
                case 13:
                    str = "CONSENT_WRITTEN";
                    break;
                default:
                    str = "CONSENT_WRITE_FAILED";
                    break;
            }
            cqeyVar.b.a().a(Integer.valueOf(i), str, Integer.valueOf(Build.VERSION.SDK_INT));
        }
        str = "EVENT_TYPE_UNKNOWN";
        cqeyVar.b.a().a(Integer.valueOf(i), str, Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public final void b(int i) {
        dhif bZ = dhip.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhip dhipVar = (dhip) bZ.b;
        dhipVar.b = i - 1;
        dhipVar.a |= 1;
        dhii bZ2 = dhij.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhij.b((dhij) bZ2.b);
        dgyd dgydVar = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhij dhijVar = (dhij) bZ2.b;
        dhijVar.b = dgydVar.v;
        dhijVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhip dhipVar2 = (dhip) bZ.b;
        dhij bK = bZ2.bK();
        bK.getClass();
        dhipVar2.c = bK;
        dhipVar2.a |= 2;
        a(bZ.bK());
    }

    public final void c(int i) {
        dhif bZ = dhip.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhip dhipVar = (dhip) bZ.b;
        dhipVar.b = 6;
        dhipVar.a |= 1;
        dhii bZ2 = dhij.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhij.b((dhij) bZ2.b);
        dgyd dgydVar = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhij dhijVar = (dhij) bZ2.b;
        dhijVar.b = dgydVar.v;
        dhijVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhip dhipVar2 = (dhip) bZ.b;
        dhij bK = bZ2.bK();
        bK.getClass();
        dhipVar2.c = bK;
        dhipVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhip dhipVar3 = (dhip) bZ.b;
        dhipVar3.d = i - 1;
        dhipVar3.a |= 4;
        a(bZ.bK());
    }
}
