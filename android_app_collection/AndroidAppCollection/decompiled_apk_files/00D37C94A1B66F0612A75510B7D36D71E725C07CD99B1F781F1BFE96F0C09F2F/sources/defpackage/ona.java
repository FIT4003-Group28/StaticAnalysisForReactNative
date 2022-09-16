package defpackage;

import android.accounts.Account;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: ona  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ona implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ona u = new ona(20);
    public static final /* synthetic */ ona t = new ona(19);
    public static final /* synthetic */ ona s = new ona(18);
    public static final /* synthetic */ ona r = new ona(17);
    public static final /* synthetic */ ona q = new ona(16);
    public static final /* synthetic */ ona p = new ona(15);
    public static final /* synthetic */ ona o = new ona(14);
    public static final /* synthetic */ ona n = new ona(13);
    public static final /* synthetic */ ona m = new ona(12);
    public static final /* synthetic */ ona l = new ona(11);
    public static final /* synthetic */ ona k = new ona(10);
    public static final /* synthetic */ ona j = new ona(9);
    public static final /* synthetic */ ona i = new ona(8);
    public static final /* synthetic */ ona h = new ona(7);
    public static final /* synthetic */ ona g = new ona(6);
    public static final /* synthetic */ ona f = new ona(5);
    public static final /* synthetic */ ona e = new ona(4);
    public static final /* synthetic */ ona d = new ona(3);
    public static final /* synthetic */ ona c = new ona(2);
    public static final /* synthetic */ ona b = new ona(1);
    public static final /* synthetic */ ona a = new ona();

    private /* synthetic */ ona() {
    }

    private /* synthetic */ ona(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                if (((omk) obj) == omk.LOADING) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((asxp) obj).an;
            case 2:
                aqtp aqtpVar = ((arhd) obj).v;
                return aqtpVar == null ? aqtp.a : aqtpVar;
            case 3:
                aqtp aqtpVar2 = ((arhd) obj).v;
                return aqtpVar2 == null ? aqtp.a : aqtpVar2;
            case 4:
                return Boolean.valueOf(((aqtp) obj).k);
            case 5:
                return ampq.j((byte[]) obj);
            case 6:
                return ampq.j((byte[]) obj);
            case 7:
                amum h2 = amup.h();
                for (Object obj2 : (Object[]) obj) {
                    Pair pair = (Pair) obj2;
                    h2.f((String) pair.first, (ampq) pair.second);
                }
                return h2.b();
            case 8:
                return tet.c((awne) obj);
            case 9:
                return ((ahic) obj).a().x();
            case 10:
                return ((ahic) obj).a().I();
            case 11:
                return ((ahic) obj).a().U();
            case 12:
                return ((ahic) obj).a().w();
            case 13:
                return ((ahic) obj).a().P();
            case 14:
                return ((ahic) obj).a().V();
            case 15:
                return ((ahic) obj).a().v();
            case 16:
                return ((ahic) obj).a().x();
            case 17:
                return (Account) ((ampq) obj).c();
            case 18:
                return (aajj) ((ampq) obj).c();
            case 19:
                return (aajj) ((ampq) obj).c();
            default:
                return ((aajp) obj).c;
        }
    }
}
