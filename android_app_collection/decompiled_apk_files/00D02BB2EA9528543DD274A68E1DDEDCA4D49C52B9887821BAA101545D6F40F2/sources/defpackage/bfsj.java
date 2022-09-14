package defpackage;

import android.content.Context;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfsj  reason: default package */
/* loaded from: classes3.dex */
public class bfsj implements bfrs {
    private static final TypefaceSpan a = new TypefaceSpan("sans-serif-medium");
    private final Context b;
    private final bvsx c;
    private final dnob d;
    private final aelb e;
    private final cjta f;

    public bfsj(Context context, dnob dnobVar, aelb aelbVar, cjtd cjtdVar) {
        this.b = context;
        this.c = new bvsx(context.getResources());
        this.d = dnobVar;
        this.e = aelbVar;
        this.f = cjtd.c(cjtdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dnob dnobVar) {
        int a2 = donw.a(dnobVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1 || i == 2) {
            int i2 = dnobVar.a;
            if ((i2 & 8) != 0 && (i2 & 4) != 0) {
                dorg dorgVar = dnobVar.c;
                if (dorgVar == null) {
                    dorgVar = dorg.g;
                }
                if ((dorgVar.a & 1) != 0) {
                    dorg dorgVar2 = dnobVar.c;
                    if (dorgVar2 == null) {
                        dorgVar2 = dorg.g;
                    }
                    if ((dorgVar2.a & 4) != 0) {
                        dorg dorgVar3 = dnobVar.c;
                        if (dorgVar3 == null) {
                            dorgVar3 = dorg.g;
                        }
                        if ((dorgVar3.a & 8) != 0) {
                            dorg dorgVar4 = dnobVar.c;
                            if (dorgVar4 == null) {
                                dorgVar4 = dorg.g;
                            }
                            if ((dorgVar4.a & 16) != 0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(dnob dnobVar) {
        int a2 = donw.a(dnobVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 13 || i == 14) {
            int i2 = dnobVar.a;
            if ((i2 & 16) != 0 && (i2 & 4096) != 0) {
                dorg dorgVar = dnobVar.c;
                if (dorgVar == null) {
                    dorgVar = dorg.g;
                }
                if ((dorgVar.a & 1) != 0) {
                    dorg dorgVar2 = dnobVar.c;
                    if (dorgVar2 == null) {
                        dorgVar2 = dorg.g;
                    }
                    if ((dorgVar2.a & 4) != 0) {
                        dorg dorgVar3 = dnobVar.c;
                        if (dorgVar3 == null) {
                            dorgVar3 = dorg.g;
                        }
                        if ((dorgVar3.a & 8) != 0) {
                            dorg dorgVar4 = dnobVar.c;
                            if (dorgVar4 == null) {
                                dorgVar4 = dorg.g;
                            }
                            if ((dorgVar4.a & 16) != 0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    private final ddho f() {
        return g() ? d(this.d) ? dtxr.cv : dtxr.ct : d(this.d) ? dtxr.cw : dtxr.cu;
    }

    private final boolean g() {
        int a2 = donw.a(this.d.b);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 == 3 || a2 == 15;
    }

    @Override // defpackage.bfrs
    public cqkl b() {
        aelb aelbVar = this.e;
        dorg dorgVar = this.d.c;
        if (dorgVar == null) {
            dorgVar = dorg.g;
        }
        eapg eapgVar = new eapg(dorgVar.b);
        dorg dorgVar2 = this.d.c;
        if (dorgVar2 == null) {
            dorgVar2 = dorg.g;
        }
        aelbVar.a(eapgVar, new eapg(dorgVar2.c), f(), cjqm.a);
        return cqkl.a;
    }

    @Override // defpackage.bfrs
    public cjtd c() {
        cjta cjtaVar = this.f;
        cjtaVar.d = f();
        return cjtaVar.a();
    }

    @Override // defpackage.bfrs
    public CharSequence a() {
        int a2 = donw.a(this.d.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            dnob dnobVar = this.d;
            String str = dnobVar.d;
            dorg dorgVar = dnobVar.c;
            if (dorgVar == null) {
                dorgVar = dorg.g;
            }
            String str2 = dorgVar.e;
            dorg dorgVar2 = this.d.c;
            if (dorgVar2 == null) {
                dorgVar2 = dorg.g;
            }
            String str3 = dorgVar2.f;
            bvsu c = this.c.c(R.string.HOTEL_ITINERARY_SHIFT_TIP);
            bvsv a3 = this.c.a(str);
            a3.i();
            bvsu c2 = this.c.c(R.string.HOTEL_CHECK_IN_AND_CHECK_OUT_DATE_RANGE);
            c2.a(str2, str3);
            c2.p();
            c.a(a3, c2);
            return c.c();
        } else if (i == 2) {
            dnob dnobVar2 = this.d;
            String str4 = dnobVar2.d;
            dorg dorgVar3 = dnobVar2.c;
            if (dorgVar3 == null) {
                dorgVar3 = dorg.g;
            }
            String str5 = dorgVar3.e;
            dorg dorgVar4 = this.d.c;
            if (dorgVar4 == null) {
                dorgVar4 = dorg.g;
            }
            String str6 = dorgVar4.f;
            bvsu c3 = this.c.c(R.string.HOTEL_CHECK_IN_AND_CHECK_OUT_DATE_RANGE);
            c3.a(str5, str6);
            bvsv a4 = this.c.a(str4);
            bvsu c4 = this.c.c(R.string.HOTEL_ITINERARY_SHIFT_FOR_UNAVAILABLE_TIP);
            Object[] objArr = new Object[2];
            if (g()) {
                c3.l(ibm.x().b(this.b));
                c3.i();
            } else {
                c3.p();
            }
            objArr[0] = c3;
            if (g()) {
                a4.j(a);
            } else {
                a4.i();
            }
            objArr[1] = a4;
            c4.a(objArr);
            return c4.c();
        } else if (i == 13) {
            dorg dorgVar5 = this.d.c;
            if (dorgVar5 == null) {
                dorgVar5 = dorg.g;
            }
            int i2 = dorgVar5.d;
            dnob dnobVar3 = this.d;
            int i3 = dnobVar3.h;
            String str7 = dnobVar3.e;
            bvsu d = this.c.d(R.plurals.HOTEL_ITINERARY_EXTENSION_TIP_LINK, i2);
            bvsu d2 = this.c.d(R.plurals.HOTEL_ITINERARY_EXTENSION_TIP_EXTRA_NIGHTS, i3);
            d2.a(this.c.a(Integer.valueOf(i3)));
            d2.p();
            bvsu b = this.c.b(str7);
            b.i();
            d.a(d2, b);
            return d.c();
        } else if (i != 14) {
            return "";
        } else {
            dorg dorgVar6 = this.d.c;
            if (dorgVar6 == null) {
                dorgVar6 = dorg.g;
            }
            int i4 = dorgVar6.d;
            dnob dnobVar4 = this.d;
            int i5 = dnobVar4.h;
            String str8 = dnobVar4.e;
            bvsu d3 = this.c.d(R.plurals.HOTEL_ITINERARY_EXTENSION_TIP_FOR_UNAVAILABLE_ACTION, i5);
            d3.a(this.c.a(Integer.valueOf(i5)));
            bvsu b2 = this.c.b(str8);
            bvsu d4 = this.c.d(R.plurals.HOTEL_ITINERARY_EXTENSION_TIP_FOR_UNAVAILABLE_LINK, i4);
            Object[] objArr2 = new Object[3];
            objArr2[0] = this.c.a(Integer.valueOf(i4));
            if (g()) {
                d3.l(ibm.x().b(this.b));
                d3.i();
            } else {
                d3.p();
            }
            objArr2[1] = d3;
            if (g()) {
                b2.j(a);
            } else {
                b2.i();
            }
            objArr2[2] = b2;
            d4.a(objArr2);
            return d4.c();
        }
    }
}
