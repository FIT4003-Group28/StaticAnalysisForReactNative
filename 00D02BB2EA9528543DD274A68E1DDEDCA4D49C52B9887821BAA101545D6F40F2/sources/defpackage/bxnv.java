package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxnv  reason: default package */
/* loaded from: classes4.dex */
public final class bxnv {
    public static final cqss a = ibm.p();
    private static final cqss f = ibm.D();
    private static final cqss g = ibm.x();
    private static final cqss h = ibm.b();
    private static final cqss i = ibm.x();
    private static final cqss j = iva.b(ibl.X(), ibl.w());
    private static final cqss k = ibm.b();
    private static final cqss l = ibm.b();
    private static final cqss m = ibm.b();
    public static final cqss b = ibm.x();
    private static final cqss n = ibm.x();
    private static final cqss o = ibm.x();
    private static final cqss p = cqta.f();
    public static final cqss c = ibm.b();
    public static final cqss d = ibm.i();
    private static final cqss q = ibm.A();
    private static final cqss r = ibm.u();
    private static final cqss s = ibl.U();
    private static final cqss t = ibm.u();
    private static final cqss u = iva.b(ibl.R(), ibl.ai());
    private static final cqss v = cqrt.c(R.color.place_list_favorites);
    private static final cqss w = cqrt.c(R.color.place_list_custom_background);
    private static final cqss x = ibl.ab();
    public static final cqss e = ibm.u();
    private static final cqss y = ibm.u();
    private static final cqss z = ibm.b();
    private static final cqss A = ibl.b();
    private static final cqss B = iva.b(ibl.ak(), ibl.an());

    @dzsi
    public static cqss a(bxmh bxmhVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 11) {
            return e;
        }
        if (a2 == 17) {
            return B;
        }
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar2 = dwjjVar2.b;
        if (dxbpVar2 == null) {
            dxbpVar2 = dxbp.x;
        }
        owz a3 = oxa.a(dxbpVar2.h);
        if (a3 != null) {
            return h(a3.c);
        }
        return null;
    }

    public static cqtd b(@dzsi dptg dptgVar) {
        cqss cqssVar;
        if (dptgVar == null) {
            cqssVar = a;
        } else if (dptgVar.i) {
            cqssVar = h;
        } else {
            int a2 = dplr.a(dptgVar.h);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 2;
            cqssVar = (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) ? g : a;
        }
        int i3 = 2131231600;
        if (dptgVar != null) {
            if (dptgVar.i) {
                i3 = 2131231730;
            } else {
                int a3 = dplr.a(dptgVar.h);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i4 = a3 - 2;
                if (i4 == 0) {
                    i3 = 2131232292;
                } else if (i4 == 1) {
                    i3 = 2131232467;
                } else if (i4 == 2) {
                    i3 = 2131232130;
                } else if (i4 == 3) {
                    i3 = 2131231285;
                }
            }
        }
        return cqrt.g(i3, cqssVar);
    }

    public static cqtd c(@dzsi dptg dptgVar) {
        if (dptgVar == null) {
            return j();
        }
        if (dptgVar.i) {
            owz a2 = oxa.a(4);
            if (a2 == null) {
                return j();
            }
            return cqrt.i(a2.b(), i(5));
        } else if ((dptgVar.a & 256) != 0) {
            owz a3 = oxa.a(dptgVar.j);
            if (a3 == null) {
                return j();
            }
            return cqrt.i(a3.b(), i(a3.c));
        } else {
            return j();
        }
    }

    public static boolean d(bxmh bxmhVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        int a2 = dxbk.a(dxbpVar.g);
        if (a2 != 0 && a2 == 17) {
            return false;
        }
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dxbp dxbpVar2 = dwjjVar2.b;
        if (dxbpVar2 == null) {
            dxbpVar2 = dxbp.x;
        }
        owz a3 = oxa.a(dxbpVar2.h);
        if (a3 == null) {
            return false;
        }
        int i2 = a3.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 61953:
            case 61954:
            case 61955:
            case 61956:
            case 61957:
            case 61958:
            case 61959:
            case 61960:
            case 61961:
            case 61962:
            case 61963:
            case 61964:
            case 61965:
            case 61966:
            case 61967:
            case 61968:
            case 61969:
            case 61970:
            case 61971:
            case 61972:
            case 61973:
            case 61974:
            case 61975:
            case 61976:
            case 61977:
            case 61978:
            case 61979:
            case 61980:
            case 61981:
            case 61982:
            case 61983:
            case 61984:
            case 61985:
            case 61986:
            case 61987:
            case 61988:
            case 61989:
            case 61990:
            case 61991:
            case 61992:
            case 61993:
            case 61994:
            case 61995:
            case 61996:
            case 61997:
            case 61998:
            case 61999:
            case 62000:
            case 62001:
            case 62002:
            case 62003:
            case 62004:
            case 62005:
            case 62006:
            case 62007:
                return true;
            default:
                return false;
        }
    }

    public static cqss e(@dzsi dptg dptgVar) {
        if (dptgVar == null) {
            return d;
        }
        if (dptgVar.i) {
            return s;
        }
        int a2 = dplr.a(dptgVar.h);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 2;
        return (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) ? r : d;
    }

    public static cqss f(@dzsi dptg dptgVar) {
        owz a2;
        if (dptgVar == null) {
            return d;
        }
        if (dptgVar.i) {
            return s;
        }
        if ((dptgVar.a & 256) != 0 && (a2 = oxa.a(dptgVar.j)) != null) {
            return h(a2.c);
        }
        return d;
    }

    public static jic g(String str) {
        return new jic(str, ckqc.FULLY_QUALIFIED, 0);
    }

    public static cqss h(int i2) {
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 2) {
                return q;
            }
            if (i3 == 4) {
                return s;
            }
            if (i3 != 49) {
                if (i3 != 129) {
                    if (i3 == 241) {
                        return y;
                    }
                    if (i3 != 243 && i3 != 4081) {
                        if (i3 != 65457) {
                            if (i3 != 65473) {
                                if (i3 == 65524) {
                                    return A;
                                }
                                switch (i3) {
                                    case 6:
                                    case 7:
                                        break;
                                    case 8:
                                    case 9:
                                        break;
                                    case 10:
                                        return u;
                                    default:
                                        switch (i3) {
                                            case 4091:
                                                break;
                                            case 4092:
                                                break;
                                            case 4093:
                                            case 4094:
                                                return w;
                                            default:
                                                switch (i3) {
                                                    case 61953:
                                                    case 61954:
                                                    case 61955:
                                                    case 61956:
                                                    case 61957:
                                                    case 61958:
                                                    case 61959:
                                                    case 61960:
                                                    case 61961:
                                                    case 61962:
                                                    case 61963:
                                                    case 61964:
                                                    case 61965:
                                                    case 61966:
                                                    case 61967:
                                                    case 61968:
                                                    case 61969:
                                                    case 61970:
                                                    case 61971:
                                                    case 61972:
                                                    case 61973:
                                                    case 61974:
                                                    case 61975:
                                                    case 61976:
                                                    case 61977:
                                                    case 61978:
                                                    case 61979:
                                                    case 61980:
                                                    case 61981:
                                                    case 61982:
                                                    case 61983:
                                                    case 61984:
                                                    case 61985:
                                                    case 61986:
                                                    case 61987:
                                                    case 61988:
                                                    case 61989:
                                                    case 61990:
                                                    case 61991:
                                                    case 61992:
                                                    case 61993:
                                                    case 61994:
                                                    case 61995:
                                                    case 61996:
                                                    case 61997:
                                                    case 61998:
                                                    case 61999:
                                                    case 62000:
                                                    case 62001:
                                                    case 62002:
                                                    case 62003:
                                                    case 62004:
                                                    case 62005:
                                                    case 62006:
                                                    case 62007:
                                                        return z;
                                                    default:
                                                        return d;
                                                }
                                        }
                                }
                            }
                            return x;
                        }
                        return v;
                    }
                }
                return t;
            }
            return r;
        }
        throw null;
    }

    public static cqss i(int i2) {
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 2) {
                return f;
            }
            if (i3 == 4) {
                return h;
            }
            if (i3 != 49) {
                if (i3 != 129) {
                    if (i3 == 241) {
                        return n;
                    }
                    if (i3 != 243 && i3 != 4081) {
                        if (i3 != 65457) {
                            if (i3 != 65473) {
                                if (i3 == 65524) {
                                    return p;
                                }
                                switch (i3) {
                                    case 6:
                                    case 7:
                                        break;
                                    case 8:
                                    case 9:
                                        break;
                                    case 10:
                                        return j;
                                    default:
                                        switch (i3) {
                                            case 4091:
                                                break;
                                            case 4092:
                                                break;
                                            case 4093:
                                            case 4094:
                                                return l;
                                            default:
                                                switch (i3) {
                                                    case 61953:
                                                    case 61954:
                                                    case 61955:
                                                    case 61956:
                                                    case 61957:
                                                    case 61958:
                                                    case 61959:
                                                    case 61960:
                                                    case 61961:
                                                    case 61962:
                                                    case 61963:
                                                    case 61964:
                                                    case 61965:
                                                    case 61966:
                                                    case 61967:
                                                    case 61968:
                                                    case 61969:
                                                    case 61970:
                                                    case 61971:
                                                    case 61972:
                                                    case 61973:
                                                    case 61974:
                                                    case 61975:
                                                    case 61976:
                                                    case 61977:
                                                    case 61978:
                                                    case 61979:
                                                    case 61980:
                                                    case 61981:
                                                    case 61982:
                                                    case 61983:
                                                    case 61984:
                                                    case 61985:
                                                    case 61986:
                                                    case 61987:
                                                    case 61988:
                                                    case 61989:
                                                    case 61990:
                                                    case 61991:
                                                    case 61992:
                                                    case 61993:
                                                    case 61994:
                                                    case 61995:
                                                    case 61996:
                                                    case 61997:
                                                    case 61998:
                                                    case 61999:
                                                    case 62000:
                                                    case 62001:
                                                    case 62002:
                                                    case 62003:
                                                    case 62004:
                                                    case 62005:
                                                    case 62006:
                                                    case 62007:
                                                        return o;
                                                    default:
                                                        return a;
                                                }
                                        }
                                }
                            }
                            return m;
                        }
                        return k;
                    }
                }
                return i;
            }
            return g;
        }
        throw null;
    }

    private static cqtd j() {
        owz a2 = oxa.a(3);
        if (a2 == null) {
            return cqrt.g(2131231600, a);
        }
        return cqrt.i(a2.b(), a);
    }
}
